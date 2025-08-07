import { Component, inject } from '@angular/core';
import { Student } from '../student';
import { ApiStudentService } from '../api-student.service';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-one-student',
  imports: [RouterLink],
  templateUrl: './one-student.component.html',
  styleUrl: './one-student.component.css'
})
export class OneStudentComponent {
  data: Student = new Student();
  private _activatedRoute = inject(ActivatedRoute)
  private _route = inject(Router)
  constructor(private _api: ApiStudentService) {
    const id = this._activatedRoute.snapshot.params["id"];
    this._api.getByid(id).subscribe((res: any) => {
      this.data = res;
    })
  }

  backToHome() {
    this._route.navigate(['/'])
  }

  deleteStudent() {
    const id = this._activatedRoute.snapshot.params["id"];
    this._api.delete(id).subscribe(() => {
      this._route.navigate(['/'])
    })
  }
}