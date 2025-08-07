import { Routes } from '@angular/router';
import { FacultyComponent } from './faculty/faculty.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
    {
        path:"",
        component:HomeComponent
    },
    {
        path: "home",
        component: HomeComponent
    },
    {
        path: "faculty",
        component: FacultyComponent
    },
    {
        path: "contact",
        component: ContactComponent
    },
    {
        path: "about",
        component: AboutComponent
    }
];