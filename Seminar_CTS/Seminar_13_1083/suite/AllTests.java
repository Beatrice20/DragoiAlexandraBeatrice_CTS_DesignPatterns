package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.AplicaDiscountTest;
import teste.PoateRezervaTest;

@RunWith(Suite.class)
@SuiteClasses({AplicaDiscountTest.class, PoateRezervaTest.class})
public class AllTests {

}
