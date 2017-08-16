package practice.spring.sprice;

import org.apache.commons.math3.random.RandomDataGenerator;

public class SoftwareEngineer implements Engineer {
    @Override
    public String reportProgress(String productName) {
        int progress = (new RandomDataGenerator()).nextInt(1, 100);
        return String.format("%d%%", progress);
    }
}
