FROM ubuntu:latest

# Install OpenJDK
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY demo/target/demo-1.0.0.jar /app/demo.jar

# Command to run the Java application
CMD ["java", "-jar", "demo.jar"]

