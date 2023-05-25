/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaBugatti;

import java.util.concurrent.Semaphore;

/**
 *
 * @author mkferrerteran
 */
public class ProductorAccesoriosB extends Thread {

    private Semaphore productor, mutex, ensamblador;
    private Drive drive;
    private boolean activo = true;
    private int num;

    public ProductorAccesoriosB(Drive drive, Semaphore productor, Semaphore mutex, Semaphore ensamblador, int num) {
        this.productor = productor;
        this.mutex = mutex;
        this.ensamblador = ensamblador;
        this.drive = drive;
        this.num = num;
    }

    @Override
    public void run() {
        while (activo) {
            try {

                    productor.acquire();

                    if (0 <= num && num < 3) {
                        this.sleep(PlantaB.DiaDuracion * 3);
                    } else {
                        this.sleep(PlantaB.DiaDuracion * 2);
                    }
                    mutex.acquire();
                    drive.producirAcces();

                    PlantaB.Acces++;
//                    System.out.println("Accesorios: " + PlantaB.Acces);
                    mutex.release();
                    ensamblador.release();

            } catch (Exception e) {
            }
        }
    }

}
