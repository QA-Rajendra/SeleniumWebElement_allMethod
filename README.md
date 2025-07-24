# SeleniumWebElement_allMethod

## Selenium WebElement Methods – Summary Table (Java)

| No. | Action                         | WebElement Method                  | Usage Example                                        |
| --- | ------------------------------ | ---------------------------------- | ---------------------------------------------------- |
| 1   | Find single element            | `findElement(By.locator)`          | `driver.findElement(By.id("username"))`              |
| 2   | Find multiple elements         | `findElements(By.locator)`         | `driver.findElements(By.tagName("a"))`               |
| 3   | Enter text in input field      | `sendKeys("text")`                 | `element.sendKeys("hello")`                          |
| 4   | Clear input field              | `clear()`                          | `element.clear()`                                    |
| 5   | Click a button or link         | `click()`                          | `element.click()`                                    |
| 6   | Get visible text               | `getText()`                        | `element.getText()`                                  |
| 7   | Get HTML attribute value       | `getAttribute("attr")`             | `element.getAttribute("href")`                       |
| 8   | Check if element is visible    | `isDisplayed()`                    | `element.isDisplayed()`                              |
| 9   | Check if element is enabled    | `isEnabled()`                      | `element.isEnabled()`                                |
| 10  | Check if checkbox is selected  | `isSelected()`                     | `element.isSelected()`                               |
| 11  | Find elements in a section     | `parent.findElements(By.locator)`  | `div.findElements(By.tagName("li"))`                 |
| 12  | Click using JavaScriptExecutor | `JavascriptExecutor.executeScript` | `js.executeScript("arguments[0].click();", element)` |

### Notes:

* Use `isDisplayed()`, `isEnabled()` before interacting to avoid errors.
* `findElements()` returns an empty list if nothing matches (no exception).
* Use `JavascriptExecutor` only when regular `click()` fails.

---

Feel free to copy this table into your automation framework documentation or training notes.
