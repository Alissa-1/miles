public class Main {
    public static void main(String[] args) {
        int price = 20005;
        int rubPerMile = 20;
        int miles = price / rubPerMile;
        if (price>0) {
            System.out.println("Вам начислено " + miles + " миль");
        } else {
            System.out.println("Неверно указана цена билета");
        }

    }
}
