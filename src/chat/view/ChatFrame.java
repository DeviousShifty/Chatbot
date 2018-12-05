package chat.view;
import java.awt.Container;

import javax.swing.JFrame;

import chat.controller.chatController;

public class ChatFrame extends JFrame

{
private chatController app;

public ChatFrame(chatController app)
{
	super();
	this.app = app;
	
}

private void setupFrame(Container appPanel)
{
	this.setContentPane(appPanel);
	this.setSize(800,600);
	this.setTitle("Chatbot 2.0");
	this.setResizable(false);
	this.setVisible(true);
}
}
