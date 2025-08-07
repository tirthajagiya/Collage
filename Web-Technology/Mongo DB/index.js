const express = require('express');
const mongoose = require('mongoose');
const bodyParser=require('body-parser');
const cors=require('cors');

const Student=require('./Student');

mongoose.connect("mongodb+srv://tirthajagiya:Tirth%405618@cluster0.wzs3y.mongodb.net/Student_Info").then(() => {
    console.log("Conntect");

    const app = express();

    app.use(express.urlencoded());
    app.use(cors());

    //Api

    //getAll
    app.get("/student",async(req,res)=>{
        const ans=await Student.find();
        res.send(ans);
    })

    //getById
    app.get("/student/:id",async(req,res)=>{
        const ans=await Student.findOne({Id: req.params.id});
        res.send(ans);
    })

    //create
    app.post("/student",async (req,res)=>{
        stu=new Student({...req.body});
        const ans=await stu.save();
        res.send(ans);
    });

    //delete
    app.delete('/student/:id',async(req,res)=>{
        const ans=await Student.deleteOne({
            Id:req.params.id
        });
        res.send(ans);
    });

    //update
    app.patch('/student/edit/:id',async(req,res)=>{
        stu=await Student.findOne({Id:req.params.id});
        // stu.Name=req.body.Name;
        stu={...req.body};

        const ans=await stu.save();
        res.send(ans);
    });

    app.listen(3000, () => {
        console.log("Server Start @3000");
    });
})
    .catch(() => {
        console.log("Error");
    })