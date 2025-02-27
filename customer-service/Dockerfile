FROM openjdk:21-jdk-slim
WORKDIR /server
COPY target/customer-service.jar /server/customer-service.jar
CMD ["java", "-jar", "/server/customer-service.jar"]