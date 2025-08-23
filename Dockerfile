# ---------- Build Stage ----------
FROM maven:3.9.3-eclipse-temurin-17 AS build

WORKDIR /app

# Copy pom.xml first to cache dependencies
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the Spring Boot JAR (skip tests for faster build)
RUN mvn clean package -DskipTests

# ---------- Runtime Stage ----------
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy JAR from build stage
COPY --from=build /app/target/backend-portfolio-1.0.0-.jar.original app.jar

# Expose port (Spring Boot default)
EXPOSE 8080

# Command to run the app
ENTRYPOINT ["java","-jar","app.jar"]
