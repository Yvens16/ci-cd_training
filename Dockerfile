FROM eclipse-temurin:17
RUN mkdir /opt/app
ADD target/ci_cd_training.jar ci_cd_training.jar
CMD ["java", "-jar", "/ci_cd_training.jar"]
