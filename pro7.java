
// 21CE019-Darshan Chavda
//             1
//           1 2 1
//          1 2 4 2 1
//         1 2 4 8 4 2 1
//       1 2 4 8 16 8 4 2 1
//     1 2 4 8 16 32 16 8 4 2 1
// 1 2 4 8 16 32 64 32 16 8 4 2 1
import java.util.*;
public class pro7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k * 2;
            }
            k = k / 4;
            for (int j = 1; j < i; j++) {
                System.out.print(k + " ");
                k = k / 2;
            }System.out.println();
        }
    }
}