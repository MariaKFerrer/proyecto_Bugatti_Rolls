/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantas;

/**
 *
 * @author Marcelo
 */
public class Day extends Thread {
    
    public static int day;
    public int counter;
    public static boolean activo = true;
    
    public Day(){
        this.day = 0;
        this.counter = 0;
        
    }
    
    @Override
    public void run(){
        while(activo){
            try {
                Thread.sleep(Planta.DiasParaEntrega);
                System.out.println("Dias: " + Planta.DiasParaEntrega);
                day--;
                
            } catch (Exception e) {
            }
        }
    }
    
}
