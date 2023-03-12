import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { product } from '../model/product';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent {
indian:string='';
pursian:string='';
chinese:string='';
all:string='';
isResultLoaded=false;
  isUpdateFormActive= false;
    imageurl:string=''
    name:string=''
    price:number=0
    origin:string=''
    searchItem:string='';

CutomerArray : any[]  =[];

constructor (private httpclient:HttpClient){
this.getallproduct();
}

getFoodBypursian() {


  this.httpclient.get("http://localhost:8081/api/v1/product/tag?origin=pursian").subscribe((resultdata:any)=>
  {
    //  this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;

  });
}
getFoodByindian() {


  this.httpclient.get("http://localhost:8081/api/v1/product/tag?origin=indian").subscribe((resultdata:any)=>
  {
    //  this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;

  });
}
getFoodByitalian() {


  this.httpclient.get("http://localhost:8081/api/v1/product/tag?origin=italian").subscribe((resultdata:any)=>
  {
    //  this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;

  });
}
getFoodBychinese() {


  this.httpclient.get("http://localhost:8081/api/v1/product/tag?origin=chinese").subscribe((resultdata:any)=>
  {
    //  this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;

  });
}
getFoodByall() {

  this.getallproduct();
  
}
search(searchItem:string) {

  alert(searchItem)
  this.httpclient.get("http://localhost:8081/api/v1/product/search?searchText="+this.searchItem).subscribe((resultdata:any)=>
  {
    //  this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;

  });
}
  
   
  
 


getallproduct()
{
  
  this.httpclient.get("http://localhost:8081/api/v1/product/getallproducts").subscribe((resultdata:any)=>
  {
    //  this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;
  
     
  
  
  
  
  });


}
addtocart(product:product)
{
  this.httpclient.post("http://localhost:8081/api/v1/product/savecart",product).subscribe((resultdata:any)=>
  {
    //  this.isResultLoaded=true;
     console.log(resultdata);
     this.CutomerArray=resultdata;
  

  
  });

}
}
