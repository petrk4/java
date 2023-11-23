// Класс исключения при отсутствии студента
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

// Класс исключения при пустой строке
class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}

// Класс студента
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Класс управления лабораторией (список студентов)
class LabClass {
    private Student[] students;

    public LabClass(Student[] students) {
        this.students = students;
    }

    public Student findStudentByName(String name) throws StudentNotFoundException {
        if (name.isEmpty()) {
            try {
                throw new EmptyStringException("Имя студента не может быть пустым!");
            } catch (EmptyStringException e) {
                e.printStackTrace();
            }
        }

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с именем " + name + " не найден!");
    }

    // Здесь могут быть методы для сортировки студентов
}

// Пользовательский интерфейс
class LabClassUI {
    private LabClass labClass;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    public void searchStudent(String name) {
        try {
            Student foundStudent = labClass.findStudentByName(name);
            System.out.println("Студент " + foundStudent.getName() + " найден!");
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

// Пример использования
public class LabClassDriver {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иванов"),
                new Student("Петров"),
                new Student("Сидоров")
                // Добавьте остальных студентов
        };

        LabClass labClass = new LabClass(students);
        LabClassUI labClassUI = new LabClassUI(labClass);

        labClassUI.searchStudent("Иванов");
        labClassUI.searchStudent("Пакетов");
        labClassUI.searchStudent("Сидоров");
    }
}
