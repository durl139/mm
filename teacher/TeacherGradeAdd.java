/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.tihtih.teacher;

import com.jp.tihtih.login.Jdbc;
import com.jp.tihtih.root.Aclass;
import com.jp.tihtih.root.Grade;
import com.jp.tihtih.root.GradeDate;
import com.jp.tihtih.root.Student;
import com.jp.tihtih.root.TeachersDate;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geng9516
 */
public class TeacherGradeAdd extends javax.swing.JFrame {

    /**
     * Creates new form TeacherGradeAdd
     */
    public TeacherGradeAdd() {
        initComponents();
    }

    public void showGradeDb(List<Grade> list) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Grade grade : list) {
            tableModel.addRow(new Object[]{grade.getStudentid(), grade.getTest(),
                grade.getKokugo(), grade.getMath(), grade.getEnglish(), grade.getScience(), grade.getHistory(), grade.getSum()});
        }
    }

    public void readGrade(String studentid) {
        Jdbc jdbc = new Jdbc();
        List<Grade> list = new ArrayList<>();
        try {
            jdbc.getDbcom();
            list = jdbc.selectGrade(studentid);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                jdbc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Grade grade : list) {
            tableModel.addRow(new Object[]{grade.getStudentid(), grade.getTest(), grade.getKokugo(), grade.getMath(), grade.getEnglish(), grade.getScience(), grade.getHistory(), grade.getSum()});
        }
    }

    public void setSubject(String s) {
        jComboBox1.removeAllItems();
        jComboBox1.addItem(s);

    }

    public void setTeacherDate(String teacherId, String name, String subject, String studentId, String className) {
        jLabel1.setText(teacherId);
        jLabel2.setText(name);
        jLabel3.setText(subject);
        jLabel4.setText(studentId);
        jLabel5.setText(className);
    }

    public void setvisible() {
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("成績追加/編集");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "生徒ID", "試験別", "国語", "数学", "英語", "理科", "歴史", "合計"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jLabel1.setText("先生ID");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "国語", "数学", "英語", "理科", "歴史" }));

        jButton3.setText("成績追加/編集");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("戻る");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("先生名前");

        jButton6.setText("削除");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setText("科目");

        jLabel4.setText("生徒ID");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "中間テスト", "期末テスト" }));

        jLabel5.setText("クラス");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(58, 58, 58)
                                        .addComponent(jButton6)
                                        .addGap(59, 59, 59)
                                        .addComponent(jButton5))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * 成績追加
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();
        Grade grade = new Grade();
        grade.setStudentid(jLabel4.getText());
        grade.setTest(jComboBox2.getSelectedItem().toString());
        try {
            jdbc.getDbcom();
            jLabel6.setText("");
            if (Double.parseDouble(jTextField1.getText()) < 0 || Double.parseDouble(jTextField1.getText()) > 100) {
                jLabel6.setText("成績は0〜100以内の数字を入力してください！");
                return;
            } else {
                if (jLabel1.getText().contains("A") || jLabel1.getText().contains("B") || jLabel1.getText().contains("C") || jLabel1.getText().contains("D")) {
                    if (!jdbc.selectGrade(jLabel4.getText(), jComboBox2.getSelectedItem().toString())) {
                        if ("国語".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertKokugo(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        } else if ("数学".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertMath(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        } else if ("英語".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertEnglish(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        } else if ("理科".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertScience(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        } else if ("歴史".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertHistory(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        }
                    } else {
                        if ("国語".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateKokugo(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        } else if ("数学".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateMath(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        } else if ("英語".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateEnglish(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        } else if ("理科".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateScience(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        } else if ("歴史".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateHistory(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        }
                    }
                    readGrade(jLabel4.getText());
                } else {
                    if (!jdbc.selectGrade(jLabel4.getText(), jComboBox2.getSelectedItem().toString())) {
                        if ("国語".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertKokugo(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        } else if ("数学".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertMath(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        } else if ("英語".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertEnglish(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        } else if ("理科".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertScience(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        } else if ("歴史".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.insertHistory(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), jLabel5.getText(), Double.parseDouble(jTextField1.getText()));
                        }
                    } else {
                        if ("国語".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateKokugo(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        } else if ("数学".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateMath(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        } else if ("英語".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateEnglish(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        } else if ("理科".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateScience(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        } else if ("歴史".equals(jComboBox1.getSelectedItem().toString())) {
                            jdbc.updateHistory(jLabel4.getText(), jComboBox2.getSelectedItem().toString(), Double.parseDouble(jTextField1.getText()));
                        }
                    }
                    readGrade(jLabel4.getText());
                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherGradeAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherGradeAdd.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * 戻る
     *
     * @param evt
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        List<Aclass> list = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        Jdbc jdbc = new Jdbc();
        try {
            jdbc.getDbcom();
            if (jLabel1.getText().contains("A") || jLabel1.getText().contains("B") || jLabel1.getText().contains("C") || jLabel1.getText().contains("D")) {
                StudentsDate sd = new StudentsDate();
                sd.showTeacherId(jLabel1.getText(), jLabel2.getText(), jLabel3.getText());
                list = jdbc.getClassDB(jLabel1.getText());
                sd.readClassDb(list);
                list2 = jdbc.selectClass(jLabel5.getText());
                sd.readeStudents(list2);
                this.dispose();
                sd.setVisible(true);
            } else {
                StudentsDate sd = new StudentsDate();
                sd.showTeacherId(jLabel1.getText(), jLabel2.getText(), jLabel3.getText());
                list = jdbc.getClassDB(jLabel1.getText());
                sd.readClassDb(list);
                list2 = jdbc.selectClass(jLabel5.getText());
                sd.readeStudents(list2);
                sd.setVisible();
                this.dispose();
                sd.setVisible(true);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherGradeAdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherGradeAdd.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * 削除
     *
     * @param evt
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();

        try {
            jdbc.getDbcom();

            if (jTable1.getSelectedColumn() != -1) {
                // //成績をテスト別に削除
                jdbc.deleteGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());

                //成績画面データ更新
                readGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            } else {
                jLabel1.setText("データを選択してください！");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                jdbc.closeDbcom();
            } catch (SQLException ex) {
                Logger.getLogger(GradeDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherGradeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherGradeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherGradeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherGradeAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherGradeAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
