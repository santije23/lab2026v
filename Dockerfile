FROM openjdk:11-ea-19-jre-slim

EXPOSE 8080

ADD target/lab2-2026.jar lab2-2026.jar



ENTRYPOINT ["java","-jar","/lab2-2026.jar"]