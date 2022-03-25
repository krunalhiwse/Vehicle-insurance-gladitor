import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Contact } from './contact';

@Injectable({
  providedIn: 'root'
})
export class ContactService {

  constructor(private myhttp:HttpClient) { }
  restUrl:string="http://localhost:9098/rest/api";
  addSuggestions(ims:Contact)
  {
    return this.myhttp.post(this.restUrl+"/contact",ims);
  }
  showSuggestions(ims:Contact)
  {
    return this.myhttp.get(this.restUrl+"/contact");
  }
}
