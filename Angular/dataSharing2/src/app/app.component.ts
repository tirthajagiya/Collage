import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Child1Component } from "./child1/child1.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Child1Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'dataSharing2';
  count: number = 10
  name=""

  name2(e:any){
    this.name=e
  }

  valueInc(): void {
    this.count++;
  }
}
