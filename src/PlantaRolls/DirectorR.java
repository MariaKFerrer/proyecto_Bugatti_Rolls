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
    public static int contadorRM = 0;
    public static int Mes = 30;
    private static boolean activo = true;
    
    public DirectorR (Semaphore Reloj, Semaphore Capitulo, Semaphore VehiculoAcc){
            this.reloj = Reloj;
            DIR = "";
            this.VehiculoAcc = VehiculoAcc;
        }
    
    @Override
    public void run(){
        while(activo){
            try {
                do {                    
                    Thread.sleep(Math.round(Math.random() * (PlantaR.DiaDuracion/16 - PlantaR.DiaDuracion/48) + PlantaR.DiaDuracion/48));
                    DIR ="Revisando";
                    if("F1 TIME".equals(GerenteR.G)){
//                        System.out.println("Gerente atrapado viendo F1");
                        contadorRM++;
                        DIR = "DIVAGANDO";
                    }
                    
                } while (DayR.day != diasParaEntrega);
                
                reloj.acquire();
                DIR = "DESPACHANDO";
                Thread.sleep(PlantaR.DiaDuracion);
                DayR.day = PlantaR.DiasParaEntrega;
                DIR = "DESPACHADO";
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
