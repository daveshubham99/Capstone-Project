import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{
  value:any=5;
  login:boolean=false;
  adminlogin:boolean=false;
 constructor(private httpclient:HttpClient)
 {
this.login1();
this.isadminlogin();
this.totalprice();
 
 } ngOnInit(): void {
          // this.login=true;
          

 }

  login1()
          {
           
            
this.httpclient.get("http://localhost:8081/api/v1/customer/islogin").subscribe((resultdata:any)=>
           {

              this.login=resultdata;
              


           });

}
logout()
{
  this.httpclient.get("http://localhost:8081/api/v1/customer/logout").subscribe((resultdata:any)=>
           {

              this.login=resultdata;


           });
}
isadminlogin()
{
  this.httpclient.get("http://localhost:8081/api/v1/customer/isadminlogin").subscribe((resultdata:any)=>
           {

              this.adminlogin=resultdata;


           });
}
adminlogout()
{
  this.httpclient.get("http://localhost:8081/api/v1/customer/isadminlogout").subscribe((resultdata:any)=>
           {

              this.adminlogin=resultdata;
              alert("admin logged out");


           });
}
totalprice()
{
  this.httpclient.get("http://localhost:8081/api/v1/product/totalprice").subscribe((resultdata:any)=>
  {
   //   this.isResultLoaded=true;
     console.log(resultdata);
     this.totalprice=resultdata;
     
     

  });

}
}
