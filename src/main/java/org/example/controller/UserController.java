package org.example.controller;

import org.example.dao.UserDaoImpl;
import org.example.entitiy.User;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserController {
    private boolean selectCar = false;
    private boolean userFound = false;

    public void FindUser() {
        UserDaoImpl userDao = new UserDaoImpl();
        try (Scanner inputUser = new Scanner(System.in)) {
            while (!userFound) {
                System.out.println("Introduce el nombre del usuario:");
                String username = inputUser.nextLine();

                List<User> userList = userDao.findUsers(username);
                System.out.println("Introduce la contraseña del usuario:");
                String password = inputUser.nextLine();
                for (User user : userList) {

                    if (user != null && user.getPassword().equals(password)) {
                        System.out.println("Usuario encontrado: " + user.getUsername());
                        userFound = true;
                    } else {
                        System.out.println("Usuario o contraseña incorrectos.");
                    }
                }
                // Agregar una opción para salir del bucle

            }
        } catch (Exception e) {
            System.out.println("¡ALERTA! Ha ocurrido un error: " + e.getMessage());
        }
    }

    public void selectServices() {
        try (Scanner enterCar = new Scanner(System.in)) {
            while (!selectCar) {
                System.out.println("Escoge entre estas opciones: RENTING, COMPRAR o FINANCIAR");
                String exportCar = enterCar.nextLine().toUpperCase();
                switch (exportCar) {
                    case "RENTING" -> {
                        CarOptionsController carOptionsController = new CarOptionsController();
                        carOptionsController.rentingCar();
                        selectCar = true;
                    }
                    case "COMPRAR" -> {
                        CarOptionsController carOptionsController = new CarOptionsController();
                        carOptionsController.buyCar();
                        selectCar = true;
                    }
                    case "FINANCIAR" -> {
                        CarOptionsController carOptionsController = new CarOptionsController();
                        carOptionsController.financialCar();
                        selectCar = true;
                    }
                    default -> System.out.println("Has introducido una opción no válida.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Has introducido una entrada no válida.");
        }
    }
}
