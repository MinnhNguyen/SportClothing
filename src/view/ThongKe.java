/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ThongKe extends javax.swing.JPanel {
    /**
     * Creates new form ThongKe
     */
    public ThongKe() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_dt = new javax.swing.JLabel();
        lbl_hd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Bang = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        rdo_Thang = new javax.swing.JRadioButton();
        rdo_Nam = new javax.swing.JRadioButton();
        txt_Thang = new javax.swing.JTextField();
        txt_Nam = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 66, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(940, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(940, 580));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Doanh Thu");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 27));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Hóa Đơn");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        lbl_dt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_dt.setText("...");
        jPanel2.add(lbl_dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 80, 49));

        lbl_hd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_hd.setText("...");
        jPanel2.add(lbl_hd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 60, 39));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 460, 120));

        tbl_Bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Bang);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 928, 200));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Bảng thống kê");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 190, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill.png"))); // NOI18N
        jButton1.setText("Biểu Đồ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 120, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Doanh thu ở");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        rdo_Thang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdo_Thang.setText("Tháng:");
        rdo_Thang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_ThangActionPerformed(evt);
            }
        });
        jPanel1.add(rdo_Thang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        rdo_Nam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdo_Nam.setText("Năm:");
        rdo_Nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_NamActionPerformed(evt);
            }
        });
        jPanel1.add(rdo_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txt_Thang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ThangActionPerformed(evt);
            }
        });
        txt_Thang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ThangKeyReleased(evt);
            }
        });
        jPanel1.add(txt_Thang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 90, -1));

        txt_Nam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NamKeyReleased(evt);
            }
        });
        jPanel1.add(txt_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rdo_ThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_ThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_ThangActionPerformed

    private void rdo_NamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_NamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_NamActionPerformed

    private void txt_ThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ThangActionPerformed

    private void txt_ThangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ThangKeyReleased
        
    }//GEN-LAST:event_txt_ThangKeyReleased

    private void txt_NamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NamKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NamKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_dt;
    private javax.swing.JLabel lbl_hd;
    private javax.swing.JRadioButton rdo_Nam;
    private javax.swing.JRadioButton rdo_Thang;
    private javax.swing.JTable tbl_Bang;
    private javax.swing.JTextField txt_Nam;
    private javax.swing.JTextField txt_Thang;
    // End of variables declaration//GEN-END:variables
}
