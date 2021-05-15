package com.va.week1.sat.junit2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayClassTest {

	@Test
	public void testPass()
	{
		assertTrue(ArrayClass.isPass(80));
		assertFalse(ArrayClass.isPass(45));
	}
	@Test
	public void testGrade()
	{
		assertEquals('A',ArrayClass.grade(95));
		assertEquals('B',ArrayClass.grade(89));
		assertEquals('C',ArrayClass.grade(70));
		assertEquals('D',ArrayClass.grade(62));
		assertEquals('F',ArrayClass.grade(54));
	}

}
