import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { USERLOGINComponent } from './userlogin/userlogin.component';
import { USERREGISTERComponent } from './userregister/userregister.component';
import { ADMINComponent } from './admin/admin.component';
import { CARTITEMSComponent } from './cartitems/cartitems.component';
import { ADDPRODUCTComponent } from './addproduct/addproduct.component';

const routes: Routes = [

{
  path:"",
  component:HomePageComponent
},
{
  path:"userLogin",
  component:USERLOGINComponent
},
{
  path:"userRegister",
  component:USERREGISTERComponent
},
{
  path:"admin",
  component:ADMINComponent
},
{
  path:"cart",
  component:CARTITEMSComponent
},
{
  path:"addproduct",
  component:ADDPRODUCTComponent
}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
