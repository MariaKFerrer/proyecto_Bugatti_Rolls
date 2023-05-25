/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaRolls;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Marcelo
 */
public class DirectorR extends Thread {

    Semaphore reloj = new Semaphore(1);
    Semaphore vehiculo = new Semaphore(1);
    
    public static int diasParaEntrega;
    public static String DIR;
    public static int contadorRM = 0;
    public static int Mes = 30;
    private static boolean activo = true;
    
    public DirectorR (Semaphore Reloj, Semaphore Capitulo){
            this.reloj = Reloj;
            DIR = "";
        }
    
    @Override
    public void run(){
        while(activo){
            try {
                do {                    
                    Thread.sleep(Math.round(Math.random() * (PlantaR.DiaDuracion/16 - PlantaR.DiaDuracion/48) + PlantaR.DiaDuracion/48));
                    DIR ="Revisando";
                    if("F1 TIME".equals(GerenteR.G)){
//                        System.out.println("Gerente atrapado viendo F1");
                        contadorRM++;
                        DIR = "DIVAGANDO";
                    }
                    
                } while (Day.day != diasParaEntrega);
                
                reloj.acquire();
                    DIR = "DESPACHANDO";
                    Thread.sleep(PlantaR.DiaDuracion);
                    Day.day = PlantaR.DiasParaEntrega;
                    DIR = "DESPACHANDO";
                    Thread.sleep(PlantaR.DiaDuracion);
                    vehiculo.acquire();
                        System.out.println("ganancias");
                    vehiculo.release();
                reloj.release();
                
                
            } catch (Exception e) {
            }
        }
    }

}
