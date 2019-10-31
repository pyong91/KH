package keywordTyping;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestGUI extends JFrame{
//	private JButton startBtn;
	private JTextField userInputText;
	private JLabel label;
	private JLabel scoreLabel;
	private Integer score = 0;
	private JLabel quizLabel;
	private KeywordList kl = new KeywordList();
	private String[] keywordList = kl.getKeywordList();
	private Play play = new Play();
	
	public TestGUI() {
//		setting
		setTitle("Test");
		setSize(1000, 800);
		setResizable(false);
		setLocation(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		panel
		JPanel panel = new JPanel();
		setPanel(panel);
		
//		add
		add(panel);
		
//		visible
		setVisible(true);
		
	}
	
	public void setPanel(JPanel panel) {
		panel.setLayout(null);
		
//		startBtn = new JButton("start");
//		startBtn.setBounds(100, 100, 100, 100);
//		panel.add(startBtn);
		
//		문제레이블
		label = new JLabel("제시어 : ");
		label.setBounds(350, 100, 100, 100);
		panel.add(label);
		
//		문제 출제
		quizLabel = new JLabel(keywordList[play.getNumber()]);
		quizLabel.setBounds(400, 100, 100, 100);
		panel.add(quizLabel);
		
//		점수
		scoreLabel = new JLabel("점수 : " + score.toString());
		scoreLabel.setBounds(700, 100, 100, 100);
		panel.add(scoreLabel);
		
//		입력창
		userInputText = new JTextField();
		userInputText.setBounds(300, 200, 150, 30);
		panel.add(userInputText);
//		입력 처리
		userInputText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkText()) {
					score+=1000;
					quizLabel.setText(keywordList[play.getNumber()]);
					scoreLabel.setText(score.toString());
					userInputText.setText("");
				} else {
					score-=1000;
					quizLabel.setText(keywordList[play.getNumber()]);
					scoreLabel.setText(score.toString());
					userInputText.setText("");
				}
			}
		});
	}
	
	public boolean checkText() {
		return userInputText.getText().equals(quizLabel.getText());
	}
	
}
