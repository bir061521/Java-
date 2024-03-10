package _06oop;


class Product{
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public Product(){}//기본 생성자
}
public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1제품의 (serial no)는 " + p1.serialNo);
        System.out.println("p2제품의 (serial no)는 " + p2.serialNo);
        System.out.println("p3제품의 (serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 count는 " + Product.count +"개 입니다");
    }
}
