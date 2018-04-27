package core;

import static org.junit.Assert.*; 
import org.junit.*;
 
public class CalcTest {
 
static double divide(double a, double b) {return a / b;}
static double divide(double a, double b, double c) {return a / b / c;}
static double divide(double a, double b, double c, double d) {return a / b / c / d;}
static double divide(double a, double b, double c, double d, double e) {return a / b / c / d / e;}
static double divide(double a, double b, double c, double d, double e, double f) {return a / b / c / d / e / f;}
 
static double add(double a, double b) {return a + b;}
static double add(double a, double b, double c) {return a + b + c;}
static double add(double a, double b, double c, double d) {return a + b + c + d;}
static double add(double a, double b, double c, double d, double e) {return a + b + c + d + e;}
static double add(double a, double b, double c, double d, double e, double f) {return a + b + c + d + e + f;}
 
static double subtract(double a, double b) {return a - b;}
static double subtract(double a, double b, double c) {return a - b - c;}
static double subtract(double a, double b, double c, double d) {return a - b - c - d;}
static double subtract(double a, double b, double c, double d, double e) {return a - b - c - d - e;}
static double subtract(double a, double b, double c, double d, double e, double f) {return a - b - c - d - e - f;}
 
static double multiply(double a, double b) {return a * b;}
static double multiply(double a, double b, double c) {return a * b * c;}
static double multiply(double a, double b, double c, double d) {return a * b * c * d;}
static double miltiply(double a, double b, double c, double d, double e) {return a * b * c * d * e;}
static double multiply(double a, double b, double c, double d, double e, double f) {return a * b * c * d * e * f;}
 

@Test // @Ignore
public void test_01() {
	assertEquals("Not correct", divide(90.0, 7.0), 12.9, 0.09);
	}
@Test // @Ignore
public void test_02() {
	assertEquals("Not correct", divide(144.0, 7.0, 2.0), 10.3, 0.09);
	}
@Test // @Ignore
public void test_03() {
	assertEquals("Not correct", divide(222.0, 2.0, 4.0, 1.5), 18.5, 0.09);
	}
@Test // @Ignore
public void test_04() {
	assertEquals("Not correct", divide(1122.0, 7.0, 3.0, 100.0, 1.5), 0.36, 0.09);
	}
@Test // @Ignore
public void test_05() {
	assertEquals("Not correct", divide(3432.0, 12.0, 34.5, 12.0, 2.0, 1.5), 0.23, 0.09);
	}


@Test //@Ignore
public void test_06() {
	assertEquals("Not correct", add(60.0, 5.0), 65.0, 0.09); 
	}
@Test // @Ignore
public void test_07() {
	assertEquals("Not correct", add(1.0, 5.0, 2.0), 8.0, 0.09);
	}
@Test // @Ignore
public void test_08() {
	assertEquals("Not correct", add(10.0, 5.0, 2.0, 3.0), 20.0, 0.09);
	}
@Test //@Ignore
public void test_09() {
	assertEquals("Not correct", add(11.0, 1.0, 2.0, 34.0, 15.0), 63.0, 0.09); 
	}
@Test // @Ignore
public void test_10() {
	assertEquals("Not correct", add(30.0, 15.0, 12.0, 3.3, 45.3, 12.2), 117.8, 0.09);
	}



@Test // @Ignore
public void test_11() {
	assertEquals("Not correct", subtract(100.0, 22.0), 78.0, 0.09);
	}
@Test // @Ignore
public void test_12() {
	assertEquals("Not correct", subtract(220.0, 120.0, 54.0), 46.0, 0.09);
	}
@Test // @Ignore
public void test_13() {
	assertEquals("Not correct", subtract(450.0, 200.0, 50.0, 130.0), 70.0, 0.09);
	}
@Test  //@Ignore
public void test_14() {
	assertEquals("Not correct", subtract(10.0, 1.0, 2.0, 3.0, 1.0), 3.0, 0.09);
	}
@Test // @Ignore
public void test_15() {
	assertEquals("Not correct", subtract(18.0, 4.0, 3.0, 1.5, 3.5, 2.0), 4.0, 0.09);
	}


@Test // @Ignore
public void test_16() {
	assertEquals("Not correct", multiply(9.0, 5.0), 45.0, 0.09);
	}
@Test // @Ignore
public void test_17() {
	assertEquals("Not correct", multiply(9.0, 5.0, 2.0), 90.0, 0.09);
	}
@Test // @Ignore
public void test_18() {
	assertEquals("Not correct", multiply(5.0, 5.0, 2.0, 3.0), 150.0, 0.09);
	}
@Test // @Ignore
public void test_19() {
	assertEquals("Not correct", multiply(3.0, 5.0, 2.0, 100.0, 2.0, 1.0), 6000.0, 0.09);
	}
@Test // @Ignore
public void test_20() {
	assertEquals("Not correct", multiply(9.0, 5.0, 2.0, 4.0, 20.0, 30.0), 216000.0, 0.09);
	}
}
