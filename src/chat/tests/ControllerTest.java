package chat.tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chat.controller.chatController;

public class ControllerTest
{
	
private ControllerTest ControllerTest;

	
	public chatController ControllerTest1;
	@Before
	public void setUp() throws Exception
	{
		ControllerTest = new ControllerTest();
	}

	@After
	public void tearDown() throws Exception
	{
		ControllerTest = null;
	}

	@Test
	public void testchatController()
	{
		assertNotNull("Chatbot data member not initialized");
	}

	public void assertNotNull(String Object)
	{
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testInteractWithChatbot()
	{
		assertNotNull("Stub method used, implement with code", ControllerTest.interactWithChatbot(""));
		assertNotNull("Null should not ever be returned", ControllerTest.interactWithChatbot(null));
		assertTrue("If null is supplied user should be notified about it");
	}

	private void assertNotNull(String string, Object interactWithChatbot)
	{
		// TODO Auto-generated method stub
		
	}

	private Object interactWithChatbot(String string)
	{
		// TODO Auto-generated method stub
		return null;
	}
	

	@Test
	public void testUseChatbotCheckers()
	{
		assertTrue("Spooky tester method not implemented");
	}

	private void assertTrue(String string)
	{
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testGetChatbot()
	{
		assertNotNull("Chatbot data member not initialized");
	}

}