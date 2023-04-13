//While
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador ++;
}
console.log("Fin del ciclo while")

//do While
let conteo = 0;
do {
    console.log(conteo);
    conteo ++;
} while (conteo < 3);
console.log("Fin del ciclo do while")

//for
for(let contando = 0; contando < 3 ; contando++){
    console.log(contando);
}

//palabra recerbada Break
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
    console.log(contando) // Muestra solo los pares
    break;
    }
}
console.log("termina el ciclo al encontrar el primer numero par")

//Palabra recervada continue y Etiquetas Labels
inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue inicio;//Esto va a continuar a la siguiente iteracion
    }
    console.log(contando) 

}
console.log("termina el ciclo al encontrar el primer numero par")


