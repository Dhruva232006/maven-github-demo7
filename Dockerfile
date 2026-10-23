
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/maven-github-demo7-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-cp", "app.jar", "com.example.maven_github_demo7.App"]
