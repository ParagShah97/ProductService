FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} productservice.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/productservice.jar"]

