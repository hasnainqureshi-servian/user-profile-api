# Start with a base image containing Java runtime
FROM openjdk:8-jdk-slim

# Add Maintainer Info

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080/tcp

# The application's jar file
ARG JAR_FILE=target/swagger-spring-1.0.0.jar

# Add the application's jar to the container
ADD ${JAR_FILE} swagger-spring-1.0.0.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/swagger-spring-1.0.0.jar"]