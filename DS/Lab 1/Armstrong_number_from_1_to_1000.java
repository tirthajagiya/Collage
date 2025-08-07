public class Armstrong_number_from_1_to_1000 {
    public static void main(String[] args) {
      for(int i=1;i<=1000;i++){
      int a=i;
      int b=i;
      int count=0;
      int ans=0;
      int z=0;
      while(i!=0){
        i=i/10;
        count++;
      }
      
      while(a!=0){
        z=a%10;
        a=a/10;
        ans+=Math.pow(z,count);
      }

      
    if(ans==b){
        System.out.print(ans+",");
    }
      }
    }

}