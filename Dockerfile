FROM frolvlad/alpine-oraclejdk8:slim
ADD target/VoxxedSum-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]