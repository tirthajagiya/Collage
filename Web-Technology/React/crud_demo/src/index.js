import React from 'react';
import ReactDOM from 'react-dom/client';
import { BrowserRouter,Routes,Route} from 'react-router-dom';
import Layout from './Component/Layout';
import Home from './Component/Home';
import GetAllStudent from './Component/GetAllStudent';
import DetailStudent from './Component/DetailStudent';
import AddStudent from './Component/AddStudent';
import EditStudent from './Component/EditStudent';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <>
      <BrowserRouter>
          <Routes>
            <Route path="/" element={<Layout/>}>
              <Route index element={<Home/>}/>
              <Route path="/student" element={<GetAllStudent/>}/> 
              <Route path={"/student/:id"} element={<DetailStudent/>}/>
              <Route path={"/student/add"} element={<AddStudent/>}/>
              <Route path={"/student/edit/:id"} element={<EditStudent/>}/>
            </Route>
          </Routes>
      </BrowserRouter>
    </>
);