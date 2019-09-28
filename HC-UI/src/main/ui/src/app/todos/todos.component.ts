import { MpApiService } from './../mp-api.service';
import { Component, OnInit } from '@angular/core';
import {todos} from './todos';

@Component({
  selector: 'todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.scss']
})
export class TodosComponent implements OnInit {
  todosIns : todos;
  data:any;

  model = new todos(new Date(),"Task Description",new Date(),"Task Name",1,"Open")

  constructor(private mpservice:MpApiService) { }

  ngOnInit() {
  }


  taskcreate(){

    this.todosIns=this.model;
    
    console.log(this.todosIns);
    this.mpservice.postcall("8083","createTodo",this.todosIns)
  .subscribe(

    res => {
    
      this.data=res;
      console.log(this.data.status);
     console.log(res);
      
    }
    
  );

  }

}
