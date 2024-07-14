FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk
COPY . .
RUN ./mvnw spring-boot:run

FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY --from=build /target/RiwiMarket-0.0.1.jar app.jar

ENTRYPOINT [ "java","-jar","app.jar" ]