import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-showcontact',
  templateUrl: './showcontact.component.html',
  styleUrls: ['./showcontact.component.css']
})
export class ShowcontactComponent implements OnInit {

  constructor(private vhs:AdminService) { }
  vehicleList:any;
  ngOnInit(): void 
  {
    this.vhs.showSuggestions().subscribe
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
