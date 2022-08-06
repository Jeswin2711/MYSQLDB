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
            //query to create a payroll_service database
            statement.execute("create database payroll_service");
            //query to show databases
            statement.execute("show databases");
            //query to use the database
            statement.execute("use payroll_service");
            //query to create a table
            statement.execute("create table employee_payroll (id int primary key auto_increment, name varchar(20) not null, salary bigint not null, start_date Date not null)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
