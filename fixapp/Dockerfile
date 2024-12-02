
FROM openjdk:17-jdk



RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY /target/fixapp-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]

# docker build -t testeimagen:1.0 .
