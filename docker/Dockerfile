FROM eclipse-temurin:17-jdk-focal
COPY *.jar /root/
WORKDIR /root/
ENTRYPOINT exec java -server -verbose:gc -XX:-PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError $JAVA_OPTS -jar my-app-1.0-SNAPSHOT.jar
