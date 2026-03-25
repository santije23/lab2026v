# Etapa de construcción
FROM maven:latest AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11-ea-19-jre-slim
WORKDIR /app
# Copia el JAR de la etapa 'build' a la etapa actual
COPY --from=build /app/target/lab2-2026.jar lab2-2026.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","lab2-2026.jar"]