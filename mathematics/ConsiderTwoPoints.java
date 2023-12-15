import java.util.Scanner;

public class ConsiderTwoPoints {

    static int[] findPoint(int px, int py, int qx, int qy) {
        int rx = 2 * qx - px;
        int ry = 2 * qy - py;
        return new int[]{rx, ry};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int px = scanner.nextInt();
            int py = scanner.nextInt();
            int qx = scanner.nextInt();
            int qy = scanner.nextInt();

            int[] result = findPoint(px, py, qx, qy);
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
