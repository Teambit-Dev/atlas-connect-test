FROM maven:3.8.2-openjdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11-jre-slim
VOLUME /tmp
COPY --from=build /target/integration-plugin-1.0-SNAPSHOT.jar integration-plugin.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","integration-plugin.jar"]