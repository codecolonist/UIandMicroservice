import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
import { Mpuser } from "./register/Mpuser";
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { RegistrationRequest } from './register/RegistrationRequest';
import { RegistrationResponse } from './register/RegistrationResponse';

@Injectable({
  providedIn: 'root'
})
export class MpApiService {
 

  constructor(private http: HttpClient) { }

  getcall(portnum:string,path: string){
    return this.http.get("http://localhost:"+portnum+"/"+path,httpOptions)
    
  }
   

  /** POST: add a new hero to the database */
postcall (portnum:string,path: string,Req: any): Observable<any> {
   console.log(Req);
  return this.http.post<any>("http://localhost:"+portnum+"/"+path, Req, httpOptions)
    .pipe(
      //catchError(this.handleError('addHero', hero))
    );
}


  
}

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};
