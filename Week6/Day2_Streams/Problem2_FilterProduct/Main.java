package Problem2_FilterProduct;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the maximum price of the product");
        Scanner sc = new Scanner(System.in);
        Double maxPrice = sc.nextDouble();
        Product p = new Product();
        List<Product> filteredProducts = p.filterProducts(maxPrice);
        if (filteredProducts.isEmpty()) {
            System.out.println("No products found within the given price");
        } else {
            System.out.println("List of Filtered Products");
            System.out.format("%-20s %-20s %-20s %-10s %s\n", "Name", "Brand", "Category", "Color", "Price");
            for (Product product : filteredProducts) {
                System.out.format("%-20s %-20s %-20s %-10s %s\n", product.getName(), product.getBrand(),
                        product.getProductCategory(), product.getColor(), product.getPrice());
            }
        }
    }
}
