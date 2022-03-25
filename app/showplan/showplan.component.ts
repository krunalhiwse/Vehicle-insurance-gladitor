import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-showplan',
  templateUrl: './showplan.component.html',
  styleUrls: ['./showplan.component.css']
})
export class ShowplanComponent implements OnInit {

  constructor(private vhs:AdminService) { }
  vehicleList:any;
  ngOnInit(): void 
  {
    this.vhs.showAllPlan().subscribe
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
