var boys = ["Peter", "lars", "Ole"];
var girls = ["Janne", "hanne", "Sanne"];

var all = boys.concat(girls);

console.log(all); // Prints value

var gurls = ["Peter", "Lars", "Ole", "Janne", "Hanne", "Sanne"];
var gurls2 = ["Peter" - "lars" - "Ole" - "Janne" - "Hanne" - "Sanne"];
var gurls3  = ["Peter", "Lars", "Ole","Janne","Hanne","Sanne"];


gurls.push("Lone", "Gitte");   // End of the array

gurls.splice(0,0,"Hans", "Kurt"); // Push to start

gurls.shift(0,0, "Hans"); // Removing Hans

gurls.pop("Gitte"); // Removing Gitte

gurls.splice(2,3); // Remvoing Janne & Ole (With indexing)

gurls.reverse();   // Reversing, girls come first.


var uppercases = gurls3.map(function (x) { return x.toUpperCase(); });
console.log(uppercases);      // Prints to uppercase letters in array.


var names = ["Peter", "Lars", "Ole", "Janne", "Hanne", "Sanne"];

var dname = names.filter(function (names) { return names.match("L") });

console.log("Uppercase names, Hurray :  " + uppercases);
console.log("The names that contain L :" + dname);
console.log("Assembling boys and girls: " + all);
console.log("What is this: " + gurls);

