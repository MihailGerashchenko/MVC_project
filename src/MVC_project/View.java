package MVC_project;

/**
 * Created by User on 19.08.2021.
 *
 * @author Mihail Gerashchenko
 */
public class View {

    public static final String INPUT_FIRST_STRING = "Input first word :";
    public static final String INPUT_SECOND_STRING = "Input second word :";
    public static final String WRONG_DATA = "Wrong data! Repeat please! ";
    public static final String OUR_STRING = "The demanded word is = ";
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndString(String message, String string) {
        System.out.println(message + string);
    }
}
