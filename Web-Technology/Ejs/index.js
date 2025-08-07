const express=require('express');
const path=require('path');

const app=express();

app.set("view engine" , "view");
app.set("views" , path.join(__dirname,"/views"));

app.get("/",(req,res)=>{
    res.render("Home.ejs");
});

app.get("/dice",(req,res)=>{
    const data=Math.floor(Math.random()*6)+1;
    res.render("Dice.ejs",{data});
})

app.listen(3000,()=>{
    console.log("Server Start.");
})