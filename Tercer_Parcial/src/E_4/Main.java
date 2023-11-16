package E_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.print("Ingrese saldo inicial= ");
        float saldo = sc.nextFloat();
        System.out.print("Ingrese tasa de interés: ");
        float tasa = sc.nextFloat();
        CuentaAhorro cuenta = new CuentaAhorro(saldo, tasa);
        System.out.print("Ingresar cantidad a consignar: "); float cantidadDepositar = sc.nextFloat();
        cuenta.consignar(cantidadDepositar);
        System.out.print("Ingresar cantidad a retirar: ");
        float cantidadRetirar = sc.nextFloat();
        cuenta.retirar(cantidadRetirar);
        cuenta.extractoMensual2();
        cuenta.imprimir();

        //propuesto

        Libro texto = new Libro("Nochesitas","Dennis",351);
        LibroTexto texto2 = new LibroTexto("como estas","yo",51,"cuarto");
        System.out.println("Novela");
        texto.imprimirInfo();
        System.out.println("Libro de texto infocal");
        texto2.imprimirInfo();

    }



}