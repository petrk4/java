import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeAndSortStudents {

    public static void main(String[] args) {
        // Создаем два списка данных о студентах
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        // Заполняем списки данными о студентах
        list1.add(new Student("Иван", "Иванов", "Информатика", 3, "Группа A", 85));
        list1.add(new Student("Петр", "Петров", "Математика", 2, "Группа B", 40));
        list1.add(new Student("Мария", "Сидорова", "Физика", 4, "Группа A", 30));

        list2.add(new Student("Елена", "Смирнова", "Биология", 3, "Группа C", 90));
        list2.add(new Student("Андрей", "Козлов", "Химия", 2, "Группа B", 100));

        // Объединяем два списка в один
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        // Сортируем объединенный список по имени
        Collections.sort(mergedList, (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));

        // Выводим отсортированный список
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
