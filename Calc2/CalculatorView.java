import java.util.Scanner;

public class CalculatorView {
    public void displayResult(int result) {
System.out.println("Результат: " + result);

}


public int getUserInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int input = scanner.nextInt();
    //scanner.close();
    return input;
    
}   

public char getUserOper() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите математическую операция которую хотите выполнить: + или - или * или / .");
    System.out.print("Ваш выбор: ");
    char op = scanner.next().charAt(0);
    //scanner.close();
    return op;
    
}   

}

