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
public class ProductorRuedasR extends Thread {
    
    private Semaphore productor, mutex, ensamblador;
    private Drive drive;
    private boolean activo = true;
    private int num;
    
    public ProductorRuedasR(Drive drive, Semaphore productor, Semaphore mutex, Semaphore ensamblador, int num) {
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

                    if (0 <= num && num < 5) {
                        this.sleep(PlantaR.DiaDuracion / 3);
                    } else {
                        this.sleep(PlantaR.DiaDuracion / 5);
                    }
                    mutex.acquire();
                    drive.producirRuedas();

                    PlantaR.Ruedas++;
//                    System.out.println("Ruedas: " + PlantaB.Ruedas);
                    
                    mutex.release();
                    ensamblador.release();


            } catch (Exception e) {
            }
        }
    }
    
    public void despRuedas(){
        activo = false;
    }
}

