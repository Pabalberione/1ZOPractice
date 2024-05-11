package ProgramacionOrientadaAObjetos;

public class MiembrosEstáticos {//OBJETIVOS ESPECIFICOS DEL EXAMEN
    /*
    * -Son métodos que no están asociados a ningun objeto particular de la clase
    * -Se declaran con la palabra static:
    *   class Calc{
    *       public static int cuadrado(int a){
    *           return a*a;
    *       }
    *   }
    * -No es necesrio crear un objeo para llamar a estos métodos, se utiliza el nombre de la clase:
    *   int r = Calc.cuadrado(4);
    *
    * Consideraciones métodos Estáticos
    * -Solo pueden llamar a otros miembros de su misma clase que TAMBIEN SEAN STATIC
    *   class Test{
    *       int a = 2;
    *       static int b=5;
    *       public static int metodo(){
    *           int c = a * 3; //Error de compilacion
    *           int m = b + 1; //OK
    *           imprime(n); //OK
    *       }
    *       static void imprime(int s){...}
    *   }
    * -No se puede usar en su interior ni this ni super
    *
    * Atributos Estaticos
    * -Son compartidos por todos los objetos de la clase
    * -Se definen con la palabra static
    *
    *   class Test{
    *       static int n = 0;
    *       public void inc(){
    *           n++;
    *       }
    *       public int getN(){return n;}
    *   }
    *
    *   class Prueba{
    *       public static void main(String[]args){
    *           Test t1 = new Test();
    *           t1.inc();
    *           Test t2 = new Test();
    *           t2.inc();
    *           System.out.println(t1.getN());//2
    *           System.out.println(t2.getN());//2 Muestran este resultado porque al ser compartida la variable estática
    *       }                                     se ejecutó 2 veces el incremento, y como los dos objetos comparten la
    *   }                                         mismo variable ese es el resultado de las dos ejecuciones.
    *
    * Bloques estaticos //Pregunta de Examen
    * -Se ejecutan una vez durante la vida de una clase.
    * -Solo puede acceder a otros miembros estáticos
    *
    * class Test{
    *   static int n = 0;
    *   static{
    *       n++;
    *   }
    *   public int getN(){return n;}
    * }
    *
    * class Prueba{
    *   public static void main(String [] args){
    *       Test t1 = new Test();
    *       Test t2 = new Test();
    *       System.out.println(t1.getN());//1
    *       System.out.println(t2.getN());//1 Muestra este resultado porque el metodo static SOLO SE EJECUTA UNA VEZ.
    *   }                                     Por lo que el incremento llevó a que la variable static n sea 1 y no se volvio a ejecutar
    * }                                       el bloque estatico.
    *
    * */
}
