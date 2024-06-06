/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Alex Kamunga
 */
public class frmRegister extends javax.swing.JFrame {

    float length;
    float width;
    float height;
    float result;
    float resultSubTotal;
    float resultVAT;
    float resultTotal;
    float tinCost = 30F;
    float cash;   
    float amountOfTins;
    float TAX = 0.15F;
    String operations;
    String area;
    String answer;
    String subTotal;
    String vat;
    String total;
    String change;
    String tinsRequired;
    boolean isNegative;
    /**
     * Creates new form System_Function_GUI
     */
    
    public frmRegister() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
//    ---------------Clear Button---------------

//    Clears all text fields.
    private void mClearFields(){
        txtDisplaySubTotal.setText("");
        txtDisplayVAT.setText("");
        txtRoomLength.setText("");
        txtRoomWidth.setText("");
        txtRoomHeight.setText("");
        txtQuantityOfTins.setText("");
        txtDisplayArea.setText("");
        txtDisplayPaintRequired.setText("");
        txtDisplayChange.setText("");
        txtDisplayCash.setText("");
        txtDisplayTotal.setText("");
    }
    
    
//    ---------------Process Button---------------
    
//    Gets measurement values needed to calculate the area of the room and parses them as a float.
    private void mGetProcessValues(){
            length = Float.parseFloat(txtRoomLength.getText());
            width = Float.parseFloat(txtRoomWidth.getText());
            height = Float.parseFloat(txtRoomHeight.getText());
    }
    
//    Takes the measurements values and calculates the total area of all four walls.
    private void mProcessProcessValues(){
            
            
                    result = (length * height) * 2 + (height * width) * 2;
                    area = String.format("%.1f",result);
                    
                    tinsRequired = String.format("%.0f",(Math.ceil(result / 10)));
            
                    txtQuantityOfTins.requestFocusInWindow();  
                    
                    isNegative = false;
            
    }
    
//    Displays the value for area and tins required to cover all the walls.
    private void mSetProcessValues(){
            txtDisplayArea.setText(area);
            txtDisplayPaintRequired.setText(tinsRequired);
            txtQuantityOfTins.setText(tinsRequired);
    }
    
//    --------------------------------------------
    
    
//    ---------------Change Button---------------   
    
//    Gets monetary values needed to calculate the amount of change a customer must get and parses them as a float.
    private void mGetValuesForChange(){
            cash = Float.parseFloat(txtDisplayCash.getText());
            amountOfTins = Float.parseFloat(txtQuantityOfTins.getText());
    }
    
//    Takes the monetary values and calculates how much change a customer should receive.
    private void mProcessChange(){
            result = cash - ((amountOfTins * tinCost * TAX) + amountOfTins * tinCost);
            change = String.format("R %.2f",result);
            
//            Used to ensure that the value of the change is not less than zero. Message will be displayed until a valid cash amount is entered.
            if (result > 0) {
                    mSetChange();
            }else{
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Cash Amount");
            }
    }
    
//    Displays how much change a customer should receive
    private void mSetChange(){
            txtDisplayChange.setText(change);
    }
    
//    -------------------------------------------
    
    
//    ---------------Total Button---------------
    
//    Gets the number of tins required
    private void mGetTotalValues(){
            amountOfTins = Float.parseFloat(txtQuantityOfTins.getText());
    }
    
//    Calculates the different total values
    private void mProcessTotalValues(){
            
//            Subtotal Value - (Pre-tax)
            resultSubTotal = amountOfTins * tinCost ;
            subTotal = String.format("R %.2f",resultSubTotal);
            
//            Value Added Tax(VAT) Value
            resultVAT = amountOfTins * tinCost * TAX;
            vat = String.format("R %.2f",resultVAT);
             
//            Total Value - (Sub Total + VAT)
            resultTotal = (amountOfTins * tinCost * TAX) + amountOfTins * tinCost ;
            total = String.format("R %.2f",resultTotal);
    }
//    Displays all the total values
    private void mSetTotalValues(){
            txtDisplaySubTotal.setText(subTotal); 
            txtDisplayVAT.setText(vat);
            txtDisplayTotal.setText(total);
    }
    
//    -------------------------------------------
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                lblRoomWidth = new javax.swing.JLabel();
                txtRoomWidth = new javax.swing.JTextField();
                txtDisplayArea = new javax.swing.JTextField();
                lblTinsRequired = new javax.swing.JLabel();
                lblAreaOfRoom = new javax.swing.JLabel();
                lblRoomLength = new javax.swing.JLabel();
                txtRoomHeight = new javax.swing.JTextField();
                txtRoomLength = new javax.swing.JTextField();
                lblRoomHeight = new javax.swing.JLabel();
                txtDisplayPaintRequired = new javax.swing.JTextField();
                btnProcess = new javax.swing.JButton();
                lblMeterSquared = new javax.swing.JLabel();
                lblMeter3 = new javax.swing.JLabel();
                lblMeter = new javax.swing.JLabel();
                lblMeter2 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                jPanel7 = new javax.swing.JPanel();
                jPanel8 = new javax.swing.JPanel();
                jPanel9 = new javax.swing.JPanel();
                jButton3 = new javax.swing.JButton();
                btnChange = new javax.swing.JButton();
                btnClear = new javax.swing.JButton();
                btnTotal = new javax.swing.JButton();
                lblPrice = new javax.swing.JLabel();
                lblSubTotal = new javax.swing.JLabel();
                lblVAT = new javax.swing.JLabel();
                lblTotal = new javax.swing.JLabel();
                lblPaintTins = new javax.swing.JLabel();
                txtDisplayVAT = new javax.swing.JTextField();
                txtQuantityOfTins = new javax.swing.JTextField();
                jPanel10 = new javax.swing.JPanel();
                jPanel11 = new javax.swing.JPanel();
                jPanel12 = new javax.swing.JPanel();
                jPanel13 = new javax.swing.JPanel();
                jButton4 = new javax.swing.JButton();
                jBtnChange1 = new javax.swing.JButton();
                jbtnResetAction1 = new javax.swing.JButton();
                jbtnTotal2 = new javax.swing.JButton();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jtxtDisplaySubTotal1 = new javax.swing.JTextField();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jtxtDisplayVAT1 = new javax.swing.JTextField();
                jtxtDisplayTotal1 = new javax.swing.JTextField();
                jtxtDisplayPaintTinsPurchased1 = new javax.swing.JTextField();
                jtxtDiplayCostOfTins1 = new javax.swing.JTextField();
                lblCash = new javax.swing.JLabel();
                lblChange = new javax.swing.JLabel();
                lblQuantity = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                txtDisplayCash = new javax.swing.JTextField();
                txtDisplaySubTotal = new javax.swing.JTextField();
                txtDisplayTotal = new javax.swing.JTextField();
                txtDisplayChange = new javax.swing.JTextField();
                lblR = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(153, 153, 255));
                jPanel1.setForeground(new java.awt.Color(240, 240, 240));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel3.setBackground(new java.awt.Color(153, 153, 255));
                jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(0, 0, 255)));
                jPanel3.setForeground(new java.awt.Color(240, 240, 240));
                jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 310));

                jPanel2.setBackground(new java.awt.Color(153, 153, 255));
                jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 255)));
                jPanel2.setForeground(new java.awt.Color(240, 240, 240));
                jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel5.setBackground(new java.awt.Color(153, 153, 255));
                jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(0, 0, 255)));
                jPanel5.setForeground(new java.awt.Color(240, 240, 240));
                jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 310));

                lblRoomWidth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblRoomWidth.setForeground(new java.awt.Color(0, 0, 0));
                lblRoomWidth.setText("Room Width");
                jPanel2.add(lblRoomWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 50));

                txtRoomWidth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                txtRoomWidth.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtRoomWidthActionPerformed(evt);
                        }
                });
                jPanel2.add(txtRoomWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 50, 30));

                txtDisplayArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                txtDisplayArea.setForeground(new java.awt.Color(0, 0, 0));
                txtDisplayArea.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtDisplayAreaActionPerformed(evt);
                        }
                });
                jPanel2.add(txtDisplayArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 70, 30));

                lblTinsRequired.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblTinsRequired.setForeground(new java.awt.Color(0, 0, 0));
                lblTinsRequired.setText("No. of paint tins required");
                jPanel2.add(lblTinsRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 172, 30));

                lblAreaOfRoom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblAreaOfRoom.setForeground(new java.awt.Color(0, 0, 0));
                lblAreaOfRoom.setText("Area of the room");
                jPanel2.add(lblAreaOfRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 30));

                lblRoomLength.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblRoomLength.setForeground(new java.awt.Color(0, 0, 0));
                lblRoomLength.setText("Room Length");
                jPanel2.add(lblRoomLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 50));

                txtRoomHeight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                txtRoomHeight.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtRoomHeightActionPerformed(evt);
                        }
                });
                jPanel2.add(txtRoomHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 50, 30));

                txtRoomLength.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                txtRoomLength.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtRoomLengthActionPerformed(evt);
                        }
                });
                jPanel2.add(txtRoomLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 50, 30));

                lblRoomHeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblRoomHeight.setForeground(new java.awt.Color(0, 0, 0));
                lblRoomHeight.setText("Room Height");
                jPanel2.add(lblRoomHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 50));

                txtDisplayPaintRequired.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                txtDisplayPaintRequired.setForeground(new java.awt.Color(0, 0, 0));
                txtDisplayPaintRequired.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtDisplayPaintRequiredActionPerformed(evt);
                        }
                });
                jPanel2.add(txtDisplayPaintRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 270, 40, 30));

                btnProcess.setBackground(new java.awt.Color(102, 255, 255));
                btnProcess.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnProcess.setForeground(new java.awt.Color(0, 0, 0));
                btnProcess.setText("Process");
                btnProcess.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
                btnProcess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnProcess.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnProcessActionPerformed(evt);
                        }
                });
                jPanel2.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 170, 100, 30));

                lblMeterSquared.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblMeterSquared.setForeground(new java.awt.Color(0, 0, 0));
                lblMeterSquared.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblMeterSquared.setText("m^2");
                jPanel2.add(lblMeterSquared, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 35, -1));

                lblMeter3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblMeter3.setForeground(new java.awt.Color(0, 0, 0));
                lblMeter3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblMeter3.setText("m.");
                jPanel2.add(lblMeter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

                lblMeter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblMeter.setForeground(new java.awt.Color(0, 0, 0));
                lblMeter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblMeter.setText("m.");
                jPanel2.add(lblMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

                lblMeter2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                lblMeter2.setForeground(new java.awt.Color(0, 0, 0));
                lblMeter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblMeter2.setText("m.");
                jPanel2.add(lblMeter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

                jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, 260, 460));

                jPanel4.setBackground(new java.awt.Color(255, 255, 255));
                jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 255)));
                jPanel4.setForeground(new java.awt.Color(0, 0, 0));
                jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel7.setBackground(new java.awt.Color(153, 153, 255));
                jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(0, 0, 255)));
                jPanel7.setForeground(new java.awt.Color(240, 240, 240));
                jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 310));

                jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 255)));
                jPanel8.setForeground(new java.awt.Color(240, 240, 240));
                jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel9.setBackground(new java.awt.Color(153, 153, 255));
                jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(0, 0, 255)));
                jPanel9.setForeground(new java.awt.Color(240, 240, 240));
                jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 310));

                jButton3.setText("jButton2");
                jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

                btnChange.setBackground(new java.awt.Color(255, 255, 134));
                btnChange.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnChange.setForeground(new java.awt.Color(0, 0, 0));
                btnChange.setText("Change");
                btnChange.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
                btnChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnChange.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btnChange.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnChangeActionPerformed(evt);
                        }
                });
                jPanel8.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 20, 110, 40));

                btnClear.setBackground(new java.awt.Color(255, 94, 94));
                btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnClear.setForeground(new java.awt.Color(0, 0, 0));
                btnClear.setText("Clear");
                btnClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
                btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btnClear.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnClearActionPerformed(evt);
                        }
                });
                jPanel8.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 20, 110, 40));

                btnTotal.setBackground(new java.awt.Color(51, 255, 125));
                btnTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                btnTotal.setForeground(new java.awt.Color(0, 0, 0));
                btnTotal.setText("Total");
                btnTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
                btnTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                btnTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btnTotal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTotalActionPerformed(evt);
                        }
                });
                jPanel8.add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 110, 40));

                jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 420, 80));

                lblPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                lblPrice.setForeground(new java.awt.Color(0, 0, 0));
                lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblPrice.setText("@ R 30");
                jPanel4.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 20));

                lblSubTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                lblSubTotal.setForeground(new java.awt.Color(0, 0, 0));
                lblSubTotal.setText("Sub Total");
                lblSubTotal.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
                jPanel4.add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 100, 20));

                lblVAT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                lblVAT.setForeground(new java.awt.Color(0, 0, 0));
                lblVAT.setText("VAT @ 15%");
                jPanel4.add(lblVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, 20));

                lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                lblTotal.setForeground(new java.awt.Color(0, 0, 0));
                lblTotal.setText("Total");
                jPanel4.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 20));

                lblPaintTins.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                lblPaintTins.setForeground(new java.awt.Color(0, 0, 0));
                lblPaintTins.setText("Paint Tins");
                jPanel4.add(lblPaintTins, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 20));

                txtDisplayVAT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtDisplayVAT.setForeground(new java.awt.Color(0, 0, 0));
                txtDisplayVAT.setBorder(null);
                txtDisplayVAT.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtDisplayVATActionPerformed(evt);
                        }
                });
                jPanel4.add(txtDisplayVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 100, 20));

                txtQuantityOfTins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtQuantityOfTins.setForeground(new java.awt.Color(0, 0, 0));
                txtQuantityOfTins.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                txtQuantityOfTins.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                txtQuantityOfTins.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtQuantityOfTinsActionPerformed(evt);
                        }
                });
                jPanel4.add(txtQuantityOfTins, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 40, 20));

                jPanel10.setBackground(new java.awt.Color(255, 255, 255));
                jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(0, 0, 255)));
                jPanel10.setForeground(new java.awt.Color(240, 240, 240));
                jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel11.setBackground(new java.awt.Color(153, 153, 255));
                jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(0, 0, 255)));
                jPanel11.setForeground(new java.awt.Color(240, 240, 240));
                jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 310));

                jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(0, 0, 255)));
                jPanel12.setForeground(new java.awt.Color(240, 240, 240));
                jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel13.setBackground(new java.awt.Color(153, 153, 255));
                jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 12, 12, 12, new java.awt.Color(0, 0, 255)));
                jPanel13.setForeground(new java.awt.Color(240, 240, 240));
                jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 310));

                jButton4.setText("jButton2");
                jPanel12.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

                jBtnChange1.setBackground(new java.awt.Color(255, 153, 0));
                jBtnChange1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jBtnChange1.setText("Change");
                jBtnChange1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 153, 0)));
                jBtnChange1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jBtnChange1ActionPerformed(evt);
                        }
                });
                jPanel12.add(jBtnChange1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, 40));

                jbtnResetAction1.setBackground(new java.awt.Color(255, 0, 0));
                jbtnResetAction1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jbtnResetAction1.setText("Reset");
                jbtnResetAction1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));
                jbtnResetAction1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jbtnResetAction1ActionPerformed(evt);
                        }
                });
                jPanel12.add(jbtnResetAction1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 110, 40));

                jbtnTotal2.setBackground(new java.awt.Color(0, 255, 0));
                jbtnTotal2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jbtnTotal2.setText("Total");
                jbtnTotal2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 0)));
                jbtnTotal2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jbtnTotal2ActionPerformed(evt);
                        }
                });
                jPanel12.add(jbtnTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 40));

                jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 420, 120));

                jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel11.setText("@R30 each");
                jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 70, -1));

                jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
                jLabel12.setText("Sub Total");
                jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

                jtxtDisplaySubTotal1.setBorder(null);
                jtxtDisplaySubTotal1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtxtDisplaySubTotal1ActionPerformed(evt);
                        }
                });
                jPanel10.add(jtxtDisplaySubTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 70, 40));

                jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
                jLabel13.setText("Tax @15%");
                jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 30));

                jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
                jLabel14.setText("Total");
                jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));

                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
                jLabel15.setText("Paint Tins");
                jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 40));

                jtxtDisplayVAT1.setBorder(null);
                jPanel10.add(jtxtDisplayVAT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 70, 40));

                jtxtDisplayTotal1.setBorder(null);
                jPanel10.add(jtxtDisplayTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 70, 40));

                jtxtDisplayPaintTinsPurchased1.setBorder(null);
                jtxtDisplayPaintTinsPurchased1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtxtDisplayPaintTinsPurchased1ActionPerformed(evt);
                        }
                });
                jPanel10.add(jtxtDisplayPaintTinsPurchased1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 50, 30));

                jtxtDiplayCostOfTins1.setBorder(null);
                jtxtDiplayCostOfTins1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtxtDiplayCostOfTins1ActionPerformed(evt);
                        }
                });
                jPanel10.add(jtxtDiplayCostOfTins1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 40, 70, 30));

                jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 460, 460));

                lblCash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                lblCash.setForeground(new java.awt.Color(0, 0, 0));
                lblCash.setText("Cash ");
                jPanel4.add(lblCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 20));

                lblChange.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                lblChange.setForeground(new java.awt.Color(0, 0, 0));
                lblChange.setText("Change");
                jPanel4.add(lblChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 20));

                lblQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                lblQuantity.setForeground(new java.awt.Color(0, 0, 0));
                lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblQuantity.setText("Qty");
                jPanel4.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 40, 20));

                jTextField1.setForeground(new java.awt.Color(0, 0, 0));
                jTextField1.setText("============================================================");
                jTextField1.setBorder(null);
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });
                jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 420, -1));

                txtDisplayCash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtDisplayCash.setForeground(new java.awt.Color(0, 0, 0));
                txtDisplayCash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                txtDisplayCash.setMaximumSize(new java.awt.Dimension(80, 20));
                txtDisplayCash.setMinimumSize(new java.awt.Dimension(80, 20));
                txtDisplayCash.setName(""); // NOI18N
                txtDisplayCash.setPreferredSize(new java.awt.Dimension(80, 20));
                txtDisplayCash.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtDisplayCashActionPerformed(evt);
                        }
                });
                jPanel4.add(txtDisplayCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 80, 20));

                txtDisplaySubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtDisplaySubTotal.setForeground(new java.awt.Color(0, 0, 0));
                txtDisplaySubTotal.setBorder(null);
                txtDisplaySubTotal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtDisplaySubTotalActionPerformed(evt);
                        }
                });
                jPanel4.add(txtDisplaySubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 100, 20));

                txtDisplayTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtDisplayTotal.setForeground(new java.awt.Color(0, 0, 0));
                txtDisplayTotal.setBorder(null);
                txtDisplayTotal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtDisplayTotalActionPerformed(evt);
                        }
                });
                jPanel4.add(txtDisplayTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 100, 20));

                txtDisplayChange.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtDisplayChange.setForeground(new java.awt.Color(0, 0, 0));
                txtDisplayChange.setBorder(null);
                txtDisplayChange.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtDisplayChangeActionPerformed(evt);
                        }
                });
                jPanel4.add(txtDisplayChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 100, 20));

                lblR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                lblR.setForeground(new java.awt.Color(0, 0, 0));
                lblR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblR.setText("R");
                lblR.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
                jPanel4.add(lblR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 20, 20));

                jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 22, 460, 460));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
            
            try {
                    mGetValuesForChange();
                    mProcessChange();
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please Insert Cash");
                    txtDisplayCash.requestFocusInWindow();
            }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void txtDisplayAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayAreaActionPerformed
        
    }//GEN-LAST:event_txtDisplayAreaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        mClearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtRoomHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomHeightActionPerformed

    private void txtDisplayPaintRequiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayPaintRequiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayPaintRequiredActionPerformed

    private void txtRoomWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomWidthActionPerformed

    private void txtRoomLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomLengthActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
            
