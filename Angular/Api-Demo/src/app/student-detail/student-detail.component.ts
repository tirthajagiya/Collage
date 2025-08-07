import { Component, inject } from '@angular/core';
import { ApiStudentService } from '../api-student.service';
import { Student } from '../student';
import { NgFor, NgIf } from '@angular/common';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-student-detail',
  imports: [NgFor, RouterLink,NgIf],
  templateUrl: './student-detail.component.html',
  styleUrl: './student-detail.component.css'
})
export class StudentDetailComponent {
  data: Student[] = []
  private _router = inject(Router)
  constructor(private _api: ApiStudentService) {
    this._api.getAll().subscribe((res: any) => {
      this.data = res;
    })
  }

  deleteStudent(id: any) {
    this._api.delete(id).subscribe((res) => {
        this.data = this.data.filter((obj)=>obj.id !== id);
    })
  }
}