/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantaRolls;

import PlantaBugatti.*;

/**
 *
 * @author Marcelo
 */
public class CobrosR extends Thread {

    public static int diaDuracion;
    public int contador;

    public CobrosR() {
        this.diaDuracion = PlantaR.DiaDuracion;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(diaDuracion / 24);
                PlantaR.gastos = PlantaR.gastos - (10 * PlantaR.posVecChasis);
                PlantaR.gastos = PlantaR.gastos - (13 * PlantaR.posVecCarroc);
                PlantaR.gastos = PlantaR.gastos - (20 * PlantaR.posVecMotor);
                PlantaR.gastos = PlantaR.gastos - (8 * PlantaR.posVecRuedas);
                PlantaR.gastos = PlantaR.gastos - (17 * PlantaR.posVecAcc);
                PlantaR.gastos = PlantaR.gastos - (25 * PlantaR.posEnsamb);
//                System.out.println(PlantaB.gastos);
            } catch (Exception e) {
            }
        }
    }

}