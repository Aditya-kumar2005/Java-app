/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.simplebankingsystem;


import java.sql.*;

/**
 *
 * @author nanua
 */
public class connec {
    Connection c;
    Statement s;
    public connec(){
        try{
           String url="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
           c=DriverManager.getConnection(url,"root","Adity@25062005");
           s=c.createStatement();
        }
        catch(Exception e){
           System.out.print(e);
        }
    }
}