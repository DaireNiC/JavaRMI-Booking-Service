package ie.gmit.sw.ds.db;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ie.gmit.sw.ds.model.RentalOrder;

public interface CarHireDB  extends Remote {
	
	//=== CRUD === //
	
	// READ
	//public List<RentalOrder> getAllBookings(String ) throws RemoteException;
	public List<RentalOrder> getAllBookings() throws RemoteException ;
	//CREATE
	public boolean addBooking(RentalOrder booking) throws RemoteException, SQLException;
	//REMOVE
	public boolean deleteBooking(String bookingID) throws RemoteException, SQLException;
	// UPDATE
	public boolean updateBooking(RentalOrder booking) throws RemoteException;

	
}
