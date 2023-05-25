public class pgm18 {
    public static void main(String[] args) {
        // System.out.println(345/10);
        // System.out.println(345%10);
        // System.out.println("---");
        // System.out.println(34/10);
        // System.out.println(34%10);
        // System.out.println("----");
        // System.out.println(3/10);
        // System.out.println(4%10);
        int x=3450;
        int y=0,c=0;
        while(x!=0)
        {
            // y=x%10;
            x=x/10;
            c++;
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);

    }

    

}
