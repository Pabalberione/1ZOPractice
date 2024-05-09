package tiposDeDatos;

public class ClasesDeEnvoltorio {
    /**
     * Clases de envoltorio
     *  Juego de clases de Java.lang y representaan forma de objetos a los tipos primitivos de Java
     *
     * Encapsulan tipos primitivos como objetos:
     *  Integer integ = Integer.valueOf(200);
     *  Double db = Double.valueOf(30.4)
     *
     *  int k = integer.intValue()
     *  double d = db.doubleValue()
     *
     *  Metodos estáticos para convertir String en tipo primitivo u objeto:
     *  int p = Integer.parseInt("300")
     *  int n = Integer.parseInt("100011", 2); //35
     *  Integer num = Integer.valueOf("100011",2);
     *
     * Autoboxing / Unboxing
     * -Se puede asignar directamente el tipo primitivo a la variable objeto(Autoboxing)
     *  Integer ent = 200;
     *  Double db = 36.8
     *
     * -Se puede recuperar el tipo primitivo asignando directamente la variable objeto a la variable primitiva(unboxing)
     * int n = ent; //Se extrae el numero del objeto antes creado y se lo asigna a la variable
     * Integer k = 30;
     * k++;
     *
     * Inmutabilidad de objetos
     * -Los objetos de las clases envoltorio son inmutables, no se pueden modificar:
     *  Integer ent = 200; //Autoboxing
     *  ent = ent + 100; //genera un nuevo objeto, unboxing + autoboxing
     */
}
