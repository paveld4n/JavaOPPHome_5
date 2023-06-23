public class CalculatorPresenter {
    private CalculatorModel model;
private CalculatorView view;

public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
    this.model = model;
    this.view = view;
}
 
public void choice() {
    char oper = view.getUserOper();
    switch (oper){
            case '+':
                onAddButtonClicked();
                break;
            case '-':
                onSubtracButtonClicked();
                break;
            case '*':
                onMultipButtonClicked();
                break;
            case '/':
                onDivisButtonClicked();
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                choice();
    }           
}
public void onAddButtonClicked() {
    double number1 = view.getUserInput();
    double number2 = view.getUserInput();

    model.add(number1, number2);
    double result = model.getResult();

    view.displayResult(result);
}

public void onSubtracButtonClicked() {
    double number1 = view.getUserInput();
    double number2 = view.getUserInput();

    model.subtrac(number1, number2);
    double result = model.getResult();

    view.displayResult(result);
}
public void onMultipButtonClicked() {
    double number1 = view.getUserInput();
    double number2 = view.getUserInput();

    model.multip(number1, number2);
    double result = model.getResult();

    view.displayResult(result);
}
public void onDivisButtonClicked() {
    double number1 = view.getUserInput();
    double number2 = view.getUserInput();

    model.divis(number1, number2);
    double result = model.getResult();

    view.displayResult(result);
}
}
