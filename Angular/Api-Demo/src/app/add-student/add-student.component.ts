import { HttpClient } from '@angular/common/http';
import { Component, inject } from '@angular/core';
import { ApiStudentService } from '../api-student.service';
import { Student } from '../student';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-student',
  imports: [FormsModule,CommonModule],
  templateUrl: './add-student.component.html',
  styleUrl: './add-student.component.css'
})
export class AddStudentComponent {
  private _api = inject(ApiStudentService)
  private _router = inject(Router)

  studentData = new Student()

  saveData(data:any){
    this._api.insert(data.value).subscribe((res) => {
      this._router.navigate(['/']);
    })
  }
}