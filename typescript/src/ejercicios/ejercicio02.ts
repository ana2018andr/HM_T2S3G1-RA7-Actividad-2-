(function () {
    let num, j, sum = 0, div = 0;
    num = parseInt("enter one number ");
    for (j = 0; j <= num; j++) {
        sum += j;
        if (j % 3 == 0 && j % 5 == 0 && j != 0) {
            div += 1;
        }
    }
    console.log("sumatoria: " + sum);
    console.log("cantidad de divisores de 3 & 5: " + div);
})();
