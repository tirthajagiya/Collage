import { NgIf } from '@angular/common';
import { Component, inject } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup-form',
  imports: [ReactiveFormsModule, NgIf],
  templateUrl: './signup-form.component.html',
  styleUrl: './signup-form.component.css'
})
export class SignupFormComponent {
  private _fb = inject(FormBuilder);
  private router=inject(Router);

  signup: FormGroup = this._fb.group({
    name: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(16)]],
    gender: ['', [Validators.required]],
    email: ['', [Validators.required, Validators.minLength(6), Validators.maxLength(30), Validators.email]],
    password: ['', [Validators.required]],
    confirmPassword: ['', [Validators.required]]
  })

  submit() {
    localStorage.setItem('email',this.signup.value.email);
    localStorage.setItem('password',this.signup.value.password);
    console.log("Data Store Done");
    this.router.navigate(['/login-signup-form/login'])
  }
}