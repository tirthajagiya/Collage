import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule, NgFor, NgIf, NgStyle } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [FormsModule, CommonModule, NgStyle,NgIf ,NgFor],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  // audioPlay:boolean=false

  // myColor:any = {
  // }

  // startLight() {
  //   setInterval(() => {
  //     this.myColor['background-color']="rgb("+Math.random()*255+","+Math.random()*255+","+Math.random()*255+")"
  //   }, 100)
  // }

  // ngOnInit(){
  //   var myMusic=document.getElementById('myAudio');
  //   console.log(myMusic);
  //   myMusic.play()
  //   // myMusic.play();
  // }

  isAgree: boolean = false;

  userAgree() {
    this.isAgree=!this.isAgree
  }

  student=[
    {
      Name:"Arjun",
      Mark:80
    },
    {
      Name:"Bala",
      Mark:21
    },
    {
      Name:"Darshan",
      Mark:45
    },
    {
      Name:"Rajkot",
      Mark:52
    },
    {
      Name:"Gujrat",
      Mark:100
    }
  ]

}