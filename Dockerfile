FROM adoptopenjdk/openjdk11

WORKDIR /usr/src/app

COPY ./build/libs/docker-practice-0.0.1-SNAPSHOT.jar /build/libs/docker-practice-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "/build/libs/docker-practice-0.0.1-SNAPSHOT.jar"]
