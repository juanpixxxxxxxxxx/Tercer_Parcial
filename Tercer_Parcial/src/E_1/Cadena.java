package E_1;
public class Cadena {

    public String cadenaInicial = " Programación Orientada a Objetos ";

    int cuantasMayusculas(String texto){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contador++;
            }
        }
        return contador;
    }

    public int contarOcurrencias(String cadenaMayúscula, char o) {

        return 0;
    }


    public void textoSinEspacio(String text) {
        String newText = text.replaceAll(" ", "");
        System.out.println(newText);
    }

    public void alRevez(String text) {
        char[] celdascad = text.toCharArray();
        int tam = celdascad.length;
        for (int i = tam - 1; i >= 0; i--) {
            System.out.print(celdascad[i]);
        }
    }
}