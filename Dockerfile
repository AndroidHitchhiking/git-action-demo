FROM adoptopenjdk/jdk-11.0.9_11-alpine

EXPOSE 8089

COPY ./target/git-action-demo-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "java-app-1.0-SNAPSHOT.jar"]