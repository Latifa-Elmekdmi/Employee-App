import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { employeeService } from './employee.service';
import { employee } from './employee';
import { Router } from '@angular/router';


@Component({
    selector: 'employee-list',
    templateUrl: './employeeList.component.html',
    styleUrls: ['./employeeList.component.css']
})
export class employeeListComponent implements OnInit{
    employee = new employee();
    statusMessage: string;
    employees: employee[];
    constructor(private _employeeService: employeeService,
                private _router: Router){}
    
    ngOnInit(): void {
        console.log("calling ngOnInit()::::");
        this.getemployees();
    }

    getemployees(): void{
        console.log("Inside getemployees():::::")
        this._employeeService.getAllemployees()
            .subscribe((employeeData) => this.employees = employeeData,
            (error) =>{
                console.log(error);
                this.statusMessage = "Problem with service. Please try again later!";
            }
        );
        console.log("end of getemployees():::::");
    }
}