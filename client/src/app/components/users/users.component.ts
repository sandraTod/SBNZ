import { Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';
import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/model/user';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  
  users: User[] = []; 

  constructor(
    private userService: UserService,
    private router :Router ) { }

  ngOnInit() {
    this.userService.getUsers().subscribe(data => this.users = data)
  }

}
