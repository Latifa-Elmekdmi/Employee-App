import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';


import { AppComponent } from './app.component';
import { employeeService } from './employee/employee.service';
import { employeeComponent } from './employee/employee.component';

import { employeeListComponent } from './employee/employeeList.component';
import { PageNotFoundComponent } from './others/pageNotFound.component';
import { HomeComponent } from './employee/home.component';


const appRoutes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'employees', component: employeeListComponent },
  { path: 'addemployee', component: employeeComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  declarations: [
    AppComponent, employeeComponent, employeeListComponent, HomeComponent, PageNotFoundComponent
  ],
  imports: [
    BrowserModule, HttpModule, FormsModule,  RouterModule.forRoot(appRoutes)
  ],
  providers: [employeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }