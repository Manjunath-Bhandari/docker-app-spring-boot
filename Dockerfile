FROM openjdk:17-jdk-alpine
COPY target/docker-app-spring-boot.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-app-spring-boot.jar"]
