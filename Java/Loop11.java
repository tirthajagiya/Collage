public class Loop11 {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            for(j=4;j>=0;j--){
                if(j>i){
                System.out.print(" ");
                }
                else if(j<=i){
                System.out.print("* ");
                }
            }
            System.out.println("");
        }

        for(i=4;i>=0;i--){
            for(j=4;j>=0;j--){
                if(j>=i){
                System.out.print(" ");
                }
                else if(j<i){
                System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}