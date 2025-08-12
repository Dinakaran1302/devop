FROM eclipse-temurin:17
COPY target/final.jar final.jar
CMD ["java","-jar","final.jar"]