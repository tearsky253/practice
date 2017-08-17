package practice.spring.sprice;

import org.aspectj.lang.JoinPoint;

public class Assistant {
    public void logProductProgress(String productName, String progress) {
        System.out.println(String.format("product=%s, progress=%s", productName, progress));
    }

    public void afterQueryProgress(JoinPoint joinPoint, String progress) {
        System.out.println("Assistant.afterQueryProgress");
        String productName = (String)joinPoint.getArgs()[0];
        logProductProgress(productName, progress);
    }
}
