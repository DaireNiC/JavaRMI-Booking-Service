<img src="https://raw.githubusercontent.com/DaireNiC/Emerging-Technologies/master/media/emerging_tech.gif?token=ATSi0FagwtorgU0CSrdcqiW1ZVSgF9tuks5cCwcFwA%3D%3D" width="100%"/>

## Car Hire Booking Service

#### Project Outline:

> You are required to use the JAX-RS/Jersey, Java RMI and JAXB frameworks to develop a simple Car Hire Booking System. A Web Client page should provide users with the ability to Create/Modify/Update/Delete bookings for a specific vehicle for a given set of dates. The Web Client will interact with a RESTful JAX-RS Web Service for bookings which is deployed on Apache Tomcat Server. The RESTful Web Service will act as a RMI client to a RMI Database Server which will handle persistence.
> 

|| Contents ||
|--|--|--|
|1  | [Numpy Random Notebook](https://github.com/DaireNiC/Emerging-Techologies/blob/master/numpy_random.ipynb) | Exploring probability distributions & numpy.rand package
|2 | [Iris Dataset Notebook](https://github.com/DaireNiC/Emerging-Techologies/blob/master/iris_dastaset.ipynb) | Researching and visualizing the Iris dataset with Pandas, Keras & more
|3| [MNIST Dataset Notebook](https://github.com/DaireNiC/Emerging-Techologies/blob/master/MNIST.ipynb) | How to read and interpret the MNIST dataset
|5 |[ MNSIT Dataset Reader Python Script](https://github.com/DaireNiC/Emerging-Techologies/blob/master/mnist_script.py) | Python implementation of reading and storing the MNIST dataset
|4 | [Digit Recognizer Notebook](https://github.com/DaireNiC/Emerging-Techologies/blob/master/digit_recognition.ipynb) | Building Neural Networks to recognize hand drawn digits
|5 |[Digit Recognizer Python Script](https://github.com/DaireNiC/Emerging-Techologies/blob/master/digit_recognizer/digit_recognition_script.py) | Command Line tool that takes an image file containing a handwritten digit and identifies the digit using a supervisedlearning algorithm and the MNIST dataset


## Running the Project
To run and view the .ipynb files correctly, Jupyter Notebook/Jupyter lab must be installed. 

- Before installing ensure Python 3.3 or greater, or Python 2.7 is installed on your machine
- One approach to installing Python & Jupyter is using [Anaconda](https://www.anaconda.com/), get it from [here](https://www.anaconda.com/download/).

With Anaconda and Python installed, execute the following

    conda install jupyter 


With Juypter successfully installed , you can now download and run .ipynb files.

### Run the Notebook
#### Option 1: 
- Click on notebook 
- View raw
- Paste into text editor
- Save with .ipynb extension
- Execute
	- `jupyter notebook $what_you_saved_it_as.ipynb`
#### Option 2:
- Clone this repo
- Execute
	- 	 `jupyter notebook $my_notebook_name.ipynb`

## Project Breakdown


### Web Client
- The webclient uses the Spring Framework. 
- Initially I was explicitly marshlling and unmarshalling the data. Using the following code: 

   Marshal the RentalOrder into XML
	System.out.println("\n\n######### XML Format #########");
	Marshaller m1 = jc.createMarshaller();
	m1.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	m1.marshal(r1, new FileWriter("order.xml"));
	m1.marshal(r1, System.out)
- However after conducting some research and gathering resources from lab 9, I found that Jersey can conduct marshalling automatically once the correct annotatipns are in place.



### RESTful  Web Service
The Restful Service 
### Data Modelling

- The data model consists of four classes. All classes are generated using the XSD. The realtionships between each of the entities are shown in the following diagram.
- insert model db
- The reasoning behind heach of the components is simply what is necessary to facilitate gathering the necessary information to manage car hire bookings. 
- All classes implement  the **Serialializable** interface. This is key to allow for passing of obejcts when using the RMI Database.

### RMI Database Server
 Resources used during project devlopment: 
 - http://slackspace.de/articles/jersey-client-retrieve-list-of-entities/
 - -https://alvinalexander.com/java/java-timestamp-example-current-time-now
 - https://www.baeldung.com/jersey-rest-api-with-spring
