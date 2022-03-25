import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Contact } from './contact/contact';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private myhttp:HttpClient) { }

  restUrl:string="http://localhost:9098/rest/api";
  ShowAllUser()
  {
    return this.myhttp.get(this.restUrl+"/registration");
  }
  ShowAllVehicle()
  {
    return this.myhttp.get(this.restUrl+"/vehicle");
  }
  showSuggestions()
  {
    return this.myhttp.get(this.restUrl+"/contact");
  }
  showAllPlan()
  {
    return this.myhttp.get(this.restUrl+"/plan");
  }
}
