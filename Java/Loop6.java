public class Loop6 {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            for(j=4;j>=0;j--){
                if(i<j){
                    System.out.print(" ");
                }
                else if(i>=j){
                    System.out.print("* ");
                }
        }
        System.out.println("");
    }
}
}