//            Try catch to ensure all the values are  there
            try {
                    mGetTotalValues();
                    mProcessTotalValues();
                    mSetTotalValues();
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please Insert Quantity Of Tins");
                    txtQuantityOfTins.requestFocusInWindow();
            }
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
                
//            Try catch to ensure All values are  there            
            try {
                    
                    mGetProcessValues();
                    
//                    Ensures that all values are greater than zero
                    if(length > 0 && width > 0 && height > 0){
                            mProcessProcessValues();
                            mSetProcessValues();
                    } else{
                            JOptionPane.showMessageDialog(null, ("Please enter values greater than zero"));
                            
//                            Ensures that fields are empty incase it was not cleared from the previous transaction
                            txtQuantityOfTins.setText("");
                            txtDisplayArea.setText("");
                            txtDisplayPaintRequired.setText("");
                    }
                    
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Fields Connot Be Left Empty");
            }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void txtQuantityOfTinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityOfTinsActionPerformed
    
    }//GEN-LAST:event_txtQuantityOfTinsActionPerformed

    private void jBtnChange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnChange1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnChange1ActionPerformed

    private void jbtnResetAction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetAction1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnResetAction1ActionPerformed

    private void jbtnTotal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTotal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnTotal2ActionPerformed

    private void jtxtDisplaySubTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplaySubTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplaySubTotal1ActionPerformed

    private void jtxtDisplayPaintTinsPurchased1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayPaintTinsPurchased1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayPaintTinsPurchased1ActionPerformed

    private void jtxtDiplayCostOfTins1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDiplayCostOfTins1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDiplayCostOfTins1ActionPerformed

    private void txtDisplayVATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayVATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayVATActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtDisplayCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayCashActionPerformed

    private void txtDisplaySubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplaySubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplaySubTotalActionPerformed

    private void txtDisplayTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayTotalActionPerformed

    private void txtDisplayChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayChangeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegister().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnChange;
        private javax.swing.JButton btnClear;
        private javax.swing.JButton btnProcess;
        private javax.swing.JButton btnTotal;
        private javax.swing.JButton jBtnChange1;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel13;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JButton jbtnResetAction1;
        private javax.swing.JButton jbtnTotal2;
        private javax.swing.JTextField jtxtDiplayCostOfTins1;
        private javax.swing.JTextField jtxtDisplayPaintTinsPurchased1;
        private javax.swing.JTextField jtxtDisplaySubTotal1;
        private javax.swing.JTextField jtxtDisplayTotal1;
        private javax.swing.JTextField jtxtDisplayVAT1;
        private javax.swing.JLabel lblAreaOfRoom;
        private javax.swing.JLabel lblCash;
        private javax.swing.JLabel lblChange;
        private javax.swing.JLabel lblMeter;
        private javax.swing.JLabel lblMeter2;
        private javax.swing.JLabel lblMeter3;
        private javax.swing.JLabel lblMeterSquared;
        private javax.swing.JLabel lblPaintTins;
        private javax.swing.JLabel lblPrice;
        private javax.swing.JLabel lblQuantity;
        private javax.swing.JLabel lblR;
        private javax.swing.JLabel lblRoomHeight;
        private javax.swing.JLabel lblRoomLength;
        private javax.swing.JLabel lblRoomWidth;
        private javax.swing.JLabel lblSubTotal;
        private javax.swing.JLabel lblTinsRequired;
        private javax.swing.JLabel lblTotal;
        private javax.swing.JLabel lblVAT;
        private javax.swing.JTextField txtDisplayArea;
        private javax.swing.JTextField txtDisplayCash;
        private javax.swing.JTextField txtDisplayChange;
        private javax.swing.JTextField txtDisplayPaintRequired;
        private javax.swing.JTextField txtDisplaySubTotal;
        private javax.swing.JTextField txtDisplayTotal;
        private javax.swing.JTextField txtDisplayVAT;
        private javax.swing.JTextField txtQuantityOfTins;
        private javax.swing.JTextField txtRoomHeight;
        private javax.swing.JTextField txtRoomLength;
        private javax.swing.JTextField txtRoomWidth;
        // End of variables declaration//GEN-END:variables
}
