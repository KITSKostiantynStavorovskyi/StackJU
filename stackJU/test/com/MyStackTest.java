package com;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;


public class MyStackTest {

	
	@Test(expected = NegativeArraySizeException.class)
	public void wrongStackSize(){
		MyStack incorrectStack = new MyStack(-1);
	}
	
	@Test
	public void emptyTest() {
		MyStack stackEmpty = new MyStack(3);
		assertTrue(stackEmpty.empty());
	}
	
	@Test
	public void emptyNotTest() {
		MyStack stack = new MyStack();
		stack.push(2);
		assertFalse("Empty",stack.empty());
	}
	
	@Test 
	public void pushTest(){
		MyStack stack = new MyStack(3);
		for (int i = 0; i<3; i++){
			stack.push(i);
		}
		assertTrue(2==stack.peek());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void pushOutOfStackTest(){
		MyStack stack = new MyStack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
	}
	

	@Test
	public void peekTest(){
		MyStack stack = new MyStack();
		int buf;
		stack.push(1);
	    buf = stack.peek();
		assertTrue("incorrect value of peek",1==buf);
	}
	
	@Test(expected = EmptyStackException.class)
	public void peekEmptyTest(){
		MyStack stack = new MyStack();
		stack.peek();
	}
	
	@Test
	public void popTest(){
		MyStack stack = new MyStack();
		stack.push(22);
		int item = stack.pop();
		assertTrue(22==item);
		assertTrue(stack.empty());
	}
	
	@Test
	public void popEmptyTest(){
		MyStack stack = new MyStack();
		assertNull(stack.pop());
	}
	
	
	
}
