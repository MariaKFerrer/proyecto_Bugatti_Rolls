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
        this.act = new Actualizador(this, plantaB);
        
        this.plantaB = new PlantaB(5);
        this.plantaR = new PlantaR(9);
        
        
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
        cantidadVehB = new javax.swing.JTextField();
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
        cantidadChasisB1 = new javax.swing.JTextField();
        cantidadChasisB2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        labelCarroc3 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Costos");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, -1, 10));

        DiasLabelB.setForeground(new java.awt.Color(255, 255, 255));
        DiasLabelB.setText("Dias restantes ");
        getContentPane().add(DiasLabelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        DiasRestantes.setBackground(new java.awt.Color(0, 102, 153));
        DiasRestantes.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DiasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 60, 30));

        labelGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        labelGerenteB.setText("Gerente");
        getContentPane().add(labelGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, 20));

        LabelDirecB.setForeground(new java.awt.Color(255, 255, 255));
        LabelDirecB.setText("Director");
        getContentPane().add(LabelDirecB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        SalarioGerenteB.setBackground(new java.awt.Color(0, 102, 153));
        SalarioGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        SalarioGerenteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioGerenteBActionPerformed(evt);
            }
        });
        getContentPane().add(SalarioGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 60, -1));

        DirectorB.setBackground(new java.awt.Color(0, 102, 153));
        DirectorB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DirectorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 70, -1));

        FaltasGerenteB.setBackground(new java.awt.Color(0, 102, 153));
        FaltasGerenteB.setForeground(new java.awt.Color(255, 255, 255));
        FaltasGerenteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaltasGerenteBActionPerformed(evt);
            }
        });
        getContentPane().add(FaltasGerenteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 60, -1));

        labelFaltasGB.setForeground(new java.awt.Color(255, 255, 255));
        labelFaltasGB.setText("Faltas");
        getContentPane().add(labelFaltasGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 20));

        labelSalarioG.setForeground(new java.awt.Color(255, 255, 255));
        labelSalarioG.setText("Salario");
        getContentPane().add(labelSalarioG, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

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

        labeldirecR.setForeground(new java.awt.Color(255, 255, 255));
        labeldirecR.setText("Director");
        getContentPane().add(labeldirecR, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        DirectorR.setBackground(new java.awt.Color(0, 102, 153));
        DirectorR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DirectorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 70, -1));

        labelPlanta.setForeground(new java.awt.Color(255, 255, 255));
        labelPlanta.setText("Planta");
        getContentPane().add(labelPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        labelCarroc.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc.setText("Ruedas");
        getContentPane().add(labelCarroc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad de piezas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ensambladores");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        cantidadRuedasB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadRuedasB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadRuedasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 80, -1));

        plantaRlabel.setForeground(new java.awt.Color(255, 255, 255));
        plantaRlabel.setText("Planta");
        getContentPane().add(plantaRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        ensamblaRlabel.setForeground(new java.awt.Color(255, 255, 255));
        ensamblaRlabel.setText("Ensambladores");
        getContentPane().add(ensamblaRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ganancias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 10));

        gananciasRlabel.setForeground(new java.awt.Color(255, 255, 255));
        gananciasRlabel.setText("Ganancias");
        getContentPane().add(gananciasRlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, 10));

        GananciasRolls.setBackground(new java.awt.Color(0, 102, 153));
        GananciasRolls.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(GananciasRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 90, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad de Vehiculos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        cantidadVehB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadVehB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadVehB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 90, -1));

        cantidadCarrB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadCarrB.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadCarrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 80, -1));

        cantidadVehiculosR.setBackground(new java.awt.Color(0, 102, 153));
        cantidadVehiculosR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadVehiculosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 80, -1));

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
        jLabel11.setText("Ruedas");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empleados");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cantidad de piezas");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cantidad de Vehiculos");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));

        cantidadChasisB.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisB.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(GananciasBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 90, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Costos");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, 20));

        CostosBugatti.setBackground(new java.awt.Color(0, 102, 153));
        CostosBugatti.setForeground(new java.awt.Color(255, 255, 255));
        CostosBugatti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostosBugattiActionPerformed(evt);
            }
        });
        getContentPane().add(CostosBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 90, -1));

        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        CostosRolls.setBackground(new java.awt.Color(0, 102, 153));
        CostosRolls.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CostosRolls, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 90, -1));

        cantidadChasisB1.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisB1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadChasisB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 80, -1));

        cantidadChasisB2.setBackground(new java.awt.Color(0, 102, 153));
        cantidadChasisB2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cantidadChasisB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 80, -1));

        jButton1.setText("-");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jButton3.setText("+");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jButton2.setText("-");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jButton4.setText("+");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jButton5.setText("+");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jButton6.setText("+");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jButton7.setText("-");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jButton8.setText("-");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 40, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 40, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 40, 30));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 40, 30));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 40, 30));

        jButton9.setText("+");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jButton10.setText("-");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        labelCarroc3.setForeground(new java.awt.Color(255, 255, 255));
        labelCarroc3.setText("Ruedas");
        getContentPane().add(labelCarroc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


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
    public javax.swing.JTextField cantidadCarrB;
    public javax.swing.JTextField cantidadCarrR;
    public javax.swing.JTextField cantidadChasisB;
    public javax.swing.JTextField cantidadChasisB1;
    public javax.swing.JTextField cantidadChasisB2;
    public javax.swing.JTextField cantidadChasisR;
    public javax.swing.JTextField cantidadMotorB;
    public javax.swing.JTextField cantidadMotorR1;
    public javax.swing.JTextField cantidadRuedasB;
    public javax.swing.JTextField cantidadRuedasR;
    public javax.swing.JTextField cantidadVehB;
    public javax.swing.JTextField cantidadVehiculosR;
    private javax.swing.JLabel ensamblaRlabel;
    private javax.swing.JLabel gananciasRlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
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
    private javax.swing.JLabel plantaRlabel;
    private javax.swing.JLabel salarioGerR;
    // End of variables declaration//GEN-END:variables
}
