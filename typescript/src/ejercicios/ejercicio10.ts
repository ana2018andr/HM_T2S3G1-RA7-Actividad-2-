(function () {
    let iCantidad = 0;
    let n=0;
     n=parseInt(prompt("Introduce numero : "));
    while (n>0){
      n = n/10;
      iCantidad++;
    }
    console.log("tiene " + iCantidad + " dígitos conformantes de un numero capicua");
})();