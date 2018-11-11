import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeJTest {
	Employee empObj1 = new Employee();

	@Test
	public void testName() {
		empObj1.setname("Jasmine");
		Assert.assertEquals("Jasmine", empObj1.getname());
	}

	@Test
	public void testSalary() {
		empObj1.setsalary(4000.0);
		Assert.assertEquals(4100.0, empObj1.getsalary(), 0);
	}

	@Test
	public void testage() {
		empObj1.setage(24);
		Assert.assertEquals(24, empObj1.getage());
	}

	@Test
	public void testDesig() {
		empObj1.setdesignation("QA");
		Assert.assertEquals("QA", empObj1.getdesignation());
	}

	@Test
	public void testBonus() {

		Assert.assertEquals(100, empObj1.paybonus(empObj1.getsalary()));
	}

}
