<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="/css/style.css" rel="stylesheet" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orders</title>
</head>
<body>
	<h1>Bookings</h1>
	<table>
		<tr>
			<th>Booking ID</th>
			<th>Customer Name</th>
			<th>Vehicle Model</th>
			<th>Pickup Date</th>
			<th>Return Date</th>
		</tr>

		<c:forEach items="${bookings}" var="booking">

			<tr>
				<td>${booking.rentalSID}</td>
				<td>${booking.customer.firstName}</td>
				<td>${booking.vehicle.model}</td>
				<td>${booking.pickUpDate}</td>
				<td>${booking.dropOffDate}</td>
			</tr>

		</c:forEach>

	</table>
	<br>
	<a href="/index.html">Home</a>
</body>
</html>