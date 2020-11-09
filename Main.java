package com.company;
import java.math.BigInteger;
import java.io.IOException;
import java.util.*;

public class Main {
    static char[] alpha ={'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ы','ь','э','ю','я'};
    static String fileName = "cipher_text.txt";
    static int[] X = new int[5];
    static int[] Y = new int[5];
    public static void fun(char[] alpha, String[] array) {
        XY num = new XY();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int j = 0 ; j < 5 ; j ++) {
            for (int i = 0 ; i < alpha.length; i++) {
                if (alpha[i] == array[j].charAt(0)) {
                    arr1[j] = i;
                }
            }
        }
        for (int j = 0 ; j < 5 ; j ++) {
            for (int i = 0 ; i < alpha.length; i++) {
                if (alpha[i] == array[j].charAt(1)) {
                    arr2[j] = i;
                }
            }
        }
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(num.findXY(arr1[i],arr2[i], alpha.length));
        }
    }
    public static void main(String[] args) throws IOException {
        ReadFile file = new ReadFile(fileName);
        String cipher_text = file.readUsingBufferedReader(fileName);
        /*BigramFinder bigram = new BigramFinder();
          bigram.bigram(cipher_text);*/
        String[] mostPopularBigramm = {"уи", "зц","юк", "цл", "мц"};
        String[] mostPopularBigrammRus = {"ст", "но","то", "на", "ен"};
        int[] mostPopularY = {597, 239, 909, 693, 394};
        int[] mostPopularX = {545, 417, 572, 403, 168};
        for (int i = 0 ; i < 5 ; i++) {
            //arrY[i] = num.findXY((int)mostPopularBigramm[i].charAt(0)-1072, mostPopularBigramm[0].charAt(1)-1072, alpha.length);
            //arrX[i] = num.findXY((int)mostPopularBigrammRus[i].charAt(0)-1072, mostPopularBigrammRus[0].charAt(1)-1072, alpha.length);
        }
        //fun(alpha, mostPopularBigramm);
        //fun(alpha, mostPopularBigrammRus);
        //GCD g = new GCD(mostPopularX[1]-mostPopularX[4],mostPopularY[1]-mostPopularY[3], alpha.length);
        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 1 ; j < 5; j++) {
                    if (j == i || i > j) {
                        continue;
                    }
                for (int k = 0 ; k < 4; k++) {
                    for (int o = 1 ; o < 5; o++) {
                        if (k == o || k > o) {
                            continue;
                        }
                        FindKeyA key = new FindKeyA(mostPopularX[i] - mostPopularX[j], mostPopularY[k] - mostPopularY[o], alpha.length);
                    }
                }

            }
            System.out.println();
        }
        FindKeyA key = new FindKeyA(87,412,31);
        key.findKey(87,412,31);


    }
}
