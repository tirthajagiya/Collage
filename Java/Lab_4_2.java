import java.util.*;
    public class Lab_4_2{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int i;
            System.out.println("Enter Sring");
            String str=sc.nextLine();
            int vowel=0,cons=0;
            for(i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(Character.isLetter(ch)){
                    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                        vowel++;
                    }
                }
                else{
                    cons++;
                }
            }
            System.out.println("Vowel:"+vowel);
            System.out.println("Constant:"+cons);
        }
}