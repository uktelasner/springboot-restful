import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AccountManagementRoutingModule } from './account-management-routing.module';
import { CustomerListComponent } from './customer/list/list.component';


@NgModule({
  declarations: [CustomerListComponent],
  imports: [
    CommonModule,
    AccountManagementRoutingModule
  ]
})
export class AccountManagementModule { }
