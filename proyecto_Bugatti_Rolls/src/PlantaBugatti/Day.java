/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantaBugatti;

/**
 *
 * @author Marcelo
 */
public class Day extends Thread {
    
    public static int day;
    public int counter;
    public static boolean activo = true;
    
    public Day(){
        this.day = PlantaB.DiasParaEntrega;
        this.counter = 0;
        
    }
    
    @Override
    public void run(){
        while(activo){
            try {
                Thread.sleep(PlantaB.DiaDuracion);
                System.out.println("\n Dia: " + (day-1));
                day--;
//                director.mes--
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
    
}
