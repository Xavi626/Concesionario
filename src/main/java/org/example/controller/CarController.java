package org.example.controller;

import org.example.dao.CarDao;
import org.example.dao.CarDaoImpl;
import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.entitiy.Car;
import org.example.entitiy.User;

import java.util.ArrayList;
import java.util.List;

public class CarController {
        public void viewCars(){
            CarDao carDao = new CarDaoImpl();
            List<Car> cars = carDao.viewCars();

            for (Car car : cars){
                System.out.println(" Marca: " + car.getBrand() +" Modelo: " + car.getModel() + " Color: " + car.getColor() + " CV: " + car.getCv() + " Disponibilidad: " + car.getAvailable() + " Precio: " + car.getPrice());
            }
        }
}
