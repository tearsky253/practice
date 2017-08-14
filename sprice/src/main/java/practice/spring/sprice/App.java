package practice.spring.sprice;

public class App
{
    public static void main( String[] args )
    {
        (new App()).run();
    }

    public void run() {
        String productName = "3D-Map";
        String report = (new ProductManager()).report(productName);
        System.out.println(report);
    }
}
