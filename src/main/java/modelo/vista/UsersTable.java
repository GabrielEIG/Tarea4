/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package modelo.vista;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Window;

import modelo.beans.User;
import modelo.CRUD.Crud;

/**
 *
 * @author genca
 */
public class UsersTable extends javax.swing.JPanel {

    /**
     * Creates new form UsersTable
     */
    public UsersTable() {
        initComponents();
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userTableField = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        updeteUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        closeSesion = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        userTableField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userTableField.setForeground(new java.awt.Color(0, 102, 102));
        userTableField.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Apellido", "Telefono", "Correo", "Check"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTableField);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        updeteUser.setBackground(new java.awt.Color(0, 102, 102));
        updeteUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updeteUser.setForeground(new java.awt.Color(255, 255, 255));
        updeteUser.setText("Actualizar");
        updeteUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updeteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updeteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updeteUserActionPerformed(evt);
            }
        });

        deleteUser.setBackground(new java.awt.Color(0, 102, 102));
        deleteUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteUser.setForeground(new java.awt.Color(255, 255, 255));
        deleteUser.setText("Borrar");
        deleteUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        addUser.setBackground(new java.awt.Color(0, 102, 102));
        addUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addUser.setForeground(new java.awt.Color(255, 255, 255));
        addUser.setText("Agregar");
        addUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Usuarios Registrados");

        closeSesion.setBackground(new java.awt.Color(0, 102, 102));
        closeSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        closeSesion.setForeground(new java.awt.Color(255, 255, 255));
        closeSesion.setText("Cerrar sesion");
        closeSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updeteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updeteUser)
                            .addComponent(deleteUser)
                            .addComponent(closeSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addUser))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void fillTable() {
        Object[][] data = getUsersData();
        String[] columnNames = {"Usuario","Nombre", "Apellido", "Telefono", "Correo", "Check"};

        CheckBoxTableModel model = new CheckBoxTableModel(data, columnNames);

        // aqui se agregara el cambio a la tabla para agregar el checkBox
        userTableField.setModel(model);
    }
    
    //La clase CheckBoxTableModel recibira dos parametros los datos de las columnas(Matriz bi) y las columnas una matriz.
    private class CheckBoxTableModel extends DefaultTableModel {
        public CheckBoxTableModel(Object[][] data, Object[] columnNames) {
            super(data, columnNames);
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == getColumnCount() - 1) {
                // Si es la última columna, tratamos como JCheckBox
                return Boolean.class;
            } else {
                // Si no se cumple, entonces se tratara la columna por defecto osea por su diseno de origen
                return super.getColumnClass(columnIndex);
            }
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            // Hacemos que todas las celdas sean editables (para permitir la selección del JCheckBox)
            return true;
        }
    }
    
    
    
    
    
    private void updeteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updeteUserActionPerformed
        // TODO add your handling code here:
        CheckBoxTableModel model = (CheckBoxTableModel) userTableField.getModel();
    
    // Check if there are any changes to be saved
    boolean hasChanges = false;
    for (int i = 0; i < model.getRowCount(); i++) {
        boolean isSelected = (boolean) model.getValueAt(i, model.getColumnCount() - 1);
        if (isSelected) {
            hasChanges = true;
            break;
        }
    }
    
    if (hasChanges) {
        int option = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?", "Guardar Cambios", JOptionPane.YES_NO_OPTION);
        
        if (option == JOptionPane.YES_OPTION) {
            
            List<User> userList = Crud.getUsers();
            
            for (int i = 0; i < model.getRowCount(); i++) {
                
                boolean isSelected = (boolean) model.getValueAt(i, model.getColumnCount() - 1);
                
                if (isSelected) {
                    User user = userList.get(i);
                    user.setUserName((String) model.getValueAt(i, 0));
                    user.setName((String) model.getValueAt(i, 1));
                    user.setLastName((String) model.getValueAt(i, 2));
                    user.setPhone((String) model.getValueAt(i, 3));
                    user.setEmail((String) model.getValueAt(i, 4));

                    Crud.updateUser(user);

                    model.setValueAt(false, i, model.getColumnCount() - 1);
                }
            }
            fillTable();
        }
    } else {
        JOptionPane.showMessageDialog(this, "No hay cambios que guardar.", "Sin Cambios", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_updeteUserActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        // TODO add your handling code here:
        CheckBoxTableModel model = (CheckBoxTableModel) userTableField.getModel();
    
    // Check if there are any rows selected for deletion
    boolean hasSelection = false;
    for (int i = 0; i < model.getRowCount(); i++) {
        boolean isSelected = (boolean) model.getValueAt(i, model.getColumnCount() - 1);
        if (isSelected) {
            hasSelection = true;
            break;
        }
    }
    
    if (hasSelection) {
        // Ask the user for confirmation before deletion
        int option = JOptionPane.showConfirmDialog(this, "¿Desea eliminar los usuarios seleccionados?", "Eliminar Usuarios", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // User clicked "Yes", delete the selected users
            List<User> userList = Crud.getUsers();
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                boolean isSelected = (boolean) model.getValueAt(i, model.getColumnCount() - 1);
                if (isSelected) {
                    User user = userList.get(i);
                    Crud.deleteUser(user.getId());
                    model.removeRow(i);
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "No ha seleccionado ningún usuario para eliminar.", "Sin Selección", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_deleteUserActionPerformed

    private void closeSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeSesionActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de cerrar la sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        // Cerrar la ventana actual
        Window parentWindow = SwingUtilities.getWindowAncestor(this);
        parentWindow.dispose();

        // Abrir la ventana de inicio de sesión (LoginForm)
        JFrame loginFrame = new JFrame("Inicio de Sesión");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.add(new LoginForm());
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }
    }//GEN-LAST:event_closeSesionActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
    RegisterForm registerForm = new RegisterForm();

    // Establecer la ventana de tabla de usuarios (UsersTable) como el padre de la ventana de registro (RegisterForm)
    JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
    JDialog dialog = new JDialog(parentFrame, "Registrar Usuario", true);
    dialog.setContentPane(registerForm);
    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    dialog.pack();
    dialog.setLocationRelativeTo(null);

    // Mostrar la ventana de registro
    dialog.setVisible(true);

    // Actualizar la tabla con los datos recién agregados
    fillTable();
    }//GEN-LAST:event_addUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser;
    private javax.swing.JButton closeSesion;
    private javax.swing.JButton deleteUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updeteUser;
    private javax.swing.JTable userTableField;
    // End of variables declaration//GEN-END:variables

    private Object[][] getUsersData() {
        List<User> userList = Crud.getUsers();
        Object[][] data = new Object[userList.size()][6];
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            data[i][0] = user.getUserName();
            data[i][1] = user.getName();
            data[i][2] = user.getLastName();
            data[i][3] = user.getPhone();
            data[i][4] = user.getEmail();
            data[i][5] = false; // Valor inicial del JCheckBox (sin selección)
        }
        return data;
    }

}
