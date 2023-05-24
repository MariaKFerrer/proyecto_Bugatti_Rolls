/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlantaBugatti;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Marcelo
 */
public class EnsambladorB extends Thread {

    boolean activo = true;

    Semaphore pChasis;
    Semaphore pCarroceria;
    Semaphore pMotor;
    Semaphore pRuedas;
    Semaphore pAcces;

    Semaphore mChasis;
    Semaphore mCarroceria;
    Semaphore mMotor;
    Semaphore mRuedas;
    Semaphore mAcces;

    Semaphore eChasis;
    Semaphore eCarroceria;
    Semaphore eMotor;
    Semaphore eRuedas;
    Semaphore eAcces;

    Semaphore vehiculo;

    public Drive driveAcces;
    public Drive driveCarroc;
    public Drive driveMotor;
    public Drive driveRuedas;
    public Drive driveChasis;

    public EnsambladorB(Drive driveAcces, Drive driveCarroc, Drive driveMotor, Drive driveRuedas, Drive driveChasis,
            Semaphore pChasis, Semaphore pCarroceria, Semaphore pMotor, Semaphore pRuedas, Semaphore pAcces, Semaphore mChasis,
            Semaphore mCarroceria, Semaphore mMotor, Semaphore mRuedas, Semaphore mAcces, Semaphore eChasis,
            Semaphore eCarroceria,
            Semaphore eMotor,
            Semaphore eRuedas,
            Semaphore eAcces, Semaphore vehiculo) {

        this.driveAcces = driveAcces;
        this.driveCarroc = driveCarroc;
        this.driveChasis = driveChasis;
        this.driveMotor = driveMotor;
        this.driveRuedas = driveRuedas;

        this.pAcces = pAcces;
        this.pCarroceria = pCarroceria;
        this.pChasis = pChasis;
        this.pMotor = pMotor;
        this.pRuedas = pRuedas;

        this.mAcces = mAcces;
        this.mCarroceria = mCarroceria;
        this.mChasis = mChasis;
        this.mMotor = mMotor;
        this.mRuedas = mRuedas;

        this.eAcces = eAcces;
        this.eCarroceria = eCarroceria;
        this.eChasis = eChasis;
        this.eMotor = eMotor;
        this.eRuedas = eRuedas;

        this.vehiculo = vehiculo;

    }

    @Override
    public void run() {
        while (activo) {
            try {

                if ((PlantaB.Chasis >= 1) && (PlantaB.Carroceria >= 2) && (PlantaB.Motor >= 4) && (PlantaB.Ruedas >= 4)) {
                    System.out.println("Dentro");
                    System.out.println("\n Chasis: " + PlantaB.Chasis);
                    System.out.println("\n Carroceria: " + PlantaB.Carroceria);
                    System.out.println("\n Motor: " + PlantaB.Motor);
                    System.out.println("\n Ruedas: " + PlantaB.Ruedas);
                    if ((PlantaB.vehiculo % 5 != 0) || (PlantaB.vehiculo == 0)) {

                        Thread.sleep(PlantaB.DiaDuracion * 2);

                        this.mCarroceria.acquire();
//                        this.pCarroceria.acquire();

                        driveCarroc.consumirCarroceria();
                        driveCarroc.consumirCarroceria();
                        PlantaB.Carroceria = PlantaB.Carroceria - 2;
//                        System.out.println( PlantaB.Carroceria);
//                        this.pCarroceria.release();
                        this.mCarroceria.release();

                        this.mChasis.acquire();
//                        this.pChasis.acquire();
                        driveChasis.consumirChasis();
                        PlantaB.Chasis--;
//                        System.out.println( PlantaB.Chasis);
                        this.pChasis.release();
                        this.mChasis.release();

                        this.mMotor.acquire();
//                        this.pMotor.acquire();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        PlantaB.Motor = PlantaB.Motor - 4;
//                        System.out.println( PlantaB.Motor);
                        this.mMotor.release();
//                        this.pMotor.release();

//                        this.pRuedas.acquire();
                        this.mRuedas.acquire();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        PlantaB.Ruedas = PlantaB.Ruedas - 4;
//                        System.out.println( PlantaB.Ruedas);
                        this.mRuedas.release();
//                        this.pRuedas.release();
                    } else {
                        System.out.println("Vehiculo con accesorios");

                        Thread.sleep(PlantaB.DiaDuracion * 2);

//                        this.pCarroceria.acquire();
                        this.mCarroceria.acquire();
                        driveCarroc.consumirCarroceria();
                        driveCarroc.consumirCarroceria();
                        PlantaB.Carroceria = PlantaB.Carroceria - 2;
//                        System.out.println( PlantaB.Carroceria);
                        this.mCarroceria.release();
//                        this.pCarroceria.release();

//                        this.pChasis.acquire();
                        this.mChasis.acquire();
                        driveChasis.consumirChasis();
                        PlantaB.Chasis--;
//                        System.out.println( PlantaB.Chasis);
                        this.mChasis.release();
//                        this.pChasis.release();

//                        this.pMotor.acquire();
                        this.mMotor.acquire();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        PlantaB.Motor = PlantaB.Motor - 4;
//                        System.out.println( PlantaB.Motor);
                        this.mMotor.release();
//                        this.pMotor.release();

//                        this.pRuedas.acquire();
                        this.mRuedas.acquire();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        PlantaB.Ruedas = PlantaB.Ruedas - 4;
//                        System.out.println( PlantaB.Ruedas);
                        this.mRuedas.release();
//                        this.pRuedas.release();

//                        this.pAcces.acquire();
                        this.mAcces.acquire();
                        driveAcces.consumirAcces();
                        driveAcces.consumirAcces();
                        PlantaB.Acces = PlantaB.Acces - 2;
                        this.mAcces.release();
//                        this.pAcces.release();

                    }
                    vehiculo.acquire();
                    PlantaB.vehiculo++;
                    vehiculo.release();
                    System.out.println("Vehiculo ensamblado");
                    System.out.println("Vehiculos: " + PlantaB.vehiculo);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
