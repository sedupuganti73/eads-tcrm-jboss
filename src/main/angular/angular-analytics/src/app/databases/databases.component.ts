import { Component, OnInit } from '@angular/core';
import {DataSource} from '@angular/cdk/collections';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/observable/of';
import {AnalyticsService} from '../analytics.service';
import {AddDatabaseComponent} from '../add-database/add-database.component';
import {MatDialog, MatDialogRef, MatSnackBar, MAT_DIALOG_DATA} from '@angular/material';

@Component({
  selector: 'app-databases',
  templateUrl: './databases.component.html',
  styleUrls: ['./databases.component.css'],
  providers: [AnalyticsService]
})
export class DatabasesComponent implements OnInit {

  public datasource: DataSource<DBDataSource> = new DsDataSource() ;
  public displayedColumns = [ 'name', 'description', 'url', 'dbUsername', 'dbPassword', 'actions'];
  public loading = true;
  public errorTextIndicator:boolean = false;
  public errorText: string;
  public dsId: number;

  constructor(private analyticsService: AnalyticsService, public dialog: MatDialog, public snackBar: MatSnackBar) { }

  ngOnInit() {
    this.analyticsService.getDatabases().subscribe(data => {
        dataSources = data;
        this.datasource = new DsDataSource();
        this.loading = false;
    });
  }

  delete(dsId: string): void {
      this.loading = true;
      this.analyticsService.deleteDatabase(+dsId).subscribe(data => {
        dataSources = data;
        this.datasource = new DsDataSource();
        this.loading = false;
        this.snackBar.open('Data Source Deleted', null,
        {
          duration: 1000
        });
      });
  }

  addDatabase(dsId: number): void {

    let dialogRef;
    if (dsId) {
       dialogRef = this.dialog.open(AddDatabaseComponent, {
        width: '500px', data: {dsId: dsId}
      });
    } else {
       dialogRef = this.dialog.open(AddDatabaseComponent, {
        width: '500px'
      });
    }



    dialogRef.afterClosed().subscribe(refreshValues => {
      console.log('The dialog was closed ' + refreshValues);
      if (refreshValues) {
        this.loading = true;
        this.analyticsService.getDatabases().subscribe(data => {
            dataSources = data;
            this.datasource = new DsDataSource();
            this.loading = false;
        });
      }
    });
  }
}



export interface DBDataSource {
  dsId: string;
  name: string;
  description: string;
  url: string;
  dbUsername: string;
  dbPassword: string;
  driverClassName: string;
}

let dataSources: DBDataSource[] = [];


/**
 * Data source to provide what data should be rendered in the table. The observable provided
 * in connect should emit exactly the data that should be rendered by the table. If the data is
 * altered, the observable should emit that new set of data on the stream. In our case here,
 * we return a stream that contains only one set of data that doesn't change.
 */
export class DsDataSource extends DataSource<any> {
  /*constructor(private siteId:string, private adminService:AdminService){
    super();
  }*/

  /** Connect function called by the table to retrieve one stream containing the data to render. */
  connect(): Observable<DBDataSource[]> {
    return Observable.of(dataSources);
  }

  disconnect() {}

}
