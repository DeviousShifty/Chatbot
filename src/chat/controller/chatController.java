package chat.controller;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chat.model.Chatbot;

//initialize model before view, or it will crash 

public class chatController {
	private Chatbot simplebot;
	private ChatFrame appFrame;

	public chatController() {
		simplebot = new Chatbot();
		appFrame = new ChatFrame(this);
	}

	public void start() {

	}

	public String interactWithChatbot(String text) 
	{
		String output = "";
		output += simplebot.processText(text);
		return output;
		// String userInput = JOptionPane.showInputDialog(null, "Hello, what would you
		// like to talk about");
		// String chatbotSays = simplebot.processText(userInput);
		// return chatbotSays;
	}

	public String useChatbotCheckers(String text) {
		return null;
	}

	public Object getChatbot() {
		return null;
	}

	public Object getContent() {
		return null;
	}

	{
		this.ChatFrame();

	}

	private void ChatFrame() {

	}
}
