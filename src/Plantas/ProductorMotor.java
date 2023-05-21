/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantas;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Marcelo
 */
public class ProductorMotor extends Thread {

    private Semaphore productor, mutex, ensamblador;
    private Drive drive;
    private boolean activo = true;
    private int num;
    
    public ProductorMotor(Drive drive, Semaphore productor, Semaphore mutex, Semaphore ensamblador, int num) {
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
                    this.sleep(Planta.DiaDuracion / 3);
                } else if (3 <= num && num < 6) {
                    this.sleep(Planta.DiaDuracion / 2);
                } else {
                    this.sleep(Planta.DiaDuracion);
                }
                mutex.acquire();
                drive.producirMotor();

                Planta.Motor++;
                System.out.println("Motor: " + Planta.Motor);
                mutex.release();
                ensamblador.release();

            } catch (Exception e) {
            }
        }
    }

}
