package task2;
import java.util.ArrayList;
import java.util.List;

public class MainTask2 {
    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();
        staff.add(new Developer("Sara", 50000, 8000));
        staff.add(new SalesManager("Bilal", 40000, 200000, 0.05));
        staff.add(new Developer("Hamza", 55000, 7000));

        for (Employee e : staff) {
            System.out.println(e.getName() + " -> Pay: " + e.calculatePay());
        }
    }
}
