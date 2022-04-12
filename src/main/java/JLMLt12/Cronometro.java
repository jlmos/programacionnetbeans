/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

