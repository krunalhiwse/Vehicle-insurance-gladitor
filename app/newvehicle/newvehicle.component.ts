import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Vehicle } from './vehicle';
import { VehicleService } from './vehicle.service';

@Component({
  selector: 'app-newvehicle',
  templateUrl: './newvehicle.component.html',
  styleUrls: ['./newvehicle.component.css']
})
export class NewvehicleComponent implements OnInit {

  constructor(private veh:VehicleService,private http:Router) { }

  ngOnInit(): void { }
  
  vehicle:Vehicle=new Vehicle();
  addVehicle(vehicleForm:any)
  {
    this.vehicle=vehicleForm.value;
    console.log(this.vehicle);
    this.veh.addVehicle(this.vehicle).subscribe(
      (data)=>{
        console.log(data);
        alert("Vehicle added.!")
        this.http.navigate(['/plan'])
      },
      (error)=>
      {
        console.log(error);
        alert("Fill the fields");
      }
    )
  }

}
