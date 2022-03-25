import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Registration } from './registration';
import { RegistrationService } from './registration.service';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor(private ims:RegistrationService,private http:Router) { }

  
  ngOnInit(): void {
    
  }
  registration:Registration=new Registration();
  saveRegistration(registrationForm:any)
  {
    this.registration=registrationForm.value;
    console.log(this.registration);
    this.ims.addRegistration(this.registration).subscribe
    (
      (data)=>
      {
        console.log(data);
        alert("Registration Successfull")
        this.http.navigate(['/newvehicle'])
      },
      (error)=>
      {
        console.log(error);
        alert("Fill the fields");
      }
    )
  }

}
