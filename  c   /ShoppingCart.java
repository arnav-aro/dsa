import java.util.*;
public class ShoppingCart {
    
    Scanner sc = new Scanner(System.in);
    ArrayList<String> itemID = new ArrayList<>();
    ArrayList<String> itemName = new ArrayList<>();
    ArrayList<String> itemPrice = new ArrayList<>();
    
    public void addItems(){
        
        System.out.println("Enter Item Id: ");
        itemID.add(sc.nextLine());
        System.out.println("Enter Item name: ");
        itemName.add(sc.nextLine());
        System.out.println("Enter Item Price: ");
        itemPrice.add(sc.nextLine());
        System.out.println("Items added in ur cart!!!");
    }

    public void showItems(){
        System.out.println("--------------UR CART------------------");
        System.out.println("Item ID\tItem Name\tItem Price");
        System.out.println("---------------------------------------");
        for(int k =0;k<itemID.size();++k){
            System.out.println(itemID.get(k).toString()+"\t"+itemName.get(k).toString()+"\t\t"+itemPrice.get(k).toString());
        }
        System.out.println("---------------------------------------");
    }

       public void updateItems() {
        System.out.println("Enter the Item ID to update: ");
        String itemIdToUpdate = sc.nextLine();

        int index = itemID.indexOf(itemIdToUpdate);
        if (index != -1) {
            System.out.println("Enter new Item Name: ");
            itemName.set(index, sc.nextLine());
            System.out.println("Enter new Item Price: ");
            itemPrice.set(index, sc.nextLine());
            System.out.println("Item updated successfully!");
        } else {
            System.out.println("Item not found in the cart!");
        }
    }

    public void deleteItems() {
        System.out.println("Enter the Item ID to delete: ");
        String itemIdToDelete = sc.nextLine();

        int index = itemID.indexOf(itemIdToDelete);
        if (index != -1) {
            itemID.remove(index);
            itemName.remove(index);
            itemPrice.remove(index);
            System.out.println("Item deleted successfully!");
        } else {
            System.out.println("Item not found in the cart!");
        }
    }

    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add items in ur cart");
            System.out.println("2.Show cart");
            System.out.println("3.Update cart");
            System.out.println("4.Delete items from ur cart");
            System.out.println("5.Exit");
            System.out.println("Select an option");
            int ch = sc1.nextInt();
            switch (ch) {
                case 1:
                    s.addItems();
                    break;
                case 2:
                    s.showItems();
                    break;
                case 3:
                    s.updateItems();
                    break;
                case 4:
                    s.deleteItems();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
