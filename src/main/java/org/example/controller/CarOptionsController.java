package org.example.controller;

import org.example.dao.CarDao;
import org.example.dao.CarDaoImpl;
import org.example.entitiy.Car;

import java.util.List;
import java.util.Scanner;

public class CarOptionsController {
    public void rentingCar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escoge el automóvil que deseas alquilar por nombre:");

        // Obtener la lista de autos disponibles desde la base de datos
        CarDao carDao = new CarDaoImpl();
        List<Car> carsList = carDao.viewCars();

        // Mostrar la lista de autos disponibles
        for (Car car : carsList) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }

        System.out.println("Introduce el nombre del automóvil que deseas alquilar:");
        String carName = input.nextLine().toUpperCase();

        // Buscar el automóvil seleccionado por el usuario por nombre
        Car selectedCar = null;
        for (Car car : carsList) {
            if (car.getBrand().equalsIgnoreCase(carName)) {
                selectedCar = car;
                break;
            }
        }
        if (selectedCar != null) {
            System.out.println("Cuantos días deseas rentar el automóvil:");
            int rentingDays = input.nextInt();

            // Calcular el costo total del alquiler
            double totalCost = selectedCar.getPriceRenting() * rentingDays;

            // Mostrar la información del alquiler
            System.out.println("Has seleccionado el automóvil: " + selectedCar.getBrand() + " " + selectedCar.getModel());
            System.out.println("Días de alquiler: " + rentingDays);
            System.out.println("Costo total del alquiler: $" + totalCost);
            FinishWindowController finishWindowController = new FinishWindowController();
            finishWindowController.completeRenting();
        } else {
            System.out.println("Automóvil no encontrado. Introduce un nombre de automóvil válido.");
        }
    }
    public void buyCar(){
        System.out.println("BUY CAR");
    }
    public void financialCar(){
        System.out.println("FINANCIAR");
    }
}
