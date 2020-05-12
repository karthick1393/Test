import org.testng.annotations.Test;

public class Enab {
@Test
public void test(){
	System.out.println("Test1");
}

@Test(enabled=false)
public void test2()
{
	System.out.println("Test2");
}
@Test(enabled=true)
public void test3(){
	System.out.println("Test3");
}
}
