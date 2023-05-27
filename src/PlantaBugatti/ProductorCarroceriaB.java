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
public class ProductorCarroceriaB extends Thread {

    private Semaphore productor, mutex, ensamblador;
    private Drive drive;
    private boolean activo = true;
    private int num;

    public ProductorCarroceriaB(Drive drive, Semaphore productor, Semaphore mutex, Semaphore ensamblador, int num) {
        this.productor = productor;
        this.mutex = mutex;
        this.ensamblador = ensamblador;
        this.num = num;
        this.drive = drive;
    }

    @Override
    public void run() {
        while (activo) {
            try {

                    productor.acquire();

                    if (0 <= num && num < 3) {
                        this.sleep(PlantaB.DiaDuracion * 2);
                    } else if (3 <= num && num < 6) {
                        this.sleep(PlantaB.DiaDuracion * 3);
                    } else {
                        this.sleep(PlantaB.DiaDuracion * 4);
                    }
                    mutex.acquire();
                    drive.producirCarroceria();

                    PlantaB.Carroceria++;
//                    System.out.println("Chasis: " + PlantaB.Carroceria);
                    mutex.release();


            } catch (Exception e) {
            }
        }
    }
    
    public void despCarr(){
        activo = false;
    }

}
