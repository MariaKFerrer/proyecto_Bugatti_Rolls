/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSO;

import PlantaBugatti.Day;
import PlantaBugatti.PlantaB;
import PlantaRolls.PlantaR;
import PlantaRolls.DayR;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo
 */
public class Actualizador extends Thread {

    public Interfaz interfaz;
    PlantaR plantaR;
    PlantaB plantaB;

    private static boolean activo = true;

    public Actualizador(Interfaz interfaz, PlantaB planta) {
        this.interfaz = interfaz;
        this.plantaB = planta;

    }

    public Actualizador(Interfaz interfaz, PlantaR planta) {
        this.interfaz = interfaz;
        this.plantaR = planta;

    }

    @Override
    public void run() {
        while (activo) {
           
            interfaz.cantidadChasisB.setText(String.valueOf(plantaB.Chasis));
            interfaz.cantidadCarrB.setText(String.valueOf(plantaB.Carroceria));
            interfaz.cantidadMotorB.setText(String.valueOf(plantaB.Motor));
            interfaz.cantidadRuedasB.setText(String.valueOf(plantaB.Ruedas));
            interfaz.cantAccesB.setText(String.valueOf(plantaB.Acces));
            interfaz.empChasis.setText(String.valueOf(plantaB.prodChasis));
            interfaz.empCarroc.setText(String.valueOf(plantaB.prodCarroceria));
            interfaz.empMotor.setText(String.valueOf(plantaB.prodMotor));
            interfaz.empRuedas.setText(String.valueOf(plantaB.prodRuedas));
            interfaz.empEnsamb.setText(String.valueOf(plantaB.ensamblador));
            interfaz.empAccesorios.setText(String.valueOf(plantaB.prodAcces));
            interfaz.CostosBugatti.setText(String.valueOf(Math.abs(plantaB.gastos)));
            interfaz.GananciasBugatti.setText(String.valueOf(plantaB.ganancias));
            interfaz.DiasRestantes.setText(String.valueOf(Day.day));
            interfaz.vehiculosB.setText(String.valueOf(plantaB.vehiculo));
            interfaz.vehiculosAccB.setText(String.valueOf(plantaB.vehiculoAcc));

            interfaz.empDisp.setText(String.valueOf(plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador)));

            interfaz.cantidadChasisR.setText(String.valueOf(plantaR.Chasis));
            interfaz.cantidadCarrR.setText(String.valueOf(plantaR.Chasis));
            interfaz.cantidadMotorR1.setText(String.valueOf(plantaR.Motor));
            interfaz.cantidadRuedasR.setText(String.valueOf(plantaR.Ruedas));
            interfaz.cantidadVehiculosR.setText(String.valueOf(plantaR.vehiculo));
            interfaz.DiasRestantesR.setText(String.valueOf(DayR.day));
            interfaz.GananciasRolls.setText(String.valueOf(plantaR.ganancias));
            interfaz.CostosRolls.setText(String.valueOf(Math.abs(plantaR.gastos)));

        }
    }

}
