import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearchTest extends Parameters {

	@Test()
	public void verifiy_the_search_results() {

		driver.findElement(By.name("q")).sendKeys("dema mohammed" + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[2]")).click();
		String search_result = driver.findElement(By.id("result-stats")).getText();
		System.out.println(search_result);

		String spleted_text[] = search_result.split(" ");
		System.out.println(spleted_text[1]);
		String theNumOfSearchResult = spleted_text[1];
		String theNumOfSearchResultUpdated = theNumOfSearchResult.replace("," , "");
		int ActualResult = Integer.parseInt(theNumOfSearchResultUpdated);
		int ExpNum = 10;
		myAssertion.assertEquals(ActualResult, ExpNum, "pass");
		myAssertion.assertAll();
		System.out.println(ActualResult+10);
		
		
//		System.out.println(spleted_text.length + "***********");
//		for (int i = 0; i < spleted_text.length; i++) {
//			
//		}
	}
}