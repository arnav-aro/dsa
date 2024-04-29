import java.util.*; 
public class StrPalindrome {
    public void strPa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur string: ");
        String str = sc.next();
        str = str.toLowerCase();
        String rstr = "";
        char ch[] = str.toCharArray();
        for(int i =0; i<str.length(); i++){
            rstr = ch[i]+rstr;
            
        }
        System.out.println(rstr);
        if (rstr.equals(str)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        StrPalindrome s = new StrPalindrome();
        s.strPa();
    }
    
}