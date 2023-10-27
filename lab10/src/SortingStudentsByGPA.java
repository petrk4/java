import java.util.*;

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    public SortingStudentsByGPA(int size) {
        iDNumber = new Student[size];
    }

    public void setArray(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            iDNumber[i] = students[i];
        }
    }

    public void quickSort(Comparator<Student> comparator) {
        quickSort(0, iDNumber.length - 1, comparator);
    }

    private void quickSort(int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivotIndex = partition(low, high, comparator);
            quickSort(low, pivotIndex - 1, comparator);
            quickSort(pivotIndex + 1, high, comparator);
        }
    }

    private int partition(int low, int high, Comparator<Student> comparator) {
        Student pivot = iDNumber[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(iDNumber[j], pivot) >= 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Student temp = iDNumber[i];
        iDNumber[i] = iDNumber[j];
        iDNumber[j] = temp;
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", "Иванов", "Информатика", 3, "Группа A", 85),
                new Student("Петр", "Петров", "Математика", 2, "Группа B", 78),
                new Student("Мария", "Сидорова", "Физика", 4, "Группа A", 92),
                new Student("Елена", "Смирнова", "Биология", 3, "Группа C", 88),
                new Student("Андрей", "Козлов", "Химия", 2, "Группа B", 76)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA(students.length);
        sorter.setArray(students);

        System.out.println("Исходный массив студентов:");
        sorter.outArray();

        // Сортировка по среднему баллу в порядке убывания
        sorter.quickSort(Comparator.comparing(Student::getGpa).reversed());

        System.out.println("\nОтсортированный массив студентов по среднему баллу:");
        sorter.outArray();

        // Сортировка по другому полю, например, по курсу
        sorter.quickSort(Comparator.comparing(Student::getCourse));

        System.out.println("\nОтсортированный массив студентов по курсу:");
        sorter.outArray();
    }
}
