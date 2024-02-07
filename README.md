<br />
<div align="center">
<h3 align="center">MESSENGER MICROSERVICE FOR PLAZOLETA SERVICE</h3>

</div>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
* ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)

## About the Project

This is a microservice in charge of sending SMS messages to clients.

<!-- GETTING STARTED -->
## Getting Started

To view how the project works go to https://messenguer-microservice-small-square-app.onrender.com/swagger-ui/index.html

To get a local copy up and running, follow these steps.

### Prerequisites

* JDK 17 [https://jdk.java.net/java-se-ri/17](https://jdk.java.net/java-se-ri/17)
* Gradle [https://gradle.org/install/](https://gradle.org/install/)
* have a twilio account https://www.twilio.com/login
* You must have a restaurant linked to the sender tulio and a customer with the number you registered in tulio

### Recommended Tools
* IntelliJ Community [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
* Postman [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

### Installation
1. Clone the repository
2. Open project
3. Create a new database in MongoDB
4. update environment variables
   - SERVER_PORT= 8094;
   - ACCOUNT_SID= ;
   - AUTH_TOKEN= ;
   note: ACCOUNT_SID and AUTH_TOKEN are twilio environment variables

<!-- USAGE -->
## Usage
1. Right-click the class PowerUpApplication and choose Run
2. Open [http://localhost:8094/swagger-ui/index.html](http://localhost:8094/swagger-ui/index.html) in your web browser

<!-- ROADMAP -->
## Tests
- Right-click the test folder and choose Run tests with coverage