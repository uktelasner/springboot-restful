import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RoutesRoutingModule } from './routes-routing.module';
import { AccountManagementModule } from './account-management/account-management.module';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RoutesRoutingModule,
    AccountManagementModule
  ]
})
export class RoutesModule { }
