import { Routes } from '@angular/router';
import { FacultyComponent } from './faculty/faculty.component';
import { AddfacComponent } from './addfac/addfac.component';

export const routes: Routes = [
    {
        path: "",
        component: FacultyComponent
    },
    {
        path:"faculty",
        component:FacultyComponent
    },
    {
        path: "add",
        component: AddfacComponent
    }
];
