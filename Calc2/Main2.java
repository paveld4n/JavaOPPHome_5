public class Main2 {
public static void main(String[] args) {
// Создание экземпляров модели, представления и презентера
CalculatorModel model = new CalculatorModel();
CalculatorView view = new CalculatorView();
CalculatorPresenter presenter = new CalculatorPresenter(model, view);

    // Обработка действия пользователя  нажатие кнопки "Сложение"
    //presenter.onAddButtonClicked();
    // Обработка действия пользователя  нажатие кнопки "Вычитание"
    //presenter.onSubtracButtonClicked();
    // Обработка действия пользователя  нажатие кнопки "умножение"
    //presenter.onMultipButtonClicked();
    // Обработка действия пользователя  нажатие кнопки "Деление"
    //presenter.onDivisButtonClicked();
    presenter.choice();
}
}
