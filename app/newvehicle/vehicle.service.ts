import { Injectable } from '@angular/core';
import { Vehicle } from './vehicle';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {

  constructor(private myhttp:HttpClient) { }
  restUrl:String="http://localhost:9098/rest/api";
  // getAllVehicles()
  // {
  //   return this.myhttp.get(this.restUrl+"/vehicle")
  // }
  addVehicle(veh:Vehicle)
  {
    return this.myhttp.post(this.restUrl+"/vehicle",veh);
  }
}

