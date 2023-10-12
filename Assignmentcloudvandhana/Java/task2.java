import java.util.*;
public class task2 {
    public int value(char c) {
        if (c == 'I'){
            return 1;
        } 
        if (c == 'V'){
            return 5;
        } 
        if (c == 'X'){
            return 10;
        }    
        if (c == 'L'){
            return 50;
        } 
        if (c == 'C'){
            return 100;
        }
        if (c == 'D'){
            return 500;
        } 
        if (c == 'M'){
            return 1000;
        }
        return -1;
    }
    public int conversion(String s) {
        int total = 0;
        for (int i=0; i<s.length(); i++) {//XVI
            int s1 = value(s.charAt(i));//X-->10 --- V-->5 --- I-->1

            if (i+1 <s.length()) {
                int s2 = value(s.charAt(i+1));//V-->5 --- I-->1

                if (s1 >= s2) {//10>5 --- 5>1

                    total = total + s1;//10+5=15
                } else {
                    total = total - s1;
                }
            } 
            else {
                total = total + s1;//15+1=16
            }
        }
        return total;//16
    }
    public static void main(String[] args) {
        task2 t = new task2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roman number: ");
        String s=sc.next();
        System.out.println("The corresponding Integer value is: "+t.conversion(s));
    }
}
