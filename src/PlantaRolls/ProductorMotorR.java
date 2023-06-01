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
public class ProductorMotorR extends Thread {

    private Semaphore productor, mutex, ensamblador;
    private Drive drive;
    private boolean activo = true;
    private int num;

    public ProductorMotorR(Drive drive, Semaphore productor, Semaphore mutex, Semaphore ensamblador, int num) {
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
                    this.sleep(PlantaR.DiaDuracion / 3);
                } else if (3 <= num && num < 6) {
                    this.sleep(PlantaR.DiaDuracion / 2);

                } else {
                    this.sleep(PlantaR.DiaDuracion);
                }
                mutex.acquire();
                if (PlantaR.Motor < PlantaR.motorDrive) {
                    drive.producirMotor();

                    PlantaR.Motor++;
                }
//                    System.out.println("Motor: " + PlantaB.Motor);
                mutex.release();
                ensamblador.release();
                productor.release();

            } catch (Exception e) {
            }
        }
    }

    public void despMotor() {
        activo = false;
    }
}
