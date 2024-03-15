# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app

# Copy the source code
COPY src /app/src
COPY pom.xml /app

# Build the application
RUN mvn clean package

# Stage 2: Run the application
FROM openjdk
WORKDIR /app

# Copy the built artifact from the build stage
COPY --from=build /app/target/*.jar /app/app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
