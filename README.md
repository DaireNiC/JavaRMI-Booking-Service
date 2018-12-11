## Car Hire Booking Service

#### Project Outline:

> You are required to use the JAX-RS/Jersey, Java RMI and JAXB frameworks to develop a simple Car Hire Booking System. A Web Client page should provide users with the ability to Create/Modify/Update/Delete bookings for a specific vehicle for a given set of dates. The Web Client will interact with a RESTful JAX-RS Web Service for bookings which is deployed on Apache Tomcat Server. The RESTful Web Service will act as a RMI client to a RMI Database Server which will handle persistence.
> 

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
The RESTful Web Service uses JAX-RS/Jersey.
 It acts as an endpoint for all clients wishing to use the car hire booking system
 which will act as the gateway for all clients which wish to use the Car Hire Booking System. Clients will be able to access CRUD functionality for car hire bookings using the GET, POST, PUT and DELETE methods. This class will be responsible for marshalling/unmarshalling data to/from XML for all Web Client requests/responses. This class will also act as a client for the RMI Database Server.
 

### Data Modelling

- The data model consists of four classes. All classes are generated using the XSD. The realtionships between each of the entities are shown in the following diagram.
- insert model db
- The reasoning behind heach of the components is simply what is necessary to facilitate gathering the necessary information to manage car hire bookings. 
- All classes implement  the **Serialializable** interface. This is key to allow for passing of obejcts when using the RMI Database. ### RMI Database Server

## Extra Goodies
### Desktop Client
- I created a simple Desktop client to demonstrate how the RESTful WEb service can be accesssed from various form of client. 
- Consists of a command line interface and allows the user to perform a READ operation. This operation then calls the GET method in the web service, which in turn returns a list of the bookings retrieved from the database/
- 


## Running the Project
### WebService 

 - 





 Resources used during project devlopment: 
 - http://slackspace.de/articles/jersey-client-retrieve-list-of-entities/
 - -https://alvinalexander.com/java/java-timestamp-example-current-time-now
 - https://www.baeldung.com/jersey-rest-api-with-spring
