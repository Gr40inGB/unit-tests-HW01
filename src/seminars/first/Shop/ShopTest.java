package seminars.first.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args) {
        Shop shop = new Shop();
        List<Product> list = new ArrayList<>();
        list.add(new Product(5, "apple"));
        list.add(new Product(55, "mango"));
        list.add(new Product(3, "pineaplle"));
        list.add(new Product(9, "banana"));
        shop.setProducts(list);



        for (Product product: shop.sortProductsByPrice()){
            System.out.println(product);
        }

    }
}
