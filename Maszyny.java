public class Maszyny{
    public static void czasProdukcji(int x, int y, int[] productionSpeed) {
        //x - liczba jednostek towaru, y- liczba maszyn,szukamy minimalnego czasu wyprodukowania
        //i - numer maszyny
        int days=1;
        while (x >0) {
            System.out.println("Dzień: " + days+". Do wyprodukowania zostało " + x);
            for (int i = 0; i < y; i++) {
                if (days % productionSpeed[i] == 0) {
                    x--;
                }
            }
            if(x>0) days++;
        }
        System.out.println("Potrzeba " + days+ " dni.");
    }

    public static void main(String[] args) {
        int [] productionSpeed={1,1,3,3,3};
        czasProdukcji(28, productionSpeed.length, productionSpeed);

    }
}
