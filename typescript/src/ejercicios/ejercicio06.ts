(function () {
    let d,i:number;
    let arreglo= [20],contador=0,div=0;
    d=parseInt(prompt("Ingrese dimension :"));
    for(i=0; i<d;i++){
         arreglo[i]=parseInt(prompt("A["+(i+1)+"]= "));
        } 
         div=parseInt(prompt("Ingrese un divisor: "));   
    for(  i = 0; i < d; i++) 
        if(arreglo[i]%div==0)
            contador=contador+1;
    console.log("Se encontraron : "+contador+ " multiplos del divisor: "+div);
})();