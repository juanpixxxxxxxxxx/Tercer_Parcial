package E_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tienda futurama","juan p",123456, 5);
        Computadoras computador1 = new Computadoras("HP", 38, "Intel iCore 9", "Mac", 18500000);
        Computadoras computador2 = new Computadoras("samsung", 48, "Intel iCore 4", "Mac", 15500000);
        Computadoras computador3 = new Computadoras("CHAMSUNG", 64, "Intel iCore 1", "Mac", 2500000);
        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Que marca de computadora busca?");
        String marca = sc.next();
        System.out.println("El computador de la marca: " + marca +  " se encuentra en la posición " + tienda.buscar(marca));
        tienda.imprimir();
    }
}
