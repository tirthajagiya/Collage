import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ChildComponent } from "./child/child.component";
import { NgIf } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ChildComponent, NgIf, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'dataSharing';
  name: string = "arjun";
  nameChange: boolean = false
  nameOfBtn = "Change Name"

  btnClick(): void {
    if (this.nameOfBtn == "Ok") {
      this.nameOfBtn = "Change Name"
      this.nameChange=false
    }
    else if (this.nameOfBtn == "Change Name") {
      this.nameOfBtn = "Ok"
      this.nameChange = true
    }
  }

  reciveData(e:any){    
    this.name=e
  }
}
