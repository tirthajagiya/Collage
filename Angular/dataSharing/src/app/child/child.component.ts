import { NgIf } from '@angular/common';
import { Component, Input, input, output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-child',
  imports: [FormsModule, NgIf],
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
  // parentName = input();
  @Input() parentName: String =''

  nameChange: boolean = false
  nameOfBtn = "Change Name"

  name = output<String>();

  sendData() {
    this.name.emit(this.parentName)
  }
  
  btnClick(): void {
    if (this.nameOfBtn == "Ok") {
      this.nameOfBtn = "Change Name"
      this.nameChange = false
      this.sendData();
    }
    else if (this.nameOfBtn == "Change Name") {
      this.nameOfBtn = "Ok"
      this.nameChange = true
    }
  }
}