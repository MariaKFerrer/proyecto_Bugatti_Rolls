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
        this.act = new Actualizador(this, plantaB, plantaR);

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
        jPanel5 = new javax.swing.JPanel();
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
        empDispR = new javax.swing.JTextField();
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
        empAccesoriosR = new javax.swing.JTextField();
        aRuedasR1 = new javax.swing.JButton();
        empRuedasR = new javax.swing.JTextField();
        mRuedasR = new javax.swing.JButton();
        empMotorR = new javax.swing.JTextField();
        empCarrocR = new javax.swing.JTextField();
        mMotorR = new javax.swing.JButton();
        aMotorR = new javax.swing.JButton();
        mCarrocR = new javax.swing.JButton();
        aCarrocR = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 0), new java.awt.Dimension(1, 32767));
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        maxAccB = new javax.swing.JTextField();
        maxAccR = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        maxChasisR = new javax.swing.JTextField();
        masCarrR = new javax.swing.JTextField();
        maxMotorR = new javax.swing.JTextField();
        maxRuedasR = new javax.swing.JTextField();
        maxChasisB = new javax.swing.JTextField();
        maxCarrB = new javax.swing.JTextField();
        maxMotorB = new javax.swing.JTextField();
        maxRuedasB = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setMinimumSize(new java.awt.Dimension(855, 490));
        setSize(new java.awt.Dimension(850, 495));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Costos");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, 10));

        DiasLabelB.setForeground(new java.awt.Color(255, 255, 255));
        DiasLabelB.setText("Dias restantes ");
        getContentPane().add(DiasLabelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        DiasRestantes.setBackground(new java.awt.Color(0, 102, 153));
        DiasRestantes.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 60, 30));

        labelGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        labelGerenteB.setText("Gerente");
        getContentPane().add(labelGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, 20));

        LabelDirecB.setForeground(new java.awt.Color(255, 255, 255));
        LabelDirecB.setText("Director");
        getContentPane().add(LabelDirecB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

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
        getContentPane().add(DirectorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 70, -1));

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
        getContentPane().add(labelFaltasGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 20));

        labelSalarioG.setForeground(new java.awt.Color(255, 255, 255));
        labelSalarioG.setText("Salario");
        getContentPane().add(labelSalarioG, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        labelDiasR.setForeground(new java.awt.Color(255, 255, 255));
        labelDiasR.setText("Dias Restantes");
        labelDiasR.setToolTipText("");
        getContentPane().add(labelDiasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        DiasRestantesR.setBackground(new java.awt.Color(0, 102, 153));
        DiasRestantesR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasRestantesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 70, -1));

        salarioGerR.setForeground(new java.awt.Color(255, 255, 255));
        salarioGerR.setText("Salario");
        getContentPane().add(salarioGerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, 10));

        LabelGerR1.setForeground(new java.awt.Color(255, 255, 255));
        LabelGerR1.setText("Gerente");
        getContentPane().add(LabelGerR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        LabelFaltasGerR.setForeground(new java.awt.Color(255, 255, 255));
        LabelFaltasGerR.setText("Faltas");
        getContentPane().add(LabelFaltasGerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, 10));

        SalarioGerenteR.setBackground(new java.awt.Color(0, 102, 153));
        SalarioGerenteR.setForeground(new java.awt.Color(255, 255, 255));
        SalarioGerenteR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioGerenteRActionPerformed(evt);
            }
        });
        getContentPane().add(SalarioGerenteR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 60, -1));

        FaltasGerenteR.setBackground(new java.awt.Color(0, 102, 153));
        FaltasGerenteR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(FaltasGerenteR, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 60, -1));

        labeldirecR.setForeground(new java.awt.Color(255, 255, 255));
        labeldirecR.setText("Director");
        getContentPane().add(labeldirecR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        DirectorR.setBackground(new java.awt.Color(0, 102, 153));
        DirectorR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DirectorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 70, -1));

        labelPlanta.setForeground(new java.awt.Color(255, 255, 255));
        labelPlanta.setText("Planta");
        getContentPane().add(labelPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        labelCarroc.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc.setText("Accesorios");
        getContentPane().add(labelCarroc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 10));

        labelChasis1.setForeground(new java.awt.Color(255, 255, 255));
        labelChasis1.setText("Chasis");
        getContentPane().add(labelChasis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        labelCarroc1.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc1.setText("Carroceria");
        getContentPane().add(labelCarroc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        labelCarroc2.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc2.setText("Motor");
        getContentPane().add(labelCarroc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Piezas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empleados disponibles");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, 20));

        cantidadRuedasB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadRuedasB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 60, -1));

        plantaRlabel.setForeground(new java.awt.Color(255, 255, 255));
        plantaRlabel.setText("Planta");
        getContentPane().add(plantaRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        ensamblaRlabel.setForeground(new java.awt.Color(255, 255, 255));
        ensamblaRlabel.setText("Ensambladores");
        getContentPane().add(ensamblaRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ganancias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, 10));

        gananciasRlabel.setForeground(new java.awt.Color(255, 255, 255));
        gananciasRlabel.setText("Ganancias");
        getContentPane().add(gananciasRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, 10));

        GananciasRolls.setBackground(new java.awt.Color(0, 102, 153));
        GananciasRolls.setForeground(new java.awt.Color(255, 255, 255));
        GananciasRolls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GananciasRollsActionPerformed(evt);
            }
        });
        getContentPane().add(GananciasRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 90, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Accesorios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, 10));

        empChasisB.setBackground(new java.awt.Color(0, 102, 153));
        empChasisB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, -1));

        cantidadCarrB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadCarrB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadCarrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 60, -1));

        cantidadVehiculosR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadVehiculosR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadVehiculosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 70, -1));

        cantidadMotorB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadMotorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 60, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Chasis");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Carroceria");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Motor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, 10));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Accesorios");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empleados");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Piezas");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cantidad de Vehiculos");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        cantidadChasisB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisB.setForeground(new java.awt.Color(255, 255, 255));
        cantidadChasisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadChasisBActionPerformed(evt);
            }
        });
        getContentPane().add(cantidadChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 60, -1));

        cantidadChasisR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisR.setForeground(new java.awt.Color(255, 255, 255));
        cantidadChasisR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadChasisRActionPerformed(evt);
            }
        });
        getContentPane().add(cantidadChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 60, -1));

        cantidadCarrR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadCarrR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 60, -1));

        cantidadMotorR1.setBackground(new java.awt.Color(0, 102, 153));
        cantidadMotorR1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadMotorR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 60, -1));

        cantidadRuedasR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadRuedasR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 60, -1));

        GananciasBugatti.setBackground(new java.awt.Color(0, 102, 153));
        GananciasBugatti.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(GananciasBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 90, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Costos");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, 10));

        CostosBugatti.setBackground(new java.awt.Color(0, 102, 153));
        CostosBugatti.setForeground(new java.awt.Color(255, 255, 255));
        CostosBugatti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostosBugattiActionPerformed(evt);
            }
        });
        getContentPane().add(CostosBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 90, -1));

        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        CostosRolls.setBackground(new java.awt.Color(0, 102, 153));
        CostosRolls.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CostosRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 90, -1));

        mRuedasB.setForeground(new java.awt.Color(0, 102, 153));
        mRuedasB.setText("-");
        mRuedasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRuedasBActionPerformed(evt);
            }
        });
        getContentPane().add(mRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 50, -1));

        aRuedasB.setForeground(new java.awt.Color(0, 102, 153));
        aRuedasB.setText("+");
        aRuedasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aRuedasBActionPerformed(evt);
            }
        });
        getContentPane().add(aRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 50, -1));

        mChasisB.setForeground(new java.awt.Color(0, 102, 153));
        mChasisB.setText("-");
        mChasisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mChasisBActionPerformed(evt);
            }
        });
        getContentPane().add(mChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 50, -1));

        aChasisB.setForeground(new java.awt.Color(0, 102, 153));
        aChasisB.setText("+");
        aChasisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aChasisBActionPerformed(evt);
            }
        });
        getContentPane().add(aChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 50, -1));

        aChasisR.setForeground(new java.awt.Color(0, 102, 153));
        aChasisR.setText("+");
        aChasisR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aChasisRActionPerformed(evt);
            }
        });
        getContentPane().add(aChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 50, 30));

        aMotorB.setForeground(new java.awt.Color(0, 102, 153));
        aMotorB.setText("+");
        aMotorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aMotorBActionPerformed(evt);
            }
        });
        getContentPane().add(aMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 50, -1));

        mChasisR.setForeground(new java.awt.Color(0, 102, 153));
        mChasisR.setText("-");
        mChasisR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mChasisRActionPerformed(evt);
            }
        });
        getContentPane().add(mChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 50, -1));

        mMotorB.setForeground(new java.awt.Color(0, 102, 153));
        mMotorB.setText("-");
        mMotorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMotorBActionPerformed(evt);
            }
        });
        getContentPane().add(mMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 50, -1));

        aEnsamb.setForeground(new java.awt.Color(0, 102, 153));
        aEnsamb.setText("+");
        aEnsamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aEnsambActionPerformed(evt);
            }
        });
        getContentPane().add(aEnsamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 50, -1));

        mEnsamb.setForeground(new java.awt.Color(0, 102, 153));
        mEnsamb.setText("-");
        mEnsamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEnsambActionPerformed(evt);
            }
        });
        getContentPane().add(mEnsamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 50, -1));

        labelCarroc3.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc3.setText("Ruedas");
        getContentPane().add(labelCarroc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ensambladores");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        vehiculosAccB.setBackground(new java.awt.Color(0, 102, 153));
        vehiculosAccB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vehiculosAccB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 60, -1));

        empMotorB.setBackground(new java.awt.Color(0, 102, 153));
        empMotorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 60, -1));

        empRuedasB.setBackground(new java.awt.Color(0, 102, 153));
        empRuedasB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 60, -1));

        cantAccesR.setBackground(new java.awt.Color(0, 102, 153));
        cantAccesR.setForeground(new java.awt.Color(255, 255, 255));
        cantAccesR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantAccesRActionPerformed(evt);
            }
        });
        getContentPane().add(cantAccesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 60, -1));

        empEnsamb.setBackground(new java.awt.Color(0, 102, 153));
        empEnsamb.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empEnsamb, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 60, -1));

        empDispR.setBackground(new java.awt.Color(0, 102, 153));
        empDispR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empDispR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 90, 20));

        aCarrocB.setForeground(new java.awt.Color(0, 102, 153));
        aCarrocB.setText("+");
        aCarrocB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aCarrocBActionPerformed(evt);
            }
        });
        getContentPane().add(aCarrocB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 50, -1));

        empCarrocB.setBackground(new java.awt.Color(0, 102, 153));
        empCarrocB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empCarrocB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 60, -1));

        mCarrocB.setForeground(new java.awt.Color(0, 102, 153));
        mCarrocB.setText("-");
        mCarrocB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCarrocBActionPerformed(evt);
            }
        });
        getContentPane().add(mCarrocB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 50, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cantidad vehiculos ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        vehiculosEstandarB.setBackground(new java.awt.Color(0, 102, 153));
        vehiculosEstandarB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(vehiculosEstandarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 60, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Empleados");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        empChasisR.setBackground(new java.awt.Color(0, 102, 153));
        empChasisR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 60, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Accesorios");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, 10));

        cantidadVehiculosR1.setBackground(new java.awt.Color(0, 102, 153));
        cantidadVehiculosR1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadVehiculosR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 70, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Estandar");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, 10));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Estandar");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, 10));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ruedas");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Empleados");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Empleados disponibles");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 20));

        aEnsamb1.setForeground(new java.awt.Color(0, 102, 153));
        aEnsamb1.setText("+");
        aEnsamb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aEnsamb1ActionPerformed(evt);
            }
        });
        getContentPane().add(aEnsamb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 50, -1));

        empEnsambB.setBackground(new java.awt.Color(0, 102, 153));
        empEnsambB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empEnsambB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 60, -1));

        mEnsambB.setForeground(new java.awt.Color(0, 102, 153));
        mEnsambB.setText("-");
        mEnsambB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEnsambBActionPerformed(evt);
            }
        });
        getContentPane().add(mEnsambB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 50, -1));

        empDispB.setBackground(new java.awt.Color(0, 102, 153));
        empDispB.setForeground(new java.awt.Color(255, 255, 255));
        empDispB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empDispBActionPerformed(evt);
            }
        });
        getContentPane().add(empDispB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 90, 20));

        cantAccesB.setBackground(new java.awt.Color(0, 102, 153));
        cantAccesB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantAccesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 60, -1));

        aAccesB.setForeground(new java.awt.Color(0, 102, 153));
        aAccesB.setText("+");
        aAccesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aAccesBActionPerformed(evt);
            }
        });
        getContentPane().add(aAccesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 50, -1));

        empAccesB.setBackground(new java.awt.Color(0, 102, 153));
        empAccesB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empAccesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 60, -1));

        mAccesB.setForeground(new java.awt.Color(0, 102, 153));
        mAccesB.setText("-");
        mAccesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAccesBActionPerformed(evt);
            }
        });
        getContentPane().add(mAccesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 50, -1));

        aAccesR1.setForeground(new java.awt.Color(0, 102, 153));
        aAccesR1.setText("+");
        aAccesR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aAccesR1ActionPerformed(evt);
            }
        });
        getContentPane().add(aAccesR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 50, 30));

        mAccesR1.setForeground(new java.awt.Color(0, 102, 153));
        mAccesR1.setText("-");
        mAccesR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAccesR1ActionPerformed(evt);
            }
        });
        getContentPane().add(mAccesR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 50, -1));

        empAccesoriosR.setBackground(new java.awt.Color(0, 102, 153));
        empAccesoriosR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empAccesoriosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 60, -1));

        aRuedasR1.setForeground(new java.awt.Color(0, 102, 153));
        aRuedasR1.setText("+");
        aRuedasR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aRuedasR1ActionPerformed(evt);
            }
        });
        getContentPane().add(aRuedasR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 50, 30));

        empRuedasR.setBackground(new java.awt.Color(0, 102, 153));
        empRuedasR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 60, -1));

        mRuedasR.setForeground(new java.awt.Color(0, 102, 153));
        mRuedasR.setText("-");
        mRuedasR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRuedasRActionPerformed(evt);
            }
        });
        getContentPane().add(mRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 50, -1));

        empMotorR.setBackground(new java.awt.Color(0, 102, 153));
        empMotorR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 60, -1));

        empCarrocR.setBackground(new java.awt.Color(0, 102, 153));
        empCarrocR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(empCarrocR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 60, -1));

        mMotorR.setForeground(new java.awt.Color(0, 102, 153));
        mMotorR.setText("-");
        mMotorR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMotorRActionPerformed(evt);
            }
        });
        getContentPane().add(mMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 50, -1));

        aMotorR.setForeground(new java.awt.Color(0, 102, 153));
        aMotorR.setText("+");
        aMotorR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aMotorRActionPerformed(evt);
            }
        });
        getContentPane().add(aMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 50, 30));

        mCarrocR.setForeground(new java.awt.Color(0, 102, 153));
        mCarrocR.setText("-");
        mCarrocR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCarrocRActionPerformed(evt);
            }
        });
        getContentPane().add(mCarrocR, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 50, -1));

        aCarrocR.setForeground(new java.awt.Color(0, 102, 153));
        aCarrocR.setText("+");
        aCarrocR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aCarrocRActionPerformed(evt);
            }
        });
        getContentPane().add(aCarrocR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 50, 30));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Cantidad");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 30));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Cantidad");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, 30));

        maxAccB.setBackground(new java.awt.Color(0, 102, 153));
        maxAccB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(maxAccB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 60, -1));

        maxAccR.setBackground(new java.awt.Color(0, 102, 153));
        maxAccR.setForeground(new java.awt.Color(255, 255, 255));
        maxAccR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxAccRActionPerformed(evt);
            }
        });
        getContentPane().add(maxAccR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 60, -1));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Max");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, 30));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Max");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 176, -1, 20));

        maxChasisR.setBackground(new java.awt.Color(0, 102, 153));
        maxChasisR.setForeground(new java.awt.Color(255, 255, 255));
        maxChasisR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxChasisRActionPerformed(evt);
            }
        });
        getContentPane().add(maxChasisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 60, -1));

        masCarrR.setBackground(new java.awt.Color(0, 102, 153));
        masCarrR.setForeground(new java.awt.Color(255, 255, 255));
        masCarrR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masCarrRActionPerformed(evt);
            }
        });
        getContentPane().add(masCarrR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 60, -1));

        maxMotorR.setBackground(new java.awt.Color(0, 102, 153));
        maxMotorR.setForeground(new java.awt.Color(255, 255, 255));
        maxMotorR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxMotorRActionPerformed(evt);
            }
        });
        getContentPane().add(maxMotorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 60, -1));

        maxRuedasR.setBackground(new java.awt.Color(0, 102, 153));
        maxRuedasR.setForeground(new java.awt.Color(255, 255, 255));
        maxRuedasR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxRuedasRActionPerformed(evt);
            }
        });
        getContentPane().add(maxRuedasR, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 60, -1));

        maxChasisB.setBackground(new java.awt.Color(0, 102, 153));
        maxChasisB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(maxChasisB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 60, -1));

        maxCarrB.setBackground(new java.awt.Color(0, 102, 153));
        maxCarrB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(maxCarrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 60, -1));

        maxMotorB.setBackground(new java.awt.Color(0, 102, 153));
        maxMotorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(maxMotorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 60, 20));

        maxRuedasB.setBackground(new java.awt.Color(0, 102, 153));
        maxRuedasB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(maxRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 60, -1));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Sirve2.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 490));

        pack();
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

        if (plantaB.posVecChasis < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador) != 0)) {
            plantaB.productorChasis();
            plantaB.prodChasis++;
        }
    }//GEN-LAST:event_aChasisBActionPerformed

    private void mChasisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mChasisBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecChasis != 0 && (plantaB.prodChasis - 1) > 0) {
            plantaB.despProdChasis();
            plantaB.prodChasis--;
        }
    }//GEN-LAST:event_mChasisBActionPerformed

    private void mCarrocBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCarrocBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecCarroc != 0 && (plantaB.prodCarroceria - 1) > 0) {
            plantaB.desProdCarroc();
            plantaB.prodCarroceria--;
        }
    }//GEN-LAST:event_mCarrocBActionPerformed

    private void aCarrocBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aCarrocBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecCarroc < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador) != 0)) {
            plantaB.productorCarroc();
            plantaB.prodCarroceria++;
        }
    }//GEN-LAST:event_aCarrocBActionPerformed

    private void mMotorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMotorBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecMotor != 0 && (plantaB.prodMotor - 1) > 0) {
            plantaB.desProdMotor();
            plantaB.prodMotor--;
        }
    }//GEN-LAST:event_mMotorBActionPerformed

    private void aMotorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMotorBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecMotor < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador) != 0)) {
            plantaB.productorMotor();
            plantaB.prodMotor++;
        }
    }//GEN-LAST:event_aMotorBActionPerformed

    private void mRuedasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRuedasBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecRuedas != 0 && (plantaB.prodRuedas - 1) > 0) {
            plantaB.desProdRuedas();
            plantaB.prodRuedas--;
        }
    }//GEN-LAST:event_mRuedasBActionPerformed

    private void aRuedasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aRuedasBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecRuedas < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador) != 0)) {
            plantaB.productorRuedas();
            plantaB.prodRuedas++;
        }

    }//GEN-LAST:event_aRuedasBActionPerformed

    private void mChasisRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mChasisRActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecChasis != 0 && (plantaR.prodChasis - 1) > 0) {
            plantaR.despProdChasis();
            plantaR.prodChasis--;
        }
    }//GEN-LAST:event_mChasisRActionPerformed

    private void aChasisRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aChasisRActionPerformed
        // TODO add your handling code here:

        if (plantaR.posVecChasis < plantaR.maxEmpleados && (plantaR.maxEmpleados - (plantaR.prodChasis + plantaR.prodCarroceria + plantaR.prodMotor + plantaR.prodRuedas + plantaR.prodAcces + plantaR.ensamblador) != 0)) {
            plantaR.productorChasis();
            plantaR.prodChasis++;
        }
    }//GEN-LAST:event_aChasisRActionPerformed

    private void mEnsambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEnsambActionPerformed
        // TODO add your handling code here:
        if (plantaR.posEnsamb != 0 && (plantaR.ensamblador - 1) > 0) {
            plantaR.desEnsamblador();
            plantaR.ensamblador--;
        }

    }//GEN-LAST:event_mEnsambActionPerformed

    private void aEnsambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aEnsambActionPerformed
        // TODO add your handling code here:
        if (plantaR.posEnsamb < plantaR.maxEmpleados && (plantaR.maxEmpleados - (plantaR.prodChasis + plantaR.prodCarroceria + plantaR.prodMotor + plantaR.prodRuedas + plantaR.prodAcces + plantaR.ensamblador) != 0)) {
            plantaR.Ensamblador();
            plantaR.ensamblador++;
        }

    }//GEN-LAST:event_aEnsambActionPerformed

    private void cantidadChasisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadChasisBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadChasisBActionPerformed

    private void aEnsamb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aEnsamb1ActionPerformed
        // TODO add your handling code here:
        if (plantaB.posEnsamb < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador) != 0)) {
            plantaB.Ensamblador();
            plantaB.ensamblador++;
        }

    }//GEN-LAST:event_aEnsamb1ActionPerformed

    private void mEnsambBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEnsambBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posEnsamb != 0 && (plantaB.ensamblador - 1) > 0) {
            plantaB.desEnsamblador();
            plantaB.ensamblador--;
        }
    }//GEN-LAST:event_mEnsambBActionPerformed

    private void cantAccesRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantAccesRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantAccesRActionPerformed

    private void aAccesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aAccesBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecAcc < plantaB.maxEmpleados && (plantaB.maxEmpleados - (plantaB.prodChasis + plantaB.prodCarroceria + plantaB.prodMotor + plantaB.prodRuedas + plantaB.prodAcces + plantaB.ensamblador) != 0)) {
            plantaB.productorAcce();
            plantaB.prodAcces++;
        }
    }//GEN-LAST:event_aAccesBActionPerformed

    private void mAccesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAccesBActionPerformed
        // TODO add your handling code here:
        if (plantaB.posVecAcc != 0 && (plantaB.prodAcces - 1) > 0) {
            plantaB.desProdAcc();
            plantaB.prodAcces--;
        }
    }//GEN-LAST:event_mAccesBActionPerformed

    private void aAccesR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aAccesR1ActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecAcc < plantaR.maxEmpleados && (plantaR.maxEmpleados - (plantaR.prodChasis + plantaR.prodCarroceria + plantaR.prodMotor + plantaR.prodRuedas + plantaR.prodAcces + plantaR.ensamblador) != 0)) {
            plantaR.productorAcce();
            plantaR.prodAcces++;
        }
    }//GEN-LAST:event_aAccesR1ActionPerformed

    private void mAccesR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAccesR1ActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecAcc != 0 && (plantaR.prodAcces - 1) > 0) {
            plantaR.desProdAcc();
            plantaR.prodAcces--;
        }
    }//GEN-LAST:event_mAccesR1ActionPerformed

    private void aRuedasR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aRuedasR1ActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecRuedas < plantaR.maxEmpleados && (plantaR.maxEmpleados - (plantaR.prodChasis + plantaR.prodCarroceria + plantaR.prodMotor + plantaR.prodRuedas + plantaR.prodAcces + plantaR.ensamblador) != 0)) {
            plantaR.productorRuedas();
            plantaR.prodRuedas++;
        }
    }//GEN-LAST:event_aRuedasR1ActionPerformed

    private void mRuedasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRuedasRActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecRuedas != 0 && (plantaR.prodRuedas - 1) > 0) {
            plantaR.desProdRuedas();
            plantaR.prodRuedas--;
        }
    }//GEN-LAST:event_mRuedasRActionPerformed

    private void mMotorRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMotorRActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecMotor != 0 && (plantaR.prodMotor - 1) > 0) {
            plantaR.desProdMotor();
            plantaR.prodMotor--;
        }
    }//GEN-LAST:event_mMotorRActionPerformed

    private void aMotorRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMotorRActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecMotor < plantaR.maxEmpleados && (plantaR.maxEmpleados - (plantaR.prodChasis + plantaR.prodCarroceria + plantaR.prodMotor + plantaR.prodRuedas + plantaR.prodAcces + plantaR.ensamblador) != 0)) {
            plantaR.productorMotor();
            plantaR.prodMotor++;
        }
    }//GEN-LAST:event_aMotorRActionPerformed

    private void mCarrocRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCarrocRActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecCarroc != 0 && (plantaR.prodCarroceria - 1) > 0) {
            plantaR.desProdCarroc();
            plantaR.prodCarroceria--;
        }
    }//GEN-LAST:event_mCarrocRActionPerformed

    private void aCarrocRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aCarrocRActionPerformed
        // TODO add your handling code here:
        if (plantaR.posVecCarroc < plantaR.maxEmpleados && (plantaR.maxEmpleados - (plantaR.prodChasis + plantaR.prodCarroceria + plantaR.prodMotor + plantaR.prodRuedas + plantaR.prodAcces + plantaR.ensamblador) != 0)) {
            plantaR.productorCarroc();
            plantaR.prodCarroceria++;
        }
    }//GEN-LAST:event_aCarrocRActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void empDispBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDispBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empDispBActionPerformed

    private void cantidadChasisRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadChasisRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadChasisRActionPerformed

    private void GananciasRollsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GananciasRollsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GananciasRollsActionPerformed

    private void maxAccRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxAccRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxAccRActionPerformed

    private void maxChasisRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxChasisRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxChasisRActionPerformed

    private void masCarrRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masCarrRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masCarrRActionPerformed

    private void maxMotorRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxMotorRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxMotorRActionPerformed

    private void maxRuedasRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxRuedasRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxRuedasRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    public javax.swing.JTextField CostosBugatti;
    public javax.swing.JTextField CostosRolls;
    private javax.swing.JLabel DiasLabelB;
    public javax.swing.JTextField DiasRestantes;
    public javax.swing.JTextField DiasRestantesR;
    public javax.swing.JTextField DirectorB;
    public javax.swing.JTextField DirectorR;
    public javax.swing.JTextField FaltasGerenteB;
    public javax.swing.JTextField FaltasGerenteR;
    public javax.swing.JTextField GananciasBugatti;
    public javax.swing.JTextField GananciasRolls;
    private javax.swing.JLabel LabelDirecB;
    private javax.swing.JLabel LabelFaltasGerR;
    private javax.swing.JLabel LabelGerR1;
    public javax.swing.JTextField SalarioGerenteB;
    public javax.swing.JTextField SalarioGerenteR;
    private javax.swing.JButton Start;
    private javax.swing.JButton aAccesB;
    private javax.swing.JButton aAccesR1;
    private javax.swing.JButton aCarrocB;
    private javax.swing.JButton aCarrocR;
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
    public javax.swing.JTextField empAccesoriosR;
    public javax.swing.JTextField empCarrocB;
    public javax.swing.JTextField empCarrocR;
    public javax.swing.JTextField empChasisB;
    public javax.swing.JTextField empChasisR;
    public javax.swing.JTextField empDispB;
    public javax.swing.JTextField empDispR;
    public javax.swing.JTextField empEnsamb;
    public javax.swing.JTextField empEnsambB;
    public javax.swing.JTextField empMotorB;
    public javax.swing.JTextField empMotorR;
    public javax.swing.JTextField empRuedasB;
    public javax.swing.JTextField empRuedasR;
    private javax.swing.JLabel ensamblaRlabel;
    private javax.swing.Box.Filler filler1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JButton mCarrocB;
    private javax.swing.JButton mCarrocR;
    private javax.swing.JButton mChasisB;
    private javax.swing.JButton mChasisR;
    private javax.swing.JButton mEnsamb;
    private javax.swing.JButton mEnsambB;
    private javax.swing.JButton mMotorB;
    private javax.swing.JButton mMotorR;
    private javax.swing.JButton mRuedasB;
    private javax.swing.JButton mRuedasR;
    public javax.swing.JTextField masCarrR;
    public javax.swing.JTextField maxAccB;
    public javax.swing.JTextField maxAccR;
    public javax.swing.JTextField maxCarrB;
    public javax.swing.JTextField maxChasisB;
    public javax.swing.JTextField maxChasisR;
    public javax.swing.JTextField maxMotorB;
    public javax.swing.JTextField maxMotorR;
    public javax.swing.JTextField maxRuedasB;
    public javax.swing.JTextField maxRuedasR;
    private javax.swing.JLabel plantaRlabel;
    private javax.swing.JLabel salarioGerR;
    public javax.swing.JTextField vehiculosAccB;
    public javax.swing.JTextField vehiculosEstandarB;
    // End of variables declaration//GEN-END:variables
}
