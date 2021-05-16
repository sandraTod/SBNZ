import { User } from './../model/user';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  public authenticate(username: string, password: string) {
    let authenticationRequest = { username: username, password: password };
    let params = JSON.stringify(authenticationRequest);
    let headers = new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8');
    return this.http.post("http://localhost:8000/auth", params,
      {
        headers: headers
      });
  }

  constructor(private http: HttpClient) { }

  public getHello(): Observable<String>{
    return this.http.get<String>("http://localhost:8000/api/user/hello");
  }

  public getUsers(): Observable<User[]>{
    return this.http.get<User[]>("http://localhost:8000/api/user/getAllUsers");
  }
}
