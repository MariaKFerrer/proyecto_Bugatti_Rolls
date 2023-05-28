/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSO;

import PlantaBugatti.Day;
import PlantaBugatti.PlantaB;
import PlantaRolls.PlantaR;
import PlantaRolls.DayR;

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
            interfaz.cantidadChasisB.setText(String.valueOf(plantaB.Chasis));
            interfaz.cantidadCarrB.setText(String.valueOf(plantaB.Carroceria));
            interfaz.cantidadMotorB.setText(String.valueOf(plantaB.Motor));
            interfaz.cantidadRuedasB.setText(String.valueOf(plantaB.Ruedas));
            interfaz.cantAccesB.setText(String.valueOf(plantaB.Acces));
            interfaz.vehiculosEstandarB.setText(String.valueOf(plantaB.vehiculo));
            interfaz.vehiculosAccB.setText(String.valueOf(plantaB.vehiculoAcc));
            interfaz.empChasisB.setText(String.valueOf(plantaB.prodChasis));
            interfaz.empCarrocB.setText(String.valueOf(plantaB.prodCarroceria));
            interfaz.empMotorB.setText(String.valueOf(plantaB.prodMotor));
            interfaz.empRuedasB.setText(String.valueOf(plantaB.prodRuedas));
            interfaz.empAccesB.setText(String.valueOf(plantaB.prodAcces));
            interfaz.empEnsambB.setText(String.valueOf(plantaB.ensamblador));
            interfaz.empDispB.setText(String.valueOf(plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador)));

            interfaz.CostosBugatti.setText(String.valueOf(Math.abs(plantaB.gastos)));
            interfaz.GananciasBugatti.setText(String.valueOf(plantaB.ganancias));
            interfaz.DiasRestantes.setText(String.valueOf(Day.day));

            interfaz.cantidadChasisR.setText(String.valueOf(plantaR.Chasis));
            interfaz.cantidadCarrR.setText(String.valueOf(plantaR.Chasis));
            interfaz.cantidadMotorR1.setText(String.valueOf(plantaR.Motor));
            interfaz.cantidadRuedasR.setText(String.valueOf(plantaR.Ruedas));
            interfaz.cantAccesR.setText(String.valueOf(plantaR.Acces));

            interfaz.empChasisR.setText(String.valueOf(plantaR.prodChasis));
            interfaz.empCarrocR.setText(String.valueOf(plantaR.prodCarroceria));
            interfaz.empMotorR.setText(String.valueOf(plantaR.prodMotor));
            interfaz.empRuedasR.setText(String.valueOf(plantaR.prodRuedas));
            interfaz.empAccesoriosR.setText(String.valueOf(plantaR.prodAcces));
            interfaz.empEnsamb.setText(String.valueOf(plantaR.ensamblador));
            interfaz.empDispR.setText(String.valueOf(plantaR.maxEmpleados - (plantaR.prodChasis + plantaR.prodCarroceria + plantaR.prodMotor + plantaR.prodRuedas + plantaR.prodAcces + plantaR.ensamblador)));
            interfaz.cantidadVehiculosR1.setText(String.valueOf(PlantaR.vehiculo));
            interfaz.cantidadVehiculosR.setText(String.valueOf(PlantaR.vehiculoAcc));
            
            interfaz.DiasRestantesR.setText(String.valueOf(DayR.day));
            interfaz.GananciasRolls.setText(String.valueOf(plantaR.ganancias));
            interfaz.CostosRolls.setText(String.valueOf(Math.abs(plantaR.gastos)));

        }
    }
    
    public static void stopAct(){
        activo = false;
    }

}
