package showDesks;
 import javax.swing.JOptionPane; 
public class Desk {
	public int num1, num2;
	String firstValue, secondValue;

    // this method uses for ask numbers and save them in num1 & num2
	public void Scan() {
        firstValue = JOptionPane.showInputDialog("Введіть перше число");
        secondValue = JOptionPane.showInputDialog("Введіть друге число");
        num1 = Integer.parseInt(firstValue);
        num2 = Integer.parseInt(secondValue);
    }

    // when this method calls we show result for user (with numbers which set in brackets)
    // Example desk.Show(102, 203) => show 102 & 203 for user
    public void Show(int num1, int num2) {
        JOptionPane.showMessageDialog(null,"Тепер ваше перше число = " + num1);
        JOptionPane.showMessageDialog(null,"Тепер ваше перше число = " + num2);
    }
}
