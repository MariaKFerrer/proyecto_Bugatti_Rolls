/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaRolls;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Marcelo
 */
public class DirectorR extends Thread {

    Semaphore reloj = new Semaphore(1);
    Semaphore vehiculo = new Semaphore(1);
    Semaphore VehiculoAcc;

    public static int diasParaEntrega;
    public static String DIR;
    public static int contadorF1 = 0;
    public static int Mes = 30;
    private static boolean activo = true;

    public DirectorR(Semaphore Reloj, Semaphore Capitulo, Semaphore VehiculoAcc) {
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
                    Thread.sleep(PlantaR.DiaDuracion / 56);

                    if ("F1 TIME".equals(GerenteR.G)) {
//                        System.out.println("Gerente atrapado viendo F1");
                        contadorF1++;

                    }
                    DIR = "Trabajando";

                    Thread.sleep(PlantaR.DiaDuracion);

                } while (DayR.day != diasParaEntrega);
                DayR.stopDay();
                DayR.day = PlantaR.DiasParaEntrega + 1;
                reloj.acquire();
                DIR = "DESPACHANDO";
                Thread.sleep(PlantaR.DiaDuracion);

                DIR = "DESPACHADO";
                CobrosR.stopCobros();

                Thread.sleep(PlantaR.DiaDuracion);
                vehiculo.acquire();
                System.out.println(PlantaR.ganancias);
                System.out.println("Vehiculos normales: " + (450000 * PlantaR.vehiculo));
                PlantaR.ganancias = PlantaR.ganancias + (450000 * PlantaR.vehiculo);
                System.out.println(PlantaR.ganancias);
                vehiculo.release();

                VehiculoAcc.acquire();
                System.out.println("Vehiculos normales: " + (900000 * PlantaR.vehiculoAcc));
                PlantaR.ganancias = PlantaR.ganancias + (900000 * PlantaR.vehiculoAcc);
                System.out.println(PlantaR.ganancias);
                VehiculoAcc.release();

                reloj.release();
                System.out.println("Ingresos brutos: " + PlantaR.ganancias);
                PlantaR.ganancias = PlantaR.ganancias + PlantaR.gastos;
                System.out.println("Gastos: " + Math.abs(PlantaR.gastos));
                System.out.println("Ganancias: " + PlantaR.ganancias);

            } catch (Exception e) {
            }
        }
    }

}
