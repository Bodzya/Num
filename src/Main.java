// package name changed to more understandable
import showDesks.Desk;

// Class name that starts the program should be left as Main and stay in the root of the project
public class Main {
    public static void main(String[] args) {
        // create Desk that will show Panels for user
        Desk desk = new Desk();
        // get numbers from user and save them in desk.num1 & desk.num2
        desk.Scan();

        // add +6 to desk.num1 & desk.num2 and save them to newFirstValue & newSecondValue
        int newFirstValue = addSixToNumber(desk.num1);
        int newSecondValue = addSixToNumber(desk.num2);

        // log to console changed values
        System.out.println("k= " + newFirstValue);
        System.out.println("i= " + newSecondValue);

        // show this values for user
       desk.Show(newFirstValue, newSecondValue);
    }

    private static int addSixToNumber(int x) {
        x = x + 6;
        return x;
    }
}