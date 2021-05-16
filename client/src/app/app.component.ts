import { Component } from '@angular/core';
import { LoggedUtils } from './utils/loggedUtils';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'client';


  isLoggedIn(){
    return !LoggedUtils.isEmpty();
  }

  getRole(){
    return LoggedUtils.getRole();
  }

  logout(){
    localStorage.removeItem("loggedUser");
  }

}
