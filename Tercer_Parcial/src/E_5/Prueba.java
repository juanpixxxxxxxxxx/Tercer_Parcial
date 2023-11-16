package E_5;

public class Prueba {
    public static void main(String[] args) {
        Profesores profesor1 = new ProfesorT();
        Profesores profesor2 = (Profesores) profesor1;
        profesor2.imprimir();
    }
}
///*   public static void main(String[] args) {
//        Profesores profesor1 = new ProfesorT();
//        System.out.print("Profesor 1: ");
//        profesor1.imprimir();
//        //propuesto
//
//        Profesores profesor2 = (Profesores) profesor1;
//        System.out.print("Profesor 2: ");
//        profesor2.imprimir();
//    }/*