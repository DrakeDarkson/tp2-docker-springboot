FROM openjdk:17-jdk
WORKDIR /app
COPY target/tp2-docker-springboot-0.0.1-SNAPSHOT.jar /app/tp2-docker-springboot.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/tp2-docker-springboot.jar"]