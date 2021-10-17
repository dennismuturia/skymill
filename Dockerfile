
FROM maven:3.8.3-jdk-11 AS build
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package


FROM openjdk:11
COPY --from=build /tmp/target/shymill_test-1.0-SNAPSHOT.jar maven-docker.jar
ENTRYPOINT ["java", "-jar","maven-docker.jar"]
EXPOSE 8083
#ADD target/shymill_test-1.0-SNAPSHOT.jar maven-docker.jar
#ENTRYPOINT ["java", "-jar","maven-docker.jar"]
#EXPOSE 8083