package exception.salaryinfo;

import exception.salaryinfo.salaryexception.EmptyDateException;
import exception.salaryinfo.salaryexception.IncorrectDateFormatException;
import exception.salaryinfo.salaryexception.IncorrectDateLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryInfoTest {

    String[] names = new String[]{
            "John",
            "Kate",
            "Andrew",
            "Max"
    };
    String[] data = new String[]{
            "26.04.2019 John 4 50",
            "05.04.2019 Andrew 3 200",
            "10.04.2019 John 7 100",
            "22.04.2019 Kate 9 100",
            "25.06.2019 John 11 50",
            "26.04.2019 Andrew 3 150",
            "13.02.2019 John 7 100",
            "26.04.2019 Kate 9 100",
            "29.04.2020 Max 3 100"
    };

    String dateFrom = "01.04.2019";
    String dateToIncorrect = "3x.004.@Xz02";
    String dateToCorrect = "30.04.2020";

    SalaryInfo info = new SalaryInfo();

    @Test
    public void test_salary_info() {
        try {
            StringBuilder excepted = new StringBuilder().append("Repost for period ")
                    .append(dateFrom).append(" - ")
                    .append(dateToCorrect)
                    .append("\n")
                    .append("John - 900\n")
                    .append("Kate - 1800\n")
                    .append("Andrew - 1050\n")
                    .append("Max - 300\n");
            assertEquals(excepted.toString(), info.getSalaryInfo(names, data, dateFrom, dateToCorrect));
            assertEquals(null, info.getSalaryInfo(names, data, dateFrom, dateToIncorrect));

        } catch (NullPointerException
                | EmptyDateException
                | IncorrectDateFormatException
                | IncorrectDateLengthException ex) {
            System.out.println(ex.getMessage());
        }
    }

}