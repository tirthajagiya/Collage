import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { retry } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class ApiStudentService {

  constructor(private _http: HttpClient) { }

  apiUrl = "https://66ee8cc33ed5bb4d0bf144d5.mockapi.io/StudentData/Student"

  getAll() {
    return this._http.get(this.apiUrl)
  }

  getByid(id: number) {
    return this._http.get(this.apiUrl + "/" + id)
  }

  delete(id: number) {
    return this._http.delete(this.apiUrl + "/" + id)
  }

  insert(data: Student) {
    return this._http.post(this.apiUrl, data)
  }

  update(id: number, data: Student) {
    return this._http.put(this.apiUrl + "/" + id, data)
  }
}