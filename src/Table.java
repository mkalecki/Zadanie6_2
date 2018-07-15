import java.util.Random;

public class Table {

    public static void main(String[] args) {

        Random random = new Random();

        int[] table = new int[10];
        boolean normal = true;

        for (int i = 0; i < 10; i++)
            if (normal) {
                table[i] = random.nextInt(10);
                System.out.print(table[i] + " ");
                if (i == 9) {
                    normal = false;
                    i = -1;
                    System.out.print("mirror: ");
                }
            }
            else

                System.out.print(table[9 - i] + " ");


    }
}
