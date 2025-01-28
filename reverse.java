import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String a=sc.nextLine();
        //sc.close();
        String b="";//
        for(int i =a.length()-1;i>=0;i--){
            b=b+a.charAt(i);//StringBuilder b = new StringBuilder(); STRINGBUILDER IS TO CONCATINATE TWO STRINGS INSTEAD OF USING+

        }
        System.out.println("reverse of the string:"+b);//b.tostring();TOSTRING IS TO EXTRACT THE OBJECT TO STRING
    }
    
}
