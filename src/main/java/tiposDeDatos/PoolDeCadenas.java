package tiposDeDatos;

public class PoolDeCadenas {
    /*
    * Java utiliza un pool de literales de cadenas de caracteres para optimizar memoria:
    * */
        String n1 = "cadena";
        String n2 = "cadena";
        if(n1 == n2){}//El resultado es verdadero, apuntan al mismo objeto
    /*
    * -Al asignar un literal de cadena, no se crea un nuevo objeto, se comprueba si existe en el pool y si es así se devuelve
    * una referencia al objeto existente. Si no existe, se crea y se graba en el pool.
    * */

    /*
    * Igualdad objetos de envoltorio
    * -Se aplica lo mismo que para cadenas:
    * -Se puede utilizar el metodo equals para comparar los valores envueltos por el objeto
    * */
    Integer int1 = new Integer(20);
    Integer int2 = new Integer(20);
    if(int 1 == int 2){}//Falso

    Integer int3 = 20;
    Integer int4 = 20;
    if(int3 == int4){}//Verdadero


    /*
    * Igualdad de StringBuilder
    * -Representa cadenas mutables(modificables)
    * -No sobrescribe equals(), por lo que == y equals() producen el mismo efecto. Solo verdadero cuando apuntan al mismo objeto.
    * */
    StringBuilder s1 = new StringBuilder("cadena");
    StringBuilder s2 = new StringBuilder("cadena");
    StringBuilder n3 = s2;

    if(s1=s2){}//Falso
    if(s1.equals(s2)){}//Falso
    if(s2 == s3){}//Verdadero

    /*
    * Inmutabilidad de objetos String
    * -Un objeto String representa una cadena de caracteres inmutable, es decir, no se puede modificar.
    * -En la concatenacion, no se modifica ningun objeto existente, se crea uno nuevo:
    * */
    String a1 = "cadena";
    String a2 = " completa";
    a1 = a1 + a2;

}
