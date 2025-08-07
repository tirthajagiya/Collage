import { CommonModule, NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { ReactiveFormComponent } from "./reactive-form/reactive-form.component";
import { SimpleFormComponent } from "./simple-form/simple-form.component";
import { DeclarativeFormComponent } from "./declarative-form/declarative-form.component";
import { ReactiveFormUsingFormBuilderComponent } from "./reactive-form-using-form-builder/reactive-form-using-form-builder.component";
import { LoginFormComponent } from "./login-form/login-form.component";

@Component({
  selector: 'app-root',
  imports: [ReactiveFormComponent, SimpleFormComponent,RouterLink, DeclarativeFormComponent, ReactiveFormUsingFormBuilderComponent, LoginFormComponent,RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
}