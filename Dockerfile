FROM eclipse-temurin:21
COPY target/final.jar final.jar
CMD ["java","-jar","final.jar"]