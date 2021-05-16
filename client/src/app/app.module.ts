import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule,routingComponents } from './app-routing.module';
import { UserService } from './services/user.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { UsersComponent } from './components/users/users.component';
import { WineComponent } from './components/wine/wine.component';
import { MeatComponent } from './components/meat/meat.component';
import { SauceComponent } from './components/sauce/sauce.component';
import { IngredientsComponent } from './components/ingredients/ingredients.component';
import { ProfileComponent } from './components/profile/profile.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    routingComponents,
    UsersComponent,
    WineComponent,
    MeatComponent,
    SauceComponent,
    IngredientsComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
    UserService,
    HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
