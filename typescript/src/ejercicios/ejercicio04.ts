(function () {
    let numero,f1,f2,i:number;
    let suma = 0;
    do{
       numero=parseInt(prompt("Introduce numero mayor que 1: " ));
       f2=parseInt(prompt(f2 + " "));
       f1 = parseInt(prompt(f1 + " "));
    }while(numero<1);
    f1=1;
    f2=1; 
    for(i=2;i<=numero;i++){
         f2 = f1 + f2;
         f1 = f2 - f1;
    }
    suma = f1 + f2-1;
    console.log()
    console.log("La sumatoria es: " + suma);
    console.log("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

})();
