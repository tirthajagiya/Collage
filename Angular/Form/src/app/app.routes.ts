import { Routes } from '@angular/router';
import { SimpleFormComponent } from './simple-form/simple-form.component';
import { DeclarativeFormComponent } from './declarative-form/declarative-form.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { FormBuilder } from '@angular/forms';
import { LoginFormComponent } from './login-form/login-form.component';
import { ReactiveFormUsingFormBuilderComponent } from './reactive-form-using-form-builder/reactive-form-using-form-builder.component';
import { LoginSignupFormComponent } from './login-signup-form/login-signup-form.component';
import { SignupFormComponent } from './signup-form/signup-form.component';

export const routes: Routes = [{
    path: 'simple-form',
    component: SimpleFormComponent
}, {
    path: 'declarative-form',
    component: DeclarativeFormComponent
}, {
    path: 'reactive-form',
    component: ReactiveFormComponent
}, {
    path: 'form-builder',
    component: ReactiveFormUsingFormBuilderComponent
}, {
    path: 'login-signup-form',
    component: LoginSignupFormComponent,
    children: [
        {
            path:'login',
            component:LoginFormComponent
        },
        {
            path:'signup',
            component:SignupFormComponent
        }
    ]
}]; 