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
public class ProductorChasisR extends Thread {

    private Semaphore productor, mutex, ensamblador;
    private Drive drive;
    private boolean activo = true;
    private int num;

    public ProductorChasisR(Drive drive, Semaphore productor, Semaphore mutex, Semaphore ensamblador, int num) {
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
                        this.sleep(PlantaR.DiaDuracion * 2);
                    } else if (3 <= num && num < 6) {
                        this.sleep(PlantaR.DiaDuracion * 3);
                    } else {
                        this.sleep(PlantaR.DiaDuracion * 4);
                    }
                    mutex.acquire();
                    drive.producirChasis();

                    PlantaR.Chasis++;
//                    System.out.println("Chasis: " + PlantaB.Chasis);
                    mutex.release();
                    ensamblador.release();


            } catch (Exception e) {
            }
        }
    }
    
     public void despChasis(){
        activo = false;
    }

}
