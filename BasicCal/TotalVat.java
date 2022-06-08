package BasicCal;
import java.time.LocalDateTime;

public class TotalVat {
    public String[] product = new String[10];
    public int[] quantity = new int[10];
    public int[] price = new int[10];
    public int countItem = 0;
    public int[] total = new int[10];
    public int totalP = 0;
    public double tax;
    public int m = 0; 
    public LocalDateTime datetime = LocalDateTime.now();
    
    public void items(String productname , int quanti , int prices){
        product[countItem] = productname;
        quantity[countItem] = quanti;
        price[countItem] = prices;
        countItem += 1;
        System.out.println(productname + " " + quanti + " " + prices);
    }
    public void listitem(){
        for(int i = 0;i < countItem;i++){
            System.out.println(product[i] + "        " + quantity[i] + "        " + price[i]);
        }  
    }
    public void itemLists(){ 
        System.out.print('\u000C');
        m = 1;
        System.out.println("========= Stationery =========");
        System.out.println("\tStore Receipt");
        System.out.println(datetime);
        System.out.println("Name   Quantity Price Total");
            for(int x = 0;x < countItem;x++){ 
               total[x] = (quantity[x] * price[x]);
               System.out.println(product[x] + "     " + quantity[x] + "     " + price[x] + "     " + total[x]);
            }   
        
            for(int y = 0;y < total.length;y++){
               totalP += total[y]; 
            }
        System.out.println("Total Value:" + totalP);
        tax = totalP * 0.12;
        System.out.println("Tax:" + tax);
        System.out.println("==============================");
        countItem = 0;
        m = 0;
    }
}
