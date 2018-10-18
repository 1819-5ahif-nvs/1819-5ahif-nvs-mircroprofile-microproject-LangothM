package at.htl.nvs.micro.entities;

import javax.persistence.*;

@Entity
@Table(name = "RentLocation")
@NamedQuery(name="RentLocation.findAll", query = "select r from RentLocation r")
public class RentLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private int parkingSlots;

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getParkingSlots() {
        return parkingSlots;
    }

    public RentLocation(String city,int parkingSlots){
        this.city = city;
        this.parkingSlots = parkingSlots;
    }

    public RentLocation(){

    }
}
