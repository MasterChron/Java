package level1.arrays;

public class ProductsOfArrays {

    public int prodcut(int[] arr) {
        int sum = 1;

        for (int j : arr) {
            sum = sum * j;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};

        ProductsOfArrays obj = new ProductsOfArrays();
        System.out.println(obj.prodcut(arr));
    }
}


