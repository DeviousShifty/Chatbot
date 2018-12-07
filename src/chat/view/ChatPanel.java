package chat.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chat.controller.chatController;
import chat.model.Chatbot;
import javax.swing.JSlider;

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
	/**
	 * @wbp.nonvisual location=36,331
	 */
	private final JButton button = new JButton("Check Text");
	
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
		chatArea.setBackground(Color.RED);
		
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
		chatButton.addActionListener(new ActionListener()
				{
			private chatController appController;

			public void actionPerformed(ActionEvent click)
			{
				String userText = chatField.getText();
				String response = "";
				response = appController.interactWithChatbot(userText);
				chatArea.append(response);
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
				chatField.setText("");
			}
				});
		
	}
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setRowHeaderView(chatArea);
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
private void add(JScrollPane chatPane) 
{
		
		
	}
	private void add(JTextField chatField) 
	{
	
		
	}
	private void setPreferredSize(Dimension dimension) 
	{
		
	}
	private void add(JButton chatButton) 
	{
		
	}
	private void setBackground(Color magenta) 
	{
	
		
	}
	private void setupLayout(Object appLayout) 
	{
		
		
	}
}
