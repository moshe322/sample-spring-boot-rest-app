FROM openjdk:14

ADD target/sample-rest-app-0.0.1.jar sample-rest-app.jar

ENTRYPOINT ["java","-jar","sample-rest-app.jar"]

