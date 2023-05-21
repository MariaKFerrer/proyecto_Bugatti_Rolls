/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaRolls;

import PlantaRolls.ProductorCarroceriaR;
import PlantaRolls.ProductorChasisR;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
/**
 *
 * @author mkferrerteran
 */

public class PlantaR {

    PlantaRolls.Drive driveChasis; // buffer de chasis
    PlantaRolls.Drive driverCarroceria;
    PlantaRolls.Drive driveMotor;
    PlantaRolls.Drive driveRuedas;
    PlantaRolls.Drive driveAcces;

    public static int DiaDuracion; // duracion del dia
    public static int DiasParaEntrega;
    public int maxEmpleados;

    public static int Chasis;
    public static int Carroceria;
    public static int Motor;
    public static int Ruedas;
    public static int Acces;

    public static int prodChasis;
    public static int prodCarroceria;
    public static int prodMotor;
    public static int prodRuedas;
    public static int prodAcces;
    public static int ensamblador;

    public static int chasisDrive;  // almacenamiento de chasis en drive
    public static int carroceriaDrive; // almacenamiento de carroceria en drive
    public static int motorDrive; // almacenamiento de motor en drive
    public static int ruedasDrive; // almacenamiento de ruedas en drive
    public static int accesDrive; // almacenamiento de accesorios en drive

    public static ProductorChasisR[] vecProdChasis;
    public static ProductorCarroceriaR[] vecProdCarroc;
    public static int posVecCarroc;
    public static int posVecChasis;

    // semaforos p= productores , m = mutex , e = ensamblador
    Semaphore pChasis;
    Semaphore pCarroceria;
    Semaphore pMotor;
    Semaphore pRuedas;
    Semaphore pAcces;

    Semaphore mChasis = new Semaphore(1);
    Semaphore mCarroceria = new Semaphore(1);
    Semaphore mMotor = new Semaphore(1);
    Semaphore mRuedas = new Semaphore(1);
    Semaphore mAcces = new Semaphore(1);

    Semaphore eChasis = new Semaphore(0);
    Semaphore eCarroceria = new Semaphore(0);
    Semaphore eMotor = new Semaphore(0);
    Semaphore eRuedas = new Semaphore(0);
    Semaphore eAcces = new Semaphore(0);

    public PlantaR(int num) {
        this.maxEmpleados = num + 10;
    }

    public void iniciarValores() throws InterruptedException, FileNotFoundException {
        Scanner doc = new Scanner(new File("src/Plantas/values.txt"));
        String line = doc.nextLine();

        DiaDuracion = parseInt(line.substring(17, 25).trim());
        if (DiaDuracion < 1) {
            DiaDuracion = 5;
        }
        DiaDuracion = DiaDuracion * 1000;

        line = doc.nextLine();

        DiasParaEntrega = parseInt(line.substring(17, 25).trim());
        if (DiasParaEntrega < 1) {
            DiasParaEntrega = 30;
        }
        line = doc.nextLine();

        chasisDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine();
        if (chasisDrive < 1) {
            chasisDrive = 50;
        }

        carroceriaDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de carroceria en el Drive
        if (carroceriaDrive < 1) {
            carroceriaDrive = 30;
        }

        motorDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de motor en el Drive
        if (motorDrive < 1) {
            motorDrive = 25;
        }

        ruedasDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de ruedas en el Drive
        if (ruedasDrive < 1) {
            ruedasDrive = 55;
        }
        accesDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de accesorios en el Drive
        if (accesDrive < 1) {
            accesDrive = 40;
        }

        driveChasis = new PlantaRolls.Drive();
        driverCarroceria = new PlantaRolls.Drive();
        driveRuedas = new PlantaRolls.Drive();
        driveMotor = new PlantaRolls.Drive();
        driveAcces = new PlantaRolls.Drive();

        prodChasis = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de chasis
        if (prodChasis < 1) {
            prodChasis = 1;
        }

        prodCarroceria = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de carroceria
        if (prodCarroceria < 1) {
            prodCarroceria = 1;
        }

        prodMotor = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de motor
        if (prodMotor < 1) {
            prodMotor = 1;
        }

        prodRuedas = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de ruedas
        if (prodRuedas < 1) {
            prodRuedas = 1;
        }

        prodAcces = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de accesorios
        if (prodAcces < 1) {
            prodAcces = 1;
        }

        ensamblador = parseInt(line.substring(17, 25).trim()); //Numeros de ensambladores 

        pChasis = new Semaphore(chasisDrive);
        pCarroceria = new Semaphore(carroceriaDrive);
        pMotor = new Semaphore(motorDrive);
        pRuedas = new Semaphore(ruedasDrive);
        pAcces = new Semaphore(accesDrive);

        vecProdChasis = new ProductorChasisR[maxEmpleados];
        vecProdCarroc = new ProductorCarroceriaR[maxEmpleados];

    }

    public void Start() throws ParseException, InterruptedException, FileNotFoundException {
        iniciarValores();
    }

    public void productorChasis() {
        System.out.println(maxEmpleados);
        vecProdChasis[posVecChasis] = new ProductorChasisR(driveChasis, pChasis, mChasis, eChasis, maxEmpleados - 10);
        vecProdChasis[posVecChasis].start();
        posVecChasis++;
    }

}

