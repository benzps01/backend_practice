FROM maven:3.9.8-amazoncorretto-21 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/tasks-0.0.1-SNAPSHOT.jar task.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","task.jar" ]