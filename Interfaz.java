package ProyectoSO;

import PlantaBugatti.PlantaB;
import PlantaRolls.PlantaR;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mkferrerteran
 */
public class Interfaz extends javax.swing.JFrame {

    public Actualizador act;
    public PlantaB plantaB;
    public PlantaR plantaR;

    public Interfaz() throws FileNotFoundException, InterruptedException, ParseException {
        initComponents();
        this.setLocationRelativeTo(null);
//        this.setResizable(false);
        this.setVisible(true);
        
        
        this.plantaB = new PlantaB(5);
        this.plantaR = new PlantaR(9);
        this.act = new Actualizador(this, plantaB);
        
        
        this.act.run();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
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
        cantidadRuedasB = new javax.swing.JTextField();
        plantaRlabel = new javax.swing.JLabel();
        ensamblaRlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gananciasRlabel = new javax.swing.JLabel();
        GananciasRolls = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        empChasisB = new javax.swing.JTextField();
        cantidadCarrB = new javax.swing.JTextField();
        cantidadVehiculosR = new javax.swing.JTextField();
        cantidadMotorB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cantidadChasisB = new javax.swing.JTextField();
        cantidadChasisR = new javax.swing.JTextField();
        cantidadCarrR = new javax.swing.JTextField();
        cantidadMotorR1 = new javax.swing.JTextField();
        cantidadRuedasR = new javax.swing.JTextField();
        GananciasBugatti = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CostosBugatti = new javax.swing.JTextField();
        Start = new javax.swing.JButton();
        CostosRolls = new javax.swing.JTextField();
        mRuedasB = new javax.swing.JButton();
        aRuedasB = new javax.swing.JButton();
        mChasisB = new javax.swing.JButton();
        aChasisB = new javax.swing.JButton();
        aChasisR = new javax.swing.JButton();
        aMotorB = new javax.swing.JButton();
        mChasisR = new javax.swing.JButton();
        mMotorB = new javax.swing.JButton();
        aEnsamb = new javax.swing.JButton();
        mEnsamb = new javax.swing.JButton();
        labelCarroc3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vehiculosAccB = new javax.swing.JTextField();
        empMotorB = new javax.swing.JTextField();
        empRuedasB = new javax.swing.JTextField();
        cantAccesR = new javax.swing.JTextField();
        empEnsamb = new javax.swing.JTextField();
        empDisp = new javax.swing.JTextField();
        aCarrocB = new javax.swing.JButton();
        empCarrocB = new javax.swing.JTextField();
        mCarrocB = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        vehiculosEstandarB = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        empChasisR = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cantidadVehiculosR1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        aEnsamb1 = new javax.swing.JButton();
        empEnsambB = new javax.swing.JTextField();
        mEnsambB = new javax.swing.JButton();
        empDispB = new javax.swing.JTextField();
        cantAccesB = new javax.swing.JTextField();
        aAccesB = new javax.swing.JButton();
        empAccesB = new javax.swing.JTextField();
        mAccesB = new javax.swing.JButton();
        aAccesR1 = new javax.swing.JButton();
        mAccesR1 = new javax.swing.JButton();
        empAccesR = new javax.swing.JTextField();
        aRuedasR1 = new javax.swing.JButton();
        empRuedasR = new javax.swing.JTextField();
        mRuedasR = new javax.swing.JButton();
        empMotorR = new javax.swing.JTextField();
        empCarrR = new javax.swing.JTextField();
        mMotorR = new javax.swing.JButton();
        aMotorR = new javax.swing.JButton();
        mCarrR = new javax.swing.JButton();
        aCarrR = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Costos");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, 10));

        DiasLabelB.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        DiasLabelB.setForeground(new java.awt.Color(255, 255, 255));
        DiasLabelB.setText("Dias restantes ");
        getContentPane().add(DiasLabelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        DiasRestantes.setBackground(new java.awt.Color(0, 102, 153));
        DiasRestantes.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 60, 30));

