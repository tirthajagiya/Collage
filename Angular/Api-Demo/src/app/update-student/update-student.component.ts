import { Component, inject } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { ApiStudentService } from '../api-student.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from '../student';

@Component({
  selector: 'app-update-student',
  imports: [ReactiveFormsModule],
  templateUrl: './update-student.component.html',
  styleUrl: './update-student.component.css'
})
export class UpdateStudentComponent {
  private _form = inject(FormBuilder)
  private _api = inject(ApiStudentService)
  private _activatedRoute = inject(ActivatedRoute)
  private _router = inject(Router)

  // data = { name: '', avatar: '' }



  id: number = 0;
  ngOnInit() {
    this.id = this._activatedRoute.snapshot.params["id"]
    this._api.getByid(this.id).subscribe((res: any) => {
      // this.data = res
      this.studentForm.patchValue(res)

      // console.log(this.data);
      // this.studentForm.patchValue({
      //   name: this.data.name,
      //   avatar: this.data.avatar
      // })
    })
  }

  studentForm: FormGroup = this._form.group({
    name: [''],
    avatar: ['']
  })

  updateData(data: any) {
    this._api.update(this.id, data).subscribe((res) => {
      this._router.navigate(['/']);
    })
  }
}
