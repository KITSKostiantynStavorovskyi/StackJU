package ua.com.epam;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;


public class MyStackTest {

	
	@Test(expected = NegativeArraySizeException.class)
	public void isWrongStackSizeDeclinedTest(){
		MyStack incorrectStack = new MyStack(-1);
	}
	
	@Test
	public void isNewStackEmptyTest() {
		MyStack stackEmpty = new MyStack(3);
		assertTrue(stackEmpty.empty());
	}
	
	@Test
	public void isEmptyCorrectTest() {
		MyStack stack = new MyStack();
		stack.push(2);
		assertFalse("Empty",stack.empty());
	}
	
	@Test 
	public void isPushCorrectTest(){
		MyStack stack = new MyStack(3);
        stack.push(0);
        stack.push(1);
        stack.push(2);
		assertTrue(2 == stack.peek());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void isPushOutOfStackCorrectTest(){
		MyStack stack = new MyStack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
	}
	

	@Test
	public void isPeekCorrectTest(){
		MyStack stack = new MyStack();
		int buf;
		stack.push(1);
	    buf = stack.peek();
		assertTrue("incorrect value of peek",1 == buf);
	}
	
	@Test(expected = EmptyStackException.class)
	public void isPeekEmptyCorrectTest(){
		MyStack stack = new MyStack();
		stack.peek();
	}
	
	@Test
	public void isPopCorrectTest(){
		MyStack stack = new MyStack();
		stack.push(22);
		int item = stack.pop();
		assertTrue(22 == item);
		assertTrue(stack.empty());
	}
	
	@Test
	public void isPopCorrectForEmptyStackTest(){
		MyStack stack = new MyStack();
		assertNull(stack.pop());
	}
	
	
	
}
