package arrays;

import java.util.Arrays;

public class AnagramProblem {

    public static void main(String[] args) {
        AnagramProblem anagramProblem = new AnagramProblem();
        char[] s1 = {'a', 'n', 's'};
        char[] s2 = {'s', 'n'};
        System.out.println(anagramProblem.anagramCompare(s1, s2));
    }

    public boolean anagramCompare(char[] s1, char[] s2) {

        if (s1.length != s2.length) return false;
        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }
}
