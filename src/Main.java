public class Main {
    public static void main(String[] args) {

        int cost = 13_676; // стоимость билета
        int mile = 20;// количество рублей за одну бонусную милю
        int value = cost / mile;      // количество бонусных миль

        System.out.println(value);
    }
}