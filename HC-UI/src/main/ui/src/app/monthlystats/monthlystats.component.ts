import { MpApiService } from './../mp-api.service';
import { Component, OnInit } from '@angular/core';
import { mnthlyStats } from './mnthlyStats';

@Component({
  selector: 'monthlystats',
  templateUrl: './monthlystats.component.html',
  styleUrls: ['./monthlystats.component.scss']
})
export class MonthlystatsComponent implements OnInit {

  mnthstat:mnthlyStats;
  data:any;

  model = new mnthlyStats(1,"Task Name","comments","open","2hrs","4hrs",new Date(),new Date())

  constructor(private mpservice:MpApiService) { }

  ngOnInit() {
  }


  statcreate(){
    this.mnthstat=this.model;
    
    console.log(this.mnthstat);
    this.mpservice.postcall("8084","createMnthStat",this.mnthstat)
  .subscribe(

    res => {
    
      this.data=res;
      console.log(this.data.status);
     console.log(res);
      
    }
    
  );

  }
  
}
