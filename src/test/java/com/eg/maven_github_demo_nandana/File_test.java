package com.eg.maven_github_demo_nandana;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class File_test {
@Test
void testTotal() {
	assertEquals(225,GradeCalculator.calculateTotal(75, 68, 82));
}
@Test
void testAverage() {
	assertEquals(75.0,GradeCalculator.calculateAvg(75, 68, 82));
}
@Test
void testPass() {
	assertTrue(GradeCalculator.isPass(75.0));
}
@Test
void testFail() {
	assertFalse(GradeCalculator.isPass(35.0));
}
}
