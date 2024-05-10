package tiposDeDatos;

public class IgualdadEntreObjetos {
    /*
    * Operador ==
    * -Se utiliza para comprobar la igualdad con tipos primitivos
    * -En variables de tipo objeto compara referencias, no solo objetos:
    * */
        String n1 = new String("cadena");
        String n2 = new String("cadena");
        if(n1 == n2){}//Esto es falso
    //Lo que pasa es que están apuntando a objetos diferentes.

    /*
    * Igualdad de cadenas
    * -Para compara dos cadenas de caracteres utilizamos el metodo equals():
    * */
        String n1 = new String("cadena");
        String n2 = new String("cadena");
        if(n1.equals(n2)){}//Esto es verdadero ya que está comparando la cadena y no las referencias a los objetos-
    /*El metodo equals() distingue mayusculas y minusculas, para ignorar la diferencia utilizamos equalsIgnoreCase()*/

}
