/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlantaRolls;

import java.util.concurrent.Semaphore;

/**
 *
 * @author mkferrerteran
 */
public class EnsambladorR extends Thread {

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
    Semaphore vehiculoAcc;
    Semaphore contadorVehiculos;

    public Drive driveAcces;
    public Drive driveCarroc;
    public Drive driveMotor;
    public Drive driveRuedas;
    public Drive driveChasis;

    public EnsambladorR(Drive driveAcces, Drive driveCarroc, Drive driveMotor, Drive driveRuedas, Drive driveChasis,
            Semaphore pChasis, Semaphore pCarroceria, Semaphore pMotor, Semaphore pRuedas, Semaphore pAcces, Semaphore mChasis,
            Semaphore mCarroceria, Semaphore mMotor, Semaphore mRuedas, Semaphore mAcces, Semaphore eChasis,
            Semaphore eCarroceria,
            Semaphore eMotor,
            Semaphore eRuedas,
            Semaphore eAcces, Semaphore vehiculo, Semaphore vehiculoAcc, Semaphore contadorVehiculos) {

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
        this.vehiculoAcc = vehiculoAcc;
        this.contadorVehiculos = contadorVehiculos;

    }

    @Override
    public void run() {
        while (activo) {
            try {
                 this.eChasis.acquire();
                
                if ((PlantaR.Chasis >= 3) && (PlantaR.Carroceria >= 2) && (PlantaR.Motor >= 4) && (PlantaR.Ruedas >= 6)) {
                    System.out.println("Ensamblando");

                    if ((PlantaR.contadorVehiculos % 6 != 0) || (PlantaR.contadorVehiculos == 0)) {

                        Thread.sleep(PlantaR.DiaDuracion * 2);
                        
//                        this.pCarroceria.acquire();

                        driveCarroc.consumirCarroceria();
                        driveCarroc.consumirCarroceria();
                        PlantaR.Carroceria = PlantaR.Carroceria - 2;
//                        System.out.println( PlantaB.Carroceria);
//                        this.pCarroceria.release();
                        this.mCarroceria.release();
                        this.eCarroceria.release();

                       
                        this.mChasis.acquire();
//                        this.pChasis.acquire();
                        driveChasis.consumirChasis();
                        driveChasis.consumirChasis();
                        driveChasis.consumirChasis();
                        PlantaR.Chasis = PlantaR.Chasis - 3;
//                        System.out.println( PlantaB.Chasis);
//                        this.pChasis.release();
                        this.mChasis.release();
                        

                        this.eMotor.acquire();
                        this.mMotor.acquire();
//                        this.pMotor.acquire();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        PlantaR.Motor = PlantaR.Motor - 4;
//                        System.out.println( PlantaB.Motor);
                        this.mMotor.release();
                        this.eMotor.release();
//                        this.pMotor.release();

//                        this.pRuedas.acquire();
                        this.eRuedas.acquire();
                        this.mRuedas.acquire();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        PlantaR.Ruedas = PlantaR.Ruedas - 6;
//                        System.out.println( PlantaB.Ruedas);
                        this.mRuedas.release();
                        this.eRuedas.release();
//                        this.pRuedas.release();
                        System.out.println("Vehiculo ensamblado");
                        vehiculo.acquire();
                        PlantaR.vehiculo++;
                        vehiculo.release();

                    } else {
                        System.out.println("Vehiculo con accesorios");

                        Thread.sleep(PlantaR.DiaDuracion * 2);

//                        this.pCarroceria.acquire();
                        this.eCarroceria.acquire();
                        this.mCarroceria.acquire();
                        driveCarroc.consumirCarroceria();
                        driveCarroc.consumirCarroceria();
                        PlantaR.Carroceria = PlantaR.Carroceria - 2;
//                        System.out.println( PlantaB.Carroceria);
                        this.mCarroceria.release();
                        this.eCarroceria.release();
//                        this.pCarroceria.release();

//                        this.pChasis.acquire();
//                        this.eChasis.acquire();
                        this.mChasis.acquire();
                        driveChasis.consumirChasis();
                        driveChasis.consumirChasis();
                        driveChasis.consumirChasis();
                        PlantaR.Chasis = PlantaR.Chasis - 3;
//                        System.out.println( PlantaB.Chasis);
                        this.mChasis.release();
//                        this.eChasis.release();
//                        this.pChasis.release();

//                        this.pMotor.acquire();
                        this.eMotor.acquire();
                        this.mMotor.acquire();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        driveMotor.consumirMotor();
                        PlantaR.Motor = PlantaR.Motor - 4;
//                        System.out.println( PlantaB.Motor);
                        this.mMotor.release();
                         this.eMotor.release();
//                        this.pMotor.release();

//                        this.pRuedas.acquire();
                        this.eRuedas.acquire();
                        this.mRuedas.acquire();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        driveRuedas.consumirRuedas();
                        PlantaR.Ruedas = PlantaR.Ruedas - 6;
//                        System.out.println( PlantaB.Ruedas);
                        this.mRuedas.release();
                         this.eRuedas.release();
//                        this.pRuedas.release();

//                        this.pAcces.acquire();
                         this.eAcces.acquire();
                        this.mAcces.acquire();
                        driveAcces.consumirAcces();
                        driveAcces.consumirAcces();
                        driveAcces.consumirAcces();
                        driveAcces.consumirAcces();
                        driveAcces.consumirAcces();
                        PlantaR.Acces = PlantaR.Acces - 5;
                        this.mAcces.release();
                        this.eAcces.release();
//                        this.pAcces.release();

                        vehiculoAcc.acquire();
                        PlantaR.vehiculoAcc++;
                        vehiculoAcc.release();
                        System.out.println("Vehiculo con accesorios ensamblado");

                    }

                    contadorVehiculos.acquire();
                    PlantaR.contadorVehiculos++;
                    contadorVehiculos.release();

                    System.out.println("Vehiculos: " + PlantaR.vehiculo);
                    System.out.println("Vehiculos con accesorios: " + PlantaR.vehiculoAcc);
                } else {
//                    System.out.println("\n Chasis: " + PlantaR.Chasis);
//                    System.out.println("\n Carroceria: " + PlantaR.Carroceria);
//                    System.out.println("\n Motor: " + PlantaR.Motor);
//                    System.out.println("\n Ruedas: " + PlantaR.Ruedas);
//                    Thread.sleep(PlantaR.DiaDuracion);

                }
                
                this.eChasis.release();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void despEnsamb() {
        activo = false;
    }

}
