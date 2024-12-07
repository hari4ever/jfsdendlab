package com.klelf.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Creating Vehicle object
        Car car = new Car();
        car.setName("Sedan");
        car.setType("Car");
        car.setMaxSpeed(180);
        car.setColor("Red");
        car.setNumberOfDoors(4);

        Truck truck = new Truck();
        truck.setName("TruckPro");
        truck.setType("Truck");
        truck.setMaxSpeed(120);
        truck.setColor("Blue");
        truck.setLoadCapacity(10000);

        // Persisting objects
        session.save(car);
        session.save(truck);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully!");
    }
}
