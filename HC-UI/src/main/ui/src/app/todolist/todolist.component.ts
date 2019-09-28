import { todos } from './../todos/todos';
import { MpApiService } from './../mp-api.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'todolist',
  templateUrl: './todolist.component.html',
  styleUrls: ['./todolist.component.scss']
})
export class TodolistComponent implements OnInit {

  todosIns : todos;
  todoslist:todos[];
  data:any;
  

  constructor(private mpservice:MpApiService) { }

  ngOnInit() {

  this.mpservice.getcall("8083","todoslist").subscribe(
    resp=>{
     
      this.todoslist=resp as todos[];
      
      console.log(this.todoslist);
    }
  );
    
  }
 



}
