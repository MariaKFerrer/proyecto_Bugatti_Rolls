/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaRolls;

import java.util.concurrent.Semaphore;

/**
 *
 * @author mkferrerteran
 */
public class GerenteR extends Thread{
    
        Semaphore Reloj = new Semaphore(1);
        public static int diasAntesEntrega;
        public static String G;
        private static boolean activo = true;
        
        public GerenteR (Semaphore Reloj){
            this.Reloj = Reloj;
            G = "";
        }
    
    @Override
        public void run(){
            while(activo){ 
                try {
                    G = "F1 TIME";
                    Thread.sleep((PlantaR.DiaDuracion/72));
                    G = "SPRINT";
                    Thread.sleep((PlantaR.DiaDuracion/72));
                    Reloj.acquire();
                        G = "CONTADOR";
                        Thread.sleep(PlantaR.DiaDuracion/24);
                    Reloj.release();
                } catch (Exception e) {
                }
            }
        }
        
    public void Formula1() throws InterruptedException{
        for(int i = 0; i <= 2; i++){
            G = "F1 TIME";
            Thread.sleep((PlantaR.DiaDuracion/48)); 
        }
    }

}

