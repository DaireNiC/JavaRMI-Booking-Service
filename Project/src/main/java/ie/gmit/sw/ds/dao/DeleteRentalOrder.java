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

public class DeleteRentalOrder {

	// add the booking to the database
	public boolean deleteOrder(Connection conn, String bookingID) throws SQLException {

		String deleteBooking = "DELETE FROM rentalorder WHERE rental_SID = ?";

		// create a Statement from the connection
		PreparedStatement preparedStatement = conn.prepareStatement(deleteBooking);

		preparedStatement.setString(1, bookingID);

		// execute insert SQL stetement
		int rowsaffected = preparedStatement.executeUpdate();

		if (rowsaffected > 0) {
			System.out.println("Record deleted!");
			return true;
		} else {
			return false;
		}

	}

}
