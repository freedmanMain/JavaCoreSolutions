package exception.salaryinfo;

import exception.salaryinfo.salaryexception.EmptyDateException;
import exception.salaryinfo.salaryexception.IncorrectDateFormatException;
import exception.salaryinfo.salaryexception.IncorrectDateLengthException;

/**
 * Класс, который реализует методы для проверки формата даты.
 * Методы в нем ничего не возвращают, а только генерируют исключения,
 * если такие отлавливаются.
 */

public class DateValidator {

    /**
     * Это поле описывает правильный формат даты.
     */

    private static final String DATE_FORMAT = "00.00.0000";

    /**
     * Генерирует исключение EmptyDateException(), если дата пустая.
     */

    public static void IsNotDateEmpty(String dateFrom, String dateTo) {
        if (dateFrom.isEmpty() || dateTo.isEmpty()) {
            throw new EmptyDateException("Date is empty");
        }
    }

    /**
     * Генерирует исключение IncorrectDateLengthException(), если длина введеной даты неправильная.
     */

    public static void isCorrectDateLength(String dateFrom, String dateTo) {
        if (dateFrom.length() != DATE_FORMAT.length() || dateTo.length() != DATE_FORMAT.length()) {
            throw new IncorrectDateLengthException("Incorrect date length.");
        }
    }

    /**
     * Самый важный метод, который проверяет формат строки.
     * В нём вызываются вспомогательные методы:
     * - countOfDots()
     * - isDateAreDigits()
     * - isCorrectSize()
     * Описание этих методов ниже.
     */

    public static void isCorrectFormatDate(String dateFrom, String dateTo) {
        if (countOfDots(dateFrom) != 2 || countOfDots(dateTo) != 2 ||
                !isDateAreDigits(dateFrom) || !isDateAreDigits(dateTo) ||
                !isCorrectSize(dateFrom) || !isCorrectSize(dateTo)) {
            throw new IncorrectDateFormatException("Incorrect date format.");
        }
    }

    /**
     * Сравнивает размер каждой подстроки до символа '.'.
     */

    private static boolean isCorrectSize(String date) {
        String[] correctFormat = DATE_FORMAT.split(".");
        String[] currentDate = date.split(".");
        for (int i = 0; i < correctFormat.length; i++) {
            if (correctFormat[i].length() != currentDate[i].length()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Проверяет кол-во точек в дате (их должно быть 2).
     */

    private static int countOfDots(String date) {
        int count = 0;
        for (char ch : date.toCharArray()) {
            if (ch == '.') {
                count++;
            }
        }
        return count;
    }

    /**
     * Сравнивает все ли символы в дате цифры.
     */

    private static boolean isDateAreDigits(String date) {
        for (char ch : date.replace(".", "").toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
