// import { Component, OnInit } from '@angular/core';

// @Component({
//   selector: 'app-payment',
//   templateUrl: './payment.component.html',
//   styleUrls: ['./payment.component.css']
// })
// export class PaymentComponent implements OnInit {

//   constructor() { }

//   ngOnInit(): void {
//   }

// }

/////////////////////////////////////
import { Component, OnInit } from '@angular/core';
import { Payment } from './payment';
import { PaymentService } from './payment.service';
import { Router } from '@angular/router';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  
  payment: Payment = new Payment;

  constructor(private paymentService : PaymentService, private router: Router) { }

  pay(){
    //alert(JSON.stringify(this.policy));
    this.paymentService.payNow(this.payment).subscribe(data => {
      alert(JSON.stringify(data));
      })
      alert("Click 'OK' to confirm payment");
       
      this.router.navigate(['congratulations']);
    }

  ngOnInit(): void {
  }

}
