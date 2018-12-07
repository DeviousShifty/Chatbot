package chat.tests;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chat.model.Chatbot;

public class Chatbot
{
	private Chatbot testedBot;

	@Before
	public void setUp() throws Exception
	{
		testedBot = new Chatbot();
		
	}

	@After
	public void tearDown() throws Exception
	{
		testedBot = null;
	}

	@Test
	public void testChatbot()
	{
		assertNotNull("You need to initialize the content data member", testedBot.Content() );
		assertNotNull("ArrayLists need to be initialized too", testedBot.testGetSpookyList());
		assertNotNull("ArrayLists need to be initialized too", testedBot.testGetResponseList());
		assertNotNull("Current user data member needs to be initialized", testedBot.CurrentUser());
	}

	public String processText(String userText)
	{
		String answer = "";
		if (!validityChecker(userText))
		{
			answer += "You really should not send null\n";
		}
		else
		{
			answer += "You said: " + userText + "\n";
			
			if ((boolean) contentChecker(userText))
			{
				answer += "You said the special words. \n";
			}
			ArrayList<String> responseList;
			int randomindex = (int) (responseList.size() * Math.random());
			int randomIndex;
			answer += "ChatBot says:" + responseList.get(randomIndex) + "\n";
		}
		return answer;
	}
	private boolean validityChecker(String userText) {
		// TODO Auto-generated method stub
		return false;
	}

	private Object CurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object Content() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testProcessText()
	{
		ArrayList<String> responseList = null;
		int randomIndex = (int)(Math.random()*responseList.size());
	
		String sampleText = "What is the meaning of life?";
		assertNotNull("Even null data should not return null", testedBot.processText(null));
		assertNotNull("Empty text should not return null", testedBot.processText(""));
		assertNotNull("Random text should not return null", testedBot.processText("dsfkjadsjkghakjs"));
		assertTrue("The empty String should not be returned", ((String) testedBot.processText(null)).length() > 0 );
		assertTrue("The empty String still should not be returned", ((String) testedBot.processText("")).length() > 0);
		assertTrue("The text you supply should be prefixed with \"You said: \" ", ((ArrayList<String>) testedBot.processText("")).contains("You said: "));
		assertTrue("The text you supply should be prefixed with \"You said: \" ", ((ArrayList<String>) testedBot.processText(sampleText)).contains("You said: "));
		assertTrue("The text returned should indicate what the chatbot says with \"Chatbot says: \"", ((ArrayList<String>) testedBot.processText(sampleText)).contains("Chatbot says: "));
		String response = (String) testedBot.processText(sampleText);
		assertTrue("The chatbot content should be after your content", response.indexOf("You said:") < response.indexOf("Chatbot says: "));
	}

	private Object processText(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testChatbotString()
	{
		testedBot = new Chatbot();
		assertTrue("String constructor needs to assign to the content variable");
	}

	private void assertTrue(String string)
	{
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testSpookyChecker()
	{
		assertTrue("Halloween should return true", testedBot.spookyChecker("Halloween"));
		for (String phrase : ( testedBot.SpookyList))
		{
			assertTrue("Every item in the spookyList should pass the spookyChecker method", testedBot.spookyChecker(phrase));
		}
		assertTrue("Easter should return false", testedBot.spookyChecker("Easter"));
	}
	
	
	private Object spookyChecker(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testLegitimacyChecker()
	{
		assertTrue("Null should return false", testedBot.legitimacyChecker(null));
		assertTrue("Empty string should return false", testedBot.legitimacyChecker(""));
		assertTrue("Keyboard mash should return false", testedBot.legitimacyChecker("asdfghjkl"));
		assertTrue("Strings more than 1 letter should return true", testedBot.legitimacyChecker("a"));
	}

	private Object legitimacyChecker(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testContentChecker()
	{
		assertTrue("The content checker should definitly find the value", testedBot.contentChecker((String) testedBot.Content()));
		assertTrue("The content in middle of another word is NOT the special content", testedBot.contentChecker("text" + testedBot.Content() + "text"));
		assertTrue("The content after another word is NOT the special content", testedBot.contentChecker("text" + testedBot.Content()));
		assertTrue("The content in front of another word is NOT the special content", testedBot.contentChecker(testedBot.Content() + "text"));
		assertTrue("If the content is sent to the chatbot via process text it should be noted", ((ArrayList<String>) testedBot.processText((String) testedBot.Content())).contains("You said the special words"));
	}
	private Object contentChecker(String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGetSpookyList()
	{
		 assertTrue("You really need to initialize the spookyList", ((Chatbot) testedBot).testGetSpookyList());
		 assertTrue("You need to have more than 8 items in the spookyList", ((ArrayList<String>) testedBot.SpookyList).size() > 8);
		 assertTrue("The first item in your list has to mention Halloween", ((ArrayList<String>) testedBot.SpookyList).get(0).contains("Halloween"));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testGetResponseList()
	{
		 assertNotNull("You really need to initialize the responseList", testedBot.testGetResponseList());
		 assertTrue("You need to have more than 15 items in the repsonseList", ((ArrayList<String>) testedBot.ResponseList).size() > 15);
		 assertTrue("The first item in your list has to mention Hello", ((ArrayList<String>) testedBot.ResponseList).get(0).contains("Hello"));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testBuildLists()
	{
		assertTrue("The responseList is not properly built by the constructor", ((ArrayList<String>) testedBot.getResponseList).size() > 15);
		assertTrue("The spookyList is not properly built by the constructor", ((ArrayList<String>) testedBot.getSpookyList).size() > 8);
	}

private Object assertTrue(String string, Object responseList)
	{
		// TODO Auto-generated method stub
		return null;
	}
private Object assertNotNull(String string, Object responseList)
{
	// TODO Auto-generated method stub
	return null;
}

public boolean legitamacyChecker(String input)
{
	boolean isValid = true;
	if (input == null)
	{
		isValid = false;
	}
	else if (input.length() < 2)
	{
		isValid = false;
	}
	else if (input.contains("dfg") || input.contains("cvb"))
	{
		isValid = false;
	}
	return isValid;
}
}
