class Sh9 {
    public static void main(String[] args) {
        String s ="arnavarora";
        System.out.println(s);
        String s1= new String("arnavarora");
        System.out.println(s1);
        char[] ch = {'a','r','n','a','v'};
        String s3= new String(ch);
        System.out.println(s3);
        char[] ch1 = {'a','r','n','a','v','a','r','o','r','a'};
        String s4= new String(ch1,1,7);
        System.out.println(s4);
        byte[] b = {65,66,57,54,67,72};
        String s5=new String(b);
        System.out.println(s5);
        


    }
}
