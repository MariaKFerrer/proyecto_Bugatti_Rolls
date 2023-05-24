
import PlantaBugatti.PlantaB;
import PlantaRolls.PlantaR;
import java.io.FileNotFoundException;
import java.text.ParseException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, InterruptedException, FileNotFoundException {
        // TODO code application logic here
        PlantaB plantab = new PlantaB(5);
        plantab.Start();
        
//        PlantaR plantar = new PlantaR(9);
//        plantar.Start();


    }
    
}
