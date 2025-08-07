"use strict";
class Dog {
    constructor() {
        this.age = 10;
        this.fname = "a";
    }
    bark() {
        console.log("Bark");
    }
    eat() {
        console.log("Eat");
    }
}
let d1 = new Dog();
d1.eat();
