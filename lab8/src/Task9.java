public class Task9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        long result = countSequences(a, b);
        System.out.println("Количество последовательностей: " + result);
    }

    public static long countSequences(int a, int b) {
        // Базовый случай: если не осталось нулей или единиц, то есть только одна последовательность
        if (a == 0 || b == 0) {
            return 1;
        }

        // Рекурсивный случай: вычисляем количество последовательностей, разбив a и b на подпроблемы
        long sequencesWithoutZero = countSequences(a, b - 1);

        long sequencesWithoutTwoConsecutiveZeros = 0;
        if (a >= 2) {
            sequencesWithoutTwoConsecutiveZeros = countSequences(a - 2, b);
        }

        // Общее количество последовательностей - сумма двух вышеуказанных случаев
        return sequencesWithoutZero + sequencesWithoutTwoConsecutiveZeros;
    }
}
