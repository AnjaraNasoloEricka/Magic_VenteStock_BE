# Use an official Maven image to build the application
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Clone the Spring Boot repository from GitHub
RUN git clone https://github.com/AnjaraNasoloEricka/Magic_VenteStock_BE.git .
RUN git pull

# Build the application using Maven
RUN mvn clean package -DskipTests

# Use an official OpenJDK runtime as a base image for running the app
FROM openjdk:17-jdk-slim

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port that the app will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "app.jar"]