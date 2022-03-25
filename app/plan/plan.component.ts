import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Plan } from './plan';
import { PlanService } from './plan.service';

@Component({
  selector: 'app-plan',
  templateUrl: './plan.component.html',
  styleUrls: ['./plan.component.css']
})
export class PlanComponent implements OnInit {
vehicletype="twowheeler";

  constructor(private ims:PlanService,private http:Router) { }
 ngOnInit(): void {
  }
  plan:Plan=new Plan();
  savePlan(planForm:any)
  {
    this.plan=planForm.value;
    console.log(this.plan);
    this.ims.addPlan(this.plan).subscribe
    (
      (data)=>
      {
        console.log(data);
        alert(" congratulations Plan is Selected")
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
