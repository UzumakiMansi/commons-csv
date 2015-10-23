package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_1.test1");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var3 = var1.withIgnoreHeaderCase(true);
    
    // Checks the contract:  equals-hashcode on var1 and var3
    assertTrue("Contract failed: equals-hashcode on var1 and var3", var1.equals(var3) ? var1.hashCode() == var3.hashCode() : true);
    
    // Checks the contract:  equals-hashcode on var3 and var1
    assertTrue("Contract failed: equals-hashcode on var3 and var1", var3.equals(var1) ? var3.hashCode() == var1.hashCode() : true);

  }

}
