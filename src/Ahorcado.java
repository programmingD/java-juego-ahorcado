import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Entrada de usuario
       Scanner scanner = new Scanner(System.in);

       // Declaraciones
       String palabraSecreta = "inteligencia";
       int intentosMaximo = 8;
       int intentosActuales = 0;
       boolean adivinoLaPalabra = false;

       // Arreglos
       char[] letrasAdivinadas = new char[palabraSecreta.length()];
       
       // estructura de control iterativa (bucle)
       for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] = '_';
       }

       // estructura de control iterativa (bucle)
       while(!adivinoLaPalabra && intentosActuales < intentosMaximo) {
        System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));

        // Entrada del usuario
        System.out.println("Introduce una letra por favor: ");
        char letraEntrada = Character.toLowerCase(scanner.next().charAt(0));
        
        boolean letraCorrecta = false;

        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letraEntrada) {
                letrasAdivinadas[i] = letraEntrada;
                letraCorrecta = true;
            }
        }

        if (!letraCorrecta) {
            intentosActuales++;
            System.out.println("Letra incorrecta, te quedan " + (intentosMaximo - intentosActuales) + " intentos.");
        }

        if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
            adivinoLaPalabra = true;
            System.out.println("Felicidades, adivinaste la palabra en : " + (intentosMaximo - intentosActuales) + " intentos.");
        }

       }

       if (!adivinoLaPalabra) {
        System.out.println("Que pena, no adivinaste");
       }

       scanner.close();

    }
}
