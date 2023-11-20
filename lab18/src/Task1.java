/*public class Task1 {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );
    }
}*/
/*  В исходной программе, когда выполняется метод exceptionDemo(), происходит деление на ноль (2 / 0), что приводит к
исключению java.lang.ArithmeticException. Это происходит потому, что деление на ноль не допускается в математике,
и Java генерирует исключение в таких случаях.
*/

public class Task1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}

/*
После замены 2/0 на 2,0 / 0,0, программа также вызывает деление на ноль (2.0 / 0.0), что также приводит к исключению
java.lang.ArithmeticException. Поэтому поведение остается тем же.
*/

/*
В измененной программе, где добавлен блок try-catch, происходит следующее:
1) Внутри блока try выполняется деление 2/0, и возникает исключение java.lang.ArithmeticException.
2) Затем, в блоке catch, обрабатывается это исключение, и вместо того, чтобы программа завершилась с ошибкой, будет
выведено сообщение "Attempted division by zero".
*/