        labelGerenteB.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        labelGerenteB.setText("Gerente");
        getContentPane().add(labelGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, 20));

        LabelDirecB.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        LabelDirecB.setForeground(new java.awt.Color(255, 255, 255));
        LabelDirecB.setText("Director");
        getContentPane().add(LabelDirecB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        SalarioGerenteB.setBackground(new java.awt.Color(0, 102, 153));
        SalarioGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        SalarioGerenteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioGerenteBActionPerformed(evt);
            }
        });
        getContentPane().add(SalarioGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 60, -1));

        DirectorB.setBackground(new java.awt.Color(0, 102, 153));
        DirectorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DirectorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 70, -1));

        FaltasGerenteB.setBackground(new java.awt.Color(0, 102, 153));
        FaltasGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        FaltasGerenteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaltasGerenteBActionPerformed(evt);
            }
        });
        getContentPane().add(FaltasGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 60, -1));

        labelFaltasGB.setForeground(new java.awt.Color(255, 255, 255));
        labelFaltasGB.setText("Faltas");
        getContentPane().add(labelFaltasGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 10));

        labelSalarioG.setForeground(new java.awt.Color(255, 255, 255));
        labelSalarioG.setText("Salario");
        getContentPane().add(labelSalarioG, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 10));

        labelDiasR.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelDiasR.setForeground(new java.awt.Color(255, 255, 255));
        labelDiasR.setText("Dias Restantes");
        labelDiasR.setToolTipText("");
        getContentPane().add(labelDiasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        DiasRestantesR.setBackground(new java.awt.Color(0, 102, 153));
        DiasRestantesR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasRestantesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 70, -1));

        salarioGerR.setForeground(new java.awt.Color(255, 255, 255));
        salarioGerR.setText("Salario");
        getContentPane().add(salarioGerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, 10));

        LabelGerR1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        LabelGerR1.setForeground(new java.awt.Color(255, 255, 255));
        LabelGerR1.setText("Gerente");
        getContentPane().add(LabelGerR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        LabelFaltasGerR.setForeground(new java.awt.Color(255, 255, 255));
        LabelFaltasGerR.setText("Faltas");
        getContentPane().add(LabelFaltasGerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, 10));

        SalarioGerenteR.setBackground(new java.awt.Color(0, 102, 153));
        SalarioGerenteR.setForeground(new java.awt.Color(255, 255, 255));
        SalarioGerenteR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioGerenteRActionPerformed(evt);
            }
        });
        getContentPane().add(SalarioGerenteR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 60, -1));

        FaltasGerenteR.setBackground(new java.awt.Color(0, 102, 153));
        FaltasGerenteR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(FaltasGerenteR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 60, -1));

        labeldirecR.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labeldirecR.setForeground(new java.awt.Color(255, 255, 255));
        labeldirecR.setText("Director");
        getContentPane().add(labeldirecR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        DirectorR.setBackground(new java.awt.Color(0, 102, 153));
        DirectorR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DirectorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 70, -1));

        labelPlanta.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labelPlanta.setForeground(new java.awt.Color(255, 255, 255));
        labelPlanta.setText("Planta");
        getContentPane().add(labelPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        labelCarroc.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc.setText("Accesorios");
        getContentPane().add(labelCarroc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 10));

        labelChasis1.setForeground(new java.awt.Color(255, 255, 255));
        labelChasis1.setText("Chasis");
        getContentPane().add(labelChasis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        labelCarroc1.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc1.setText("Carroceria");
        getContentPane().add(labelCarroc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        labelCarroc2.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc2.setText("Motor");
        getContentPane().add(labelCarroc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de piezas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Disponibles");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, 20));

        cantidadRuedasB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadRuedasB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 80, -1));

        plantaRlabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        plantaRlabel.setForeground(new java.awt.Color(255, 255, 255));
        plantaRlabel.setText("Planta");
        getContentPane().add(plantaRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        ensamblaRlabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ensamblaRlabel.setForeground(new java.awt.Color(255, 255, 255));
        ensamblaRlabel.setText("Ensambladores");
        getContentPane().add(ensamblaRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ganancias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 10));

        gananciasRlabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        gananciasRlabel.setForeground(new java.awt.Color(255, 255, 255));
        gananciasRlabel.setText("Ganancias");
        getContentPane().add(gananciasRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, 10));

        GananciasRolls.setBackground(new java.awt.Color(0, 102, 153));
        GananciasRolls.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(GananciasRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 90, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Accesorios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, 10));

        empChasisB.setBackground(new java.awt.Color(0, 102, 153));
        empChasisB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 60, -1));

        cantidadCarrB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadCarrB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadCarrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 80, -1));

        cantidadVehiculosR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadVehiculosR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadVehiculosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 70, -1));

        cantidadMotorB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadMotorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 80, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Chasis");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carroceria");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Motor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, 10));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Accesorios");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empleados");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cantidad de piezas");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cantidad de Vehiculos");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        cantidadChasisB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisB.setForeground(new java.awt.Color(255, 255, 255));
        cantidadChasisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadChasisBActionPerformed(evt);
            }
        });
        getContentPane().add(cantidadChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 80, -1));

        cantidadChasisR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 80, -1));

        cantidadCarrR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadCarrR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 80, -1));

        cantidadMotorR1.setBackground(new java.awt.Color(0, 102, 153));
        cantidadMotorR1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadMotorR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 80, -1));

        cantidadRuedasR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadRuedasR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 80, -1));

        GananciasBugatti.setBackground(new java.awt.Color(0, 102, 153));
        GananciasBugatti.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(GananciasBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 90, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Costos");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, 10));

        CostosBugatti.setBackground(new java.awt.Color(0, 102, 153));
        CostosBugatti.setForeground(new java.awt.Color(255, 255, 255));
        CostosBugatti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostosBugattiActionPerformed(evt);
            }
        });
        getContentPane().add(CostosBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 90, -1));

        Start.setForeground(new java.awt.Color(0, 102, 153));
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        CostosRolls.setBackground(new java.awt.Color(0, 102, 153));
        CostosRolls.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CostosRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 90, -1));

        mRuedasB.setForeground(new java.awt.Color(0, 102, 153));
        mRuedasB.setText("-");
        mRuedasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRuedasBActionPerformed(evt);
            }
        });
        getContentPane().add(mRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 50, -1));

        aRuedasB.setForeground(new java.awt.Color(0, 102, 153));
        aRuedasB.setText("+");
        aRuedasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aRuedasBActionPerformed(evt);
            }
        });
        getContentPane().add(aRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 50, -1));

        mChasisB.setForeground(new java.awt.Color(0, 102, 153));
        mChasisB.setText("-");
        mChasisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mChasisBActionPerformed(evt);
            }
        });
        getContentPane().add(mChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, -1));

        aChasisB.setForeground(new java.awt.Color(0, 102, 153));
        aChasisB.setText("+");
        aChasisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aChasisBActionPerformed(evt);
            }
        });
        getContentPane().add(aChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 50, -1));

        aChasisR.setForeground(new java.awt.Color(0, 102, 153));
        aChasisR.setText("+");
        aChasisR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aChasisRActionPerformed(evt);
            }
        });
        getContentPane().add(aChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 50, 30));

        aMotorB.setForeground(new java.awt.Color(0, 102, 153));
        aMotorB.setText("+");
        aMotorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aMotorBActionPerformed(evt);
            }
        });
        getContentPane().add(aMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 50, -1));

        mChasisR.setForeground(new java.awt.Color(0, 102, 153));
        mChasisR.setText("-");
        mChasisR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mChasisRActionPerformed(evt);
            }
        });
        getContentPane().add(mChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 50, -1));

        mMotorB.setForeground(new java.awt.Color(0, 102, 153));
        mMotorB.setText("-");
        mMotorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMotorBActionPerformed(evt);
            }
        });
        getContentPane().add(mMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 50, -1));

        aEnsamb.setForeground(new java.awt.Color(0, 102, 153));
        aEnsamb.setText("+");
        aEnsamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aEnsambActionPerformed(evt);
            }
        });
        getContentPane().add(aEnsamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 50, -1));

        mEnsamb.setForeground(new java.awt.Color(0, 102, 153));
        mEnsamb.setText("-");
        mEnsamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEnsambActionPerformed(evt);
            }
        });
        getContentPane().add(mEnsamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 50, -1));

        labelCarroc3.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc3.setText("Ruedas");
        getContentPane().add(labelCarroc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ensambladores");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        vehiculosAccB.setBackground(new java.awt.Color(0, 102, 153));
        vehiculosAccB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vehiculosAccB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 60, -1));

        empMotorB.setBackground(new java.awt.Color(0, 102, 153));
        empMotorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 60, -1));

        empRuedasB.setBackground(new java.awt.Color(0, 102, 153));
        empRuedasB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 60, -1));

        cantAccesR.setBackground(new java.awt.Color(0, 102, 153));
        cantAccesR.setForeground(new java.awt.Color(255, 255, 255));
        cantAccesR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantAccesRActionPerformed(evt);
            }
        });
        getContentPane().add(cantAccesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 80, -1));

        empEnsamb.setBackground(new java.awt.Color(0, 102, 153));
        empEnsamb.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empEnsamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 60, -1));

        empDisp.setBackground(new java.awt.Color(0, 102, 153));
        empDisp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 90, 20));

        aCarrocB.setForeground(new java.awt.Color(0, 102, 153));
        aCarrocB.setText("+");
        aCarrocB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aCarrocBActionPerformed(evt);
            }
        });
        getContentPane().add(aCarrocB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 50, -1));

        empCarrocB.setBackground(new java.awt.Color(0, 102, 153));
        empCarrocB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empCarrocB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 60, -1));

        mCarrocB.setForeground(new java.awt.Color(0, 102, 153));
        mCarrocB.setText("-");
        mCarrocB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCarrocBActionPerformed(evt);
            }
        });
        getContentPane().add(mCarrocB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 50, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cantidad vehiculos ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        vehiculosEstandarB.setBackground(new java.awt.Color(0, 102, 153));
        vehiculosEstandarB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vehiculosEstandarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 60, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Empleados");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        empChasisR.setBackground(new java.awt.Color(0, 102, 153));
        empChasisR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 60, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Accesorios");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, 10));

        cantidadVehiculosR1.setBackground(new java.awt.Color(0, 102, 153));
        cantidadVehiculosR1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadVehiculosR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 70, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Estandar");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, 10));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Estandar");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, 10));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ruedas");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Empleados");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Disponibles");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 20));

        aEnsamb1.setForeground(new java.awt.Color(0, 102, 153));
        aEnsamb1.setText("+");
        aEnsamb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aEnsamb1ActionPerformed(evt);
            }
        });
        getContentPane().add(aEnsamb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 50, -1));

        empEnsambB.setBackground(new java.awt.Color(0, 102, 153));
        empEnsambB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empEnsambB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 60, -1));

        mEnsambB.setForeground(new java.awt.Color(0, 102, 153));
        mEnsambB.setText("-");
        mEnsambB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEnsambBActionPerformed(evt);
            }
        });
        getContentPane().add(mEnsambB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 50, -1));

        empDispB.setBackground(new java.awt.Color(0, 102, 153));
        empDispB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empDispB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 90, 20));

        cantAccesB.setBackground(new java.awt.Color(0, 102, 153));
        cantAccesB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantAccesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 80, -1));

        aAccesB.setForeground(new java.awt.Color(0, 102, 153));
        aAccesB.setText("+");
        aAccesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aAccesBActionPerformed(evt);
            }
        });
        getContentPane().add(aAccesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 50, -1));

        empAccesB.setBackground(new java.awt.Color(0, 102, 153));
        empAccesB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empAccesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 60, -1));

        mAccesB.setForeground(new java.awt.Color(0, 102, 153));
        mAccesB.setText("-");
        mAccesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAccesBActionPerformed(evt);
            }
        });
        getContentPane().add(mAccesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 50, -1));

        aAccesR1.setForeground(new java.awt.Color(0, 102, 153));
        aAccesR1.setText("+");
        aAccesR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aAccesR1ActionPerformed(evt);
            }
        });
        getContentPane().add(aAccesR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 50, 30));

        mAccesR1.setForeground(new java.awt.Color(0, 102, 153));
        mAccesR1.setText("-");
        mAccesR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAccesR1ActionPerformed(evt);
            }
        });
        getContentPane().add(mAccesR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 50, -1));

        empAccesR.setBackground(new java.awt.Color(0, 102, 153));
        empAccesR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empAccesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 60, -1));

        aRuedasR1.setForeground(new java.awt.Color(0, 102, 153));
        aRuedasR1.setText("+");
        aRuedasR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aRuedasR1ActionPerformed(evt);
            }
        });
        getContentPane().add(aRuedasR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 50, 30));

        empRuedasR.setBackground(new java.awt.Color(0, 102, 153));
        empRuedasR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 60, -1));

        mRuedasR.setForeground(new java.awt.Color(0, 102, 153));
        mRuedasR.setText("-");
        mRuedasR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRuedasRActionPerformed(evt);
            }
        });
        getContentPane().add(mRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 50, -1));

        empMotorR.setBackground(new java.awt.Color(0, 102, 153));
        empMotorR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, -1));

        empCarrR.setBackground(new java.awt.Color(0, 102, 153));
        empCarrR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 60, -1));

        mMotorR.setForeground(new java.awt.Color(0, 102, 153));
        mMotorR.setText("-");
        mMotorR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMotorRActionPerformed(evt);
            }
        });
        getContentPane().add(mMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 50, -1));

        aMotorR.setForeground(new java.awt.Color(0, 102, 153));
        aMotorR.setText("+");
        aMotorR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aMotorRActionPerformed(evt);
            }
        });
        getContentPane().add(aMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 50, 30));

        mCarrR.setForeground(new java.awt.Color(0, 102, 153));
        mCarrR.setText("-");
        mCarrR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCarrRActionPerformed(evt);
            }
        });
        getContentPane().add(mCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 50, -1));

        aCarrR.setForeground(new java.awt.Color(0, 102, 153));
        aCarrR.setText("+");
        aCarrR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aCarrRActionPerformed(evt);
            }
        });
        getContentPane().add(aCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 50, 30));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Sirve2.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));
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

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        try {
            // TODO add your handling code here:

            plantaB.Start();
        } catch (ParseException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            plantaR.Start();
        } catch (ParseException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_StartActionPerformed

    private void aChasisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aChasisBActionPerformed
        // TODO add your handling code here:
        
        if(plantaB.posVecChasis < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas +plantaB.prodAcces + plantaB.ensamblador ) !=0)){
            plantaB.productorChasis();
            plantaB.prodChasis++;
        }
    }//GEN-LAST:event_aChasisBActionPerformed

    private void mChasisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mChasisBActionPerformed
        // TODO add your handling code here:
        if(plantaB.posVecChasis != 0 && (plantaB.prodChasis - 1) >0){
            plantaB.despProdChasis();
             plantaB.prodChasis--;
        }
    }//GEN-LAST:event_mChasisBActionPerformed

    private void mCarrocBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCarrocBActionPerformed
        // TODO add your handling code here:
        if(plantaB.posVecCarroc != 0 && (plantaB.prodCarroceria - 1) >0){
            plantaB.desProdCarroc();
             plantaB.prodCarroceria--;
        }
    }//GEN-LAST:event_mCarrocBActionPerformed

    private void aCarrocBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aCarrocBActionPerformed
        // TODO add your handling code here:
        if(plantaB.posVecCarroc < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas +plantaB.prodAcces + plantaB.ensamblador ) !=0)){
            plantaB.productorCarroc();
            plantaB.prodCarroceria++;
        }
    }//GEN-LAST:event_aCarrocBActionPerformed

    private void mMotorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMotorBActionPerformed
        // TODO add your handling code here:
        if(plantaB.posVecMotor != 0 && (plantaB.prodMotor - 1) >0){
            plantaB.desProdMotor();
             plantaB.prodMotor--;
        }
    }//GEN-LAST:event_mMotorBActionPerformed

    private void aMotorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMotorBActionPerformed
        // TODO add your handling code here:
        if(plantaB.posVecMotor < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas +plantaB.prodAcces + plantaB.ensamblador ) !=0)){
            plantaB.productorMotor();
            plantaB.prodMotor++;
        }
    }//GEN-LAST:event_aMotorBActionPerformed

    private void mRuedasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRuedasBActionPerformed
        // TODO add your handling code here:
        if(plantaB.posVecRuedas != 0 && (plantaB.prodRuedas - 1) >0){
            plantaB.desProdRuedas();
             plantaB.prodRuedas--;
        }
    }//GEN-LAST:event_mRuedasBActionPerformed

    private void aRuedasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aRuedasBActionPerformed
        // TODO add your handling code here:
        if(plantaB.posVecRuedas < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas +plantaB.prodAcces + plantaB.ensamblador ) !=0)){
            plantaB.productorRuedas();
            plantaB.prodRuedas++;
        }
        
    }//GEN-LAST:event_aRuedasBActionPerformed

    private void mChasisRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mChasisRActionPerformed
        // TODO add your handling code here:
        if(plantaB.posVecAcc != 0 && (plantaB.prodAcces - 1) >0){
            plantaB.desProdAcc();
             plantaB.prodAcces--;
        }
    }//GEN-LAST:event_mChasisRActionPerformed

    private void aChasisRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aChasisRActionPerformed
        // TODO add your handling code here:
        
        if(plantaB.posVecAcc < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas +plantaB.prodAcces + plantaB.ensamblador ) !=0)){
            plantaB.productorAcce();
            plantaB.prodAcces++;
        }
    }//GEN-LAST:event_aChasisRActionPerformed

    private void mEnsambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEnsambActionPerformed
        // TODO add your handling code here:
        if(plantaB.posEnsamb != 0 && (plantaB.ensamblador - 1) >0){
            plantaB.desEnsamblador();
             plantaB.ensamblador--;
        }
    }//GEN-LAST:event_mEnsambActionPerformed

    private void aEnsambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aEnsambActionPerformed
        // TODO add your handling code here:
        if(plantaB.posEnsamb < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas +plantaB.prodAcces + plantaB.ensamblador ) !=0)){
            plantaB.Ensamblador();
            plantaB.ensamblador++;
        }
    }//GEN-LAST:event_aEnsambActionPerformed

    private void cantidadChasisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadChasisBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadChasisBActionPerformed

    private void aEnsamb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aEnsamb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aEnsamb1ActionPerformed

    private void mEnsambBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEnsambBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mEnsambBActionPerformed

    private void cantAccesRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantAccesRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantAccesRActionPerformed

    private void aAccesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aAccesBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aAccesBActionPerformed

    private void mAccesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAccesBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAccesBActionPerformed

    private void aAccesR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aAccesR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aAccesR1ActionPerformed

    private void mAccesR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAccesR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAccesR1ActionPerformed

    private void aRuedasR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aRuedasR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aRuedasR1ActionPerformed

    private void mRuedasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRuedasRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mRuedasRActionPerformed

    private void mMotorRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMotorRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mMotorRActionPerformed

    private void aMotorRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMotorRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aMotorRActionPerformed

    private void mCarrRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCarrRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mCarrRActionPerformed

    private void aCarrRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aCarrRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aCarrRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    public javax.swing.JTextField CostosBugatti;
    public javax.swing.JTextField CostosRolls;
    private javax.swing.JLabel DiasLabelB;
    public javax.swing.JTextField DiasRestantes;
    public javax.swing.JTextField DiasRestantesR;
    private javax.swing.JTextField DirectorB;
    private javax.swing.JTextField DirectorR;
    private javax.swing.JTextField FaltasGerenteB;
    private javax.swing.JTextField FaltasGerenteR;
    public javax.swing.JTextField GananciasBugatti;
    public javax.swing.JTextField GananciasRolls;
    private javax.swing.JLabel LabelDirecB;
    private javax.swing.JLabel LabelFaltasGerR;
    private javax.swing.JLabel LabelGerR1;
    private javax.swing.JTextField SalarioGerenteB;
    private javax.swing.JTextField SalarioGerenteR;
    private javax.swing.JButton Start;
    private javax.swing.JButton aAccesB;
    private javax.swing.JButton aAccesR1;
    private javax.swing.JButton aCarrR;
    private javax.swing.JButton aCarrocB;
    private javax.swing.JButton aChasisB;
    private javax.swing.JButton aChasisR;
    private javax.swing.JButton aEnsamb;
    private javax.swing.JButton aEnsamb1;
    private javax.swing.JButton aMotorB;
    private javax.swing.JButton aMotorR;
    private javax.swing.JButton aRuedasB;
    private javax.swing.JButton aRuedasR1;
    public javax.swing.JTextField cantAccesB;
    public javax.swing.JTextField cantAccesR;
    public javax.swing.JTextField cantidadCarrB;
    public javax.swing.JTextField cantidadCarrR;
    public javax.swing.JTextField cantidadChasisB;
    public javax.swing.JTextField cantidadChasisR;
    public javax.swing.JTextField cantidadMotorB;
    public javax.swing.JTextField cantidadMotorR1;
    public javax.swing.JTextField cantidadRuedasB;
    public javax.swing.JTextField cantidadRuedasR;
    public javax.swing.JTextField cantidadVehiculosR;
    public javax.swing.JTextField cantidadVehiculosR1;
    public javax.swing.JTextField empAccesB;
    public javax.swing.JTextField empAccesR;
    public javax.swing.JTextField empCarrR;
    public javax.swing.JTextField empCarrocB;
    public javax.swing.JTextField empChasisB;
    public javax.swing.JTextField empChasisR;
    public javax.swing.JTextField empDisp;
    public javax.swing.JTextField empDispB;
    public javax.swing.JTextField empEnsamb;
    public javax.swing.JTextField empEnsambB;
    public javax.swing.JTextField empMotorB;
    public javax.swing.JTextField empMotorR;
    public javax.swing.JTextField empRuedasB;
    public javax.swing.JTextField empRuedasR;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCarroc;
    private javax.swing.JLabel labelCarroc1;
    private javax.swing.JLabel labelCarroc2;
    private javax.swing.JLabel labelCarroc3;
    private javax.swing.JLabel labelChasis1;
    private javax.swing.JLabel labelDiasR;
    private javax.swing.JLabel labelFaltasGB;
    private javax.swing.JLabel labelGerenteB;
    private javax.swing.JLabel labelPlanta;
    private javax.swing.JLabel labelSalarioG;
    private javax.swing.JLabel labeldirecR;
    private javax.swing.JButton mAccesB;
    private javax.swing.JButton mAccesR1;
    private javax.swing.JButton mCarrR;
    private javax.swing.JButton mCarrocB;
    private javax.swing.JButton mChasisB;
    private javax.swing.JButton mChasisR;
    private javax.swing.JButton mEnsamb;
    private javax.swing.JButton mEnsambB;
    private javax.swing.JButton mMotorB;
    private javax.swing.JButton mMotorR;
    private javax.swing.JButton mRuedasB;
    private javax.swing.JButton mRuedasR;
    private javax.swing.JLabel plantaRlabel;
    private javax.swing.JLabel salarioGerR;
    public javax.swing.JTextField vehiculosAccB;
    public javax.swing.JTextField vehiculosEstandarB;
    // End of variables declaration//GEN-END:variables
}
