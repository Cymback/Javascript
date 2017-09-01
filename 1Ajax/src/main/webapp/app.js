window.setInterval(function() {
    getTime();
}, 1000);


function getTime() {
    var promise = fetch('servlet');
     promise.then(function (response) {
       return response.json();
     }).then(function (getTime) {
        document.getElementById("timeout").innerHTML = JSON.stringify(getTime);
     });
};

document.getElementById("button").onclick = getTime;