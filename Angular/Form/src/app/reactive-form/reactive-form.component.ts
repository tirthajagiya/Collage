import { CommonModule, NgClass, NgIf } from '@angular/common';
import { Component, NgModule } from '@angular/core';
import { FormControl, Validators ,ReactiveFormsModule, FormsModule } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  imports: [NgIf,CommonModule,ReactiveFormsModule,FormsModule],
  templateUrl: './reactive-form.component.html',
  styleUrl: './reactive-form.component.css'
})
export class ReactiveFormComponent {
  username = new FormControl('', [Validators.required,Validators.minLength(4)]);
  password = new FormControl('', [Validators.required,Validators.minLength(4)]);

  onSubmit() {
    console.log(this.username.value,this.password.value);
  }
  
}