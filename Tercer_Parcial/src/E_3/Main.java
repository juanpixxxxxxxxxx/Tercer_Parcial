package E_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tienda2 tienda1 = new Tienda2("Tienda Futurama","Dennis",123456);
        Computadora computador1 = new Computadora("HP","Intel iCore 9","Mac",50,18500000);
        Computadora computador2 = new Computadora("samsung","Intel iCore 2","Mac", 80,15500000);
        Computadora computador3 = new Computadora("CHAMSUNG", "Intel iCore 4","Mac",100,2500000);
        tienda1.anadir(computador1);
        tienda1.anadir(computador2);
        tienda1.anadir(computador3);
        System.out.println("Ingrese la marca del computador que desea buscar");
        Scanner sc = new Scanner(System.in);
        String marca= sc.next();
        System.out.println("El computador a buscar: "+ marca+" se encuentra en la posicion: "+ Tienda2.buscar(marca));
        tienda1.imprimir();
    }
}

