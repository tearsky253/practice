package practice.spring.sprice;

public class ProductManager implements Manager {
    private Engineer engineer;

    @Override
    public String queryProgress(String productName) {
        String progress = this.engineer.reportProgress(productName);
        return progress;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }
}
