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
public class ProductorChasis extends Thread {

    private Semaphore productor, mutex, ensamblador;
    private Drive drive;
    private boolean activo = true;
    private int num;

    public ProductorChasis(Drive drive, Semaphore productor, Semaphore mutex, Semaphore ensamblador, int num) {
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
                
               
                if(0 <= num && num < 3){
                    this.sleep(Planta.DiaDuracion * 2);
                } else if(3 <= num && num < 6){
                    this.sleep(Planta.DiaDuracion * 3);
                } else{
                    this.sleep(Planta.DiaDuracion * 4);
                }
                mutex.acquire();
                drive.producirChasis();
                
                Planta.Chasis++;
                System.out.println("Chasis: " + Planta.Chasis );
                mutex.release();
                ensamblador.release();
                
            } catch (Exception e) {
            }
        }
    }

}
