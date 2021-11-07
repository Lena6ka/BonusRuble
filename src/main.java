public class main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int refill = 1100;
        int bonus = 0;

        if (refill >= 1000){
            bonus = refill / 100;
        }
        int total = initialAccount + refill + bonus;

        System.out.println("Сумма на счету " + total + " рублей");
    }
}
