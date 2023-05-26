package ProyectoSO;

import PlantaBugatti.PlantaB;
import PlantaRolls.PlantaR;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 *
 * @author mkferrerteran
 */
public class interfaz extends javax.swing.JFrame {
        
    public interfaz() throws FileNotFoundException, InterruptedException, ParseException{ 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        DiasLabelB = new javax.swing.JLabel();
        DiasRestantes = new javax.swing.JTextField();
        labelGerenteB = new javax.swing.JLabel();
        LabelDirecB = new javax.swing.JLabel();
        SalarioGerenteB = new javax.swing.JTextField();
        DirectorB = new javax.swing.JTextField();
        FaltasGerenteB = new javax.swing.JTextField();
        labelFaltasGB = new javax.swing.JLabel();
        labelSalarioG = new javax.swing.JLabel();
        labelDiasR = new javax.swing.JLabel();
        DiasRestantesR = new javax.swing.JTextField();
        salarioGerR = new javax.swing.JLabel();
        LabelGerR1 = new javax.swing.JLabel();
        LabelFaltasGerR = new javax.swing.JLabel();
        SalarioGerenteR = new javax.swing.JTextField();
        FaltasGerenteR = new javax.swing.JTextField();
        labeldirecR = new javax.swing.JLabel();
        DirectorR = new javax.swing.JTextField();
        labelPlanta = new javax.swing.JLabel();
        labelCarroc = new javax.swing.JLabel();
        labelChasis1 = new javax.swing.JLabel();
        labelCarroc1 = new javax.swing.JLabel();
        labelCarroc2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empleadosRuedasB = new javax.swing.JSpinner();
        cantidadRuedasB = new javax.swing.JTextField();
        plantaRlabel = new javax.swing.JLabel();
        ensamblaRlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gananciasRlabel = new javax.swing.JLabel();
        GananciasRolls = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BotonRuedasB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botonEmpEnsB = new javax.swing.JButton();
        empleadosEnsB = new javax.swing.JSpinner();
        cantidadVehB = new javax.swing.JTextField();
        empleadosChasisB = new javax.swing.JSpinner();
        empleadosCarrB = new javax.swing.JSpinner();
        empleadosMotorB = new javax.swing.JSpinner();
        BotonChasisB = new javax.swing.JButton();
        BotonCarrB = new javax.swing.JButton();
        BotonMotorB = new javax.swing.JButton();
        cantidadCarrB = new javax.swing.JTextField();
        cantidadVehiculosR = new javax.swing.JTextField();
        cantidadMotorB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cantidadChasisB = new javax.swing.JTextField();
        cantidadChasisR = new javax.swing.JTextField();
        cantidadCarrR = new javax.swing.JTextField();
        cantidadMotorR1 = new javax.swing.JTextField();
        cantidadRuedasR = new javax.swing.JTextField();
        EnterEmpRuedasR = new javax.swing.JButton();
        EmpleadosRuedasR = new javax.swing.JSpinner();
        EmpleadosChasisR = new javax.swing.JSpinner();
        EnterEmpChasisR = new javax.swing.JButton();
        EmpleadosCarrR = new javax.swing.JSpinner();
        EnterEmpCarrR = new javax.swing.JButton();
        EmpleadosMotorR = new javax.swing.JSpinner();
        EnterEmpMotorR = new javax.swing.JButton();
        EnterEmpEnsR = new javax.swing.JButton();
        EmpleadosEnsb = new javax.swing.JSpinner();
        GananciasBugatti = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CostosBugatti = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CostosRolls = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DiasLabelB.setForeground(new java.awt.Color(255, 255, 255));
        DiasLabelB.setText("Dias restantes ");
        getContentPane().add(DiasLabelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        DiasRestantes.setBackground(new java.awt.Color(0, 102, 153));
        DiasRestantes.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 60, 30));

        labelGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        labelGerenteB.setText("Gerente");
        getContentPane().add(labelGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 60, 20));

        LabelDirecB.setForeground(new java.awt.Color(255, 255, 255));
        LabelDirecB.setText("Director");
        getContentPane().add(LabelDirecB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        SalarioGerenteB.setBackground(new java.awt.Color(0, 102, 153));
        SalarioGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        SalarioGerenteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioGerenteBActionPerformed(evt);
            }
        });
        getContentPane().add(SalarioGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 60, -1));

        DirectorB.setBackground(new java.awt.Color(0, 102, 153));
        DirectorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DirectorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 70, -1));

        FaltasGerenteB.setBackground(new java.awt.Color(0, 102, 153));
        FaltasGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        FaltasGerenteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaltasGerenteBActionPerformed(evt);
            }
        });
        getContentPane().add(FaltasGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 60, -1));

        labelFaltasGB.setForeground(new java.awt.Color(255, 255, 255));
        labelFaltasGB.setText("Faltas");
        getContentPane().add(labelFaltasGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 20));

        labelSalarioG.setForeground(new java.awt.Color(255, 255, 255));
        labelSalarioG.setText("Salario");
        getContentPane().add(labelSalarioG, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        labelDiasR.setForeground(new java.awt.Color(255, 255, 255));
        labelDiasR.setText("Dias Restantes");
        labelDiasR.setToolTipText("");
        getContentPane().add(labelDiasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        DiasRestantesR.setBackground(new java.awt.Color(0, 102, 153));
        DiasRestantesR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasRestantesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 70, -1));

        salarioGerR.setForeground(new java.awt.Color(255, 255, 255));
        salarioGerR.setText("Salario");
        getContentPane().add(salarioGerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, 10));

        LabelGerR1.setForeground(new java.awt.Color(255, 255, 255));
        LabelGerR1.setText("Gerente");
        getContentPane().add(LabelGerR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        LabelFaltasGerR.setForeground(new java.awt.Color(255, 255, 255));
        LabelFaltasGerR.setText("Faltas");
        getContentPane().add(LabelFaltasGerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, 10));

        SalarioGerenteR.setBackground(new java.awt.Color(0, 102, 153));
        SalarioGerenteR.setForeground(new java.awt.Color(255, 255, 255));
        SalarioGerenteR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioGerenteRActionPerformed(evt);
            }
        });
        getContentPane().add(SalarioGerenteR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 60, -1));

        FaltasGerenteR.setBackground(new java.awt.Color(0, 102, 153));
        FaltasGerenteR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(FaltasGerenteR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 60, -1));

        labeldirecR.setForeground(new java.awt.Color(255, 255, 255));
        labeldirecR.setText("Director");
        getContentPane().add(labeldirecR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        DirectorR.setBackground(new java.awt.Color(0, 102, 153));
        DirectorR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DirectorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 70, -1));

        labelPlanta.setForeground(new java.awt.Color(255, 255, 255));
        labelPlanta.setText("Planta");
        getContentPane().add(labelPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        labelCarroc.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc.setText("Ruedas");
        getContentPane().add(labelCarroc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        labelChasis1.setForeground(new java.awt.Color(255, 255, 255));
        labelChasis1.setText("Chasis");
        getContentPane().add(labelChasis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        labelCarroc1.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc1.setText("Carroceria");
        getContentPane().add(labelCarroc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        labelCarroc2.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc2.setText("Motor");
        getContentPane().add(labelCarroc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de piezas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ensambladores");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));
        getContentPane().add(empleadosRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 70, -1));

        cantidadRuedasB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadRuedasB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 80, -1));

        plantaRlabel.setForeground(new java.awt.Color(255, 255, 255));
        plantaRlabel.setText("Planta");
        getContentPane().add(plantaRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        ensamblaRlabel.setForeground(new java.awt.Color(255, 255, 255));
        ensamblaRlabel.setText("Ensambladores");
        getContentPane().add(ensamblaRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ganancias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 10));

        gananciasRlabel.setForeground(new java.awt.Color(255, 255, 255));
        gananciasRlabel.setText("Ganancias");
        getContentPane().add(gananciasRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, 10));

        GananciasRolls.setBackground(new java.awt.Color(0, 102, 153));
        GananciasRolls.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(GananciasRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 90, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Empleados");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        BotonRuedasB.setBackground(new java.awt.Color(255, 255, 255));
        BotonRuedasB.setForeground(new java.awt.Color(0, 102, 153));
        BotonRuedasB.setText("Enter");
        getContentPane().add(BotonRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 60, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad de Vehiculos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        botonEmpEnsB.setForeground(new java.awt.Color(0, 102, 153));
        botonEmpEnsB.setText("Enter");
        getContentPane().add(botonEmpEnsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 80, -1));
        getContentPane().add(empleadosEnsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 70, -1));

        cantidadVehB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadVehB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadVehB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 90, -1));
        getContentPane().add(empleadosChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 70, -1));
        getContentPane().add(empleadosCarrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 70, -1));
        getContentPane().add(empleadosMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 70, -1));

        BotonChasisB.setBackground(new java.awt.Color(255, 255, 255));
        BotonChasisB.setForeground(new java.awt.Color(0, 102, 153));
        BotonChasisB.setText("Enter");
        getContentPane().add(BotonChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 60, -1));

        BotonCarrB.setBackground(new java.awt.Color(255, 255, 255));
        BotonCarrB.setForeground(new java.awt.Color(0, 102, 153));
        BotonCarrB.setText("Enter");
        getContentPane().add(BotonCarrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 60, -1));

        BotonMotorB.setBackground(new java.awt.Color(255, 255, 255));
        BotonMotorB.setForeground(new java.awt.Color(0, 102, 153));
        BotonMotorB.setText("Enter");
        getContentPane().add(BotonMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 60, -1));

        cantidadCarrB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadCarrB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadCarrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 80, -1));

        cantidadVehiculosR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadVehiculosR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadVehiculosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 80, -1));

        cantidadMotorB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadMotorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 80, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Chasis");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carroceria");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Motor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, 10));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ruedas");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empleados");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cantidad de piezas");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Empleados");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cantidad de Vehiculos");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, -1));

        cantidadChasisB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 80, -1));

        cantidadChasisR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 80, -1));

        cantidadCarrR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadCarrR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 80, -1));

        cantidadMotorR1.setBackground(new java.awt.Color(0, 102, 153));
        cantidadMotorR1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadMotorR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 80, -1));

        cantidadRuedasR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadRuedasR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 80, -1));

        EnterEmpRuedasR.setForeground(new java.awt.Color(0, 102, 153));
        EnterEmpRuedasR.setText("Enter");
        getContentPane().add(EnterEmpRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 60, -1));
        getContentPane().add(EmpleadosRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 70, -1));
        getContentPane().add(EmpleadosChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 70, -1));

        EnterEmpChasisR.setForeground(new java.awt.Color(0, 102, 153));
        EnterEmpChasisR.setText("Enter");
        getContentPane().add(EnterEmpChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 60, -1));
        getContentPane().add(EmpleadosCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 70, -1));

        EnterEmpCarrR.setForeground(new java.awt.Color(0, 102, 153));
        EnterEmpCarrR.setText("Enter");
        getContentPane().add(EnterEmpCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 60, -1));
        getContentPane().add(EmpleadosMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 70, -1));

        EnterEmpMotorR.setForeground(new java.awt.Color(0, 102, 153));
        EnterEmpMotorR.setText("Enter");
        getContentPane().add(EnterEmpMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 60, -1));

        EnterEmpEnsR.setForeground(new java.awt.Color(0, 102, 153));
        EnterEmpEnsR.setText("Enter");
        getContentPane().add(EnterEmpEnsR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));
        getContentPane().add(EmpleadosEnsb, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 80, -1));

        GananciasBugatti.setBackground(new java.awt.Color(0, 102, 153));
        GananciasBugatti.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(GananciasBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 90, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Costos");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, 20));

        CostosBugatti.setBackground(new java.awt.Color(0, 102, 153));
        CostosBugatti.setForeground(new java.awt.Color(255, 255, 255));
        CostosBugatti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostosBugattiActionPerformed(evt);
            }
        });
        getContentPane().add(CostosBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 90, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Costos");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, 10));

        CostosRolls.setBackground(new java.awt.Color(0, 102, 153));
        CostosRolls.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CostosRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 90, -1));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Sirve2.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void SalarioGerenteRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioGerenteRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalarioGerenteRActionPerformed

    private void FaltasGerenteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaltasGerenteBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FaltasGerenteBActionPerformed

    private void SalarioGerenteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioGerenteBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalarioGerenteBActionPerformed

    private void CostosBugattiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostosBugattiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostosBugattiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BotonCarrB;
    private javax.swing.JButton BotonChasisB;
    private javax.swing.JButton BotonMotorB;
    private javax.swing.JButton BotonRuedasB;
    private javax.swing.JTextField CostosBugatti;
    private javax.swing.JTextField CostosRolls;
    private javax.swing.JLabel DiasLabelB;
    private javax.swing.JTextField DiasRestantes;
    private javax.swing.JTextField DiasRestantesR;
    private javax.swing.JTextField DirectorB;
    private javax.swing.JTextField DirectorR;
    private javax.swing.JSpinner EmpleadosCarrR;
    private javax.swing.JSpinner EmpleadosChasisR;
    private javax.swing.JSpinner EmpleadosEnsb;
    private javax.swing.JSpinner EmpleadosMotorR;
    private javax.swing.JSpinner EmpleadosRuedasR;
    private javax.swing.JButton EnterEmpCarrR;
    private javax.swing.JButton EnterEmpChasisR;
    private javax.swing.JButton EnterEmpEnsR;
    private javax.swing.JButton EnterEmpMotorR;
    private javax.swing.JButton EnterEmpRuedasR;
    private javax.swing.JTextField FaltasGerenteB;
    private javax.swing.JTextField FaltasGerenteR;
    private javax.swing.JTextField GananciasBugatti;
    private javax.swing.JTextField GananciasRolls;
    private javax.swing.JLabel LabelDirecB;
    private javax.swing.JLabel LabelFaltasGerR;
    private javax.swing.JLabel LabelGerR1;
    private javax.swing.JTextField SalarioGerenteB;
    private javax.swing.JTextField SalarioGerenteR;
    private javax.swing.JButton botonEmpEnsB;
    private javax.swing.JTextField cantidadCarrB;
    private javax.swing.JTextField cantidadCarrR;
    private javax.swing.JTextField cantidadChasisB;
    private javax.swing.JTextField cantidadChasisR;
    private javax.swing.JTextField cantidadMotorB;
    private javax.swing.JTextField cantidadMotorR1;
    private javax.swing.JTextField cantidadRuedasB;
    private javax.swing.JTextField cantidadRuedasR;
    private javax.swing.JTextField cantidadVehB;
    private javax.swing.JTextField cantidadVehiculosR;
    private javax.swing.JSpinner empleadosCarrB;
    private javax.swing.JSpinner empleadosChasisB;
    private javax.swing.JSpinner empleadosEnsB;
    private javax.swing.JSpinner empleadosMotorB;
    private javax.swing.JSpinner empleadosRuedasB;
    private javax.swing.JLabel ensamblaRlabel;
    private javax.swing.JLabel gananciasRlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCarroc;
    private javax.swing.JLabel labelCarroc1;
    private javax.swing.JLabel labelCarroc2;
    private javax.swing.JLabel labelChasis1;
    private javax.swing.JLabel labelDiasR;
    private javax.swing.JLabel labelFaltasGB;
    private javax.swing.JLabel labelGerenteB;
    private javax.swing.JLabel labelPlanta;
    private javax.swing.JLabel labelSalarioG;
    private javax.swing.JLabel labeldirecR;
    private javax.swing.JLabel plantaRlabel;
    private javax.swing.JLabel salarioGerR;
    // End of variables declaration//GEN-END:variables
}
