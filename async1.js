console.log("A: When will i be printed");


function cb() {
    console.log("B: When will i be printed");

}

setTimeout(cb, 1000);

console.log("C: When will i be printed");
