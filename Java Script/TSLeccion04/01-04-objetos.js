let x = 10; // variable de tipo primitiva
console.log(x.length);
console.log('Tipos primitivos')
// Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: '30', 
    nombreCompleto: function(){ // Metodo o funcion en JS
        return this.nombre+ ' ' +this.apellido;
    } // para agregar mas propiedades, agrego una coma despues de la llave y continuo abajo.
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('Ejecutando con un objeto')
let persona2 = new Object(); // Debe crear  un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14'
persona2.telefono = '302095825'
console.log(persona2.telefono);

console.log('Creamos un nuevo objeto')
// Acceder a las propiedades de los objetos
console.log(persona['apellido']); // Accedemos como si fuera un arreglo o Array
console.log('Usamos el ciclo for in')
//for in para acceder al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('cambiamos y eliminamos un error')
persona.apellida = 'Betancud';// Cambiamos dinamicamente el valor de un objeto
delete persona.apellida ; // Eliminamos el error
console.log(persona)

// Distintas formas de imprimir un objeto
// Numero 1: concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto: Forma 1')
console.log(persona.nombre+', '+persona.apellido)

// Numero 2: A traves del ciclo for in
console.log('Distintas formas de imprimir un objeto: Forma 2')
for (nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

// Numero 3: La funcion Object.values()
console.log('Distintas formas de imprimir un objeto: Forma 3')
let personaArray = Object.values(persona);
console.log(personaArray)

// Numero 4: Utilizaremos el metodo JSON.stringify
console.log('Distintas formas de imprimir un objeto: Forma 4')
let personaString = JSON.stringify(persona);
console.log(personaString);