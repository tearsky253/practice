package practice.spring.sprice;

public class Assistant {
    public void logProductProgress(String productName, String progress) {
        System.out.println(String.format("product=%s, progress=%s", productName, progress));
    }
}
