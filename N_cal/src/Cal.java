/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Cal extends javax.swing.JFrame {

    double firstnum ;
    double secondnum;
    String operations;
    public Cal() {
        initComponents();
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
        T1 = new javax.swing.JTextField();
        J1 = new javax.swing.JButton();
        J2 = new javax.swing.JButton();
        J3 = new javax.swing.JButton();
        J4 = new javax.swing.JButton();
        J5 = new javax.swing.JButton();
        J6 = new javax.swing.JButton();
        J7 = new javax.swing.JButton();
        J8 = new javax.swing.JButton();
        J9 = new javax.swing.JButton();
        J10 = new javax.swing.JButton();
        J11 = new javax.swing.JButton();
        J12 = new javax.swing.JButton();
        J13 = new javax.swing.JButton();
        J14 = new javax.swing.JButton();
        J15 = new javax.swing.JButton();
        J16 = new javax.swing.JButton();
        J17 = new javax.swing.JButton();
        J18 = new javax.swing.JButton();
        J19 = new javax.swing.JButton();
        J20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(43, 150, 144));

        T1.setBackground(new java.awt.Color(153, 153, 153));
        T1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T1.setForeground(new java.awt.Color(26, 28, 95));
        T1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        T1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        J1.setBackground(new java.awt.Color(153, 153, 153));
        J1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        J1.setForeground(new java.awt.Color(0, 51, 51));
        J1.setText("C");
        J1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        J2.setBackground(new java.awt.Color(204, 204, 204));
        J2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J2.setForeground(new java.awt.Color(200, 19, 27));
        J2.setText("7");
        J2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J2ActionPerformed(evt);
            }
        });

        J3.setBackground(new java.awt.Color(153, 153, 153));
        J3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J3.setForeground(new java.awt.Color(0, 51, 51));
        J3.setText("+");
        J3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });

        J4.setBackground(new java.awt.Color(204, 204, 204));
        J4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J4.setForeground(new java.awt.Color(200, 19, 27));
        J4.setText("3");
        J4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        J5.setBackground(new java.awt.Color(204, 204, 204));
        J5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J5.setForeground(new java.awt.Color(200, 19, 27));
        J5.setText("2");
        J5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J5ActionPerformed(evt);
            }
        });

        J6.setBackground(new java.awt.Color(204, 204, 204));
        J6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J6.setForeground(new java.awt.Color(200, 19, 27));
        J6.setText("4");
        J6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J6ActionPerformed(evt);
            }
        });

        J7.setBackground(new java.awt.Color(204, 204, 204));
        J7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J7.setForeground(new java.awt.Color(200, 19, 27));
        J7.setText("1");
        J7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J7ActionPerformed(evt);
            }
        });

        J8.setBackground(new java.awt.Color(153, 153, 153));
        J8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J8.setForeground(new java.awt.Color(0, 51, 51));
        J8.setText("/");
        J8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J8ActionPerformed(evt);
            }
        });

        J9.setBackground(new java.awt.Color(153, 153, 153));
        J9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J9.setForeground(new java.awt.Color(0, 51, 51));
        J9.setText("( )");
        J9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J9ActionPerformed(evt);
            }
        });

        J10.setBackground(new java.awt.Color(153, 153, 153));
        J10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J10.setForeground(new java.awt.Color(0, 51, 51));
        J10.setText("%");
        J10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J10ActionPerformed(evt);
            }
        });

        J11.setBackground(new java.awt.Color(204, 204, 204));
        J11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J11.setForeground(new java.awt.Color(200, 19, 27));
        J11.setText("8");
        J11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J11ActionPerformed(evt);
            }
        });

        J12.setBackground(new java.awt.Color(204, 204, 204));
        J12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J12.setForeground(new java.awt.Color(200, 19, 27));
        J12.setText("9");
        J12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J12ActionPerformed(evt);
            }
        });

        J13.setBackground(new java.awt.Color(204, 204, 204));
        J13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J13.setForeground(new java.awt.Color(200, 19, 27));
        J13.setText("5");
        J13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J13ActionPerformed(evt);
            }
        });

        J14.setBackground(new java.awt.Color(204, 204, 204));
        J14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J14.setForeground(new java.awt.Color(200, 19, 27));
        J14.setText("6");
        J14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J14ActionPerformed(evt);
            }
        });

        J15.setBackground(new java.awt.Color(153, 153, 153));
        J15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J15.setForeground(new java.awt.Color(0, 51, 51));
        J15.setText("*");
        J15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J15ActionPerformed(evt);
            }
        });

        J16.setBackground(new java.awt.Color(153, 153, 153));
        J16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J16.setForeground(new java.awt.Color(0, 51, 51));
        J16.setText("+ /-");
        J16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J16ActionPerformed(evt);
            }
        });

        J17.setBackground(new java.awt.Color(204, 204, 204));
        J17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J17.setForeground(new java.awt.Color(200, 19, 27));
        J17.setText("0");
        J17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        J17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J17ActionPerformed(evt);
            }
        });

        J18.setBackground(new java.awt.Color(153, 153, 153));
        J18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J18.setForeground(new java.awt.Color(0, 51, 51));
        J18.setText(".");
        J18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J18ActionPerformed(evt);
            }
        });

        J19.setBackground(new java.awt.Color(153, 153, 153));
        J19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J19.setForeground(new java.awt.Color(0, 51, 51));
        J19.setText("=");
        J19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J19ActionPerformed(evt);
            }
        });

        J20.setBackground(new java.awt.Color(153, 153, 153));
        J20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        J20.setForeground(new java.awt.Color(0, 51, 51));
        J20.setText("-");
        J20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        J20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(T1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(J13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(J1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(J2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(J9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(J11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(J16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(J17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(J10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J18, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J10ActionPerformed
 firstnum =Double.parseDouble(T1.getText()) ;
         T1.setText(" ");
         operations ="%";        // TODO add your handling code here:
    }//GEN-LAST:event_J10ActionPerformed

    private void J18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J18ActionPerformed
 String Enternum = T1.getText()+ J18.getText();
        T1.setText(Enternum);        // TODO add your handling code here:
    }//GEN-LAST:event_J18ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J2ActionPerformed
        String Enternum = T1.getText()+ J2.getText();
        T1.setText(Enternum);
    }//GEN-LAST:event_J2ActionPerformed

    private void J11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J11ActionPerformed
         String Enternum = T1.getText()+ J11.getText();
        T1.setText(Enternum);
    }//GEN-LAST:event_J11ActionPerformed

    private void J12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J12ActionPerformed
        String Enternum = T1.getText()+ J12.getText();
        T1.setText(Enternum);
    }//GEN-LAST:event_J12ActionPerformed

    private void J6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J6ActionPerformed
 String Enternum = T1.getText()+ J6.getText();
        T1.setText(Enternum);        // TODO add your handling code here:
    }//GEN-LAST:event_J6ActionPerformed

    private void J13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J13ActionPerformed
 String Enternum = T1.getText()+ J13.getText();
        T1.setText(Enternum);        // TODO add your handling code here:
    }//GEN-LAST:event_J13ActionPerformed

    private void J14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J14ActionPerformed
 String Enternum = T1.getText()+ J14.getText();
        T1.setText(Enternum);        // TODO add your handling code here:
    }//GEN-LAST:event_J14ActionPerformed

    private void J7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J7ActionPerformed
 String Enternum = T1.getText()+ J7.getText();
        T1.setText(Enternum);        // TODO add your handling code here:
    }//GEN-LAST:event_J7ActionPerformed

    private void J5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J5ActionPerformed
 String Enternum = T1.getText()+ J5.getText();
        T1.setText(Enternum);        // TODO add your handling code here:
    }//GEN-LAST:event_J5ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
 String Enternum = T1.getText()+ J4.getText();
        T1.setText(Enternum);        // TODO add your handling code here:
    }//GEN-LAST:event_J4ActionPerformed

    private void J17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J17ActionPerformed
 String Enternum = T1.getText()+ J17.getText();
        T1.setText(Enternum);        // TODO add your handling code here:
    }//GEN-LAST:event_J17ActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
           T1.setText(" ")    ;    // TODO add your handling code here:
    }//GEN-LAST:event_J1ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
         firstnum =Double.parseDouble(T1.getText()) ;
         T1.setText(" ");
         operations ="+";
