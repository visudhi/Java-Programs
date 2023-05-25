import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pgm21 {
    public static void main(String[] args) {
        int[] arr={9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr, 806));
        
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> z= new ArrayList<Integer>();
        List<Integer> z1= new ArrayList<Integer>();
        double sum=0,y=0;
        for(int i=0;i<num.length;i++)
        {
            z.add(num[i]);
           
        }
        System.out.println(z);//1,2,0,0
        
        {
            
            for(int i=0;i<z.size();i++)
            {
                sum=sum*10+(z.get(i));
                
            }
            
        }
        sum+=k;
        System.out.println(sum);

        while(sum!=0)
        {
        for(int i=0;i<z.size();i++)
        {
            
            
           
            y=sum%10;
            
            z1.add(i,(int) y);
            sum=sum/10;
            

        }
        }
        Collections.reverse(z1);
       
        while (z1.get(z1.size()-1) == 0) {
            z1.remove(z1.size()-1);
        }

        Collections.reverse(z1);
        
        return z1;
        // return Arrays.stream(num).boxed().toList();
    }

}
