import { NgIf, NgStyle } from '@angular/common';
import { Component, inject } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form-using-form-builder',
  imports: [ReactiveFormsModule,NgIf,NgStyle],
  templateUrl: './reactive-form-using-form-builder.component.html',
  styleUrl: './reactive-form-using-form-builder.component.css'
})
export class ReactiveFormUsingFormBuilderComponent {

  private _fb = inject(FormBuilder)

  userForm: FormGroup = this._fb.group({
    userName: ['', [Validators.required,Validators.minLength(3),Validators.maxLength(16)]],
    age: ['', [Validators.required]],
    email: ['', [Validators.required]],
    spi: ['', [Validators.required]],
    contactNumber: ['', [Validators.required]]
  })

  formSubmit(){
        console.log(this.userForm.value);
        this.userForm.value()
  }
}
