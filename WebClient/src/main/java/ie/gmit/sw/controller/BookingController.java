package ie.gmit.sw.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ie.gmit.sw.ds.model.*;
import ie.gmit.sw.services.*;

@Controller
public class BookingController {

	List<RentalOrder> rentalOrder;
	Map<String, String> custList;
	Map<String, String> carList;
	Map<String, String> bookingsList;

	@Autowired
	private BookingsService bookingService;
	
	public BookingController() {
	
	}

	

	// display ships
	@RequestMapping(value = "/showBookings", method = RequestMethod.GET)
	public String getBookings(Model m) {

		// String bookings = bookingService.createBooking();
		List<RentalOrder> bookings = bookingService.getBookings();

		m.addAttribute("bookings", bookings);

		return "showBookings";
	}

	// add ship
	// this is the get request which directs to the add booking page
	@RequestMapping(value = "/createBooking", method = RequestMethod.GET)
	public String getAddBooking(@ModelAttribute("RentalOrder") RentalOrder booking, Model m, HttpServletRequest h) {

		this.rentalOrder = bookingService.getBookings();

		this.custList = new HashMap<String, String>();
		this.carList = new HashMap<String, String>();

		for (RentalOrder r : rentalOrder) {

			custList.put(r.getCustomer().getCustomerSID(),
					"Customer: " + " " + r.getCustomer().getFirstName() + r.getCustomer().getLastName());
			carList.put(r.getVehicle().getVehicleSID(), "Vehicle: " + " " + r.getVehicle().getModel());

		}

		m.addAttribute("custList", custList);
		m.addAttribute("carList", carList);

		return "createBooking";
	}

	@RequestMapping(value = "/createBooking", method = RequestMethod.POST)
	public String postBooking(@Valid @ModelAttribute("RentalOrder") RentalOrder booking, BindingResult result) {
		bookingService.createBooking(booking);

		return "redirect:showBookings";
	}

	@RequestMapping(value = "/updateBooking", method = RequestMethod.GET)
	public String updateBooking(@ModelAttribute("RentalOrder") RentalOrder booking, Model m, HttpServletRequest h) {

		this.rentalOrder = bookingService.getBookings();
		this.custList = new HashMap<String, String>();
		this.carList = new HashMap<String, String>();
		this.bookingsList = new HashMap<String, String>();

		for (RentalOrder r : rentalOrder) {
			bookingsList.put(r.getRentalSID(),"Booking ID: " + " " +r.getRentalSID());

			custList.put(r.getCustomer().getCustomerSID(),
					"Customer: " + " " + r.getCustomer().getFirstName() + r.getCustomer().getLastName());
			carList.put(r.getVehicle().getVehicleSID(), "Vehicle: " + " " + r.getVehicle().getModel());

		}
		m.addAttribute("custList", custList);
		m.addAttribute("carList", carList);
		m.addAttribute("bookingsList", bookingsList);
		
		return "updateBooking";
	}

	@RequestMapping(value = "/updateBooking", method = RequestMethod.POST)
	public String putBooking( @ModelAttribute("RentalOrder") RentalOrder booking, BindingResult result) {

		bookingService.updateBooking(booking);
		return "redirect:showBookings";
	}
	
	// this is the get request which directs to the add booking page
		@RequestMapping(value = "/deleteBooking", method = RequestMethod.GET)
		public String getDeleteBooking(@ModelAttribute("RentalOrder") RentalOrder booking,Model m, HttpServletRequest h) {
			
			this.rentalOrder = bookingService.getBookings();
			this.bookingsList = new HashMap<String, String>();
			
			for (RentalOrder r : rentalOrder) {
				bookingsList.put(r.getRentalSID(),"Booking ID: " + " " +r.getRentalSID());

			}
			

			m.addAttribute("bookingsList", bookingsList);
		
			
			return "deleteBooking";
		}

		
		@RequestMapping(value = "/deleteBooking", method = RequestMethod.POST)
		public String postDelete(@Valid @ModelAttribute("RentalOrder") RentalOrder rentalOrder, BindingResult result) {	
			
			bookingService.deleteBooking(rentalOrder.getRentalSID());
			
			return "redirect:showBookings";
		}

}
