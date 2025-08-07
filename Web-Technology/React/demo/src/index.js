import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import { MyButton, MyCard } from "./function";
// import App from './App';

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <>
    <MyButton />
    <br/>
    <MyCard />
  </>
);
