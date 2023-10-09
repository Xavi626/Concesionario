package org.example;

import org.example.controller.CarController;
import org.example.controller.CarOptionsController;
import org.example.controller.UserController;
import org.example.dao.CarDaoImpl;
import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.entitiy.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        UserController userController =new  UserController();
        //userController.FindUser();
        CarController carController = new CarController();
        carController.viewCars();
        userController.selectServices();
    }
}