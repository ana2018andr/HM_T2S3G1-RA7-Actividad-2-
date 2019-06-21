(function () {
    let t = 0, n1, n2, a = 0, b = 0;
    n1 = parseInt(prompt("numero inicial "));
    n2 = parseInt(prompt("numero final "));
    if (n1 < n2) {
        a = n2;
        b = n1;
    } else {
        a = n1;
        b = n2;
    }
    while (b != 0) {
        t = a % b;
        a = b;
        b = t;
    }
    console.log("resultado :" + a);

})();