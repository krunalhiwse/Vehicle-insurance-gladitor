import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Plan } from './plan';

@Injectable({
  providedIn: 'root'
})
export class PlanService {

  constructor(private myhttp:HttpClient) { }
  restUrl:String="http://localhost:9098/rest/api";
  
  addPlan(ims:Plan)
  {
   let obj:any = {
      // "planId": ims.planId,
      "vehicleType":ims.vehicleType,
      "plan": ims.plan,
      "year": ims.year,
      "registration": {
       "email": ims.email
         
    }
}
    return this.myhttp.post(this.restUrl+"/plan",obj);
  }
}
