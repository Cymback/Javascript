function clickHandlerNorth() {
    document.getElementById("pressedHearts").innerText = "North";
}


function clickHandlerWest() {
    document.getElementById("pressedHearts").innerText = "West";
}


function clickHandlerEast() {
    document.getElementById("pressedHearts").innerText = "East";
}


function clickHandlerSouth() {
    document.getElementById("pressedHearts").innerText = "South";
};

document.getElementById("north").onclick = clickHandlerNorth;
document.getElementById("west").onclick = clickHandlerWest;
document.getElementById("east").onclick = clickHandlerEast;
document.getElementById("south").onclick = clickHandlerSouth;
    