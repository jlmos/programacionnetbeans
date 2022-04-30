/*A partir de la clase Cronometro que te proporciona el profesor, realiza un programa como el
de la figura, con un contador de minutos, segundo y décimas de segundo que se puede arrancar
(inicialmente a cero, esto es 00:00,0)
• Emplea la clase swing.Timer.
• Añade un método toString a la clase Cronómetro, que prepare el texto formateado a mostrar en el campo de texto (MM:SS,D)
autor: jose luis mosquera losada
fecha: 02-04-2022*/
package JLMLt12;

   public class Cronometro extends Thread {
   public int decimas;
   public int segundos;
   public int minutos;
   public boolean arrancado;
   
   Cronometro () {
       resetear();
   }
    
   public void resetear(){
      decimas=0;
      segundos=0;
      minutos=0;
      arrancado = false;
   } 
   public void arrancar (){
      arrancado=true;
   }
   public void parar (){
      arrancado = false;
   }
   
   public void incrementar () {
       if (arrancado) {
            decimas++;
            if (decimas==10) {decimas=0;segundos++;}
            else return;
            if (segundos ==60) {segundos=0;minutos++;}
        }
   }    

    @Override
    public String toString() {
        return String.format("%02d:%02d,%d", minutos, segundos, decimas);
    }
   
   
}

