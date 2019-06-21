(function () {
    let i, j: number;
    let p;
    let rIn = 2;
    let rF = 100;
    for (i = rIn; i <= rF; i++) {
        p = true;
        for (j = 2; j < i; j++) {
            if (i % j == 0) {
                p = false;
            }
        }
        if (p) {
            console.log(i + "\n");
        }
    }
})();
