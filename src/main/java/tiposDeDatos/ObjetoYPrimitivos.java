package tiposDeDatos;

public class ObjetoYPrimitivos {
    //Tipos primitivos. La variable CONTIENE al dato
    int n = 200;

    //Tipos Objetos. La variable contiene una referencia al dato
    Object ob = new Object();

    //Tipos primitivos. En una asignacion, cada variable tiene una copia del dato
    int r = 100; //r = 100
    int a = r; //n = 100

    //Tipos objeto. Con variables objeto, ambas variables apuntan a un mismo objeto
    Object obj = new Object();
    Object cp = obj; //Las dos referencias apuntan al mismo objeto.


}
