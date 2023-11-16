package E_2;

public class Tienda {
    String nombre;
    String propietario;
    int idTributario;
    Computadoras[] computadoras;
    static int numComputadores;
    public Tienda(String nombre, String propietario, int idTributario, int tam) {
        if (tam < 1) {
            System.out.println("Cantidad de computadores insuficientes");
        } else {
            this.nombre = nombre;
            this.propietario = propietario;
            this.idTributario = idTributario;
            computadoras = new Computadoras[tam];
            numComputadores = 0;
        }
    }
    public boolean tiendaLlena() {
        return numComputadores == computadoras.length;
    }
    public boolean tiendaVacia() {
        return numComputadores == 0;
    }
    public void añadir(Computadoras computadoras) {
        if (tiendaLlena()) {
            System.out.println("La tienda está llena, no se pueden añadir mas computadoras");
        } else {
            this.computadoras[numComputadores] = computadoras;
            numComputadores++;
        }
    }
    public int buscar(String marcaComputador) {
        for (int i = 0; i < numComputadores; i ++) {
            if (computadoras[i].marca.equals(marcaComputador))
                return i;
        }
        return -1;
    }
    public boolean eliminar(String marcaComputador) {
        int pos = buscar(marcaComputador);
        if (pos < 0 ) {
            return false;
        }

        for (int i = pos; i < numComputadores; i ++) {
            computadoras[i] = computadoras[i+1];
        }
        numComputadores--;
        return true;
    }
    public void imprimir() {
        for (int i = 0; i < numComputadores; i ++) {
            System.out.println("Computador" + i);
            System.out.println("Marca = " + computadoras[i].marca);
            System.out.println("Cantidad de memoria = "+ computadoras[i].cantidadMemoria);
            System.out.println("Características del procesador = " + computadoras[i].característicasProcesador);
            System.out.println("Sistema operativo = " + computadoras[i].sistemaOperativo);
            System.out.println("Precio = " + computadoras[i].precio);
        }
    }

}
