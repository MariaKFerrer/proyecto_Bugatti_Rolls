/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoSO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author mkferrerteran
 */
public class ventanatxt extends javax.swing.JFrame {

    /**
     * Creates new form ventanatxt
     */
    public ventanatxt() throws FileNotFoundException {
        initComponents();

        int DiaDuracion;
        int DiasParaEntrega;
        int chasisDrive;
        int carroceriaDrive;
        int motorDrive;
        int ruedasDrive;
        int accesDrive;
        int prodChasis;
        int prodCarroceria;
        int prodAcces;
        int prodRuedas;
        int prodMotor;
        int ensamblador;
        
        int DiaDuracionR;
        int DiasParaEntregaR;
        int chasisDriveR;
        int carroceriaDriveR;
        int motorDriveR;
        int ruedasDriveR;
        int accesDriveR;
        int prodChasisR;
        int prodCarroceriaR;
        int prodAccesR;
        int prodRuedasR;
        int prodMotorR;
        int ensambladorR;

        Scanner doc = new Scanner(new File("src/PlantaBugatti/values.txt"));
        String line = doc.nextLine();

        DiaDuracion = parseInt(line.substring(17, 25).trim());

//        DiaDuracion = DiaDuracion * 500;
        line = doc.nextLine();

        DiasParaEntrega = parseInt(line.substring(17, 25).trim());

        line = doc.nextLine();

        chasisDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine();

        carroceriaDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de carroceria en el Drive

        motorDrive = parseInt(line.substring(17, 25).trim());

        line = doc.nextLine(); //Almacenamiento de motor en el Drive

        ruedasDrive = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de ruedas en el Drive

        accesDrive = parseInt(line.substring(17, 25).trim());

        line = doc.nextLine(); //Almacenamiento de accesorios en el Drive

        prodChasis = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de chasis

        prodCarroceria = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de carroceria

        prodMotor = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de motor

        prodRuedas = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de ruedas

        prodAcces = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de accesorios

        ensamblador = parseInt(line.substring(17, 25).trim()); //Numeros de ensambladores 

        this.DiaDuracion.setText(String.valueOf(DiaDuracion));
        this.DiasParaEntrega.setText(String.valueOf(DiasParaEntrega));
        this.chasisDrive.setText(String.valueOf(chasisDrive));
        this.carroceriaDrive.setText(String.valueOf(carroceriaDrive));
        this.motorDrive.setText(String.valueOf(motorDrive));
        this.ruedasDrive.setText(String.valueOf(ruedasDrive));
        this.accesDrive.setText(String.valueOf(accesDrive));
        this.prodChasis.setText(String.valueOf(prodChasis));
        this.prodCarroceria.setText(String.valueOf(prodCarroceria));
        this.prodMotor.setText(String.valueOf(prodMotor));
        this.prodRuedas.setText(String.valueOf(prodRuedas));
        this.prodAcces.setText(String.valueOf(prodAcces));
        this.ensamblador.setText(String.valueOf(ensamblador));
        
        doc = new Scanner(new File("src/PlantaRolls/values.txt"));
        line = doc.nextLine();

        DiaDuracionR = parseInt(line.substring(17, 25).trim());

//        DiaDuracion = DiaDuracion * 500;
        line = doc.nextLine();

        DiasParaEntregaR = parseInt(line.substring(17, 25).trim());

        line = doc.nextLine();

        chasisDriveR = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine();

        carroceriaDriveR = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de carroceria en el Drive

        motorDriveR = parseInt(line.substring(17, 25).trim());

        line = doc.nextLine(); //Almacenamiento de motor en el Drive

        ruedasDriveR = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); //Almacenamiento de ruedas en el Drive

        accesDriveR = parseInt(line.substring(17, 25).trim());

        line = doc.nextLine(); //Almacenamiento de accesorios en el Drive

        prodChasisR = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de chasis

        prodCarroceriaR = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de carroceria

        prodMotorR = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de motor

        prodRuedasR = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de ruedas

