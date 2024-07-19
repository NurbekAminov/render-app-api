FROM eclipse-temurin:17-jdk-alpine
LABEL authors="HP"
VOLUME /tmp
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080