import { Component, OnInit } from '@angular/core';
import { Mpuser } from "./Mpuser";
import {MpApiService} from '../mp-api.service'
import {RegistrationRequest} from './RegistrationRequest';
import { RegistrationResponse } from './RegistrationResponse';
import { ServiceStatus } from './ServiceStatus';
import { Router } from '@angular/router';


@Component({
  selector: 'register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  
  mpuser : Mpuser;
  regRequest : RegistrationRequest;
  regResponse1 = new  RegistrationResponse();
  serviceStatus = new ServiceStatus();

  constructor(private mpservice:MpApiService,private router:Router) { }



  ngOnInit() {
  }

  model= new Mpuser(new Date(),"email@gmail.com","firstname",new Date(),"lastname","******","phone","username");

 
  registeruser(){

    this.mpuser=this.model;
    this.regRequest=new RegistrationRequest(this.mpuser);
    console.log(this.regRequest);
    this.mpservice.postcall("8085","register",this.regRequest)
  .subscribe(

    regResponse => {
    
      this.regResponse1=regResponse;
      this.serviceStatus=this.regResponse1.serviceStatus;

      if(this.serviceStatus.status=="ACCEPTED") {
        this.router.navigate(["/login"]);

      }
      
    }
    
  );

  }


}

