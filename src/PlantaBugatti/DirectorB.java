/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaBugatti;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Marcelo
 */
public class DirectorB extends Thread {

    Semaphore reloj = new Semaphore(1);
    Semaphore vehiculo = new Semaphore(1);
    Semaphore VehiculoAcc;

    public static int diasParaEntrega;
    public static String DIR;
    public static int contadorF1 = 0;
    public static int Mes = 30;
    private static boolean activo = true;

    public DirectorB(Semaphore Reloj, Semaphore Vehiculo, Semaphore VehiculoAcc) {
        this.reloj = Reloj;
        DIR = "";
        this.VehiculoAcc = VehiculoAcc;
    }

    @Override
    public void run() {
        while (activo) {
            try {
                do {
                    DIR = "Revisando";
                    Thread.sleep(PlantaB.DiaDuracion / 56);

                    if ("F1 TIME".equals(GerenteB.G)) {
                        contadorF1++;

                    }
                    DIR = "Trabajando";
                    Thread.sleep(PlantaB.DiaDuracion);

                } while (Day.day != diasParaEntrega);
                Day.stopDay();
                Day.day = PlantaB.DiasParaEntrega + 1;
                reloj.acquire();
                DIR = "DESPACHANDO";
                Thread.sleep(PlantaB.DiaDuracion);
                
                DIR = "DESPACHADO";
                CobrosB.stopCobros();

                Thread.sleep(PlantaB.DiaDuracion);

                vehiculo.acquire();
                System.out.println(PlantaB.ganancias);
                System.out.println("Vehiculos normales: " + (450000 * PlantaB.vehiculo));
                PlantaB.ganancias = PlantaB.ganancias + (450000 * PlantaB.vehiculo);
                System.out.println(PlantaB.ganancias);
                vehiculo.release();

                VehiculoAcc.acquire();
                System.out.println("Vehiculos normales: " + (600000 * PlantaB.vehiculoAcc));
                PlantaB.ganancias = PlantaB.ganancias + (600000 * PlantaB.vehiculoAcc);
                System.out.println(PlantaB.ganancias);
                VehiculoAcc.release();

                reloj.release();
                System.out.println("Ingresos brutos: " + PlantaB.ganancias);
                PlantaB.ganancias = PlantaB.ganancias + PlantaB.gastos;
                System.out.println("Gastos: " + PlantaB.gastos);
                System.out.println("Ganancias: " + PlantaB.ganancias);
                PlantaB.stopAll();

            } catch (Exception e) {
            }
        }
    }
    
    public static void despDirB(){
        activo = false;
    }

}
