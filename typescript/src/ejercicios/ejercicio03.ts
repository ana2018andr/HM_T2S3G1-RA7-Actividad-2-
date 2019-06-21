(function () {
    let  p=0, impar=0, sumatotal=0, m=0;
    let num1,i;
    let num2;
    parseInt(prompt("Ingrese Rango B :"));
for ( i = num1; i <= num2; i++) {
    if (i % 2 == 0) {
        p = p + 1;
    } else {
        impar = impar + 1;
    }
    if (i % 3 == 0) {
        m = m + 1;
    }
    sumatotal = sumatotal + i;
}

console.log("La cantidad de numeros PARES es: " + p);
console.log("La cantidad de numeros IMPARES es: " + impar);
console.log("Los Multiplos de 3 es: " + m);
console.log("La Suma Total del rango es: " + sumatotal);
})();
