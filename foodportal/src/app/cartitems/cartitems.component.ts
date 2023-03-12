import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-cartitems',
  templateUrl: './cartitems.component.html',
  styleUrls: ['./cartitems.component.css']
})
export class CARTITEMSComponent {

  CutomerArray : any[]  =[];
  isResultLoaded =false;
  isUpdateFormActive= false;
  imageurl:string=''
    name:string=''
    price:number=0
    origin:string=''
   

  constructor ( private httpclient:HttpClient  )
  {
    this.getFromCart();
    this.totalprice()
  }
  getFromCart()
{
  this.httpclient.get("http://localhost:8081/api/v1/product/getallcart").subscribe((resultdata:any)=>
  {
     this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;

  });
}
deletefromcart()
{
  
}
totalprice()
{
  this.httpclient.get("http://localhost:8081/api/v1/product/totalprice").subscribe((resultdata:any)=>
  {
     this.isResultLoaded=true;
     console.log(resultdata);
     this.totalprice=resultdata;
     
     

  });

}

}
