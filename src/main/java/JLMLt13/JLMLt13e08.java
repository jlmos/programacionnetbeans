/*Realiza una función/método que se le pase por parámetro una cadena que representa una
dirección de correo electrónico. En caso de que la cadena no cumpla las condiciones sintácticas de
un email, se generará una excepción de tipo: “Formato email inválido”. Los requisitos que tiene que
tener una dirección de email podrían ser: número mínimo de caracteres=5, una arroba y al menos
un punto después de la arroba. Hacer también un programa que llame a la función anterior y capture
la excepción generada.
autor: jose luis mosquera losada
fecha: 12-04-2022*/

package JLMLt13;

public class JLMLt13e08 {

    public static void main(String[] args) {

        String emailCorrecto = "emaildeprueba@gmail.com";
        String emailIncorrecto1 = "emailincorrectogmail.com";
        String emailIncorrecto2 = "em@gmail.com";
        String emailIncorrecto3 = "emailincorrecto@gmailcom";

        String[] pruebas = {emailCorrecto, emailIncorrecto1, emailIncorrecto2, emailIncorrecto3};

        for (String prueba : pruebas) {
            try {
                validarEmail(prueba);
                System.out.println("Email válido: " + prueba);
            } catch (Exception e) {
                System.out.println("Email inválido: " + prueba);
            }
        }
    }

    public static boolean validarEmail(String email) throws Exception {
        if(email.contains("@")) {
            String[] partes = email.split("@");
            if (partes[0].length() < 5) throw new Exception("Formato email inválido");
            if (!partes[1].contains(".")) throw new Exception("Formato email inválido");
            return true;
        } else {
            throw new Exception("Formato email inválido");
        }
    }
}


