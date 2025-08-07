public class Loop12 {
    public static void main(String[] args){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(i>j){
                    System.out.print(" ");
                }
                else if(i<=j){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

        for(i=3;i>=0;i--){
            for(j=0;j<5;j++){
                if(i>j){
                    System.out.print(" ");
                }
                else if(i<=j){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
