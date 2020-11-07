import { Injectable } from '@angular/core';
import {of} from 'rxjs';
import { Todo } from './../model/Todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  todos: Todo[];
  constructor() {
    this.todos = [
      {
        id: '111',
        title: 'Learn python',
        isComplete: true,
        date: new Date(),
      },
      {
        id: '222',
        title: 'Learn React',
        isComplete: true,
        date: new Date(),
      },
      {
        id: '333',
        title: 'Learn Machine Learning',
        isComplete: false,
        date: new Date(),
      }
    ];
   }

   addTodo(todo: Todo){
    this.todos.push(todo);
   }
   deleteTodo(todo: Todo){
     const i = this.todos.findIndex(
       (currentObj) => currentObj.id === todo.id
     );
     this.todos.splice(i, 1);
   }

   changeStatus(todo: Todo){
    this.todos.map( singleTodo => {
     if (singleTodo.id === todo.id) {
       todo.isComplete = !todo.isComplete;
     }
    });
   }
   getTodos(){
    return of(this.todos);
   }

}
