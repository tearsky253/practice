package practice.spring.sprice;

public class ProductManager implements Manager {
    private Engineer engineer = new SoftwareEngineer();

    @Override
    public String queryProgress(String productName) {
        return this.engineer.reportProgress(productName);
    }
}
