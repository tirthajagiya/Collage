import { Component } from '@angular/core';

@Component({
  selector: 'app-contact',
  imports: [],
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css'
})
export class ContactComponent {
  constructor(){
    console.log("ContactComponent Constructed updated")
  }

  ngOnInit(){
    console.log("ContactComponent ngOnInit")
  }

  ngOnChanges(){
    console.log("ContactComponent ngOnChanges")
  }
  ngDoCheck(){
    console.log("ContactComponent ngDoCheck")
  }

  ngOnDestroy(){
    console.log("ContactComponent ngOnDestroy")
  }
}
