package practice.spring.sprice;

public class ProductManager implements Manager {
    private Engineer engineer;
    private Assistant assistant;

    @Override
    public String queryProgress(String productName) {
        String progress = this.engineer.reportProgress(productName);
        this.assistant.logProductProgress(productName, progress);
        return progress;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }
}
