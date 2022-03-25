import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from './login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private myhttp:HttpClient) { }
  restUrl:string="http://localhost:9098/rest/api";
  addUser(ims : Login)
  {
    return this.myhttp.post(this.restUrl+"/login",ims);
  }
}
