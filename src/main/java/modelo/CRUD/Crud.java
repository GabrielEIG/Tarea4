/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.CRUD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.util.*;

import modelo.beans.User;


import modelo.conection.MyConnection;

/**
 *
 * @author genca
 */
public class Crud {

    public static void createUser(User user){
        
        MyConnection myConnection =  new MyConnection();
        Connection cn = null;
        Statement stm = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        
        String consulta = "INSERT INTO users (userName, name, lastName, phone, email, password) VALUES (?,?,?,?,?,?);";
    
    try{ 
        cn = myConnection.getConnection();

        CallableStatement cs = cn.prepareCall(consulta);
        cs.setString(1,user.getUserName());
        cs.setString(2,user.getName());
        cs.setString(3,user.getLastName());
        cs.setString(4,user.getPhone());
        cs.setString(5,user.getEmail());
        cs.setString(6,user.getPassword());
        
        cs.execute();
        
        System.out.print("se inserto correctamente "+ user.getUserName());

    
    }catch(SQLException e){
        e.printStackTrace();
        
    }finally{
        try{
            if(rs!=null){
            rs.close();
            }
            if(stm!=null){
            stm.close();
            }
            if(cn!=null){
            cn.close();
            }
        }catch(Exception e2){
            e2.printStackTrace();
        }
    }
    
    
    
    }
    
    public static List<User> getUsers() {
        List<User> userList = new ArrayList<>();

        MyConnection myConnection = new MyConnection();
        Connection cn = null;
        Statement stm = null;
        ResultSet rs = null;

        String query = "SELECT * FROM users;";

        try {
            cn = myConnection.getConnection();
            stm = cn.createStatement();
            rs = stm.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String userName = rs.getString("userName");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String password = rs.getString("password");

                User user = new User(id, userName, name, lastName, phone, email, password);
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stm != null) {
                    stm.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return userList;
    }
    
    public static void updateUser(User user) {
        MyConnection myConnection = new MyConnection();
        Connection cn = null;
        PreparedStatement ps = null;

        String updateQuery = "UPDATE users SET userName=?, name=?, lastName=?, phone=?, email=?, password=? WHERE id=?;";

        try {
            cn = myConnection.getConnection();
            ps = cn.prepareStatement(updateQuery);

            ps.setString(1, user.getUserName());
            ps.setString(2, user.getName());
            ps.setString(3, user.getLastName());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getPassword());
            ps.setInt(7, user.getId());

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Usuario actualizado correctamente: " + user.getUserName());
            } else {
                System.out.println("No se encontró ningún usuario con el ID proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public static void deleteUser(int userId) {
        MyConnection myConnection = new MyConnection();
        Connection cn = null;
        PreparedStatement ps = null;

        String deleteQuery = "DELETE FROM users WHERE id=?;";

        try {
            cn = myConnection.getConnection();
            ps = cn.prepareStatement(deleteQuery);

            ps.setInt(1, userId);

            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Usuario eliminado correctamente con ID: " + userId);
            } else {
                System.out.println("No se encontró ningún usuario con el ID proporcionado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    
}
