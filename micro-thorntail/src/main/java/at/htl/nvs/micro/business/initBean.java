package at.htl.nvs.micro.business;

import at.htl.nvs.micro.entities.Car;
import at.htl.nvs.micro.entities.RentLocation;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class initBean {

    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init(){
        em.persist(new Car("VW","Passat","LL-441LP"));
        em.persist(new RentLocation("Linz",93));
        System.out.println("Auto und neuer Standort gespeichert!");
    }
}
