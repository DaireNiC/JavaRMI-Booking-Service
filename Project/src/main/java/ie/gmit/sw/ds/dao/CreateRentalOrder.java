package ie.gmit.sw.ds.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Instant;
import java.time.ZonedDateTime;

import javax.xml.bind.JAXBContext;
import javax.xml.datatype.XMLGregorianCalendar;

import ie.gmit.sw.ds.model.Address;
import ie.gmit.sw.ds.model.Customer;
import ie.gmit.sw.ds.model.RentalOrder;
import ie.gmit.sw.ds.model.Vehicle;

public class CreateRentalOrder {

	// add the booking to the database
	public boolean createOrder(Connection conn, RentalOrder ro) throws SQLException {

		String insertBooking = "INSERT INTO rentalorder"
				+ "(rental_SID, orderDate, pickupDate, dropOffDate, vehicle_SID, customer_SID) VALUES"
				+ "(?,?,?,?,?,?)";

		// create a Statement from the connection
		PreparedStatement preparedStatement = conn.prepareStatement(insertBooking);

		preparedStatement.setString(1, ro.getRentalSID());
		preparedStatement.setDate(2, ro.getOrderDate());
		preparedStatement.setDate(3, ro.getPickUpDate());
		preparedStatement.setDate(4, ro.getDropOffDate());
		preparedStatement.setString(5, (ro.getVehicle().getVehicleSID()));
		preparedStatement.setString(6, (ro.getCustomer().getCustomerSID()));

		// execute insert SQL stetement
		int rowsaffected = preparedStatement.executeUpdate();

		if (rowsaffected > 0) {
			System.out.println("Record is inserted!");
			return true;
		} else {
			return false;
		}

	}

}
