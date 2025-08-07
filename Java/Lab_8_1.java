public class Lab_8_1{
    public static void main(String[] args){
        try{
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);

            double ans=power(x, y);

            System.out.println(x+"^"+y+"="+ans);
        }

        catch(NumberFormatException e){
            System.out.println("Please Enter A Integer X,Y.");
        }

        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static double power(int x,int y){
        if(x==0 && y<=0){
            throw new IllegalArgumentException("Please Enter A Valid Value Of X,Y");
        }

        if(y<0){
            throw new IllegalArgumentException("Y Negative Value Is NOt Possible");
        }

        double ans=1;
        for(int i=0;i<y;i++){
            ans*=x;
        }

        return ans;
    }
}