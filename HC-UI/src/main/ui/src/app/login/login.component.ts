import { Component, OnInit } from '@angular/core';
import {MpApiService} from '../mp-api.service'
import { Router } from '@angular/router';

export class logRequest {

  constructor(public email: string,
    public password: string){
    
  }
  
}

export class loginResponse {
  firstName: string;
  lastName: string;
  serviceMessage: string;
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})



export class LoginComponent implements OnInit {

   logreq: logRequest;
   logres: loginResponse;
   isLogin: boolean;

  constructor(private mpapiservice : MpApiService, private router:Router) { }

  ngOnInit() {
  }
  
  model = new logRequest("example@gmail.com","********");

  userLogin(){

    this.logreq=this.model;

    console.log(this.logreq);

     this.mpapiservice.postcall("8085","userLogin",this.logreq).subscribe(

        res => {

          this.logres=res;
          console.log(this.logres);

          if(this.logres.serviceMessage="Welcome"){
            this.router.navigate(["/home",this.logres.lastName]);
          }

           
        }

     )
    
  }
}
