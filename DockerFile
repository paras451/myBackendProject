# --- Stage 1: Build the application JAR ---
# बेस इमेज के रूप में Maven और JDK 21 का उपयोग करें
FROM maven:3.9.6-eclipse-temurin-21 AS builder

# वर्किंग डायरेक्टरी सेट करें
WORKDIR /build

# सभी सोर्स कोड कॉपी करें
COPY . /build

# Maven का उपयोग करके एप्लीकेशन को पैकेज (JAR फ़ाइल) करें, टेस्ट स्किप करें
RUN mvn clean package -DskipTests

# --- Stage 2: Create the final lightweight image (Runtime) ---
# फाइनल इमेज के लिए केवल JRE (Java Runtime Environment) का उपयोग करें
FROM eclipse-temurin:21-jre-slim

# वर्किंग डायरेक्टरी सेट करें
WORKDIR /app

# पहले स्टेज से बनी JAR फ़ाइल को कॉपी करें
COPY --from=builder /build/target/*.jar /app/service.jar

# Spring Boot का डिफ़ॉल्ट पोर्ट
EXPOSE 8080

# कंटेनर शुरू होने पर JAR फ़ाइल चलाने के लिए कमांड
CMD ["java","-jar","/app/service.jar"]