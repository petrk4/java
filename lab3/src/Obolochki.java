public class Obolochki {
    public static void main (String[] args) {
        //Task 1
        Double double1 = Double.valueOf("90");
        System.out.println("----Task #1----");
        System.out.println(double1);

        //Task 2
        String str = "117.123";
        double doubletoString = Double.parseDouble(str);
        System.out.println("----Task #2----");
        System.out.println(doubletoString);

        //Task 3
        double db = double1.doubleValue();
        float fl = double1.floatValue();
        int it = double1.intValue();
        long lg = double1.longValue();
        short st = double1.shortValue();
        byte bt = double1.byteValue();

        //Task 4
        System.out.println("----Task #4----");
        System.out.println("double: " + db);
        System.out.println("float: " + fl);
        System.out.println("int: " + it);
        System.out.println("long: " + lg);
        System.out.println("short: " + st);
        System.out.println("byte: " + bt);

        //Task 5
        System.out.println("----Task #5----");
        String dobuleToString = Double.toString(3.14);
        System.out.println(dobuleToString);


    }
}
