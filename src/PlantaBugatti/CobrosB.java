/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantaBugatti;

/**
 *
 * @author Marcelo
 */
public class CobrosB extends Thread {

    public static int diaDuracion;
    public int contador;

    public CobrosB() {
        this.diaDuracion = PlantaB.DiaDuracion;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(diaDuracion / 24);
                PlantaB.gastos = PlantaB.gastos - (10 * PlantaB.posVecChasis);
                PlantaB.gastos = PlantaB.gastos - (13 * PlantaB.posVecCarroc);
                PlantaB.gastos = PlantaB.gastos - (20 * PlantaB.posVecMotor);
                PlantaB.gastos = PlantaB.gastos - (8 * PlantaB.posVecRuedas);
                PlantaB.gastos = PlantaB.gastos - (17 * PlantaB.posVecAcc);
                PlantaB.gastos = PlantaB.gastos - (25 * PlantaB.posEnsamb);
//                System.out.println(PlantaB.gastos);
            } catch (Exception e) {
            }
        }
    }

}
