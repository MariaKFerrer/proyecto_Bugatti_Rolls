/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantaBugatti;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Marcelo
 */
public class GerenteB extends Thread {

    Semaphore Reloj = new Semaphore(1);
    public static int diasAntesEntrega;
    public static String G;
    private static boolean activo = true;
    private static int F1 = 0;

    public GerenteB(Semaphore Reloj) {
        this.Reloj = Reloj;
        G = "";
    }

    @Override
    public void run() {
        while (activo) {

            try {
                F1 = 0;
                this.Formula1();
                Reloj.acquire();
                G = "CONTADOR";

                Thread.sleep(PlantaB.DiaDuracion / 3);
                Reloj.release();
            } catch (Exception e) {
            }
        }
    }

    public void Formula1() throws InterruptedException {
        while (F1 < 16) {
            G = "F1 TIME";
//            System.out.println(G);
            Thread.sleep((PlantaB.DiaDuracion / 48));
            G = "SPRINT";
//            System.out.println(G);

            Thread.sleep((PlantaB.DiaDuracion / 48));
            F1++;
        }
    }

    public static void despGB() {
        activo = false;
    }

}
