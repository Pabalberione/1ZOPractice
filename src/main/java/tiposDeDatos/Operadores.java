package tiposDeDatos;

import java.util.ArrayList;

public class Operadores {
    /*
     * Aritmeticos
     * Se emplean con tipos numericos primitivos para realizar operaciones aritméticas en un programa: + - * / % ++ --
     * */
    int a = 3;
    a++;// equivale a = (int)(a + 1)
    int x = 6, y = 10, z;
    z =y/x; //el resultado es 1, la division entre enteros es un entero

    /*
     * Los operadores ++ y -- se aplican con tipos numéricos y pueden ir delante o detras de la variable:
     *
     * */
    int a = 3, b;
    b =++a; //b toma el valor de 4
    int c = 3, d;
    d =c++;//d toma el valor de 3

    /*
     * El operador = asigna el resultado de una expresion a una variable
     *
     * Los operadores +=, -=, *=, /=, %=, realizan la operacion entre un dato y la variable y asignan el resultado a la variable
     * */
    int a = 3;
    a+=10;//Equivale a a=a+10
    byte b = 10;
    b+=5; //Ojo, equivale a b=(byte)(b+5)
    b =b+5;//Esto provoca un error de compilacion pues una operacion con int(Los literales enteros son int) siempre da como resultado int

    /*
     * Condicionales
     * Evaluan dos operandos y dan como resultado un valor boolean:
     * <, >, <=, >=, ==, !=
     * Salvo ==, que puede utilizarse con objetos, los demas solo se pueden emplear con tipos primitivos y entre tipos compatibles:
     * */
    int a = 3;
    double c = 9.5;
    boolean x = false;
        if(a>c)//ok
            if(a<x)//error de compilacion

    /*
     * Lógicos
     * Evaluan expresiones de tipo boolean
     * &&, || y !
     * */
    int a = 3;
    int c = 9;
    int n = 0;
        if(a>n &&a<c)//verdadero
        if(!(n==0))

    /*
    * Los operadores && y || funcionan en modo cortocircuito:
    * */
    boolean b = (a<n && a<++c);
    System.out.println(c);//Muestra 9

    /*
    * Otros operadores
    * new. Creacion de objetos a partir de la clase
    * */
        ArrayList lista = new ArrayList();

    /*
    * Instanceof. Comprueba si un objeto es de un tipo dado
    * */
        String s = "hello";
        System.out.println(s instanceof String)//Nuestra true
}
