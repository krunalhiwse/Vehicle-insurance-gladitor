import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Registration } from './registration';


@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private myhttp:HttpClient) { }
  
  restUrl:string="http://localhost:9098/rest/api";
  addRegistration(ims : Registration)
  {
    return this.myhttp.post(this.restUrl+"/registration",ims);
  }
}
