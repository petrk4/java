import java.util.Comparator;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
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

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Sort in descending order of GPA
        return Double.compare(student2.getGpa(), student1.getGpa());
    }
}

public class Work2 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.8),
                new Student("Bob", 3.5),
                new Student("Charlie", 3.9),
                new Student("David", 3.7),
                new Student("Eve", 3.6)
        };

        System.out.println("Unsorted students array:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the students array using quick sort based on GPA
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        quickSort(students, sorter);

        System.out.println("\nSorted students array by GPA (descending order):");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void quickSort(Student[] arr, Comparator<Student> comparator) {
        quickSortHelper(arr, comparator, 0, arr.length - 1);
    }

    private static void quickSortHelper(Student[] arr, Comparator<Student> comparator, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, comparator, low, high);

            quickSortHelper(arr, comparator, low, partitionIndex - 1);
            quickSortHelper(arr, comparator, partitionIndex + 1, high);
        }
    }

    private static int partition(Student[] arr, Comparator<Student> comparator, int low, int high) {
        Student pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(arr[j], pivot) > 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}