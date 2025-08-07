import { NgFor } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-faculty',
  imports: [NgFor],
  templateUrl: './faculty.component.html',
  styleUrl: './faculty.component.css'
})
export class FacultyComponent {
  faculty = [
    {
      Name: 'Arjun Bala',
      Salary: 50000,
      Image: 'https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/15---28-04-2023-02-07-35.jpg'
    },
    {
      Name: 'Pradyuman Jadeja',
      Salary: 40000,
      Image: 'https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/6---28-04-2023-02-06-07.jpg'
    },
    {
      Name: "Firoz Sherasiya",
      Salary: 30000,
      Image: 'https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/12---28-04-2023-02-06-51.jpg'
    }
  ]

  count = 0;

  updateCount(num: number): void {
    this.count += num;
  }

  setZero(): void {
    this.count = 0;
  }

  imageChange(): void{
    this.count++;
  }

  imageChang(){
    this.count--
  }
}