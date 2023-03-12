import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class ADDPRODUCTComponent {
   isUpdateFormActive= false;
    imageurl:string=''
    name:string=''
    price:number=0
    origin:string=''
    constructor ( private httpclient:HttpClient )
     {
    // this.getallproduct();
    }
    


 CutomerArray : any[]  =[];
 getallproduct()
{

this.httpclient.get("http://localhost:8081/api/v1/product/getallproducts").subscribe((resultdata:any)=>
{
  //  this.isResultLoaded=true;
   console.log(resultdata);
   this.CutomerArray=resultdata;
});
}





// delete(product:product)

// {
// this.httpclient.post("http://localhost:8081/api/v1/product/deletebyid",product,{responseType:'text'}).subscribe((resultdata:any)=>
// {
//    this.isResultLoaded=true;
//    console.log(resultdata);
//    alert("user deleted ") 
// });
// }


// }
// save()
// {
// console.log(this.productid)
// if(this.productid==0)
// {
//   this.register();
// }
// else{
//   this.setupdate();
// }
// }

register()
{


let data =
{
  
  "imageurl": this.imageurl,
  "name": this.name,
  "price": this.price,
  "origin": this.origin
};
this.httpclient.post("http://localhost:8081/api/v1/product/save",data,{responseType:'text'}).subscribe((resultdata:any)=>
{
  console.log("food added succefully");
  alert("food added succefully");
});
}
// update(product:any)
// {
// this.productid=product.productid;
// this.productName=product.productName;
// this.productTags=product.productTags;
// this.productCompany=product.productCompany;
// this.productPrice=product.productPrice;
// }


// setupdate()
// {


// let data =
// {
//   "productid":this.productid,
//   "productName": this.productName,
//   "productTags": this.productTags,
//   "productCompany": this.productCompany,
//   "productPrice": this.productPrice
// };
// this.httpclient.post("http://localhost:8081/api/v1/product/update",data,{responseType:'text'}).subscribe((resultdata:any)=>
// {
//   console.log("Medicine updated succefully");
//   alert("Medicine updated succefully");
// });
// }  

}
