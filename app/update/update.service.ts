import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Update } from './update';

@Injectable({
  providedIn: 'root'
})
export class UpdateService {
  constructor(private myhttp:HttpClient) { }
  restUrl:String="http://localhost:9098/rest/api";
  
  addPlan(ims:Update)
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
    return this.myhttp.put(this.restUrl+"/updateplan",obj);
  }
}
