import React from 'react';
import ReactDOM from 'react-dom/client';
import { Faculty, Footer, Header, Home, Contact, About, Student, Admin,Layout,IncremantButton,ForHello,Forms,RouteDemo,DisplayStudentData,LabCrud, Form2 } from './function';
import { BrowserRouter, Form, Link, Outlet, Route, Routes } from 'react-router-dom';

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  <>
    <LabCrud/>
  </>
);