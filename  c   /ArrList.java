import java.util.*;
class ArrList {
    public static void main(String[] args) {
        ArrayList<String> color_list = new ArrayList<>(4);
        color_list.add("White");
        color_list.add("Black");
        color_list.add("Red");
        color_list.add("White");
        System.out.println("***COLOR LIST***");
        for(int i = 0; i< 4 ; i++){
            System.out.println(color_list.get(i).toString());
        }
        ArrayList<String> sample = new ArrayList<>(3);
    }
}
