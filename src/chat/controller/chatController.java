package chat.controller;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chat.model.Chatbot;


public class chatController
{
	private Chatbot simplebot;
	
	public chatController()
	{
		simplebot = new Chatbot();
	}

	public void start()
	{
		String userInput = "";
		
		while (!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
	}

	public String interactWithChatbot(String text)
	{
		String userInput = JOptionPane.showInputDialog(null, "Hello, what would you like to talk about");
		String chatbotSays = simplebot.processText(userInput);
		return chatbotSays;
	}
	
	public String useChatbotCheckers(String text)
	{
		return null;
	}
	
	public Object getChatbot()
	{
		return null;
	}
	
	public Object getContent()
	{
		return null;
	}
	
}
	
