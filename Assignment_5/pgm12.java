import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pgm12 
{
    public static void main(String[] args) 
    {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) 
    {
        List<Integer> x1= new ArrayList<>();
            x1.add(0);
           for(int i=0;i<gain.length;i++)
           { 
               x1.add(0,gain[i]);
           }
           Collections.reverse(x1);
           System.out.println(x1);
           int i=0,sum=0,z=0;
           int[] target= new int[x1.size()];
        while(i<x1.size())
           {
            sum+=x1.get(i);
            target[i]=sum;
            i++;
            //System.out.println(sum);
           }
           for(int i1=0;i1<target.length;i1++)
           {
                if(target[i1]>z)
                    z=target[i1];
           }
        return z;
    }
}