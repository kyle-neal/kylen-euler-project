gradle-build:
	gradle build

run:
	java -jar build/libs/kylen-euler-project.jar

clean-run:
	gradle build
	java -jar build/libs/kylen-euler-project.jar
