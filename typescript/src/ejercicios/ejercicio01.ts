(function () {
    let num;
    let s1 = 0, s2 = 0;
    num = parseInt(prompt("Numero: "));
    for (s1 = 0; s1 <= num; s1++) {
        s1 = num * (num + 1) * (2 * num + 1) / 6;
    }
    for (s2 = 0; s2 <= num; s2++) {
        s2 = num * num * (num + 1) * (num + 1) / 4;
    }
    console.log("Suma de los cuadrados de los n primeros terminos:" + s1);
    console.log("Suma de los cubos de los n primeros terminos:" + s2);
})();