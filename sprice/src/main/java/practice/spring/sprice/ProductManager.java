package practice.spring.sprice;

public class ProductManager implements Manager {
    private Engineer engineer;

    @Override
    public String queryProgress(String productName) {
        return this.engineer.reportProgress(productName);
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }
}