        prodAccesR = parseInt(line.substring(17, 25).trim());
        line = doc.nextLine(); // Numero de productores de accesorios

        ensambladorR = parseInt(line.substring(17, 25).trim()); //Numeros de ensambladores 
        
        this.DiaDuracionR.setText(String.valueOf(DiaDuracionR));
        this.DiasParaEntregaR.setText(String.valueOf(DiasParaEntregaR));
        this.chasisDriveR.setText(String.valueOf(chasisDriveR));
        this.carroceriaDriveR.setText(String.valueOf(carroceriaDriveR));
        this.motorDriveR.setText(String.valueOf(motorDriveR));
        this.ruedasDriveR.setText(String.valueOf(ruedasDriveR));
        this.accesDriveR.setText(String.valueOf(accesDriveR));
        this.prodChasisR.setText(String.valueOf(prodChasisR));
        this.prodCarroceriaR.setText(String.valueOf(prodCarroceriaR));
        this.prodMotorR.setText(String.valueOf(prodMotorR));
        this.prodRuedasR.setText(String.valueOf(prodRuedasR));
        this.prodAccesR.setText(String.valueOf(prodAccesR));
        this.ensambladorR.setText(String.valueOf(ensambladorR));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        modificarRolls = new javax.swing.JButton();
        modificarB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DiasParaEntrega = new javax.swing.JTextField();
        motorDrive = new javax.swing.JTextField();
        carroceriaDrive = new javax.swing.JTextField();
        accesDrive = new javax.swing.JTextField();
        prodChasis = new javax.swing.JTextField();
        prodMotor = new javax.swing.JTextField();
        prodRuedas = new javax.swing.JTextField();
        ensamblador = new javax.swing.JTextField();
        prodAcces = new javax.swing.JTextField();
        prodCarroceria = new javax.swing.JTextField();
        ruedasDrive = new javax.swing.JTextField();
        chasisDrive = new javax.swing.JTextField();
        DiaDuracion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DiaDuracionR = new javax.swing.JTextField();
        DiasParaEntregaR = new javax.swing.JTextField();
        chasisDriveR = new javax.swing.JTextField();
        carroceriaDriveR = new javax.swing.JTextField();
        motorDriveR = new javax.swing.JTextField();
        ruedasDriveR = new javax.swing.JTextField();
        accesDriveR = new javax.swing.JTextField();
        prodChasisR = new javax.swing.JTextField();
        prodCarroceriaR = new javax.swing.JTextField();
        prodMotorR = new javax.swing.JTextField();
        prodRuedasR = new javax.swing.JTextField();
        prodAccesR = new javax.swing.JTextField();
        ensambladorR = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(864, 488));
        setPreferredSize(new java.awt.Dimension(864, 488));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 494, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Archivo TXT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        modificarRolls.setForeground(new java.awt.Color(0, 102, 153));
        modificarRolls.setText("Modificar");
        modificarRolls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarRollsActionPerformed(evt);
            }
        });
        getContentPane().add(modificarRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        modificarB.setForeground(new java.awt.Color(0, 102, 153));
        modificarB.setText("Modificar");
        modificarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBActionPerformed(evt);
            }
        });
        getContentPane().add(modificarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Archivo TXT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        DiasParaEntrega.setBackground(new java.awt.Color(0, 102, 153));
        DiasParaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasParaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, -1));

        motorDrive.setBackground(new java.awt.Color(0, 102, 153));
        motorDrive.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(motorDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 60, -1));

        carroceriaDrive.setBackground(new java.awt.Color(0, 102, 153));
        carroceriaDrive.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(carroceriaDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 60, -1));

        accesDrive.setBackground(new java.awt.Color(0, 102, 153));
        accesDrive.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(accesDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 60, -1));

        prodChasis.setBackground(new java.awt.Color(0, 102, 153));
        prodChasis.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 60, -1));

        prodMotor.setBackground(new java.awt.Color(0, 102, 153));
        prodMotor.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 60, -1));

        prodRuedas.setBackground(new java.awt.Color(0, 102, 153));
        prodRuedas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodRuedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 60, -1));

        ensamblador.setBackground(new java.awt.Color(0, 102, 153));
        ensamblador.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ensamblador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 100, -1));

        prodAcces.setBackground(new java.awt.Color(0, 102, 153));
        prodAcces.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodAcces, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 60, -1));

        prodCarroceria.setBackground(new java.awt.Color(0, 102, 153));
        prodCarroceria.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodCarroceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 60, -1));

        ruedasDrive.setBackground(new java.awt.Color(0, 102, 153));
        ruedasDrive.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ruedasDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 60, -1));

        chasisDrive.setBackground(new java.awt.Color(0, 102, 153));
        chasisDrive.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(chasisDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 60, -1));

        DiaDuracion.setBackground(new java.awt.Color(0, 102, 153));
        DiaDuracion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiaDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 60, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DiaDuracion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DiasParaEntrega");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jLabel6.setBackground(new java.awt.Color(0, 102, 153));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ChasisDrive");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CarroceriaDrive");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 130, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MotorDrive");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 90, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RuedasDrive");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AccesDrive");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ProdChasis");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ProdCarroceria");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ProdMotor");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 30));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ProdRuedas");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ProdAcces");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 30));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ensamblador");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DiaDuracion");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 166, -1, 20));

        DiaDuracionR.setBackground(new java.awt.Color(0, 102, 153));
        DiaDuracionR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiaDuracionR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 60, -1));

        DiasParaEntregaR.setBackground(new java.awt.Color(0, 102, 153));
        DiasParaEntregaR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasParaEntregaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 60, -1));

        chasisDriveR.setBackground(new java.awt.Color(0, 102, 153));
        chasisDriveR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(chasisDriveR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 60, -1));

        carroceriaDriveR.setBackground(new java.awt.Color(0, 102, 153));
        carroceriaDriveR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(carroceriaDriveR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 60, -1));

        motorDriveR.setBackground(new java.awt.Color(0, 102, 153));
        motorDriveR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(motorDriveR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 60, -1));

        ruedasDriveR.setBackground(new java.awt.Color(0, 102, 153));
        ruedasDriveR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ruedasDriveR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 60, -1));

        accesDriveR.setBackground(new java.awt.Color(0, 102, 153));
        accesDriveR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(accesDriveR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 60, -1));

        prodChasisR.setBackground(new java.awt.Color(0, 102, 153));
        prodChasisR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 60, -1));

        prodCarroceriaR.setBackground(new java.awt.Color(0, 102, 153));
        prodCarroceriaR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodCarroceriaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 60, -1));

        prodMotorR.setBackground(new java.awt.Color(0, 102, 153));
        prodMotorR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 60, -1));

        prodRuedasR.setBackground(new java.awt.Color(0, 102, 153));
        prodRuedasR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(prodRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 60, -1));

        prodAccesR.setBackground(new java.awt.Color(0, 102, 153));
        prodAccesR.setForeground(new java.awt.Color(255, 255, 255));
        prodAccesR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodAccesRActionPerformed(evt);
            }
        });
        getContentPane().add(prodAccesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 60, -1));

        ensambladorR.setBackground(new java.awt.Color(0, 102, 153));
        ensambladorR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ensambladorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 100, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DiasParaEntrega");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 196, -1, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("ChasisDrive");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 256, -1, 20));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CarroceriaDrive");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, 30));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("MotorDrive");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, 30));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("RuedasDrive");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 336, -1, 40));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("AccesDrive");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, 30));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ProdChasis");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 256, -1, 20));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ProdCarroceria");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 286, 100, 20));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("ProdMotor");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 70, 30));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("ProdRuedas");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 346, -1, 20));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ProdAcces");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 376, -1, 20));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Ensamblador");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Sirve2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void modificarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBActionPerformed
        // TODO add your handling code here:

        try {
            FileWriter w = new FileWriter("src/PlantaRolls/values.txt");
            w.write("");
            w.write("DiaDuracion:     " + this.DiaDuracionR.getText() + "         \n");
            w.write("DiasParaEntrega: " + this.DiasParaEntregaR.getText() + "          \n");
            w.write("chasisDrive:     " + this.chasisDriveR.getText() + "           \n");
            w.write("carroceriaDrive: " + this.carroceriaDriveR.getText() + "           \n");
            w.write("motorDrive:      " + this.motorDriveR.getText() + "           \n");
            w.write("ruedasDrive:     " + this.ruedasDriveR.getText() + "           \n");
            w.write("accesDrive:      " + this.accesDriveR.getText() + "           \n");
            w.write("prodChasis:      " + this.prodChasisR.getText() + "        \n");
            w.write("prodCarroceria:  " + this.prodCarroceriaR.getText() + "          \n");
            w.write("prodMotor:       " + this.prodMotorR.getText() + "         \n");
            w.write("prodRuedas:      " + this.prodRuedasR.getText() + "           \n");
            w.write("prodAcces:       " + this.prodAccesR.getText() + "           \n");
            w.write("ensamblador:     " + this.ensambladorR.getText() + "        ");

            w.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_modificarBActionPerformed

    private void prodAccesRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodAccesRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodAccesRActionPerformed

    private void modificarRollsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarRollsActionPerformed
        // TODO add your handling code here:
        
         try {
            FileWriter w = new FileWriter("src/PlantaBugatti/values.txt");
            w.write("");
            w.write("DiaDuracion:     " + this.DiaDuracion.getText() + "         \n");
            w.write("DiasParaEntrega: " + this.DiasParaEntrega.getText() + "          \n");
            w.write("chasisDrive:     " + this.chasisDrive.getText() + "           \n");
            w.write("carroceriaDrive: " + this.carroceriaDrive.getText() + "           \n");
            w.write("motorDrive:      " + this.motorDrive.getText() + "           \n");
            w.write("ruedasDrive:     " + this.ruedasDrive.getText() + "           \n");
            w.write("accesDrive:      " + this.accesDrive.getText() + "           \n");
            w.write("prodChasis:      " + this.prodChasis.getText() + "        \n");
            w.write("prodCarroceria:  " + this.prodCarroceria.getText() + "          \n");
            w.write("prodMotor:       " + this.prodMotor.getText() + "         \n");
            w.write("prodRuedas:      " + this.prodRuedas.getText() + "           \n");
            w.write("prodAcces:       " + this.prodAcces.getText() + "           \n");
            w.write("ensamblador:     " + this.ensamblador.getText() + "        ");

            w.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_modificarRollsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiaDuracion;
    private javax.swing.JTextField DiaDuracionR;
    private javax.swing.JTextField DiasParaEntrega;
    private javax.swing.JTextField DiasParaEntregaR;
    private javax.swing.JTextField accesDrive;
    private javax.swing.JTextField accesDriveR;
    private javax.swing.JTextField carroceriaDrive;
    private javax.swing.JTextField carroceriaDriveR;
    private javax.swing.JTextField chasisDrive;
    private javax.swing.JTextField chasisDriveR;
    private javax.swing.JTextField ensamblador;
    private javax.swing.JTextField ensambladorR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarB;
    private javax.swing.JButton modificarRolls;
    private javax.swing.JTextField motorDrive;
    private javax.swing.JTextField motorDriveR;
    private javax.swing.JTextField prodAcces;
    private javax.swing.JTextField prodAccesR;
    private javax.swing.JTextField prodCarroceria;
    private javax.swing.JTextField prodCarroceriaR;
    private javax.swing.JTextField prodChasis;
    private javax.swing.JTextField prodChasisR;
    private javax.swing.JTextField prodMotor;
    private javax.swing.JTextField prodMotorR;
    private javax.swing.JTextField prodRuedas;
    private javax.swing.JTextField prodRuedasR;
    private javax.swing.JTextField ruedasDrive;
    private javax.swing.JTextField ruedasDriveR;
    // End of variables declaration//GEN-END:variables
}
