package Projects;


public class ShoppingMart {

    String[] items = {"Beverages", "Vegetables", "Household", "Beverages", "Beverages"};
    String[] channel = {"Online", "Online", "Offline", "Online", "Online"};
    int[] unitSold = {4484, 1075, 6515, 7683, 3491};
    double[] price = {47.45, 154.06, 668.27, 47.45, 47.45};

    public static void main(String[] args) {
        new ShoppingMart().displaySales();
        new ShoppingMart().average("Beverages");
        new ShoppingMart().fullDataSet();
    }

    public void displaySales(){
        double onlineTotal = 0;
        double offlineTotal = 0;
        for (int i = 0; i < items.length; i++){
            if (channel[i].equalsIgnoreCase("online"))
                onlineTotal += (unitSold[i] * price[i]);
            else if(channel[i].equalsIgnoreCase("offline"))
                offlineTotal += (unitSold[i] + price[i]);
        }

        System.out.println("\nTotal sales of all channels");
        System.out.println("----------------------------");
        System.out.println("Online price total: " + onlineTotal);
        System.out.println("Offline price total: " + offlineTotal);
    }


    public void average(String target){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(target))
                sb.append(i);
        }
        int nums = Integer.parseInt(sb.toString());

        double average = 0;
        double count = 0;
        while (nums > 0){
            int index = (nums % 10);
            average += unitSold[index];
            nums /= 10;
            count++;
        }
        average /= count;
        System.out.println("\nThe average sales of " + target + " is: " + average);
    }

    public void totalOfItems(String target){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(target))
                sb.append(i);
        }
        int nums = Integer.parseInt(sb.toString());

        double average = 0;
        while (nums > 0){
            int index = (nums % 10);
            average += unitSold[index];
            nums /= 10;
        }
        System.out.println("\nThe total sales of " + target + " is: " + average);
    }


    public void fullDataSet(){
        String[] used = new String[items.length];
        totalOfItems(items[0]);

        used[0] = items[0];
        for (int i = 1; i < items.length; i++){
            for (int j = 0; j < used.length; j++){
                if (used[j] == items[i])
                    continue;
            }
            totalOfItems(items[i]);
            used[i] = items[i];
        }
    }






    void sort(int[] arr, int l, int r){
        if (l < r){
            int m = l + (r - l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        for (int i = 0; i < n2; i++)
            R[i] = arr[m + 1 + i];

        int i = 0, j = 0,k = 0;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = L[i];
            k++;
            i++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
