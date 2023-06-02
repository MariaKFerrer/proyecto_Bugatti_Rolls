/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSO;

import PlantaBugatti.Day;
import PlantaBugatti.DirectorB;
import static PlantaBugatti.DirectorB.DIR;
import PlantaBugatti.GerenteB;
import PlantaBugatti.PlantaB;
import PlantaRolls.PlantaR;
import PlantaRolls.DayR;
import PlantaRolls.DirectorR;
import PlantaRolls.GerenteR;

/**
 *
 * @author Marcelo
 */
public class Actualizador extends Thread {

    public Interfaz interfaz;
    PlantaR plantaR;
    PlantaB plantaB;

    private static boolean activo = true;

    public Actualizador(Interfaz interfaz, PlantaB plantaB, PlantaR plantaR) {
        this.interfaz = interfaz;
        this.plantaB = plantaB;
        this.plantaR = plantaR;

    }

    @Override
    public void run() {
        while (activo) {
            interfaz.cantidadChasisB.setText(String.valueOf(Math.abs(plantaB.Chasis)));
            interfaz.cantidadCarrB.setText(String.valueOf(Math.abs(plantaB.Carroceria)));
            interfaz.cantidadMotorB.setText(String.valueOf(Math.abs(plantaB.Motor)));
            interfaz.cantidadRuedasB.setText(String.valueOf(Math.abs(plantaB.Ruedas)));
            interfaz.cantAccesB.setText(String.valueOf(Math.abs(plantaB.Acces)));
            interfaz.vehiculosEstandarB.setText(String.valueOf(Math.abs(plantaB.vehiculo)));
            interfaz.vehiculosAccB.setText(String.valueOf(Math.abs(plantaB.vehiculoAcc)));
            interfaz.empChasisB.setText(String.valueOf(plantaB.prodChasis));
            interfaz.empCarrocB.setText(String.valueOf(plantaB.prodCarroceria));
            interfaz.empMotorB.setText(String.valueOf(plantaB.prodMotor));
            interfaz.empRuedasB.setText(String.valueOf(plantaB.prodRuedas));
            interfaz.empAccesB.setText(String.valueOf(plantaB.prodAcces));
            interfaz.empEnsambB.setText(String.valueOf(plantaB.ensamblador));
            interfaz.empDispB.setText(String.valueOf(plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador)));
            interfaz.DirectorB.setText(DirectorB.DIR);
            interfaz.CostosBugatti.setText(String.valueOf(Math.abs(plantaB.gastos)));
            interfaz.GananciasBugatti.setText(String.valueOf(plantaB.ganancias));
            interfaz.DiasRestantes.setText(String.valueOf(Day.day));
            interfaz.FaltasGerenteB.setText(String.valueOf(DirectorB.contadorF1));
            interfaz.SalarioGerenteB.setText(String.valueOf(DirectorB.contadorF1 * 50));
            interfaz.maxChasisB.setText(String.valueOf(PlantaB.chasisDrive));
            interfaz.maxCarrB.setText(String.valueOf(PlantaB.carroceriaDrive));
            interfaz.maxMotorB.setText(String.valueOf(PlantaB.motorDrive));
            interfaz.maxRuedasB.setText(String.valueOf(PlantaB.ruedasDrive));
            interfaz.maxAccB.setText(String.valueOf(PlantaB.accesDrive));
            interfaz.estadoGerenteB.setText(GerenteB.G);

            interfaz.cantidadChasisR.setText(String.valueOf(Math.abs(plantaR.Chasis)));
            interfaz.cantidadCarrR.setText(String.valueOf(Math.abs(plantaR.Chasis)));
            interfaz.cantidadMotorR1.setText(String.valueOf(Math.abs(plantaR.Motor)));
            interfaz.cantidadRuedasR.setText(String.valueOf(Math.abs(plantaR.Ruedas)));
            interfaz.cantAccesR.setText(String.valueOf(Math.abs(plantaR.Acces)));

            interfaz.empChasisR.setText(String.valueOf(plantaR.prodChasis));
            interfaz.empCarrocR.setText(String.valueOf(plantaR.prodCarroceria));
            interfaz.empMotorR.setText(String.valueOf(plantaR.prodMotor));
            interfaz.empRuedasR.setText(String.valueOf(plantaR.prodRuedas));
            interfaz.empAccesoriosR.setText(String.valueOf(plantaR.prodAcces));
            interfaz.empEnsamb.setText(String.valueOf(plantaR.ensamblador));
            interfaz.empDispR.setText(String.valueOf(plantaR.maxEmpleados - (plantaR.prodChasis + plantaR.prodCarroceria + plantaR.prodMotor + plantaR.prodRuedas + plantaR.prodAcces + plantaR.ensamblador)));
            interfaz.cantidadVehiculosR1.setText(String.valueOf(Math.abs(PlantaR.vehiculo)));
            interfaz.cantidadVehiculosR.setText(String.valueOf(Math.abs(PlantaR.vehiculoAcc)));
            interfaz.FaltasGerenteR.setText(String.valueOf(DirectorR.contadorF1));
            interfaz.DirectorR.setText(DirectorR.DIR);
            interfaz.SalarioGerenteR.setText(String.valueOf(DirectorR.contadorF1 * 50));
            
            interfaz.maxChasisR.setText(String.valueOf(PlantaR.chasisDrive));
            interfaz.masCarrR.setText(String.valueOf(PlantaR.carroceriaDrive));
            interfaz.maxMotorR.setText(String.valueOf(PlantaR.motorDrive));
            interfaz.maxRuedasR.setText(String.valueOf(PlantaR.ruedasDrive));
            interfaz.maxAccR.setText(String.valueOf(PlantaR.accesDrive));
            interfaz.estadoGerenteR.setText(GerenteR.G);

            interfaz.DiasRestantesR.setText(String.valueOf(DayR.day));
            interfaz.GananciasRolls.setText(String.valueOf(plantaR.ganancias));
            interfaz.CostosRolls.setText(String.valueOf(Math.abs(plantaR.gastos)));

        }
    }

    public static void stopAct() {
        activo = false;
    }

}
