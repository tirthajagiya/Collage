import { Component } from '@angular/core';
import { ReactiveFormComponent } from '../reactive-form/reactive-form.component';
import { CommonModule, NgFor } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-simple-form',
  imports: [RouterOutlet, CommonModule, NgFor, ReactiveFormComponent],
  templateUrl: './simple-form.component.html',
  styleUrl: './simple-form.component.css'
})
export class SimpleFormComponent {
  student = {
    Name: "",
    Contact_Number: "",
    Sem: "",
    Spi: ""
  }

  project: any = {
    Project_Name: "",
    Project_Id: "",
    Project_Title: ""
  }
  projects: any = []

  setStudentData(e: any) {
    this.student = { ...this.student, [e.target.name]: e.target.value }
  }

  setProjectData(e: any) {
    this.project = { ...this.project, [e.target.name]: e.target.value }
  }

  addProjectData(e: any) {
    this.projects.push(this.project)
  }
}
