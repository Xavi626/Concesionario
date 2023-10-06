package org.example.controller;

import org.example.dao.UserDaoImpl;
import org.example.entitiy.User;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class UserController {
    private boolean selectCar = false;
    private boolean userFound = false;
    public void FindUser(){
        UserDaoImpl userDao = new UserDaoImpl();
        try (Scanner inputUser = new Scanner(System.in)) {
            while (!userFound) {
                System.out.println("Introduce el nombre del usuario:");
                String username = inputUser.nextLine();

                System.out.println("Introduce la contraseña del usuario:");
                String password = inputUser.nextLine();

                User foundUser = userDao.findUser(username);

                if (foundUser != null && foundUser.getPassword().equals(password)) {
                    System.out.println("Usuario encontrado: " + foundUser.getUsername());
                    userFound = true;
                } else {
                    System.out.println("Usuario o contraseña incorrectos.");
                }

                // Agregar una opción para salir del bucle

            }
        } catch (Exception e) {
            System.out.println("¡ALERTA! Ha ocurrido un error: " + e.getMessage());
        }
    }
    public void SelectServices() {
        try (Scanner inputCar = new Scanner(System.in)) {

        while (!selectCar) {

                CarOptionsController carOptionsController = new CarOptionsController();

                System.out.println("Escoge entre estas opciones: RENTING, COMPRAR o FINANCIAR");
                String exportCar = inputCar.nextLine().toUpperCase();

                if (exportCar.equals("RENTING")) {
                    carOptionsController.rentingCar();
                    selectCar = true;
                } else if (exportCar.equals("BUY")) {
                    carOptionsController.buyCar();
                    selectCar = true;
                } else if (exportCar.equals("FINANCIAR")) {
                    carOptionsController.financialCar();
                    selectCar = true;
                }
            }
            }catch (InputMismatchException e){
            System.out.println("Has introducido mal la petición");
        }
    }

}

