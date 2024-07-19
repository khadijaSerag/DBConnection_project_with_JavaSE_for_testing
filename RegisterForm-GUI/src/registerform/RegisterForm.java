/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registerform;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AhmedTawfik
 */
public class RegisterForm extends javax.swing.JFrame {

    DefaultTableModel dtm;
    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        dtm =new DefaultTableModel();
        
        dtm.addColumn("Employee Name");
        dtm.addColumn("Employee Salary");
        dtm.addColumn("Employee Gender");
        dtm.addColumn("Department Name");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Khadija Serag
    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        edt_emp_name = new JTextField();
        edt_emp_salary = new JTextField();
        rbtn_male = new JRadioButton();
        rbtn_female = new JRadioButton();
        cbx_dept_name = new JComboBox<>();
        jScrollPane1 = new JScrollPane();
        tbl_show = new JTable();
        btn_add = new JButton();
        buttonGroup1 = new ButtonGroup();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Register Form");
        setResizable(false);
        Container contentPane = getContentPane();

        //======== jPanel1 ========
        {
            jPanel1.setBackground(new Color(0xfafafa));
            jPanel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,jPanel1. getBorder () ) ); jPanel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );

            //======== jPanel2 ========
            {
                jPanel2.setBackground(new Color(0x009999));

                //======== jPanel3 ========
                {
                    jPanel3.setBackground(Color.white);

                    //---- jLabel1 ----
                    jLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
                    jLabel1.setText("Employee Name:");

                    //---- jLabel2 ----
                    jLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
                    jLabel2.setText("Employee Salary:");

                    //---- jLabel3 ----
                    jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
                    jLabel3.setText("Employee Gender:");

                    //---- jLabel4 ----
                    jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
                    jLabel4.setText("Department Name:");

                    //---- edt_emp_name ----
                    edt_emp_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    edt_emp_name.setBorder(new LineBorder(new Color(0x009999), 1, true));

                    //---- edt_emp_salary ----
                    edt_emp_salary.setFont(new Font("Tahoma", Font.PLAIN, 14));
                    edt_emp_salary.setBorder(new LineBorder(new Color(0x009999), 1, true));

                    //---- rbtn_male ----
                    rbtn_male.setBackground(Color.white);
                    rbtn_male.setSelected(true);
                    rbtn_male.setText("Male");

                    //---- rbtn_female ----
                    rbtn_female.setBackground(Color.white);
                    rbtn_female.setText("Female");

                    //---- cbx_dept_name ----
                    cbx_dept_name.setModel(new DefaultComboBoxModel<>(new String[] {
                        "IT",
                        "SD",
                        "HR"
                    }));

                    //======== jScrollPane1 ========
                    {

                        //---- tbl_show ----
                        tbl_show.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                            },
                            new String[] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                            }
                        ));
                        jScrollPane1.setViewportView(tbl_show);
                    }

                    //---- btn_add ----
                    btn_add.setBackground(Color.white);
                    btn_add.setText("Add");
                    btn_add.addActionListener(e -> {
                        btn_addActionPerformed(e);
		});

                    GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                    jPanel3.setLayout(jPanel3Layout);
                    jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edt_emp_name, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edt_emp_salary, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtn_male)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtn_female))
                                    .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_dept_name))
                                    .addComponent(btn_add, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE))
                    );
                    jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup()
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edt_emp_name, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup()
                                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edt_emp_salary, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbtn_male)
                                    .addComponent(rbtn_female))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_dept_name, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_add, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                }

                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(5, 5, 5))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup()
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(5, 5, 5))
                );
            }

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        buttonGroup1.add(rbtn_male);
        buttonGroup1.add(rbtn_female);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        if (!edt_emp_name.getText().isEmpty() && !edt_emp_salary.getText().isEmpty()) {
            String empName = edt_emp_name.getText();
            double empSalary = Double.parseDouble(edt_emp_salary.getText());
            String gender;
            if (rbtn_male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            
            String deptName = cbx_dept_name.getSelectedItem().toString();
            
            //JOptionPane.showMessageDialog(this, "Emp Name:" + empName + "\n Emp Salary: " + empSalary + "\nGender: " + gender + "\n Dept Name: " + deptName);
            
            
            
            dtm.addRow(new Object[]{empName,empSalary,gender,deptName});
            
            tbl_show.setModel(dtm);
            
        }
    }//GEN-LAST:event_btn_addActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Khadija Serag
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField edt_emp_name;
    private JTextField edt_emp_salary;
    private JRadioButton rbtn_male;
    private JRadioButton rbtn_female;
    private JComboBox<String> cbx_dept_name;
    private JScrollPane jScrollPane1;
    private JTable tbl_show;
    private JButton btn_add;
    private ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
