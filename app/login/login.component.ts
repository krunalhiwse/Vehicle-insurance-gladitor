import { Component, OnInit } from '@angular/core';
import { Login } from './login';
import { LoginService } from './login.service';
import { FormBuilder,FormGroup,Validators } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private ims:LoginService,private http:Router) { }

  ngOnInit(): void {
    }
    email:string="loginForm.value.email";
    password:string="loginForm.value.password";
    myrouter:any;
  
  addUser(loginForm:any)
  {
    let LUser=new Login(loginForm.value.email,loginForm.value.password)
    
    console.log(LUser);
    this.ims.addUser(LUser).subscribe
    (
      (data)=>
      {
        if(data)
        {
          // console.log("Login succssfull")
          if(this.email)
         
        {
          // alert("user valid");
          // localStorage.setItem("loginid",this.email);
          alert("welcome")
          this.http.navigate(['/userhome']);
          
        
        }
        }
        else
        {
          // console.log("incorrect Id and Password")
            alert("incorrect Id and Password")
        }
      }
    )
  }

}
