// import { Injectable } from '@angular/core';

// @Injectable({
//   providedIn: 'root'
// })
// export class PaymentService {

//   constructor() { }
// }
//////////////////////
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Payment } from './payment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  constructor(private myhttp:HttpClient) { }

  //restUrl:string="http://localhost:9098/rest/api";

  payNow(Payment : Payment) : Observable<any>
  {
    let url = 'http://localhost:9098/payment';
    return this.myhttp.post<any>(url,Payment); 
}
}
