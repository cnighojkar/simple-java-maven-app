FROM openjdk
COPY target/**.jar my-app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar my-app.jar
