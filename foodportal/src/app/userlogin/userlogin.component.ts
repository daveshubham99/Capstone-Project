import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class USERLOGINComponent {
  email:string='';
  password:string='';
  constructor(private httpclient:HttpClient, private router:Router){}

  login()
  {
    let data ={
      "email":this.email,
      "password":this.password
    }

    this.httpclient.post("http://localhost:8081/api/v1/customer/userlogin",data,{responseType:'text'}).subscribe((resultdata:any)=>
    {
      if(resultdata=="true")
      {
        alert("Logged in succesfully")
      }
      else 
      {
        alert("Invalid crediantials")
      }
        this.router.navigate(['/'])
    });
      
  }

}
