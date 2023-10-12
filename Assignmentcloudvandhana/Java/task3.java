public class task3  {  
  
    public static void test(String s)  {  
        s = s.toLowerCase();  
        boolean a = true;  
        for (char c = 'a'; c <= 'z'; c++)   {   
            if (!s.contains(String.valueOf(c)))   
            {  
                a = false;  
                break;  
            }  
        }  
        if (a)  {
            System.out.println("Pangram String");
        }
        else  {
            System.out.println("Not a Pangram String");
        }    
    }  
    public static void main(String[] args)  {  
    
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
        test(s);  
    }  
}
