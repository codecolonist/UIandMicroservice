import { MpApiService } from './../mp-api.service';
import { Component, OnInit } from '@angular/core';
import { mnthlyStats } from '../monthlystats/mnthlyStats';

@Component({
  selector: 'app-mnthstatlist',
  templateUrl: './mnthstatlist.component.html',
  styleUrls: ['./mnthstatlist.component.scss']
})
export class MnthstatlistComponent implements OnInit {

  monthstat : mnthlyStats;
  monthstatlist:mnthlyStats[];
  data:any;
  

  constructor(private mpservice:MpApiService) { }

  ngOnInit() {

    this.mpservice.getcall("8084","mnthStatlist").subscribe(
      resp=>{
       
        this.monthstatlist=resp as mnthlyStats[];
        
        console.log(this.monthstatlist);
      }
    );
      
    }
}
