import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Product p = new Product();
        p.setCode("4658");
        p.setDescription("blue product");
        p.setPrice(20.5);

        System.out.println(p.toString());

        Book b = new Book();
        b.setAuthor("Homer");
        b.setPages(1000);

        System.out.println(b.toString());

        System.out.println(Product.getCount());





    }
}
