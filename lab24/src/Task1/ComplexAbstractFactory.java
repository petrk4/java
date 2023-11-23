package Task1;

public interface ComplexAbstractFactory {
    // Создание комплексного числа
    Complex createComplex();
    // Создание комплексного числа с указанными действительной и мнимой частями
    Complex createComplex(int real, int image);
}
