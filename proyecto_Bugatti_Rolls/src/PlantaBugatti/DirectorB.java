/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaBugatti;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Marcelo
 */
public class DirectorB extends Thread {

    Semaphore reloj = new Semaphore(1);
    Semaphore vehiculo = new Semaphore(1);
    public static int diasParaEntrega;
    public static String DIR;
    public static int contadorRM = 0;
    public static int Mes = 30;
    private static boolean activo = true;
    
    public DirectorB (Semaphore Reloj, Semaphore Capitulo){
            this.reloj = Reloj;
            DIR = "";
        }
    
    @Override
    public void run(){
        while(activo){
            try {
                do {                    
                    Thread.sleep(Math.round(Math.random() * (PlantaB.DiaDuracion/16 - PlantaB.DiaDuracion/48) + PlantaB.DiaDuracion/48));
                    DIR ="Revisando";
                    if("F1 TIME".equals(GerenteB.G)){
//                        System.out.println("Gerente atrapado viendo F1");
                        contadorRM++;
                        DIR = "DIVAGANDO";
                    }
                    
                } while (Day.day != diasParaEntrega);
                
                reloj.acquire();
                    DIR = "DESPACHANDO";
                    Thread.sleep(PlantaB.DiaDuracion);
                    Day.day = PlantaB.DiasParaEntrega;
                    DIR = "DESPACHANDO";
                    Thread.sleep(PlantaB.DiaDuracion);
                    vehiculo.acquire();
                        System.out.println("ganancias");
                    vehiculo.release();
                reloj.release();
                
                
            } catch (Exception e) {
            }
        }
    }

}
