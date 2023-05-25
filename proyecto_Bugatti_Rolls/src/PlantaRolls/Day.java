/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaRolls;

/**
 *
 * @author mkferrerteran
 */
public class Day extends Thread{
    
    public static int day;
    public int counter;
    public static boolean activo = true;
    
    public Day(){
        this.day = PlantaR.DiasParaEntrega;
        this.counter = 0;
        
    }
    
    @Override
    public void run(){
        while(activo){
            try {
                Thread.sleep(PlantaR.DiaDuracion);
                System.out.println("\n Dia: " + (day-1));
                day--;
//                director.mes--
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
    
}
