import java.util.*;
 
public class CreatingStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder st= new StringBuilder(sc.next());
        check(0,st);
        System.out.println(set.size());
        Collections.sort(lt);
        for(String i:lt){
            System.out.println(i);
        }
    }
    public static HashSet<String> set=new HashSet<>();
    public static ArrayList<String > lt=new ArrayList<>();
    public static void check(int index,StringBuilder ch){
        if(index>=ch.length()){
            String str=ch.toString();
            if(set.add(str)){
                lt.add(str);
            }
            return;
        }
        for(int i=index;i<ch.length();i++){
            //Swapping of elements of String
            char temp=ch.charAt(i);
            ch.setCharAt(i,ch.charAt(index));
            ch.setCharAt(index,temp);
            check(index+1,ch);
           temp=ch.charAt(i);
            ch.setCharAt(i,ch.charAt(index));
            ch.setCharAt(index,temp);
        }
    }
}
