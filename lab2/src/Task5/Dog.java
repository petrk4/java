package Task5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + ", age " + this.age;
    }

    public void intoHumanAge() {
        System.out.println(name + "'s age in human yaers is " + age * 7 + " years");
    }
}