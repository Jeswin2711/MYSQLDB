package com.assignment;

import java.lang.invoke.StringConcatFactory;
import java.sql.*;

public class databaseMain
{
    public static void main(String[] args) {
        System.out.println("Welcome to JDBC Program");
        /*
        To create a JDBC connection we need url , username and password of our local workbench
         */
        String url = "jdbc:mysql://localhost:3306/";
        String userName = "root";
        String password = "jeswin2711";
        /*
        Connection And Statement Object is Created
         */
        Connection connection;
        Statement statement;
        /*
        We are Try Catch because if any exception occured in between the process that'll be catched and displayed
         */
        try {
            /*
            DriveManager Class to get a Connection using url , username , password
             */
            connection = DriverManager.getConnection(url,userName,password);

            statement = connection.createStatement();
            /*
            line to create a Sql Query
             */
            statement.execute("create database payroll_services");
            statement.execute("show databases");
            statement.execute("use payroll_services");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
