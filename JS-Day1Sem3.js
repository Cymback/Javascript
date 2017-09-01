function add(n1, n2) {   // Function declaration

    return n1 + n2;

}

var sub = function (n1, n2) {

    return n1 - n2;
}

var cb = function (n1, n2, callback) {

    return "Result from the two numbers: " + n1 + "+" + n2 + "=" + callback(n1, n2);


};

// Callbacks (with map, filter and foreach)

// 1)

var gurls = ["Peter", "Lars", "Ole", "Janne", "Hanne", "Sanne"];

var gurls2 = gurls.filter(function (word) {
    return word.length <= 3;
});

gurls2.forEach(function (element) {
    console.log(element);
});


console.log("===========================================");


gurls.forEach(function (element) {
    console.log(element);
})

console.log("===========================================");


// 2)

var uppercases = gurls.map(function (x) {
    return x.toUpperCase();
});
console.log(uppercases);

console.log("===========================================");

// 3)

var cb = function (n1, n2, callback) {
    try {
        if (typeof n1 === "number") {
            if (typeof n2 === "number") {
                if (typeof callback === "function") {
                    return "Result from the two numbers: " + n1 + "+" + n2 + "=" + callback(n1, n2);
                }
            }
        }
        throw new Error('Whoops!');
    } catch (e) {
        console.log("the parameters are wrong");
    }
};

console.log("===========================================");

// 4) - a

var cars = [
    {id: 1, year: 1997, make: 'Ford', model: 'E350', price: 3000},
    {id: 2, year: 1999, make: 'Chevy', model: 'Venture', price: 4900},
    {id: 3, year: 2000, make: 'Chevy', model: 'Venture', price: 5000},
    {id: 4, year: 1996, make: 'Jeep', model: 'Grand Cherokee', price: 4799},
    {id: 5, year: 2005, make: 'Volvo', model: 'V70', price: 44799}
];

var carsNewerThan1999 = cars.filter(function (word) {
    return word.year > 1999;
});
console.log(carsNewerThan1999);


console.log("===========================================");

var carsOnlyVolvo = cars.filter(function (word) {
    return word.make == "Volvo"
});
console.log(carsOnlyVolvo);

console.log("===========================================");

var carsLowerPrice = cars.filter(function (word) {
    return word.price < 5000
});
console.log(carsLowerPrice);

console.log("===========================================");


// 4a Use map + join

var sqlIn = "INSERT INTO cars (id,year,make,model,price) VALUES ( 1, 1997 'Ford','E350', 3000 );"

function createSQLstatement() {


}

console.log("INSERT INTO cars (id,year,make,model,price) VALUES ( 1, 1997 'Ford','E350', 3000 );" + createSQLstatement);

console.log("===========================================");


// Asynchronous Callbacks

var msgPrinter = function (msg, delay) {
    setTimeout(function () {
        console.log(msg);
    }, delay);
};
console.log("aaaaaaaaaa");
//msgPrinter ("bbbbbbbbbb",2000);
console.log("dddddddddd");
// msgPrinter ("eeeeeeeeee",1000);
console.log("ffffffffff");


console.log("===========================================");


function Person(name) {
    this.name = name;
    var self = this;
    console.log("Name: " + this.name);
    setTimeout(function () {
        console.log("Hi  " + self.name);  //
    }.bind(this)); // 2000 (Timeout set here - commented out for console purposes)


}

Person("Kurt Wonnegut");  //This is just a constructor

console.log("I'm global: " + name);  //Explain this

var p = new Person("Kurt Wonnegut"); // Creating an instance of constructor function
console.log("I'm global: " + name);

console.log("===========================================");

var greeter = function () {
    console.log(this.message);
};
var comp1 = {message: "Hello World"};
var comp2 = {message: "Hi"};

var g1 = greeter.bind(comp1); //We can store a reference, with a specific “this” to use
var g2 = greeter.bind(comp2); //And here another “this”
// setTimeout(g1, 500);
// setTimeout(g2, 1000);


console.log("===========================================");


var personal = {firstName: "Casper", hobby: "Soccer", age: 24, email: "cph-cl177@cphbusiness.dk"};

delete personal.age; // ( Deleting age ) //
personal.firstName = "Jonny"; // It overwrites the initial firstname

for (hobby in personal) {
    console.log(hobby, personal[hobby])
}

console.log("===========================================");


function me(firstName, lastName, age) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;

}

var MySelf = new Person("Casper", "Gross", 24);










// console.log(add(1,2));

// console.log(add());

// console.log(add(1,2,3));

// console.log(add(1));

// console.log(cb(3,3,add()));

// console.log(cb(4,3, sub()));

// console.log(cb(3,3,add()));

// console.log(cb(3,"hh",add));



