/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.tihtih.root;

import com.jp.tihtih.login.Jdbc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AllStudentsDate extends javax.swing.JFrame {

    /**
     * Creates new form Students
     */
    public AllStudentsDate() {
        initComponents();
//        readeStudents();
    }

    /*
    すべての生徒を一覧に表示する
     */
    public void readeStudents(List<Student> list) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Student student : list) {
            tableModel.addRow(new Object[]{student.getId(), student.getAclass(), student.getName(), student.getPass(), student.getSex()});
        }
    }

    //すべての生徒を一覧に表示
    public void readeStudents() {
        Jdbc jdbc = new Jdbc();

        List<Student> list = new ArrayList<>();

        try {
            jdbc.getDbcom();

            list = jdbc.getAllStudents();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Student student : list) {
            tableModel.addRow(new Object[]{student.getId(), student.getAclass(), student.getName(), student.getPass(), student.getSex()});
        }
    }

    //textの値がクラスを含むならそのクラスのすべての生徒を一覧に表示、そうでない場合すべての生徒を表示
    public void readeStudents(String text) {
        List<Student> list = new ArrayList<>();
        Jdbc jdbc = new Jdbc();

        try {
            jdbc.getDbcom();

            if (text.contains("クラス")) {
                jButton9.setVisible(false);
                jButton8.setVisible(false);

                list = jdbc.selectClass(text);

            } else {
                list = jdbc.getAllStudents();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        for (Student student : list) {
            tableModel.addRow(new Object[]{student.getId(), student.getAclass(), student.getName(), student.getPass(), student.getSex()});
        }
    }

    //クラス名を表示
    public void showClassName(String[] s) {
        jComboBox1.removeAllItems();
        for (String s2 : s) {
            jComboBox1.addItem(s2);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("生徒一覧");

        jButton5.setText("検索");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("キーワード");

        jButton1.setText("新規");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("編集");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("削除");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("戻る");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "学生ID", "クラス", "名前", "パスワード", "性別"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton7.setText("成績");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "なし" }));

        jButton9.setText("クラス別");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setText("全て");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(43, 43, 43)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton5))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9)
                        .addComponent(jButton8)))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)
                        .addComponent(jButton3)
                        .addComponent(jButton7))
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    新規追加画面へ
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StudentAdd sa = new StudentAdd();

        if (jComboBox1.getItemCount() == 1) {
            String[] s = new String[]{jComboBox1.getSelectedItem().toString()};
            sa.setClassName(s);
            sa.setStudentId(jComboBox1.getSelectedItem().toString().substring(0, 1));
            this.dispose();
            sa.setVisible(true);
        } else {
            String[] s = new String[]{"Aクラス", "Bクラス", "Cクラス", "Dクラス"};
            sa.setClassName(s);
            this.dispose();
            sa.setVisible(true);
        }


    }//GEN-LAST:event_jButton1ActionPerformed
    /*
    編集
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //Jtable表を値を取得し、編集画面に入れる
        Student student = new Student();
        StudentAdd sa = new StudentAdd();
        if (jComboBox1.getItemCount() == 1) {
            //getSelectedColumn() 如果未选择行就返回-1
            if (jTable1.getSelectedColumn() != -1) {
                student.setId(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                student.setAclass(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                student.setName(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                student.setPass(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                student.setSex(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());

                String[] s = new String[]{jComboBox1.getSelectedItem().toString()};
                sa.setClassName(s);
                sa.setVisible();
                sa.setDate(student);
                this.dispose();
                sa.setVisible(true);
            } else {
                jLabel2.setText("データを選択してください！");
            }
        } else {
            if (jTable1.getSelectedColumn() != -1) {
                student.setId(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                student.setAclass(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                student.setName(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                student.setPass(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                student.setSex(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                String[] s = new String[]{"Aクラス", "Bクラス", "Cクラス", "Dクラス"};
                sa.setClassName(s);
                sa.setVisible();
                sa.setDate(student);
                this.dispose();
                sa.setVisible(true);
            } else {
                jLabel2.setText("データを選択してください！");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    /*
    管理者画面へ戻る
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        if (jComboBox1.getItemCount() == 1) {
            TeachersDate td = new TeachersDate();
            this.dispose();
            td.setVisible(false);
        } else {
            Root root = new Root();
            this.dispose();
            root.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    /*
    生徒一人一人の成績確認へ
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        GradeDate gd = new GradeDate();
        if (jTable1.getSelectedColumn() != -1) {
            if (jComboBox1.getItemCount() == 1) {
                gd.readGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                gd.setVisible2();
                //生徒IDと名前
                gd.showStudentDate(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                gd.setStudentClassName(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                gd.setVisible();
                this.dispose();
                gd.setVisible(true);
            } else {
                String[] s = new String[]{"Aクラス", "Bクラス", "Cクラス", "Dクラス"};
                gd.setClass(s);
                gd.readGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                gd.setStudentID(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                gd.setVisible();
                gd.setVisible2();
//                gd.setName(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                this.dispose();
                gd.setVisible(true);
            }
        } else {
            jLabel2.setText("データを選択してください！");
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    /*
    削除
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Jdbc jdbc = new Jdbc();
        if (jComboBox1.getItemCount() == 1) {
            try {
                jdbc.getDbcom();

                //学生情報と成績情報を一緒に削除
                jdbc.deleteStudent(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                jdbc.deleteGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                jdbc.deleteStudentUser(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

                readeStudents(jComboBox1.getSelectedItem().toString());

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (jdbc != null) {
                    try {
                        jdbc.closeDbcom();
                    } catch (SQLException ex) {
                        Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else {
            try {
                jdbc.getDbcom();

                //学生情報と成績情報を一緒に削除
                jdbc.deleteStudent(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                jdbc.deleteGrade(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                jdbc.deleteStudentUser(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

                readeStudents("1");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (jdbc != null) {
                    try {
                        jdbc.closeDbcom();
                    } catch (SQLException ex) {
                        Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed
    /*
    生徒一覧でクラス別の生徒を表示
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();

        List<Student> list = new ArrayList<>();

        try {
            jdbc.getDbcom();

            list = jdbc.selectClass(jComboBox1.getSelectedItem().toString());

            readeStudents(list);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    /*
    全ての生徒
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        readeStudents();
    }//GEN-LAST:event_jButton8ActionPerformed
    /*
    検索
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Jdbc jdbc = new Jdbc();
        Student student = new Student();
        List<Student> list = new ArrayList<>();
        //String型をint型にフォーマット
        Pattern p = Pattern.compile("^-?[1-9]\\d*$");

//        Matcher m = p.matcher(num);
        try {
            jdbc.getDbcom();
            if (jComboBox1.getItemCount() == 1) {
                if (!jTextField1.getText().isEmpty()) {
                    jLabel2.setText("");
                    //Stringが数値かを判断
                    if (p.matcher((jTextField1.getText())).find()) {
                        if (Integer.parseInt(jTextField1.getText()) >= 0 && Integer.parseInt(jTextField1.getText()) < 10000) {
                            list = jdbc.searchStudentId(jTextField1.getText(), jComboBox1.getSelectedItem().toString());
                            readeStudents(list);
                        } else {
                            jLabel2.setText("IDが長すぎます！");
                            return;
                        }
                    } else {
                        //名前、科目、性別（あいまいと特定検索）
                        list = jdbc.searchStudentName(jTextField1.getText(), jComboBox1.getSelectedItem().toString());
                        readeStudents(list);
                    }

                } else if (jComboBox1.getItemCount() == 1) {
                    list = jdbc.selectClass(jComboBox1.getSelectedItem().toString());
                    readeStudents(list);

                }
            } else if (jComboBox1.getItemCount() != 1) {
                if (!jTextField1.getText().isEmpty()) {
                    jLabel2.setText("");
                    //Stringが数値かを判断
                    if (p.matcher((jTextField1.getText())).find()) {
                        if (Integer.parseInt(jTextField1.getText()) >= 0 && Integer.parseInt(jTextField1.getText()) < 10000) {
                            list = jdbc.searchStudentId(jTextField1.getText());
                            readeStudents(list);
                        } else {
                            jLabel2.setText("IDが長すぎます！");
                            return;
                        }
                    } else {
                        //名前、科目、性別（あいまいと特定検索）
                        list = jdbc.searchStudentName(jTextField1.getText());
                        readeStudents(list);
                    }

                } else {
                    readeStudents("1");

                }
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AllStudentsDate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (jdbc != null) {
                try {
                    jdbc.closeDbcom();
                } catch (SQLException ex) {
                    Logger.getLogger(TeachersDate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AllStudentsDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllStudentsDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllStudentsDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllStudentsDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllStudentsDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
