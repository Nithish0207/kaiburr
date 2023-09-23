# Kaiburr Assessment


  -NITHISH S
  
  -22MCA0185

  ------

<h3> Task Done - 1,3,4,5 and 6 </h3>

------

### Task 1:

<b>Dependencies Used</b>
1.	spring-boot-starter-web
2.	spring-boot-starter-data-mongodb
3.	spring-boot-maven-plugin
   
<b>The Rest API Endpoints for this project are</b>
1.	PUT (Add the details to the database)
2.	GET (Retrieve all the data)
3.	GET by name (Retrieve the Data using name)
4.	Get by id (Retrieve the data using ID)
5.	Delete (Delete from the Database using ID)
   
We can use tools like Postman or curl or any other HTTP client to interact with your REST API

  •	PUT (create) a server: PUT- http://localhost:8080/servers
  
  Body: JSON representation of the server object.
  
  •	GET all servers: GET- http://localhost:8080/servers
  
  •	GET servers by name: GET- http://localhost:8080/servers/search?name={name}
  
  •	GET a single server by ID: GET- http://localhost:8080/servers/{id}
  
  •	DELETE a server by ID: DELETE- http://localhost:8080/servers/{id}


  ------

### Task 3:

Deployed a Spring Boot application and MongoDB in separate pods within a Kubernetes cluster.</br>

<b>Prerequisites:</b></br>

  •	Docker images for your Spring Boot application and MongoDB.</br>
  •	Kubernetes cluster access (local or managed).</br>
  •	Kubernetes YAML manifests for deployment and service definitions.</br>
  •	A GitHub repository for your project.</br>
  
<p>Before deploying your Spring boot application, dockerize your application. I have created a Docker file that contains target and entry point to excute the jar.</p>
<p>Start the docker and minikube on your local.</p>

  •	<b>MongoDB Deployment:</b> I have created a deployment file specifying the latest MongoDB version. This allows the Kubernetes deployment object to automatically pull and deploy the MongoDB Docker image. It is essential to ensure that a persistent volume is configured to securely store MongoDB data.</br>
  
  •	<b>Spring Boot Application Deployment:</b> Deploy your Spring Boot application in a separate pod using Kubernetes YAML manifests. Configure the application to retrieve MongoDB connection details from environment variables.</br>
  
  •	<b>NodePort Service (Exposure):</b> Expose your Spring Boot application to the external world using a NodePort service. This allows external access to your application. Get the minikube IP from the node and the port where our spring boot application is running.</br>

------

### Task 4
The web user interface (UI) is created for task 1 that allows users to create, display and delete records. The UI has been created using HTML and CSS.</br>

<b>Features:</b></br>
•	Create Records: Users can create new records by filling out a form with relevant information.</br>
•	Display Records: The UI displays existing records in a user-friendly format for easy access.</br>
•	Delete Records: Users have the option to delete records they no longer need.</br>

<b>Technologies Used:</b></br>
•	HTML</br>
•	CSS</br>

<b>Usage:</b></br>
You can use this web UI as a frontend interface for task 1. Make sure your backend is set up to handle the data operations (create, display, delete) that this UI requires.</br>

------

### Task 5
I have created the Continuous Integration and Continuous Deployment (CI/CD) pipeline using GitHub Actions. The pipeline automates the build and deployment process for task 1 and 4.</br>

<b>The CI/CD pipeline consists of the following stages:</b></br>

•	<b>Build:</b> This stage compiles and builds the source code of the task 1 and task 4.</br>

•	<b>Docker Build:</b> The Docker Build creates a Docker image of the application using the Dockerfile provided.</br>

•	<b>Deploy:</b> The CI/CD pipeline that I have created will also deploy the created Docker image to your Docker Hub.</br>

I have defined all the YAML configuration for GitHub Actions workflow in maven.yaml file.</br>

<b>Secrets:</b></br>
To securely store sensitive information like Docker Hub credentials, you can set up secrets in your repository's settings. In this example, we use DOCKER_USERNAME and DOCKER_PASSWORD secrets for Docker Hub authentication. Make sure to replace these with your actual credentials.

------

### Task 6
In this task I have performed the text classification on a consumer complaint dataset. The goal of this task is to categorize consumer complaints into four main categories:</br>
1.	Credit reporting, repair, or other</br>
2.	Debt collection</br>
3.	Consumer Loan</br>
4.	Mortgage</br>

<b>Workflow Steps:</b></br>

•	I start by analyzing the dataset and performing feature engineering to better understand the data and potentially create new features.</br>

•	The text data is prepared through various preprocessing tasks such as tokenization, removing stop words, and handling special characters.</br>

•	<b>Selected Models</b></br>
1.	RandomForestClassifier</br>
2.	LinearSVC</br>
3.	MultinomialNB</br>
4.	LogisticRegression</br>

These are the selected machine learning models based on the preprocessed data for multi-class classification.</br>

•	These models are trained and evaluated to determine which one performs best in classifying consumer complaints.</br>

•	We assess the selected model's performance using relevant evaluation metrics like accuracy, precision, recall, and F1-score.</br>

•	The trained model is used to make predictions on new consumer complaints, assigning them to one of the specified categories based on their content.</br>

<b>Results:</b></br>

The text classification task was performed using several machine learning models, including RandomForestClassifier, LinearSVC, MultinomialNB, and LogisticRegression. Here are some key results:</br>

•	RandomForestClassifier achieved an accuracy of 54.8%.</br>
•	MultinomialNB achieved an accuracy of 68.4%.</br>
•	LogisticRegression achieved an accuracy of 80.5%.</br>
•	<b>LinearSVC (Support Vector Classifier) outperformed the other models with an accuracy of 82.5%.</b></br>

These accuracy scores were obtained through rigorous evaluation using appropriate metrics. The superior performance of the LinearSVC model indicates its effectiveness in categorizing consumer complaints into the specified categories.


