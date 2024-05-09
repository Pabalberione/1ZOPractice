package tiposDeDatos;

public class DeclaracionVariables {
    //Declaracion e inicializacion
    int p = 10;

    //Declaracion múltiple
    int g, s, a = 5;

    //Se puede utilizar cualquier combinacion de letra, numeros, $ y _
    //NO se pueden utilizar palabras reservadas como identificador(incluido goto)
    int _1 =10;//OK
    char break; //Error
    int 4aj; //Error
    float car.t; //Error
    int $pablo;//OK
    float ash78;//OK

}
/**
 * No se puede utilizar la palabra reservada this en un metodo estatico
 */

/**
 * Las variables pueden declararse:
 *  A nivel de clase compartidas por todos los metodos. Se les conoce como atributos o campos
 *  En el interior de un metodo. Se les conoce como locales. Son visibles dentro de ese método.
 */
class miClase{
    int n;
    public void method(){
        int c; //Variable local(No se inicializa por defecto. Es necesario asignarle un valor antes de utilizarla)
        int n; //Variable local
        n = 12; //Acceso a variable local
        this.n=4; //Acceso a variable atributo(Recordar siempre que la palabra reservada this sirver para hacer referencia
                  //a las variables que pertenecen a la clase.
        c = c + 3;//Esto devolveria un error
    }

}

/**
 * Las variables Atributo(Osea las propias de la clase) se inicializan por defecto:
 *  Enteras: 0
 *  Decimales: 0.0
 *  Boolean: false
 *  char: '\u0000'(caracter nulo)
 *  Objeto: null
 */