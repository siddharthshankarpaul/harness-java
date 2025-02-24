# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/sid-harness-java.jar /app/app.jar

EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
