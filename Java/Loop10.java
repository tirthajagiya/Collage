public class Loop10 {
    public static void main(String[] args){
        int i,j;
        for(i=1;i<6;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(5-i);
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(i=5;i>0;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(5-i);
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
