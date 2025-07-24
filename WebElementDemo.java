import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;

public class WebElementDemo {
    public static void main(String[] args) {

        // Setup ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Set your path
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Open browser and navigate
            driver.get("https://example.com");

            // 2. findElement() - Locate input field and enter text
            WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.clear();                         // Clear existing text
            usernameField.sendKeys("testuser123");         // Enter new text

            // 3. findElement() - Click button
            WebElement loginBtn = driver.findElement(By.id("loginBtn"));
            if (loginBtn.isDisplayed() && loginBtn.isEnabled()) {
                loginBtn.click();
            }

            // 4. findElements() - Get all links on page
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));
            System.out.println("Total Links: " + allLinks.size());
            for (WebElement link : allLinks) {
                System.out.println(link.getText() + " -> " + link.getAttribute("href"));
            }

            // 5. findElements() from a specific section
            WebElement footer = driver.findElement(By.id("footer"));
            List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
            for (WebElement link : footerLinks) {
                System.out.println("Footer Link: " + link.getText());
            }

            // 6. Check checkbox state
            WebElement newsletterCheckbox = driver.findElement(By.id("subscribe"));
            if (newsletterCheckbox.isDisplayed() && newsletterCheckbox.isEnabled()) {
                if (!newsletterCheckbox.isSelected()) {
                    newsletterCheckbox.click();  // Select checkbox
                }
            }

            // 7. Use JavaScriptExecutor if click doesn't work
            WebElement hiddenBtn = driver.findElement(By.id("hiddenButton"));
            try {
                hiddenBtn.click();  // Try regular click
            } catch (Exception e) {
                // Fallback with JS
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", hiddenBtn);
            }

            // 8. Get Text & Attribute
            WebElement header = driver.findElement(By.tagName("h1"));
            System.out.println("Header Text: " + header.getText());

            WebElement logo = driver.findElement(By.id("logo"));
            String src = logo.getAttribute("src");
            System.out.println("Logo src: " + src);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 9. Close browser
            driver.quit();
        }
    }
}
