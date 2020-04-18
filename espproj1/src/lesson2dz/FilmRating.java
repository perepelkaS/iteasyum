package lesson2dz;

public class FilmRating {
    public static void main(String[] args) {
       /* Написать программу, которая для оценки фильма по шкале от 1 до 5 выведет в консоль пояснительный текст (придумать свой).
                Например, оценка: 1, текст: Ужасный.
                Примечания
        Решить задачу нужно двумя способами: с помощью if и с помощью switch
        Счет можно задать просто переменной в начале метода main. Например int score = 1;
        Не забудьте обработать некорректный вариант: так если значение счета будет меньше 1 или больше 5, то программа должна напечатать, что это значение недопустимо.*/

        int rating = 1;
        String description = "";

        if (rating == 1) {
            System.out.println("if - Фильм ужасен");
        } else if (rating == 2) {
            System.out.println("if - Терпимо");
        } else if (rating == 3) {
            System.out.println("if - Под пивас");
        } else if (rating == 4) {
            System.out.println("if - Хороший фильм");
        } else if (rating == 5) {
            System.out.println("if - Отличный фильм");
        } else {
            System.out.println("if - Недопустимое значение");
        }

        switch (rating) {
            case 1:
                description = "Фильм ужасен";
                break;
            case 2:
                description = "Терпимо";
                break;
            case 3:
                description = "Под пивас";
                break;
            case 4:
                description = "Хороший фильм";
                break;
            case 5:
                description = "Отличный фильм";
                break;
            default:
                description = "Недопустимое значение";
        }
        System.out.println("switch - " + description);

    }
}
