/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaRolls;

import PlantaRolls.ProductorCarroceriaR;
import PlantaRolls.ProductorChasisR;
import ProyectoSO.Actualizador;
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

    Drive driveChasis; // buffer de chasis
    Drive driveCarroceria;
    Drive driveMotor;
    Drive driveRuedas;
    Drive driveAcces;

    public static int DiaDuracion; // duracion del dia
    public static int DiasParaEntrega;
    public int maxEmpleados;
    public static double gastos;
    public static double ganancias;

    public static int Chasis; // numero de chasis
    public static int Carroceria; // numero de Carroceria
    public static int Motor; // numero de Motor
    public static int Ruedas; // numero de Ruedas
    public static int Acces; // numero de Accesosios
    public static int vehiculo; // numero de vehiculos normales
    public static int vehiculoAcc; // numero de vehiculos con accesorios
    public static int contadorVehiculos; // contador de vehiculos ensamblados

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
    public static ProductorMotorR[] vecProdMotor;
    public static ProductorRuedasR[] vecProdRuedas;
    public static ProductorAccesoriosR[] vecProdAcc;
    public static EnsambladorR[] vecEnsamblador;

    public static int posVecCarroc;
    public static int posVecChasis;
    public static int posVecMotor;
    public static int posVecRuedas;
    public static int posVecAcc;
    public static int posEnsamb;

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

    Semaphore Reloj = new Semaphore(1);

    Semaphore Vehiculo = new Semaphore(1);
    Semaphore VehiculoAcc = new Semaphore(1);
    Semaphore contadorVe = new Semaphore(1);

    public PlantaR(int num) {
        this.maxEmpleados = num + 10;
    }

    public void iniciarValores() throws InterruptedException, FileNotFoundException {

        vehiculo = 0;

        Scanner doc = new Scanner(new File("src/PlantaRolls/values.txt"));
        String line = doc.nextLine();

        DiaDuracion = parseInt(line.substring(17, 25).trim());
        if (DiaDuracion < 1) {
            DiaDuracion = 5;
        }

        DiaDuracion = DiaDuracion * 500;


        DiasParaEntrega = parseInt(line.substring(17, 25).trim());
        if (DiasParaEntrega < 1) {
            DiasParaEntrega = 30;
        }
        line = doc.nextLine();
                


        chasisDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine();
        if (chasisDrive < 1) {
            chasisDrive = 25;
        }
       

        carroceriaDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de carroceria en el Drive
        if (carroceriaDrive < 1) {
            carroceriaDrive = 20;
        }

        motorDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de motor en el Drive
        if (motorDrive < 1) {
            motorDrive = 55;
        }

        ruedasDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de ruedas en el Drive
        if (ruedasDrive < 1) {
            ruedasDrive = 35;
        }
        
         
        accesDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de accesorios en el Drive
        if (accesDrive < 1) {
            accesDrive = 10;
        }
        driveChasis = new Drive();
        driveCarroceria = new Drive();
        driveRuedas = new Drive();
        driveMotor = new Drive();
        driveAcces = new Drive();

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
        if (ensamblador < 1) {
            ensamblador = 1;
        }
        
        

        pChasis = new Semaphore(chasisDrive);
        pCarroceria = new Semaphore(carroceriaDrive);
        pMotor = new Semaphore(motorDrive);
        pRuedas = new Semaphore(ruedasDrive);
        pAcces = new Semaphore(accesDrive);

        vecProdChasis = new ProductorChasisR[maxEmpleados];
        vecProdCarroc = new ProductorCarroceriaR[maxEmpleados];
        vecProdAcc = new ProductorAccesoriosR[maxEmpleados];
        vecProdMotor = new ProductorMotorR[maxEmpleados];
        vecProdRuedas = new ProductorRuedasR[maxEmpleados];
        vecEnsamblador = new EnsambladorR[maxEmpleados];
    }

    public void Start() throws ParseException, InterruptedException, FileNotFoundException {

        iniciarValores();
        crearContadorDias();
        crearDirector();
        crearGerente();

        if ((prodAcces + prodCarroceria + prodChasis + prodMotor + prodRuedas + ensamblador) <= maxEmpleados) {
            for (int i = 0; i < prodAcces; i++) {
                productorAcce();
            }

            for (int i = 0; i < prodCarroceria; i++) {
                productorCarroc();
            }

            for (int i = 0; i < prodChasis; i++) {
                productorChasis();
            }

            for (int i = 0; i < prodMotor; i++) {
                productorMotor();
            }
            for (int i = 0; i < prodRuedas; i++) {
                productorRuedas();
            }
            for (int i = 0; i < ensamblador; i++) {
                Ensamblador();
            }
            cobros();

        }
    }

    public void crearContadorDias() {
        DayR day = new DayR();
        day.start();
    }

    public void crearDirector() {
        DirectorR dir = new DirectorR(Reloj, Vehiculo, VehiculoAcc);
        dir.start();
    }

    public void crearGerente() {
        GerenteR ger = new GerenteR(Reloj);
        ger.start();
    }

    public void productorChasis() {
        vecProdChasis[posVecChasis] = new ProductorChasisR(driveChasis, pChasis, mChasis, eChasis, maxEmpleados - 10);
        vecProdChasis[posVecChasis].start();
        posVecChasis++;
    }

    public void productorCarroc() {
        vecProdCarroc[posVecCarroc] = new ProductorCarroceriaR(driveCarroceria, pCarroceria, mCarroceria, eCarroceria, maxEmpleados - 10);
        vecProdCarroc[posVecCarroc].start();
        posVecCarroc++;
    }

    public void productorMotor() {
        vecProdMotor[posVecMotor] = new ProductorMotorR(driveMotor, pMotor, mMotor, eMotor, maxEmpleados - 10);
        vecProdMotor[posVecMotor].start();
        posVecMotor++;
    }

    public void productorRuedas() {
        vecProdRuedas[posVecRuedas] = new ProductorRuedasR(driveRuedas, pRuedas, mRuedas, eRuedas, maxEmpleados - 10);
        vecProdRuedas[posVecRuedas].start();
        posVecRuedas++;
    }

    public void productorAcce() {
        vecProdAcc[posVecAcc] = new ProductorAccesoriosR(driveAcces, pAcces, mAcces, eAcces, maxEmpleados - 10);
        vecProdAcc[posVecAcc].start();
        posVecAcc++;
    }

    public void Ensamblador() {
        vecEnsamblador[posEnsamb] = new EnsambladorR(driveAcces, driveCarroceria, driveMotor, driveRuedas, driveChasis, pChasis, pCarroceria, pMotor, pRuedas, pAcces, mChasis, mCarroceria, mMotor, mRuedas, mAcces, eChasis, eCarroceria, eMotor, eRuedas, eAcces, Vehiculo, VehiculoAcc, contadorVe);
        vecEnsamblador[posEnsamb].start();
        posEnsamb++;
    }
    
    public void despProdChasis(){
        posVecChasis--;
        vecProdChasis[posVecChasis].despChasis();
    }
    
    public void desProdCarroc(){
        posVecCarroc--;
        vecProdCarroc[posVecChasis].despCarr();
    }
    
    public void desProdMotor(){
        posVecMotor--;
        vecProdMotor[posVecMotor].despMotor();
    }
    
    public void desProdRuedas(){
        posVecRuedas--;
        vecProdRuedas[posVecRuedas].despRuedas();
    }
    
    public void desProdAcc(){
        posVecAcc--;
        vecProdAcc[posVecAcc].despAcc();
    }
    
    public void desEnsamblador(){
        posEnsamb--;
        vecEnsamblador[posEnsamb].despEnsamb();
    }
    
    

    public void cobros() {
        CobrosR cobros = new CobrosR();
        cobros.start();
    }
    
    public static void stopAll() {

        for (int i = ensamblador; i > 0; i--) {  //1
            ensamblador--;
            posEnsamb--;
            vecEnsamblador[posEnsamb].despEnsamb();

        }

        for (int i = prodAcces; i > 0; i--) {  //1
            prodAcces--;
            posVecAcc--;
            vecProdAcc[posVecAcc].despAcc();

        }

        for (int i = prodCarroceria; i > 0; i--) {  //1
            prodCarroceria--;
            posVecCarroc--;
            vecProdCarroc[posVecCarroc].despCarr();

        }

        for (int i = prodChasis; i > 0; i--) {  //1
            prodChasis--;
            posVecChasis--;
            vecProdChasis[posVecChasis].despChasis();

        }

        for (int i = prodMotor; i > 0; i--) {  //1
            prodMotor--;
            posVecMotor--;
            vecProdMotor[posVecMotor].despMotor();

        }

        for (int i = prodRuedas; i > 0; i--) {  //1
            prodRuedas--;
            posVecRuedas--;
            vecProdRuedas[posVecRuedas].despRuedas();

        }

        DayR.stopDay();
        CobrosR.stopCobros();
        Actualizador.stopAct();
    }

}
