FROM openjdk:8
ADD target/entrevoisins.jar entrevoisins.jar
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "entrevoisins.jar"]