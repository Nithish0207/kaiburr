FROM openjdk:8
EXPOSE 8080
ADD target/assessment-update.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
