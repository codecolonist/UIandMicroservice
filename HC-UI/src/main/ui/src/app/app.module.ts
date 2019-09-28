import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { NavbarComponent } from './navbar/navbar.component';
import { ProfilepicComponent } from './profilepic/profilepic.component';
import { AlbumsComponent } from './albums/albums.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import {IconsModule} from './icons/icons.module';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatChipsModule} from '@angular/material/chips';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import { TodosComponent } from './todos/todos.component';
import { MonthlystatsComponent } from './monthlystats/monthlystats.component';
import { TodolistComponent } from './todolist/todolist.component';
import { MnthstatlistComponent } from './mnthstatlist/mnthstatlist.component';
import {MatTableModule} from '@angular/material/table';

const appRoutes: Routes = [

  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent},
  { path: 'home', component: HomeComponent},
  { path: 'todos', component: TodosComponent},
  { path: 'mnthstats', component: MonthlystatsComponent},
  { path: 'todoslist', component: TodolistComponent},
  { path: 'mnthstatlist', component: MnthstatlistComponent},
  {path:  'home/:lastName',component:HomeComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ProfilepicComponent,
    AlbumsComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    TodosComponent,
    MonthlystatsComponent,
    TodolistComponent,
    MnthstatlistComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    IconsModule,
    MatToolbarModule,
    MatFormFieldModule,
    MatChipsModule,
    MatGridListModule,
    MatButtonModule,
    MatInputModule,
    MatTableModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
