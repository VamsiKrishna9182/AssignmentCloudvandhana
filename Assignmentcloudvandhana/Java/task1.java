import java.util.*;
public class task1 {
    public static void test(int[] n){
        List<Integer> l = new ArrayList<>();
        for (int i : n) {
            l.add(i);
        }
        Collections.shuffle(l);
        for (int i = 0; i < l.size(); i++) {
            n[i] = l.get(i);
        } 
        for(int e: n){
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        int[] n={1,2,3,4,5,6,7};
        test(n);
    }
}
