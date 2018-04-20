public class TestRandom {
    public static void showListNumber(int[] listNumber) {
        for (int i = 0; i < listNumber.length; i++) {
            System.out.print(listNumber[i] + " ");
        }
    }

    public static void main(String[] args) {
        int listNumber[] = new int[50];

        //Random 0 - 100
        RandomInterger random = new RandomInterger(0, 100);
        System.out.println("Result: ");

        for (int i = 0; i < 50; i++) {
            listNumber[i] = random.randomInterger();
        }
        showListNumber(listNumber);
    }
}
