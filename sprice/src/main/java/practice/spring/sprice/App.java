package practice.spring.sprice;

public class App
{
    public static void main( String[] args )
    {
        (new App()).run();
    }

    public void run() {
        String productName = "3D-Map";
        Manager manager = new ProductManager();
        String progress = manager.queryProgress(productName);
        System.out.println(progress);
    }
}
