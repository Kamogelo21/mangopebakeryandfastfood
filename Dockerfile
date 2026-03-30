# Use official OpenJDK image
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml first (for caching)
COPY mvnw pom.xml ./
COPY .mvn .mvn

# Copy source code
COPY src src

RUN apt-get update && apt-get install -y maven && mvn clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/mangopebakeryandfastfood-0.0.1-SNAPSHOT.jar"]