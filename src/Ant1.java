import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ant1 {
	@Test
	public void test1234(){
		System.out.println("Test1");
	}
	@Test
	public void test2(){
		System.out.println("Test2");
	}
	
	@Test
	public void test3(){
		System.out.println("Test3");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("aftersuite");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("aftermethod");
	}
		@BeforeSuite
		public void beforesuite(){
			System.out.println("beforesuite");
		
		}
		@BeforeMethod
		public void beforemethod(){
			System.out.println("Beforemethod");
		}
		@BeforeTest
		public void beforetest(){
			System.out.println("Beforetest");
		}
		
		@BeforeClass
		public void beforeclass(){
			System.out.println("Beforeclass");
		}
			
			@AfterClass
			public void afterclass(){
		System.out.println("Afterclass");	
		
	}
			@AfterTest
			public void aftertest(){
				System.out.println("Aftertest");
			}
		
		
		
}
