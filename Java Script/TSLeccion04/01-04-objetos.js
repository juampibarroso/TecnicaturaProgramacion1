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

console.log('Comenzamos a utilizar el metodo get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el metodo get y set para idiomas')
persona.lang = 'en';//Aqui cambiamos el idioma
console.log(persona.lang);

function Persona3(nombre = 'Luis',apellido,email){//Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    //Creamos un metodo dentro del metodo constructor
    this.nombreCompleto= function(){
        return this.nombre+ ' '+this.apellido
    }
}

let padre = new Persona3('Leo','Lopez','lopezl@mail.com');
padre.nombre = 'santiago';//Modificamos el nombre
padre.telefono = '2604232323'//Una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto());//utilizamos la funcion
let madre = new Persona3('Laura','Contrera','contreraL@gmail.com');
console.log(madre);
console.log(madre.telefono); //la propiedad no esta definida
console.log(madre.nombreCompleto());

//Diferentes formas de crear objetos
//caso objeto 1
let miObjeto1 = new Object();//Esta es una opcion formal
//caso objeto 2
let miObjeto2 = {}; //esta opcion es breve y recomendada

//caso String 1
let miCadena1= new String('Hola'); //Sintaxis formal
//caso String 2 
let miCadena2 = 'Hola'; //Esta es la sintaxis simplificada y recomendada

//caso con numeros 1
let miNumero1 = new Number(1);//Caso formal no recomendable
//caso numero2
let miNumero2 = 1; //sintaxis recomendada

//Caso con booleanos 1
let miBoolean1 = new Boolean(false);//formal
//caso n2 booleano
let miBoolean2 = false; //sintaxis recomendada

//caso n1 arreglos
let miArreglo1 = new Array(); //formal
//caso n2 arreglos
let miArreglo2 = []; // sintaxis recomendada

//Funciones caso 1
let miFuncion1 = new function(){};//todo despues de new es considerado objeto
//funciones caso 2
let miFuncion2 = function(){}; // notacion simplificada y recomendada



//Uso de prototype
Persona3.prototype.telefono = '2604023213';
console.log(padre);
console.log(madre.telefono)
madre.telefono = '999999923';
console.log(madre.telefono);


//uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo,telefono){
        return titulo+': '+ this.nombre+ ' '+this.apellido+'. Cel: '+telefono;
        //return this.nombre+ ' '+this.apellido 
    }
}

let persona5 = {
    nombre:'Carlos',
    apellido:'Lara'
}

console.log(persona4.nombreCompleto2('Lic.','12453215323'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ingeniero','21391329123'));



//metodo Apply
let arreglo = ['Ing.','1321453676']
console.log(persona4.nombreCompleto2.apply(persona5,arreglo));
