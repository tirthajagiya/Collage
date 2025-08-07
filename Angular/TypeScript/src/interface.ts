interface Animal {
    age: number;
    fname: string;

    bark(): void;
    eat(): void;
}

class Dog implements Animal {
    age = 10;
    fname = "a";

    bark(): void {
        console.log("Bark");
    }

    eat(): void {
        console.log("Eat");
    }
}

let d1:Dog = new Dog()
d1.eat()