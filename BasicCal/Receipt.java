package BasicCal;

 public class Receipt extends TotalVat
{
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
