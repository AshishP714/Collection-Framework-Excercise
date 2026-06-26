import java.util.*;  
public class Practice {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
       
        list.add("Java");
        list.add("Python");
        list.add("C++");
        
        System.out.println("Programming Languages:");
       
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}
