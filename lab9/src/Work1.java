import java.util.Arrays;

class Students {
    private int iDNumber;

    public Students(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber = " + iDNumber +
                '}';
    }
}

public class Work1 {
    public static void main(String[] args) {
        Students[] students = {
                new Students(3),
                new Students(1),
                new Students(5),
                new Students(2),
                new Students(4)
        };

        System.out.println("Unsorted students array: " + Arrays.toString(students));

        // Sort the array using insertion sort based on iDNumber
        insertionSort(students);

        System.out.println("Sorted students array by iDNumber: " + Arrays.toString(students));
    }

    private static void insertionSort(Students[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Students key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key.getIDNumber(),
            // to one position ahead of their current position
            while (j >= 0 && arr[j].getIDNumber() > key.getIDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
