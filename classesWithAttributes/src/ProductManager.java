public class ProductManager {
    public void add(Product product) {
        //JDBC kodları ile veri tabanına kaydedilecek.
        System.out.println("Ürün Eklendi " + product.getName());
        System.out.println("Eklenen Ürün Kodu : " + product.getCode());
    }
}
