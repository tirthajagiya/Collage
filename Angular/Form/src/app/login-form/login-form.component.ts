import { NgIf } from '@angular/common';
import { Component, inject } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-form',
  imports: [ReactiveFormsModule, NgIf],
  templateUrl: './login-form.component.html',
  styleUrl: './login-form.component.css'
})
export class LoginFormComponent {
  private _fb = inject(FormBuilder);
  private router = inject(Router);

  login: FormGroup = this._fb.group({
    email: ['', [Validators.required, Validators.minLength(6), Validators.maxLength(30), Validators.email]],
    password: ['', [Validators.required]]
  })

  submit() {
    if(localStorage.getItem('email')==this.login.value.email && localStorage.getItem('password')==this.login.value.password){
      this.router.navigate(['/'])
    }
    else{
      alert("Enter Valid Email And Password")
    }
  }
}
