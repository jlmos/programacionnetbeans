/* Hacer un programa que cree instancias de delfines, ballenas azules y triatletas
y use los métodos desarrollados
autor: jose luis mosquera losada
fecha: 11-02-2022 */
package JLMLt10;


public class JLMLt10e09 {
    
     public static void main(String[] args) {
        Delfin delfin = new Delfin();
        int resultadoDelfin = delfin.nadar(1000);
        System.out.println("Resultado delfín: " + resultadoDelfin);

        BallenaAzul ballenaAdulta = new BallenaAzul(6);
        BallenaAzul ballenaCria = new BallenaAzul(3);
        int resultadoBallenaAdulta = ballenaAdulta.nadar(1000);
        int resultadoBallenaCria = ballenaCria.nadar(1000);
        System.out.println("Resultado ballena adulta: " + resultadoBallenaAdulta);
        System.out.println("Resultado ballena cria: " + resultadoBallenaCria);

        TriAtleta triAtleta = new TriAtleta(30, true);
        int resultadoTriatletaRecorrer = triAtleta.recorrer(100, "llano");
        int resultadoTriatletaNadar = triAtleta.nadar(1000);
        int resultadoTriatletaSaltar = triAtleta.saltarAltura();
        System.out.println("Resultado triatleta recorrer: " + resultadoTriatletaRecorrer);
        System.out.println("Resultado triatleta nadar: " + resultadoTriatletaNadar);
        System.out.println("Resultado triatleta saltar: " + resultadoTriatletaSaltar);



    }
}  
