
# ---- Build stage ----
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Kopieer Maven wrapper en pom.xml eerst (snellere caching)
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Download dependencies (cache layer)
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

# Kopieer de rest van de code
COPY src src

# Build de jar
RUN ./mvnw clean package -DskipTests


# ---- Run stage ----
FROM eclipse-temurin:21-jre
WORKDIR /app

# Kopieer de jar uit de build stage
COPY --from=build /app/target/*.jar app.jar

# Spring Boot luistert standaard op port 8080
EXPOSE 8080

# Start de app
ENTRYPOINT ["java", "-jar", "app.jar"]