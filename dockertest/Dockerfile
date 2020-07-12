FROM openjdk:8-jre-slim

ADD  target/container-test.jar /usr/share/tag/container-test.jar

# Command line to execute the test
ENTRYPOINT ["/usr/bin/java", "-cp", "/usr/share/tag/container-test.jar", "org.testng.TestNG", "-testclass", "Dockerdemotest.testappff"]