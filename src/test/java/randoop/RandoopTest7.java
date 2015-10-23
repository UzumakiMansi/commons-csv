package randoop;

import junit.framework.*;

public class RandoopTest7 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test1");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var3 = var1.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var5 = var1.withRecordSeparator("hi!");
    boolean var6 = var5.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var8 = var5.withQuote(' ');
    boolean var9 = var5.getSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var11 = var5.withIgnoreHeaderCase(false);
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var15 = var13.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var17 = var15.withIgnoreEmptyLines(true);
    org.apache.commons.csv.CSVFormat var18 = var15.withSkipHeaderRecord();
    org.apache.commons.csv.CSVFormat var20 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var22 = var20.withAllowMissingColumnNames(true);
    java.lang.Object[] var24 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var25 = var22.withHeaderComments(var24);
    org.apache.commons.csv.CSVFormat var27 = var25.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVFormat var28 = var25.withIgnoreEmptyLines();
    org.apache.commons.csv.CSVFormat var30 = var28.withQuote((java.lang.Character)'a');
    org.apache.commons.csv.CSVFormat var32 = var28.withRecordSeparator('#');
    org.apache.commons.csv.CSVFormat var34 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var36 = var34.withAllowMissingColumnNames(true);
    java.lang.Object[] var38 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var39 = var36.withHeaderComments(var38);
    org.apache.commons.csv.CSVFormat var41 = var39.withSkipHeaderRecord(false);
    java.lang.Character var42 = var39.getCommentMarker();
    java.lang.String[] var44 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var45 = var39.withHeader(var44);
    org.apache.commons.csv.CSVFormat var47 = var39.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var49 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var51 = var49.withAllowMissingColumnNames(true);
    java.lang.Object[] var53 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var54 = var51.withHeaderComments(var53);
    org.apache.commons.csv.CSVFormat var56 = var54.withSkipHeaderRecord(false);
    java.lang.Character var57 = var54.getCommentMarker();
    java.lang.String[] var59 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var60 = var54.withHeader(var59);
    org.apache.commons.csv.CSVFormat var61 = var47.withHeader(var59);
    org.apache.commons.csv.CSVFormat var62 = var32.withHeaderComments((java.lang.Object[])var59);
    org.apache.commons.csv.CSVFormat var63 = var18.withHeader(var59);
    org.apache.commons.csv.CSVFormat var64 = var11.withHeaderComments((java.lang.Object[])var59);
    java.lang.String var65 = var11.getRecordSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test2");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var3 = var1.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var5 = var1.withRecordSeparator("hi!");
    org.apache.commons.csv.CSVFormat var7 = var5.withAllowMissingColumnNames(false);
    boolean var8 = var5.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var10 = org.apache.commons.csv.CSVFormat.newFormat('4');
    boolean var11 = var10.isNullStringSet();
    org.apache.commons.csv.CSVFormat var13 = var10.withCommentMarker((java.lang.Character)'a');
    boolean var14 = var5.equals((java.lang.Object)'a');
    java.lang.String var15 = var5.toString();
    boolean var16 = var5.getAllowMissingColumnNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var18 = var5.withEscape('4');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Delimiter=<4> RecordSeparator=<hi!> SkipHeaderRecord:false"+ "'", var15.equals("Delimiter=<4> RecordSeparator=<hi!> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test3");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var4 = var2.withAllowMissingColumnNames(true);
    java.lang.Object[] var6 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var7 = var4.withHeaderComments(var6);
    org.apache.commons.csv.CSVFormat var9 = var7.withSkipHeaderRecord(false);
    java.lang.Character var10 = var7.getCommentMarker();
    java.lang.String[] var12 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var13 = var7.withHeader(var12);
    org.apache.commons.csv.CSVFormat var15 = var7.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVParser var16 = org.apache.commons.csv.CSVParser.parse("hi!", var7);
    org.apache.commons.csv.CSVFormat var17 = var7.withIgnoreEmptyLines();
    java.lang.String var18 = var17.getRecordSeparator();
    boolean var19 = var17.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var21 = var17.withCommentMarker((java.lang.Character)'a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var23 = var21.withEscape('4');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test4");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var3 = var1.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var5 = var1.withRecordSeparator("hi!");
    org.apache.commons.csv.CSVFormat var7 = var5.withAllowMissingColumnNames(false);
    java.lang.String var8 = var5.toString();
    boolean var9 = var5.isQuoteCharacterSet();
    org.apache.commons.csv.CSVFormat var11 = var5.withAllowMissingColumnNames(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.apache.commons.csv.CSVFormat var13 = var5.withQuote('4');
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Delimiter=<4> RecordSeparator=<hi!> SkipHeaderRecord:false"+ "'", var8.equals("Delimiter=<4> RecordSeparator=<hi!> SkipHeaderRecord:false"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test5");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var4 = var2.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var6 = var2.withIgnoreEmptyLines(false);
    boolean var7 = var6.getIgnoreHeaderCase();
    org.apache.commons.csv.CSVFormat var9 = var6.withCommentMarker('a');
    org.apache.commons.csv.CSVFormat var10 = var9.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var12 = var10.withSkipHeaderRecord(false);
    org.apache.commons.csv.CSVParser var13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<4> SkipHeaderRecord:false HeaderComments:[0] Header:[]", var12);
    org.apache.commons.csv.CSVFormat var14 = var12.withSkipHeaderRecord();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test6");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var3 = var1.withAllowMissingColumnNames(true);
    java.lang.Object[] var5 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var6 = var3.withHeaderComments(var5);
    org.apache.commons.csv.CSVFormat var8 = var6.withSkipHeaderRecord(false);
    java.lang.Character var9 = var6.getCommentMarker();
    java.lang.String[] var11 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var12 = var6.withHeader(var11);
    java.lang.String var13 = var12.getRecordSeparator();
    org.apache.commons.csv.CSVFormat var15 = var12.withQuote(' ');
    org.apache.commons.csv.CSVFormat var17 = var15.withEscape((java.lang.Character)' ');
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator('#');
    org.apache.commons.csv.QuoteMode var20 = var17.getQuoteMode();
    org.apache.commons.csv.CSVFormat var21 = var17.withSkipHeaderRecord();
    boolean var23 = var17.equals((java.lang.Object)(byte)(-1));
    org.apache.commons.csv.CSVFormat var25 = var17.withRecordSeparator(' ');
    boolean var26 = var17.isCommentMarkerSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test7");


    org.apache.commons.csv.CSVFormat var2 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var4 = var2.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var6 = var2.withRecordSeparator("hi!");
    org.apache.commons.csv.CSVFormat var8 = var2.withEscape('a');
    org.apache.commons.csv.CSVFormat var10 = var8.withDelimiter('#');
    org.apache.commons.csv.CSVParser var11 = org.apache.commons.csv.CSVParser.parse("hi!", var10);
    org.apache.commons.csv.CSVFormat var13 = org.apache.commons.csv.CSVFormat.newFormat('4');
    boolean var14 = var13.isNullStringSet();
    boolean var15 = var10.equals((java.lang.Object)var14);
    org.apache.commons.csv.CSVFormat var17 = var10.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var19 = var17.withRecordSeparator("Delimiter=<4> NullString=<hi!> SkipHeaderRecord:false");
    java.lang.String[] var20 = var19.getHeaderComments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest7.test8");


    org.apache.commons.csv.CSVFormat var1 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var3 = var1.withCommentMarker('#');
    org.apache.commons.csv.CSVFormat var4 = var1.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var6 = var4.withEscape('#');
    org.apache.commons.csv.CSVFormat var8 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var10 = var8.withAllowMissingColumnNames(true);
    java.lang.Object[] var12 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var13 = var10.withHeaderComments(var12);
    org.apache.commons.csv.CSVFormat var15 = var13.withSkipHeaderRecord(false);
    java.lang.Character var16 = var13.getCommentMarker();
    java.lang.String[] var18 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var19 = var13.withHeader(var18);
    org.apache.commons.csv.CSVFormat var21 = var13.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var23 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var25 = var23.withAllowMissingColumnNames(true);
    java.lang.Object[] var27 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var28 = var25.withHeaderComments(var27);
    org.apache.commons.csv.CSVFormat var30 = var28.withSkipHeaderRecord(false);
    java.lang.Character var31 = var28.getCommentMarker();
    java.lang.String[] var33 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var34 = var28.withHeader(var33);
    org.apache.commons.csv.CSVFormat var35 = var21.withHeader(var33);
    java.lang.String var36 = var4.format((java.lang.Object[])var33);
    org.apache.commons.csv.CSVFormat.Predefined[] var37 = org.apache.commons.csv.CSVFormat.Predefined.values();
    org.apache.commons.csv.CSVFormat var38 = var4.withHeaderComments((java.lang.Object[])var37);
    org.apache.commons.csv.CSVFormat var40 = var38.withRecordSeparator("Delimiter=<4> RecordSeparator=<hi!> SkipHeaderRecord:false");
    java.lang.String var41 = var40.getNullString();
    org.apache.commons.csv.CSVFormat var42 = var40.withAllowMissingColumnNames();
    org.apache.commons.csv.CSVFormat var43 = var42.withIgnoreSurroundingSpaces();
    org.apache.commons.csv.CSVFormat var45 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var47 = var45.withAllowMissingColumnNames(true);
    org.apache.commons.csv.CSVFormat var49 = var45.withRecordSeparator("hi!");
    boolean var50 = var49.isCommentMarkerSet();
    org.apache.commons.csv.CSVFormat var52 = var49.withQuote(' ');
    org.apache.commons.csv.CSVFormat var54 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var56 = var54.withAllowMissingColumnNames(true);
    java.lang.Object[] var58 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var59 = var56.withHeaderComments(var58);
    org.apache.commons.csv.CSVFormat var61 = var59.withSkipHeaderRecord(false);
    java.lang.Character var62 = var59.getCommentMarker();
    java.lang.String[] var64 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var65 = var59.withHeader(var64);
    org.apache.commons.csv.CSVFormat var67 = var59.withAllowMissingColumnNames(false);
    org.apache.commons.csv.CSVFormat var69 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var71 = var69.withAllowMissingColumnNames(true);
    java.lang.Object[] var73 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var74 = var71.withHeaderComments(var73);
    org.apache.commons.csv.CSVFormat var76 = var74.withSkipHeaderRecord(false);
    java.lang.Character var77 = var74.getCommentMarker();
    java.lang.String[] var79 = new java.lang.String[] { ""};
    org.apache.commons.csv.CSVFormat var80 = var74.withHeader(var79);
    org.apache.commons.csv.CSVFormat var81 = var67.withHeader(var79);
    org.apache.commons.csv.CSVFormat var83 = org.apache.commons.csv.CSVFormat.newFormat('4');
    org.apache.commons.csv.CSVFormat var85 = var83.withAllowMissingColumnNames(true);
    java.lang.Object[] var87 = new java.lang.Object[] { 0L};
    org.apache.commons.csv.CSVFormat var88 = var85.withHeaderComments(var87);
    java.lang.String var89 = var81.format(var87);
    org.apache.commons.csv.CSVFormat var90 = var52.withHeaderComments(var87);
    org.apache.commons.csv.CSVFormat var91 = var52.withIgnoreEmptyLines();
    java.lang.Character var92 = var91.getEscapeCharacter();
    java.lang.String[] var93 = var91.getHeader();
    org.apache.commons.csv.CSVFormat var95 = var91.withEscape('#');
    boolean var96 = var43.equals((java.lang.Object)var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "0"+ "'", var89.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);

  }

}
