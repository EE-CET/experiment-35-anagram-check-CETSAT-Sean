import java.util.*;
public class AnagramCheck {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String s1 = sc.next();
                String s2 = sc.next();
                s1 = s1.toLowerCase();
                s2 = s2.toLowerCase();
                char[] string1 = s1.toCharArray();
                Arrays.sort(string1);
                char[] string2 = s2.toCharArray();
                Arrays.sort(string2);
                System.out.println(Arrays.equals(string1, string2));
                sc.close();
        }

}
