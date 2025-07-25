# Use Java 23 base image
FROM openjdk:23-jdk

# Set working directory inside the container
WORKDIR /app

# Copy your built JAR file into the image
COPY build/libs/*.jar app.jar
#
# Run the JAR using Java 23
ENTRYPOINT ["java", "-jar", "app.jar"]