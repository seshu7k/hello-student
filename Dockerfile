# Use OpenJDK 21 full image (not alpine)
FROM openjdk:21-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/hello-student-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
