package at.htl.nvs.micro.entities;

import javax.persistence.*;

@Entity
@NamedQuery(name="Car.findAll", query = "SELECT c FROM Car c")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String name;
    private String licensePlate;

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Car(String brand, String name, String licensePlate) {
        this.brand = brand;
        this.name = name;
        this.licensePlate = licensePlate;
    }

    public Car() {

    }
}
