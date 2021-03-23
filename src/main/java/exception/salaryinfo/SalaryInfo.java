package exception.salaryinfo;

import exception.salaryinfo.salaryexception.EmptyDateException;
import exception.salaryinfo.salaryexception.IncorrectDateFormatException;
import exception.salaryinfo.salaryexception.IncorrectDateLengthException;

import java.util.LinkedList;
import java.util.List;

/**
 * Класс SalaryInfo умеет обрабатывать входные данные
 * массив имен, массив данных, а также даты, его метод getSalaryInfo()
 * возвращает отформатированую строку в виде списка ИМЯ - ЗАРПЛАТА
 * за определенный период.
 */

public class SalaryInfo {

    /**
     * Основной метод этого класса, в котором вызываеться множество других вспомогательных методов.
     * Метод принимает массив имен, а также массив данных и почти вся работа сосредоточена вокруг них.
     * Весь метод реализован в конструкции try{} catch(){} и очень строго следит за введеными даными.
     * Генерирует множество исключений т.к EmptyDateException, IncorrectDateLengthException
     * IncorrectDateFormatException и NullPointerException, если одно из
     * таких исключений будет сгенерировано, то метод вернет null.
     */

    public String getSalaryInfo(String[] names, String[] data, String dateFrom, String dateTo) {
        try {
            checkDatesFormat(dateFrom, dateTo);
            StringBuilder report = new StringBuilder()
                    .append("Repost for period ")
                    .append(dateFrom).append(" - ")
                    .append(dateTo)
                    .append("\n");
            for (String name : names) {
                report.append(name).append(" - ")
                        .append(getSalaryByName(name, getListOfDates(data, dateFrom, dateTo)))
                        .append("\n");
            }
            return report.toString();
        } catch (NullPointerException | EmptyDateException | IncorrectDateLengthException | IncorrectDateFormatException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    /**
     * Этот метод проверяет формат даты.
     * В него помещены три метода из класса DateValidator
     * UPD: скорее всего последовательность их вызовов менять не стоит
     * т.к может привести к неккоректной работе.
     */

    private void checkDatesFormat(String dateFrom, String dateTo) {
        DateValidator.IsNotDateEmpty(dateFrom, dateTo);
        DateValidator.isCorrectDateLength(dateFrom, dateTo);
        DateValidator.isCorrectFormatDate(dateFrom, dateTo);
    }

    /**
     * Метод возвращает целочисленный результат переменной salary (зарплаты)
     * текущего сотрудника. В нём также вызываеться метод getSalary, который
     * выполняет совсем другую работу и calculateSalaryByName.
     * getSalaryByName возвращает суммированый результат доходов конкретного сотрудника.
     */

    private int getSalaryByName(String name, List<String> dates) {
        int salary = 0;
        for (String date : dates) {
            if (date.indexOf(name) > 0) {
                salary += calculateSalaryByName(getSalary(date));
            }
        }
        return salary;
    }

    /**
     * Здесь рассчитывается значение доходов конкретного пользователя.
     * Метод получает строку date, которая делиться на пробелы и помещаеться в массив.
     * 2 и 3 элемент которого преобразуем в Integer.
     */

    private int calculateSalaryByName(String date) {
        String[] args = date.split(" ");
        return Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
    }

    /**
     * Метод возвращает список дат, которые входят в диапозон от dateFrom до dateTo.
     * Также в методе вызывается вспомогательный метод getNameAndSalary().
     * В конструкции if мы ищем вхождение подстроки в массиве data.
     * Подстрока - является строкой с вырезаными первыми тремя символами,
     * т.к нам нужно искать даты ориентируясь только по месяцу и году.
     */

    private List<String> getListOfDates(String[] data, String dateFrom, String dateTo) {
        List list = new LinkedList();
        for (String date : data) {
            if (date.indexOf(getNameAndSalary(dateFrom)) > 0 || date.indexOf(getNameAndSalary(dateTo)) > 0) {
                list.add(date);
            }
        }
        return list;
    }

    /**
     * Метод просто возвращает подстроку игнорируя первые 3 символа в строке date.
     * ПРИМЕР: date = 00.00.0000 => 00.0000
     */

    private String getNameAndSalary(String date) {
        return date.substring(2);
    }

    /**
     * Метод просто возвращает подстроку из строки date.
     * Это подстрока будет являться строкой из чисел, которые будут доходом
     * конкретного человека, а также кол-вом, сколько раз эта сумма была выплачена.
     */

    private String getSalary(String date) {
        return date.substring(date.indexOf(" ") + 1);
    }
}
