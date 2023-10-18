import { NgModule } from '@angular/core';

import { TableModule } from 'app/main/tables/table/table.module';
import { DatatablesModule } from 'app/main/tables/datatables/datatables.module';
import { UsersComponent } from './users/users.component';

@NgModule({
  declarations: [
    UsersComponent
  ],
  imports: [DatatablesModule, TableModule]
})
export class TablesModule {}
