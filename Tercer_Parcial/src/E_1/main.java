package E_1;

public class main {

    public static void main(String[] args) {
        Cadena cadena = new Cadena();

        int longitud = cadena.cadenaInicial.length();
        System.out.println("La longitud del String es = " + longitud);


        String cadenaSinEspacios = cadena.cadenaInicial.trim();
        System.out.println("El String sin espacios en blanco = " + cadenaSinEspacios);


        String cadenaMayúscula = cadena.cadenaInicial.toUpperCase();
        System.out.println("El String en mayúscula = " + cadenaMayúscula);


        String cadenaConcatenada = cadenaMayúscula.concat("12345");
        System.out.println("El String concatenado = " + cadenaConcatenada);


        String cadenaExtraida = cadenaConcatenada.substring(24, 31);
        System.out.println("El String extraído = " + cadenaExtraida);


        String cadenaReemplazada = cadenaExtraida.replace("O", "X");
        System.out.println("El String reemplazado = " + cadenaReemplazada);

        boolean comparación = cadenaReemplazada.equals("Programación");
        System.out.println("Los String son iguales = " + comparación);

        // Métodos adicionales

        // Cuenta las mayúsculas
        cadena.cuantasMayusculas(cadenaMayúscula);

        int numOcurrencias = cadena.contarOcurrencias(cadenaMayúscula, 'O');
        System.out.println("La letra 'O' aparece " + numOcurrencias + " veces en el String.");

        System.out.print("textosinespacio ");
        cadena.textoSinEspacio(cadenaMayúscula );



        System.out.print("texto alrevez");
       cadena.alRevez(cadenaMayúscula);
    }
}
