import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  LoginName:string="";
  Password:string="";
  logError:string="";
  login()
 {
  if (this.LoginName=="anshul"&& this.Password=="pass123") 
   {
     this.logError="";
     this.router.navigate(['/admin']);
   
   }    
 else
 {
   this.logError="Username and Password are not correct"
 }
}

constructor(private router:Router) { }

ngOnInit(): void 
{

}

}
