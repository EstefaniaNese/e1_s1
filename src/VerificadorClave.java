import java.util.Scanner;

public class verificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese clave de seguridad:");
        String clave = scanner.nextLine();

        // Mostrar la clave ingresada en rojo (esto solo funciona en algunas consolas)
        System.out.println("\u001B[31m" + clave + "\u001B[0m");

        boolean largoValido = clave.length() >= 6;
        boolean tieneLetra = false;
        boolean tieneNumero = false;
        boolean tieneEspecial = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isLetter(c)) {
                tieneLetra = true;
            } else if (Character.isDigit(c)) {
                tieneNumero = true;
            } else {
                tieneEspecial = true;
            }
        }

        if (largoValido && tieneLetra && tieneNumero && tieneEspecial) {
            System.out.println("\nLa clave cumple con los requisitos");
        } else {
            System.out.println("\nLa clave no cumple con los requisitos");
        }
    }
}