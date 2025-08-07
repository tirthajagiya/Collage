public class Loop7 {
    public static void main(String[] args) {
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
    }
}
