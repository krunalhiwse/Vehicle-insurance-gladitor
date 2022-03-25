import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Claim } from './claim';
import { ApproveClaim } from './approve-claim';

@Injectable({
  providedIn: 'root'
})
export class ClaimInsuranceService {

  constructor(private http: HttpClient) { }

  claimInsurance(claim: Claim){
    return this.http.post('http://localhost:9098/addClaimInsurance', claim);
  }

  updateStatus(approveClaim: ApproveClaim){
    return this.http.post('http://localhost:9098/updateClaimStatus', approveClaim);
  }
}
