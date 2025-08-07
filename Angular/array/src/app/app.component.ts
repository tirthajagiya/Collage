import { NgFor } from '@angular/common';
import { Component, numberAttribute } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { animationFrameScheduler } from 'rxjs';
import { text } from 'body-parser';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, NgFor, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'array';

  student: string[] = ['a', 'b', 'c']

  border: number = 1;

  name: string = "";

  btnName: string = "Add"

  updatedIndex: number = -1

  searchStu: any = []

  serStu: string = ""

  addStudentName() {
    if (this.btnName == "Add") {
      if (this.name.trim() != "") {
        this.student.push(this.name)
        this.name = ""
      }
    }
    else if (this.btnName == "Update") {
      if (this.name.trim() != "") {
        this.student[this.updatedIndex] = this.name
        this.btnName = "Add"
        this.name = ""
        this.updatedIndex = -1
      }
    }
    else if (this.btnName == "Search") {

      this.btnName = "Add"
    }
    else {
      this.btnName = "Add"
    }
  }

  deleteStudent(index: number) {
    this.student.splice(index, 1);
    this.btnName = "Add"
    this.name = ""
    this.updatedIndex = -1
  }

  updateStudent(index: number) {
    this.name = this.student[index]
    this.btnName = "Update"
    this.updatedIndex = index
  }

  searchStudent() {
    // this.btnName = "Search"
    this.searchStu = this.student.filter((stu: any) => {
      if (stu.includes(this.serStu)) {
        return stu;
      }
    })
  }

  divEvent(){
    this.serStu=""
    this.searchStu=[]
  }
}