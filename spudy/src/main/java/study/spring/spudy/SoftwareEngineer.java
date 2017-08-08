package study.spring.spudy;

import org.apache.commons.math3.random.RandomDataGenerator;

public class SoftwareEngineer implements Engineer {
    public String report(String productName) {
        int progress = (new RandomDataGenerator()).nextInt(1, 100);
        return String.format("product=%s, progress=%d%%", productName, progress);
    }
}
