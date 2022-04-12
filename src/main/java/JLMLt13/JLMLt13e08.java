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


