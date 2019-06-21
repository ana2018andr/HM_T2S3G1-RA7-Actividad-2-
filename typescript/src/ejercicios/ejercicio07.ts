(function () {
    let  n , i: number ;
    let p  , x , f  , s  : number;  
    x = parseInt(prompt("Ingrese valor de x : "));
    n = parseInt(prompt("Ingrese valor de n : "));
    p = 1 ;
    f = 1 ;
    s = 1;
    for (i = 1; i <= n - 1 ; i ++) {
         f = f + 1;
         p = p * x;
         s = s * p/f;
    }
   
    console.log("La sumatoria es  : " + s);    
})();