package MVC_project;

import java.util.Scanner;

/**
 * Created by User on 19.08.2021.
 *
 * @author Mihail Gerashchenko
 */
public class Controller {


    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setString(inputStringValueWithScanner(sc));
        view.printMessageAndString(View.OUR_STRING, model.getString());
    }

    public String inputStringValueWithScanner(Scanner sc) {
        StringBuilder sb = new StringBuilder();
        view.printMessage(View.INPUT_FIRST_STRING);
        for (; !sc.hasNext(View.HELLO); ) {
            view.printMessage(View.WRONG_DATA + View.INPUT_FIRST_STRING);
            sc.next();
        }
        sb.append(sc.next()).append(" ");

        view.printMessage(View.INPUT_SECOND_STRING);
        for (; !sc.hasNext(View.WORLD); ) {
            view.printMessage(View.WRONG_DATA + View.INPUT_FIRST_STRING);
            sc.next();
        }
        sb.append(sc.next());
        return sb.toString();
    }
}
