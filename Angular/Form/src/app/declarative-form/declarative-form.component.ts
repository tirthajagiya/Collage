import { CommonModule, NgClass, NgStyle } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import Swal from 'sweetalert2';
import { FormsModule } from '@angular/forms'

@Component({
  selector: 'app-declarative-form',
  imports: [RouterOutlet, FormsModule, CommonModule, NgClass,NgStyle],
  templateUrl: './declarative-form.component.html',
  styleUrl: './declarative-form.component.css'
})

export class DeclarativeFormComponent {
  title = 'Form2';
  darkMode = false
  data = {
    name: "",
    password: ""
  }

  myStyle = {
    "background-color": "#15202b",
    "color": "white"
  }

  noStyle = {

  }

  submitForm(data:any) {
    Swal.fire({
      title: "Form Fill Succesfully",
      icon: "success",
      draggable: true
    });
    console.log(data.value);
    
  }

  modeChange() {
    this.darkMode = !this.darkMode
  }
}
