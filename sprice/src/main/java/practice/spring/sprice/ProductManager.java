package practice.spring.sprice;

public class ProductManager implements Manager {
    private Engineer engineer = new SoftwareEngineer();

    public String report(String productName) {
        return this.engineer.report(productName);
    }
}
