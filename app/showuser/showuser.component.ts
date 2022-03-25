import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-showuser',
  templateUrl: './showuser.component.html',
  styleUrls: ['./showuser.component.css']
})
export class ShowuserComponent implements OnInit {

  constructor(private vhs:AdminService) { }
  vehicleList:any;
  ngOnInit(): void 
  {
    this.vhs.ShowAllUser().subscribe
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
