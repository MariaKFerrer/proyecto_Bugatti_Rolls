/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantaBugatti;

/**
 *
 * @author Marcelo
 */
public class Drive {

    // vectores que almacenan partes del vehiculo
    private int chasis[];
    private int carroceria[];
    private int motor[];
    private int ruedas[];
    private int acces[];

    // apuntadores para administrar E/S de las partes
    private int eChasis;
    private int sChasis;

    private int eCarroceria;
    private int sCarroceria;

    private int eMotor;
    private int sMotor;

    private int eRuedas;
    private int sRuedas;

    private int eAcces;
    private int sAcces;

    public Drive() {
        this.chasis = new int[PlantaB.chasisDrive];
        this.carroceria = new int[PlantaB.carroceriaDrive];
        this.motor = new int[PlantaB.motorDrive];
        this.ruedas = new int[PlantaB.ruedasDrive];
        this.acces = new int[PlantaB.accesDrive];

        this.eChasis = 0;
        this.sChasis = 0;
        this.eCarroceria = 0;
        this.sCarroceria = 0;
        this.eMotor = 0;
        this.sMotor = 0;
        this.eRuedas = 0;
        this.sRuedas = 0;
        this.eAcces = 0;
        this.sAcces = 0;

    }

    public void producirChasis() {
        this.chasis[eChasis] = 1;
        eChasis = (eChasis + 1) % PlantaB.chasisDrive;
    }

    public void consumirChasis() {
        this.chasis[sChasis] = 0;
        sChasis = (sChasis + 1) % PlantaB.chasisDrive;
    }

    public void producirCarroceria() {
        this.carroceria[eCarroceria] = 1;
        eCarroceria = (eCarroceria + 1) % PlantaB.carroceriaDrive;
    }

    public void consumirCarroceria() {
        this.carroceria[sCarroceria] = 0;
        sCarroceria = (sCarroceria + 1) % PlantaB.carroceriaDrive;
    }

    public void producirMotor() {
        this.motor[eMotor] = 1;
        eMotor = (eMotor + 1) % PlantaB.motorDrive;
    }

    public void consumirMotor() {
        this.motor[sMotor] = 0;
        sMotor = (sMotor + 1) % PlantaB.motorDrive;
    }

    public void producirRuedas() {
        this.ruedas[eRuedas] = 1;
        System.out.println("eruedas " + eRuedas);
        System.out.println("Drive ruedas " + this.ruedas[eRuedas]);
        eRuedas = (eRuedas + 1) % PlantaB.ruedasDrive;
        System.out.println("Modulo " +eRuedas );
        

    }

    public void consumirRuedas() {
        this.ruedas[sRuedas] = 0;
        System.out.println("Drive ruedas " + this.ruedas[sRuedas]);
        System.out.println("sruedas " + sRuedas);
        sRuedas = (sRuedas + 1) % PlantaB.ruedasDrive;

    }

    public void producirAcces() {
        this.acces[eAcces] = 1;
        eAcces = (eAcces + 1) % PlantaB.accesDrive;
    }

    public void consumirAcces() {
        this.acces[sAcces] = 0;
        sAcces = (sAcces + 1) % PlantaB.accesDrive;
    }

}
