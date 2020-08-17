import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {employeeService} from './employee.service';
import {employee} from './employee';
 
@Component({

    selector: 'app-employee',
    templateUrl: './employee.component.html',
    styleUrls: ['./employee.component.css']
})
export class employeeComponent implements OnInit{

    employees: employee[];
    statusMessage: string;
    employee = new employee();
    
   constructor(private _employeeService: employeeService,
                private _router: Router){}

    ngOnInit(): void {
        this.getemployees();
    }

    getemployees(): void{
        this._employeeService.getAllemployees()
            .subscribe((employeeData) => {
                this.employees = employeeData,
                console.log(employeeData)
            }, (error) =>{
                console.log(error);
                this.statusMessage = "Problem with service. Please try again later!";
            }
        );
        
    }
    
    getemployeeById(employeeId: string){
        this._employeeService.getemployeeById(employeeId)
            .subscribe((employeeData) => {this.employee = employeeData; this.getemployees(); }),
            (error) => {
                console.log(error);
                this.statusMessage = "Problem with service. Please try again later!";
            }
        this.reset();    
    }
 
    addemployee(): void{
        this._employeeService.addemployee(this.employee)
            .subscribe((response) => {console.log(response); this.getemployees();this.reset();},
            (error) =>{
                console.log(error);
                this.statusMessage = "Problem with service. Please try again later!";
            }
        );   
    }
   private reset(){
        this.employee.id = null;
        this.employee.prenom = null;
        this.employee.nom = null;
        this.employee.cin = null ;
        this.employee.email = null ;
        this.employee.datenaissance = null ;
        this.employee.nationalite = null ;
        this.employee.numtel = null ;
        this.employee.adresse = null ;
        this.employee.etatcivile = null ;
        this.employee.fonction = null ;
    }
    deleteemployee(employeeId: string){
        console.log("Inside the deleteemployee()::::employee id::::"+employeeId);
        this._employeeService.deleteemployee(employeeId)
            .subscribe((response) => {console.log(response); this.getemployees();},
            (error) =>{
                console.log(error);
                this.statusMessage = "Problem with service. Please try again later!";
            });
            this.reset();
            console.log("end of deleteemployee():::::::");
    }
}