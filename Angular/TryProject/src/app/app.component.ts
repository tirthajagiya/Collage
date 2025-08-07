import { CommonModule, NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HomeComponent } from './home/home.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,NgFor,CommonModule,HomeComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'TryProject'

  name:string="Tirth"

  isTrue:Boolean=false
  
  student:{name:string,spi:number,roll:number}={
    name:'arjun',
    spi:8,
    roll:101
  }

  date=new Date();

  amount:number=89102;

  temp:any;
  getDetail(e:any){
    console.log(e.target.value);
    this.temp=e.target.value;
  }

  clickButton(){
    console.log("Click Button ! ");
  }

  keydown(){
    console.log("Key Down Work");
  }

  keypress(){
    console.log("Key Press Work");
  }

  keyup(){
    console.log("Key Up Work");
  }

  mousedown(){
    console.log("Mouse Down Work");
  }
}