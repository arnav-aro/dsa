import java.util.*;

public class ArrList{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        list.add(59);
        list.add(78);
        list.add(56);
        list.add(97);
        System.out.println(list);
        System.out.println(list.contains(56));
        System.out.println(list.contains(54));
        list.set(3, 99);
        System.out.println(list);
        list.remove(2);
        for (int i = 0; i < 5 ; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}