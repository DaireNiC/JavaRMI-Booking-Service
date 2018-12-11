package ie.gmit.sw.services;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.spi.factory.ResponseImpl;

import ie.gmit.sw.ds.model.Customer;
import ie.gmit.sw.ds.model.RentalOrder;
import ie.gmit.sw.ds.model.Vehicle;

@Service
public class BookingsService {

	private final String REST_URI = "http://localhost:8080/Project/webapi/bookings/";
	private Client client;
	private WebResource webResource;
	
	public BookingsService() {
		// create the target
		System.out.println("Initialising Client..");
		
		this.client = Client.create();
		this.webResource = this.client.resource(REST_URI);
		this.webResource.type(MediaType.APPLICATION_XML);

	}
	
	// GET REQUEST/ READ OPERATION
	public List<RentalOrder> getBookings() {
		List<RentalOrder> output = null;

		try {

			this.webResource = this.client.resource(REST_URI).path("/read");

			webResource.type(MediaType.APPLICATION_XML);

			output = webResource.get(new GenericType<List<RentalOrder>>() {});

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}

		return output;
	}

	// POST / ADD OPERATION
	public String createBooking(RentalOrder booking) {
		
//		RentalOrder ro = new RentalOrder();
//		ro.setRentalSID("testernew");
//		ro.setVehicle(new Vehicle());
//		ro.getVehicle().setVehicleSID("33333");
//		ro.setCustomer(new Customer());
//		ro.getCustomer().setCustomerSID("22222");
//		java.util.Date today = new java.util.Date();
//		ro.setDropOffDate(new Date(today.getTime()));
//		
		System.out.println("my object i created : " + booking.toString());
		//POST
		webResource = this.client.resource(REST_URI).path("/create");
		webResource.post(booking);

		  return "hey";
	}

	public void updateBooking(@Valid RentalOrder booking) {
		webResource = this.client.resource(REST_URI).path("/update");
		webResource.put(booking);
		
	}
	
	public void deleteBooking(String rentalOrder) {

		webResource = this.client.resource(REST_URI).path("/delete/" + rentalOrder);
		
		webResource.delete(rentalOrder);

	}

}
