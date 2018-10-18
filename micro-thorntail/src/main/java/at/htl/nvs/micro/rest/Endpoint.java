package at.htl.nvs.micro.rest;


import at.htl.nvs.micro.entities.Car;
import com.google.gson.Gson;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.List;


@Path("rental")
public class Endpoint {

	@PersistenceContext
	private EntityManager em;

	@GET
	@Path("/cars")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCars() {
		List<Car> cars = em.createNamedQuery("Car.findAll").getResultList();
		return Response.ok()
				.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers",
						"origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods",
						"GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(cars != null ? new Gson().toJson(cars) : "keine Autos in der DB")
				.build();
	}

	@GET
	@Path("/locations")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllLocations() {
		List<Car> locations = em.createNamedQuery("RentalLocation.findAll").getResultList();
		return Response.ok()
				.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers",
						"origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods",
						"GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(locations != null ? new Gson().toJson(locations) : "keine Autos in der DB")
				.build();
	}
}
