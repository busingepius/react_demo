package answer2;

import answer2.prob2A.GradleReport;
import answer2.prob2A.Student;
import answer2.prob2B.Order;
import answer2.prob2B.OrderLine;

import java.util.List;

public class Main{
    public static void main(String[] args) {
        Student student = new Student("Bob");
        GradleReport gradleReport = student.getGradleReport();
        System.out.println(gradleReport);

        Order order = new Order(123);
        List<OrderLine> orderLineList = order.getOrderLine();
        System.out.println(orderLineList);
    }
}