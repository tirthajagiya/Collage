import { Component, inject } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { UserService } from '../user.service';
import { BestSellingProductComponent } from "../best-selling-product/best-selling-product.component";

@Component({
  selector: 'app-login',
  imports: [ReactiveFormsModule, RouterLink,FormsModule, BestSellingProductComponent],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  private _fb = inject(FormBuilder)
  private _router = inject(Router)
  private _api = inject(UserService)

  loginForm: FormGroup = this._fb.group({
    email: [''],
    password: ['']
  })

  loginUserId: any = ''
  id = ''
  submitForm() {
    var data: any = {
      email: this.loginForm.value.email,
      password: this.loginForm.value.password
    }
    this._api.login(data).subscribe((res) => {
      this.loginUserId = res
      this.id = this.loginUserId.data._id
      console.log(this.id);
    })
  } 
}
