# Use official Java runtime
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy jar file
COPY target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]