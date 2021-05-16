import { ProfileComponent } from './components/profile/profile.component';
import { IngredientsComponent } from './components/ingredients/ingredients.component';
import { SauceComponent } from './components/sauce/sauce.component';
import { MeatComponent } from './components/meat/meat.component';
import { WineComponent } from './components/wine/wine.component';

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { UserService } from './services/user.service';
import { LoginComponent } from './components/login/login.component';
import { UsersComponent } from './components/users/users.component';

const routes: Routes = [
      {path:'home',component:HomeComponent},
      {path:'users',component:UsersComponent},
      {path:'wines',component:WineComponent},
      {path:'meats',component:MeatComponent},
      {path:'sauces',component:SauceComponent},
      {path:'ingredients',component:IngredientsComponent},
      {path:'profile',component:ProfileComponent},
      {path:'',component:UsersComponent}]
      

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[HomeComponent,UsersComponent,WineComponent,MeatComponent,SauceComponent,IngredientsComponent,ProfileComponent]
