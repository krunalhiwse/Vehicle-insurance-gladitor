import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';

import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactComponent } from './contact/contact.component';
import { ForgetPasswordComponent } from './forget-password/forget-password.component';
// import { BuyinsuranceComponent } from './buyinsurance/buyinsurance.component';
import { TwoWheelerComponent } from './two-wheeler/two-wheeler.component';
import { FourwheelerComponent } from './fourwheeler/fourwheeler.component';
import { ButtonComponent } from './button/button.component';
import { NewvehicleComponent } from './newvehicle/newvehicle.component';
import { RenewComponent } from './renew/renew.component';
import { PlanComponent } from './plan/plan.component';
import { PaymentComponent } from './payment/payment.component';
import { CongratulationComponent } from './congratulation/congratulation.component';
import { UserhomeComponent } from './userhome/userhome.component';
// import { UpdateplanComponent } from './updateplan/updateplan.component';
import { ClaimComponent } from './claim/claim.component';
// import { PreminumcalculatorComponent } from './preminumcalculator/preminumcalculator.component';
// import { RenewinsuranceComponent } from './renewinsurance/renewinsurance.component';
// import { UpdateplanComponent } from './updateplan/updateplan.component';
// import { EmicalComponent } from './emical/emical.component';
// import { EligcalComponent } from './eligcal/eligcal.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { ShowuserComponent } from './showuser/showuser.component';
import { ShowvehicleComponent } from './showvehicle/showvehicle.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { ShowcontactComponent } from './showcontact/showcontact.component';
import { ShowplanComponent } from './showplan/showplan.component';
import { ErrorComponent } from './error/error.component';
import { UpdateComponent } from './update/update.component';
// import { ShowcustomersComponent } from './showcustomers/showcustomers.component';




@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    HomeComponent,
    LoginComponent,
    AboutusComponent,
    ContactComponent,
    ForgetPasswordComponent,
    // BuyinsuranceComponent,
    TwoWheelerComponent,
    FourwheelerComponent,
    ButtonComponent,
    NewvehicleComponent,
    RenewComponent,
    PlanComponent,
    PaymentComponent,
    CongratulationComponent,
    UserhomeComponent,
    // UpdateplanComponent,
    ClaimComponent,
    // EmicalComponent,
    // EligcalComponent,
    AdmindashboardComponent,
    ShowuserComponent,
    ShowvehicleComponent,
    AdminloginComponent,
    ShowcontactComponent,
    ShowplanComponent,
    ErrorComponent,
    UpdateComponent,
    // ShowcustomersComponent
    
    // PreminumcalculatorComponent
    // RenewinsuranceComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
