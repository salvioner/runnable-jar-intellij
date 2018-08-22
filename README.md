# Runnable Jar
#### Wrap any Java project with a runnable Jar!

(works with IntelliJ IDEA)

## Instructions

1) Add your sources in 'src' folder

2) Import libraries:
	- in "File > Project Structure (Maiusc+ Ctrl + Alt + S) > Libraries" click the '+' icon and add your libraries;
	- in the same window, go to "Artifacts > runnable jar" and press the '+'  symbol in the 'Output Layout' pane.
	- add all your dependencies as "Extracted Directory" items; IntelliJ will extract the content of all the .jar 
	dependencies in the root of your runnable .jar file
	- if you have a Main class, set its name in the `Main Class` field
	- if your JAR depends on **external** resources (images, libraries, etc. that are **NOT packaged inside
	 the JAR itself**), set the path to these resources in the `Class Path` field

3) Run the "run Main" configuration: the JAR file will be created inside folder `/out/artifacts/jar`.
	- you can automatically build your JAR file with any run configuration. Just go to the Configuration settings 
	and add a task under "Before launch". Select "build artifact" and tick "runnable jar".

4) To run your .jar file go to the `/out/artifacts/jar` folder and run

	    java -jar runnableJar.jar
