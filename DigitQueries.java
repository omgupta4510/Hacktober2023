import java.util.Scanner; 
public class DigitQueries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q= sc.nextInt();
        while(q-->0){
            long k=sc.nextLong();
            long a=1;
            long c=1;
            long num=9;
            long sum=0;
            while(true){
 
                if(k<=sum){
                    c--;
                    a=a/10;
                    k=sum-k;
                    k=num-k;
                    int  index=(int)(k%c);
                    k=(k+(c-1))/c;
                    long  i=a+(k-1);
                    String st=Long.toString(i);
                    if(index==0)index=(int)(c-1);
                    else index-=1;
                    System.out.println(st.charAt(index));
                    break;
                }
                num=9*a*c;
                sum+=num;
                a*=10;
                c++;
            }
        }
    }
