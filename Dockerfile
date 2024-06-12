FROM amazoncorretto:17.0.7-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
WORKDIR myapp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
