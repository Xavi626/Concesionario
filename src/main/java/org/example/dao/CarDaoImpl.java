package org.example.dao;

import jakarta.transaction.Transactional;
import org.example.entitiy.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{
    public List<Car> viewCars(){
        List<Car> carList = new ArrayList<>();
        Car bmwM3 = new Car();
        bmwM3.setId(1);
        bmwM3.setBrand("BMW");
        bmwM3.setModel("M3");
        bmwM3.setColor("Blue");
        bmwM3.setCv(456);
        bmwM3.setPrice(45356);
        bmwM3.setPriceRenting(340);
        carList.add(bmwM3);

        Car AudiA4 = new Car();
        AudiA4.setId(2);
        AudiA4.setBrand("AUDI");
        AudiA4.setModel("A4");
        AudiA4.setColor("Gray");
        AudiA4.setCv(342);
        AudiA4.setPrice(56589);
        AudiA4.setPriceRenting(128);
        carList.add(AudiA4);

        return carList;

    }
}
