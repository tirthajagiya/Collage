import { Component, input, output } from '@angular/core';

@Component({
  selector: 'app-about',
  imports: [],
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {

  constructor(){
    console.log("AboutComponent Constructed")
  }

  ngOnInit(){
    console.log("AboutComponent ngOnInit")
  }

  ngOnChanges(){
    console.log("AboutComponent ngOnChanges")
  }
  ngDoCheck(){
    console.log("AboutComponent ngDoCheck")
  }

  ngOnDestroy(){
    console.log("AboutComponent ngOnDestroy")
  }
  message = input()

  btnCalled = output<void>();

  msgSignal = output<String>();

  btnIncrement(){
    this.btnCalled.emit();
  }

  sendMsg(){
    this.msgSignal.emit("this is the message from child");
  }
}
