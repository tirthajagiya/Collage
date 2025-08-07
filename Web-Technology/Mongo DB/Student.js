const mongoose=require('mongoose');

const schema = mongoose.Schema({
    createdAt:String,
    name:String,
    avatar:String,
    Id:Number
});

module.exports=mongoose.model("Student",schema,"Students");