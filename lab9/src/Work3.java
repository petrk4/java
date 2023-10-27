import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class StudentInf {
    private String name;
    private double gpa;

    public StudentInf(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class Work3 {
    public static void main(String[] args) {
        List<Student> list1 = Arrays.asList(
                new Student("Alice", 3.8),
                new Student("Bob", 3.5),
                new Student("Charlie", 3.9)
        );

        List<Student> list2 = Arrays.asList(
                new Student("David", 3.7),
                new Student("Eve", 3.6)
        );

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        List<Student> mergedList = mergeSortStudents(list1, list2);

        System.out.println("Merged and sorted list: " + mergedList);
    }

    private static List<Student> mergeSortStudents(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getGpa() >= student2.getGpa()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
