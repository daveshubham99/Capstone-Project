import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-userregister',
  templateUrl: './userregister.component.html',
  styleUrls: ['./userregister.component.css']
})
export class USERREGISTERComponent {

  isUpdateFormActive= false;
name:String=''
password:string=''
email:string=''
phoneNo:number=0
address:string=''

constructor( private httpclient:HttpClient){}


register()
{
  let data =

  {
    "name":this.name,
    "password":this.password,
    "email":this.email,
    "phoneNo":this.phoneNo,
    "address":this.address

  };
  
  this.httpclient.post("http://localhost:8081/api/v1/customer/userregister",data,{responseType:'text'}).subscribe((resultdata:any)=>
  
  
  {

    alert( "User create with name "+resultdata)



  }
  );

}





}
