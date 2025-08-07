import { Component, inject } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { ProductService } from '../product.service';
import { NgFor } from '@angular/common';
import { CartService } from '../cart.service';
import { UserService } from '../user.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-best-selling-product',
  imports: [RouterLink, NgFor, FormsModule],
  templateUrl: './best-selling-product.component.html',
  styleUrl: './best-selling-product.component.css'
})
export class BestSellingProductComponent {
  data: any = []
  private _api1 = inject(ProductService)
  private _api2 = inject(CartService)
  private _api3 = inject(UserService)
  private _router = inject(Router)
  ngOnInit() {
    this._api1.getAll().subscribe((res) => {
      this.data = res
    })
  }

  num: number = 1

  data2: any = {}
  addToCart(i: any) {
    this.data2 = {
      items: [
        {
          productId: i,
          quantity: this.num
        }
      ],
      // totalPrice:
    }
  }

  singleProduct(i:any){
    this._router.navigate(['/product/'+i])
  }
}