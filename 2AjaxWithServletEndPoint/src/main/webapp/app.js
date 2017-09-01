window.setInterval(function() {
    clickHandler();
}, 3600000);


function clickHandler() {
    var promise = fetch('quotes');
     promise.then(function (response) {
       return response.json();
     }).then(function (quote) {
        document.getElementById("quote").innerText=quote.quote;
     });
};

document.getElementById("button").onclick = clickHandler;