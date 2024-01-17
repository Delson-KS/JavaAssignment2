import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static String printData(Iterable<Person> people) {
        StringBuilder result = new StringBuilder();
        String dollar="dollar";
        String tenge="tenge";
        for (Person person : people) {
            if (person instanceof Student) {
                Student student = (Student) person;
                result.append(String.format(student.toString()+' '+student.getPaymentAmount()+" "+tenge+'\n'));
            } else if (person instanceof Employee) {
                Employee employee = (Employee) person;
                result.append(String.format(employee.toString()+' '+employee.getPaymentAmount())+' '+tenge+'\n');
            }
        }
    return result.toString();
    }

    public static void main(String[] args) {
        Person employee1 = new Employee("John", "Lennon", "founder", 200);
        Person employee2 = new Employee("Bill", "Gates", "businessman", 4000000);
        Person student1 = new Student("Alisher", "Bekmurza", 3.67);
        Person student2 = new Student("Yuji", "Itadori", 1.67);

        List<Person> people =  new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);

        System.out.println(printData(people));
    }
}