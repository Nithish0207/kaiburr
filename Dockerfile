FROM openjdk:17
EXPOSE 8080
ADD target/kaiburr-assessment-task_5.jar kaiburr-assessment-task_5.jar
ENTRYPOINT ["java", "-jar", "/kaiburr-assessment-task_5.jar"]

#jar created