// TODO add your handling code here:
    }//GEN-LAST:event_J3ActionPerformed

    private void J20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J20ActionPerformed
 firstnum =Double.parseDouble(T1.getText()) ;
         T1.setText(" ");
         operations ="-";        // TODO add your handling code here:
    }//GEN-LAST:event_J20ActionPerformed

    private void J15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J15ActionPerformed
 firstnum =Double.parseDouble(T1.getText()) ;
         T1.setText(" ");
         operations ="*";        // TODO add your handling code here:
    }//GEN-LAST:event_J15ActionPerformed

    private void J8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J8ActionPerformed
 firstnum =Double.parseDouble(T1.getText()) ;
         T1.setText(" ");
         operations ="/";        // TODO add your handling code here:
    }//GEN-LAST:event_J8ActionPerformed

    private void J19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J19ActionPerformed
        String ans;
         secondnum = Double.parseDouble(T1.getText());
         
         if(operations== "+"){
         double  result =firstnum + secondnum;
         ans = String.format("%.0f ",result);
         T1.setText(ans);
         }
         
         else if(operations== "-"){
         double  result =firstnum - secondnum;
         ans = String.format(" %.0f",result);
         T1.setText(ans);
         }
          
        else   if(operations== "*"){
         double  result =firstnum * secondnum;
         ans = String.format(" %.0f",result);
         T1.setText(ans);
         }
         else   if(operations== "/"){
         double  result =firstnum / secondnum;
         ans = String.format(" %.0f",result);
         T1.setText(ans);
         }
        else  if(operations== "%"){
         double  result =firstnum % secondnum;
         ans = String.format(" %.0f",result);
         T1.setText(ans);
         }
          
    }//GEN-LAST:event_J19ActionPerformed

    private void J16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J16ActionPerformed
       double ops =Double.parseDouble(String.valueOf(T1.getText()));
       ops =ops *(-1);
       T1.setText(String.valueOf(ops));
       
       double ops1 =Double.parseDouble(String.valueOf(T1.getText()));
       ops1 =ops1 *(+1);
       T1.setText(String.valueOf(ops1));
       
      
       
       
    }//GEN-LAST:event_J16ActionPerformed

    private void J9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J9ActionPerformed
     
   /*  if( T1.getText()== "("){
 
        J9.getText();
        T1.setText(String.valueOf("("));
     }
     else if(T1.getText()== ")"){
         J9.getText();
        T1.setText(String.valueOf(")"));
          
     }  */  
    }//GEN-LAST:event_J9ActionPerformed

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
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton J1;
    private javax.swing.JButton J10;
    private javax.swing.JButton J11;
    private javax.swing.JButton J12;
    private javax.swing.JButton J13;
    private javax.swing.JButton J14;
    private javax.swing.JButton J15;
    private javax.swing.JButton J16;
    private javax.swing.JButton J17;
    private javax.swing.JButton J18;
    private javax.swing.JButton J19;
    private javax.swing.JButton J2;
    private javax.swing.JButton J20;
    private javax.swing.JButton J3;
    private javax.swing.JButton J4;
    private javax.swing.JButton J5;
    private javax.swing.JButton J6;
    private javax.swing.JButton J7;
    private javax.swing.JButton J8;
    private javax.swing.JButton J9;
    private javax.swing.JTextField T1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
