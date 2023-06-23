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
    int number1 = view.getUserInput();
    int number2 = view.getUserInput();

    model.add(number1, number2);
    int result = model.getResult();

    view.displayResult(result);
}

public void onSubtracButtonClicked() {
    int number1 = view.getUserInput();
    int number2 = view.getUserInput();

    model.subtrac(number1, number2);
    int result = model.getResult();

    view.displayResult(result);
}
public void onMultipButtonClicked() {
    int number1 = view.getUserInput();
    int number2 = view.getUserInput();

    model.multip(number1, number2);
    int result = model.getResult();

    view.displayResult(result);
}
public void onDivisButtonClicked() {
    int number1 = view.getUserInput();
    int number2 = view.getUserInput();

    model.divis(number1, number2);
    int result = model.getResult();

    view.displayResult(result);
}
}
