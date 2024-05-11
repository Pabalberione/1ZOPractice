package ProgramacionOrientadaAObjetos;

public class CreacionMetodosYSobrecarga {
    /*
    * Definicion y estructura
    * -Un metodo es una funcion que realiza una tarea. Puede recibir parámetros y devolver un resultado.
    * -Estructura
    *   modificador tipo_devolucion nombre_metodo(parametros){}
    *
    * -Ejemplos:
    *   public int sumar(int a, int b){
    *       int s = a + b;
    *       return s;//Devolucion
    *   }
    *
    *   public void imprimir(int a){
    *       system.out.println(a);
    *   }
    *
    * Llamada a método
    * -Los métodos se definen dentro de clases, para llamarlos se debe crear un objeto de la clase y utilizar la sintaxis:
    *   objeto.metodo(argumentos)
    *
    * Ejemplos:
    *   class Calc{
    *       public int sumar(int a, int b){
    *           int s = a + b;
    *           return s; //devolucion
    *       }
    *   }
    *
    *   class Test{
    *       public static void main(String [] args){
    *           Calc cl = new Calc();
    *           int s = cl.sumar(8,3);
    *       }
    *   }
    *
    * Sobrecarga de métodos //Pregunta de examen
    * -Una clase puede contener varios métodos con el mismo nombre, pero deben diferenciarse en el numero o tipo de parámetros:
    *   public int sumar(int a, int b){...}
    *   public int sumar(int a){...}//Si el valor devuelto fuera distinto igual cuenta como SOBRECARGA
    *   public int sumar(long b){...}
    * -El tipo de devolucion no afecta en la sobrecarga, puede ser el mismo o diferente.
    * -La version del metodo que será llamado se determina en funcion de los argumentos de la llamada:
    *   sumar(3,9)
    *   sumar(19)
    *   sumar(6L)
    *
    * Precaucion //Posible pregunta de examen
    * -Cuando hay varios posibles metodos que se pueden ejecutar en una llamada: primero se intenta coincidencia exacta,
    *  despues promocion de tipos y en último lugar autoboxing. Esta regla hay que tenerla muy clara
    * */
}
