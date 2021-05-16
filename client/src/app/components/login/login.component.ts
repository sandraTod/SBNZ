import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: string;
  password: string;

  constructor(
    private userService: UserService,
    private router: Router
  ) { }

  ngOnInit() {
  }

  login(){
    this.userService.authenticate(this.username, this.password).subscribe(
     data => {
      console.log("Ovo je vraceno",data);
      localStorage.setItem("loggedUser",JSON.stringify(data)),
      console.log(localStorage.getItem("loggedUser"))
      this.router.navigate(['/']);
     }
  );
  }

}
