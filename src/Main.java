public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Qizil", "Toyota", 25000, true);
        System.out.println(myCar.toString());

        RightTriangle triangle = new RightTriangle(3, 4, 5);
        System.out.println(triangle.toString());

        Person person = new Person("Aliyev Vali", 30, "Erkak", "Bukhara, Uzbekistan");
        person.printPersonInfo();
        System.out.println(person.toString());
    }
}