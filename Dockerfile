# Etapa 1: build com Maven + JDK 17 (imagem correta)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: runtime com OpenJDK 17 (imagem oficial e leve)
FROM openjdk:17-slim
WORKDIR /app
COPY --from=build /app/target/cidades-inteligentes-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
