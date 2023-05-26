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

    public GerenteB(Semaphore Reloj) {
        this.Reloj = Reloj;
        G = "";
    }

    @Override
    public void run() {
        while (activo) {
            try {
                G = "F1 TIME";
                Thread.sleep((PlantaB.DiaDuracion / 48));
                G = "SPRINT";
                Thread.sleep((PlantaB.DiaDuracion / 48));
            } catch (Exception e) {
            }

            try {
                Thread.sleep(PlantaB.DiaDuracion / 16);

                Reloj.acquire();
                G = "CONTADOR";
                Thread.sleep(PlantaB.DiaDuracion /8);
                Reloj.release();
            } catch (Exception e) {
            }
        }
    }

}
