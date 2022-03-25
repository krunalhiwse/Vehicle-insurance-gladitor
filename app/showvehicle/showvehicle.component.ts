import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-showvehicle',
  templateUrl: './showvehicle.component.html',
  styleUrls: ['./showvehicle.component.css']
})
export class ShowvehicleComponent implements OnInit {

  constructor(private vhs:AdminService) { }
  vehicleList:any;
  ngOnInit(): void 
  {
    this.vhs.ShowAllVehicle().subscribe
    (
       (data)=>
       {
          console.log(data);
          this.vehicleList=data;
       },
       (error)=>
       {
           console.log(error);
       }
    )

}

}
