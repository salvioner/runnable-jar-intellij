package io.chino;

public class Main {

    private static String instructions =
            "Runnable Jar" +
            "Wrap any Java project with a runnable JAR!\n" +
            "\n" +
            "1) Add your sources in 'src' folder\n" +
            "2) Import libraries:\n" +
            "\t- in \"File > Project Structure (Maiusc+ Ctrl + Alt + S) > Libraries\" click the '+' icon and add your libraries;\n" +
            "\t- in the same window, go to \"Artifacts > runnable jar\" and press the '+'  symbol in the 'Output Layout' pane.\n" +
            "\t- add all your dependencies as \"Extracted Directory\" items; IntelliJ will extract the content of the .jar dependencies in the root of your runnable .JAR file\n" +
            "\t- if you have a Main class, set its name in the \"Main Class\" field\n" +
            "\t- if your JAR depends on EXTERNAL resources (images, libraries, etc. that are NOT packaged inside the JAR itself), set the path to these resources in the \"Class Path\" field\n" +
            "3) Run the \"run Main\" configuration: the JAR file will be created inside folder \"/out/artifacts/jar\".\n" +
            "\t- you can automatically build your JAR file with any run configuration. Just go to the Configuration settings and add a task under \"Before launch\". Select \"build artifact\" and tick \"runnable jar\".\n" +
            "4) To run your .jar file go to the \"/out/artifacts/jar\" folder and run\n" +
            "\tjava -jar runnableJar.jar\n";

    public static void main(String s[]) {
        /* application entry point - edit this method as you wish */

        System.out.println(instructions);
    }
}
