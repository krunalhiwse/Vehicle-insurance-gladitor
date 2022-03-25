import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ButtonComponent } from './button/button.component';
import { ClaimComponent } from './claim/claim.component';
import { CongratulationComponent } from './congratulation/congratulation.component';

import { ContactComponent } from './contact/contact.component';
// import { EmicalComponent } from './emical/emical.component';
import { ForgetPasswordComponent } from './forget-password/forget-password.component';
import { FourwheelerComponent } from './fourwheeler/fourwheeler.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NewvehicleComponent } from './newvehicle/newvehicle.component';
import { PaymentComponent } from './payment/payment.component';
import { PlanComponent } from './plan/plan.component';
import { RegistrationComponent } from './registration/registration.component';
import { RenewComponent } from './renew/renew.component';
import { TwoWheelerComponent } from './two-wheeler/two-wheeler.component';
// import { UpdateplanComponent } from './updateplan/updateplan.component';
// import { EligcalComponent } from './eligcal/eligcal.component';

import { UserhomeComponent } from './userhome/userhome.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { ShowuserComponent } from './showuser/showuser.component';
import { ShowvehicleComponent } from './showvehicle/showvehicle.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { ShowplanComponent } from './showplan/showplan.component';
import { ShowcontactComponent } from './showcontact/showcontact.component';
import { ErrorComponent } from './error/error.component';
import { UpdateComponent } from './update/update.component';
// import { ShowcustomersComponent } from './showcustomers/showcustomers.component';

const routes: Routes = [
  {
    path:'',redirectTo:'home',pathMatch:'full'
  },
  {
    path:'home', component:HomeComponent
  },
  {
    path:'login', component:LoginComponent
  },
  {
    path:'registration', component:RegistrationComponent
  },
  // {
  //   path:'forgotpassword', component:ForgotpasswordComponent
  // },
  {
    path:'plan', component:PlanComponent
  },
  {
    path:'contact', component:ContactComponent
  },
  {
    path:'forgetpassword', component:ForgetPasswordComponent
  },
  {
    path:'aboutus', component:AboutusComponent
  },
  {
    path:'fourwheeler', component:FourwheelerComponent
  },
  {
    path:'button', component:ButtonComponent
  },
  {
    path:'twowheeler', component:TwoWheelerComponent
  },
  {
    path:'renew', component:RenewComponent
  },
  {
    path:'newvehicle', component:NewvehicleComponent
  },
  {path:'payment',component:PaymentComponent},
  {path:'congratulation',component:CongratulationComponent},
  {path:'userhome',component:UserhomeComponent},
  {path:'update',component:UpdateComponent},
  {path:'claim',component:ClaimComponent},
  // {path:'emical',component:EmicalComponent}
  // {path:'eligcal',component:EligcalComponent},
  {path:'admin',component:AdmindashboardComponent},
  {path:'show',component:ShowuserComponent},
  {path:'showvehicle',component:ShowvehicleComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'showplan',component:ShowplanComponent},
  {path:'showcontact',component:ShowcontactComponent},
  {path:'error',component:ErrorComponent}
  


  
  
  

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
