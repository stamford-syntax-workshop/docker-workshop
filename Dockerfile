#official OpenJDK runtime as the base image
FROM openjdk:17-jdk-slim

#Set the working directory inside the container
WORKDIR /app

#Copy the project files into the container
COPY app /app

#Compile the Java program
RUN javac Calculator.java

#Command to run the Java program
CMD ["java", "Calculator"]
