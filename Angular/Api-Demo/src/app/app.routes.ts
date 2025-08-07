import { Routes } from '@angular/router';
import { StudentDetailComponent } from './student-detail/student-detail.component';
import { OneStudentComponent } from './one-student/one-student.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { UpdateStudentComponent } from './update-student/update-student.component';

export const routes: Routes = [
    {
        path: '',
        component: StudentDetailComponent
    },
    {
        path: 'add-student',
        component: AddStudentComponent
    },
    {
        path: 'update/:id',
        component: UpdateStudentComponent
    },
    {
        path: ':id',
        component: OneStudentComponent
    },
];