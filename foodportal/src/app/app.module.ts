import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ADMINComponent } from './admin/admin.component';
import { USERLOGINComponent } from './userlogin/userlogin.component';
import { USERREGISTERComponent } from './userregister/userregister.component';
import { CARTITEMSComponent } from './cartitems/cartitems.component';
import {HttpClientModule} from  '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ADDPRODUCTComponent } from './addproduct/addproduct.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    NavbarComponent,
    ADMINComponent,
    USERLOGINComponent,
    USERREGISTERComponent,
    CARTITEMSComponent,
    ADDPRODUCTComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
