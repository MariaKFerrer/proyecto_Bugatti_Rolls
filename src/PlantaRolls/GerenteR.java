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
public class GerenteR extends Thread {

    Semaphore Reloj = new Semaphore(1);
    public static int diasAntesEntrega;
    public static String G;
    private static boolean activo = true;
    private static int F1 = 0;

    public GerenteR(Semaphore Reloj) {
        this.Reloj = Reloj;
        G = "";
    }

    @Override
    public void run() {
        while (activo) {
            try {
                F1 = 0;
                this.Formula1();
//                System.out.println("16 horas");
                Reloj.acquire();
                G = "CONTADOR";
                Thread.sleep(PlantaR.DiaDuracion / 3);
                Reloj.release();
            } catch (Exception e) {
            }
        }
    }

    public void Formula1() throws InterruptedException {
        while (F1 < 16) {
            G = "F1 TIME";
//            System.out.println(G);
            Thread.sleep((PlantaR.DiaDuracion / 48));
            G = "SPRINT";
//            System.out.println(G);

            Thread.sleep((PlantaR.DiaDuracion / 48));
            F1++;
        }
    }
    
   public static void despGR(){
       activo = false;
   }

}
