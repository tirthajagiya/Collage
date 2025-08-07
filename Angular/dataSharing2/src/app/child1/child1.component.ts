import { Component, input, output } from '@angular/core';

@Component({
  selector: 'app-child1',
  imports: [],
  templateUrl: './child1.component.html',
  styleUrl: './child1.component.css'
})
export class Child1Component {
  count = input()
  name = "abc"

  name2=output<String>();

  ngOnInit(){
    this.name2.emit(this.name)
  }

  // dataShare() {
  // }
}