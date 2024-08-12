package com.qa.runel;

public class JavaNiRuiel {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(1000);
        driver.quit();
        
    }
}
