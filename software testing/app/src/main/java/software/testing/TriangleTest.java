import org.junit.Test;
import static org.junit.Assert.*; 

public class TriangleTest { 

 @Test
  public void testInvalidTriangleWithZeroSide() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.classify(0, 3, 4));
 }
 
 @Test
 public void testInvalidTriangleWithNegativeSide() {
   assertEquals(Triangle.TriangleType.INVALID, Triangle.classify(3, -2, 5));
 }
 
 @Test
 public void testScaleneTriangle() {
  assertEquals(Triangle.TriangleType.SCALENE, Triangle.classify(3, 4, 5));
 }
 
 @Test
 public void testEquilateralTriangle() {
  assertEquals(Triangle.TriangleType.EQUILATERAL, Triangle.classify(5, 5, 5));
 }
 
 @Test
 public void testIsoscelesTriangle1() {
  assertEquals(Triangle.TriangleType.ISOSCELES, Triangle.classify(3, 3, 4));
 }

 @Test
 public void testIsoscelesTriangle2() {
  assertEquals(Triangle.TriangleType.ISOSCELES, Triangle.classify(4, 3, 3));
 }
 
 @Test
 public void testIsoscelesTriangle3() {
   assertEquals(Triangle.TriangleType.ISOSCELES, Triangle.classify(3, 4, 3));
 }
 @Test
 public void testInvalidTriangle1() {
   assertEquals(Triangle.TriangleType.INVALID, Triangle.classify(1, 2, 4));
 }
 
 @Test
 public void testInvalidTriangle2() {
   assertEquals(Triangle.TriangleType.INVALID, Triangle.classify(2, 2, 5));
 } 
 @Test
 public void testInvalidTriangle3() {
  assertEquals(Triangle.TriangleType.INVALID, Triangle.classify(3, 6, 3));
 }
}
