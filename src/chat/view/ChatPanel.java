package chat.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chat.controller.chatController;
import chat.model.Chatbot;

public class ChatPanel<LoadButton, SaveAsAction> 
{
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private JButton chatButton;
	private JButton loadButton;
	private JButton saveButton;
	private JButton jButton;
	private chatController app;
	
	public ChatPanel(chatController app)
	{
		super();
		this.app = app;
		SpringLayout appLayout = new SpringLayout();
		
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		chatButton = new JButton("Chat");
		jButton = new JButton("Check Text");
		
		chatField = new JTextField("Talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20,50);
		
		chatPane = new JScrollPane();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupLayout() 
	{
		
		
	}
	private void setupListeners()
	{
		
		
	}
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	private void setupPanel()
	{
		Object appLayout = null;
		this.setupLayout(appLayout);
		this.setPreferredSize(new Dimension(800,600));
		this.setBackground(Color.MAGENTA);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(chatButton);
		this.add(chatField);
	}
	private void add(JScrollPane chatPane2) {
		
		
	}
	private void add(JTextField chatField2) {
	
		
	}
	private void setPreferredSize(Dimension dimension) {
		
	}
	private void add(JButton chatButton2) {
		
	}
	private void setBackground(Color magenta) {
	
		
	}
	private void setupLayout(Object appLayout) {
		
		
	}
}
