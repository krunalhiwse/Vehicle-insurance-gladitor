import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Update } from './update';
import { UpdateService } from './update.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  vehicletype="twowheeler";

  constructor(private ims:UpdateService,private http:Router) { }
 ngOnInit(): void {
  }
  update:Update=new Update();
  savePlan(updateForm:any)
  {
    this.update=updateForm.value;
    console.log(this.update);
    this.ims.addPlan(this.update).subscribe
    (
      (data)=>
      {
        console.log(data);
        alert(" congratulations Plan is Update")
        this.http.navigate(['/payment'])
      },
      (error)=>
      {
        console.log(error);
        alert(" incorrect Email");
      }
    )
  }

}
