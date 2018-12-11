
## Car Hire Booking Service

#### Project Outline:

> You are required to use the JAX-RS/Jersey, Java RMI and JAXB frameworks to develop a simple Car Hire Booking System. A Web Client page should provide users with the ability to Create/Modify/Update/Delete bookings for a specific vehicle for a given set of dates. The Web Client will interact with a RESTful JAX-RS Web Service for bookings which is deployed on Apache Tomcat Server. The RESTful Web Service will act as a RMI client to a RMI Database Server which will handle persistence.
> 

## Running the Project

The most straighforward way to run this project is by opening it in an IDE such as Eclipse. 

 1. Copy the contents of the .sql file into an sql console to create the DB
 2. Enusre That Tomcat 7 is installed and availabe.
 3. Right Click on the Project folder --> Select Run on Server 
 4. Navigate to the CarHireDbImpl.java file and click Run as Java Application
 5. Open the Spring WebClient Project --> click Run as Spring Boot Application

## Project Breakdown

### Web Client
- The webclient uses the Spring Framework. 
- Initially I was explicitly marshlling and unmarshalling the data. Using the following code: 
     
	Marshaller m1 = jc.createMarshaller();
	m1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m1.marshal(r1, new FileWriter("order.xml"));
	m1.marshal(r1, System.out)

- However after conducting some research and gathering resources from lab 9, I found that Jersey can perform marshalling automatically once the correct annotaions are in place.


### RESTful  Web Service
- The RESTful Web Service uses JAX-RS/Jersey.
- It acts as an endpoint for all clients wishing to use the car hire booking system
-  Clients can  access CRUD functionality for car hire bookings using the GET, POST, PUT and DELETE methods.
 
### Data Modelling

- The data model consists of four classes. All classes are generated using the XSD. The realtionships between each of the entities are shown in the following diagram.
- The reasoning behind heach of the components is simply what is necessary to facilitate gathering the necessary information to manage car hire bookings. 
- All classes implement  the **Serialializable** interface. This is key to allow for passing of obejcts when using the RMI Database. 

### RMI Database Server
- A RMI interface called CarHireDB exposes the remote methods which provide CRUD (Create, Read, Update and Delete) functionality 
- The CarHireDBSetup binds the Remote Object into the RMI registry using the name "carHireDB", 
- The CarHireDBImpl performs operations on the sql database provided

## Extra Goodies
### Desktop Client
- I created a simple Desktop client to demonstrate how the RESTful WEb service can be accesssed from various form of client. 
- Consists of a command line interface and allows the user to perform a READ operation. This operation then calls the GET method in the web service, which in turn returns a list of the bookings retrieved from the database/
### .War & .Jar
- The webservice is available via the .war file
- The DesktopClient is available via the .war file
### Spring Boot Client
- I created a webclient using the Spring Boot Framework and Jersey Client.
- This acts a platform to serve the jsp file that the user interacts with. 
- From here the user execute HTTP requests to the remotely running  WebService



 Resources used during project devlopment: 
 - http://slackspace.de/articles/jersey-client-retrieve-list-of-entities/
 - -https://alvinalexander.com/java/java-timestamp-example-current-time-now
 - https://www.baeldung.com/jersey-rest-api-with-spring
