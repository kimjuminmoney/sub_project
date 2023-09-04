package client;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ClientMainDesign extends JFrame {
	
	private JButton jbtRegist;
	private JButton jbtModify;
	private JButton jbtHistory;
	private JButton jbtBook;
	private JButton jbtBookCheck;
	private JButton jbtRecall;
	
	public ClientMainDesign()
	{
		super("메인화면");
		
		JLabel jlTitle = new JLabel("마이카 관리");
		
		jbtRegist = new JButton("차량 등록");
		jbtModify = new JButton("회원 정보 수정");
		jbtHistory = new JButton("차량 정비 내역");
		jbtBook = new JButton("정비 예약");
		jbtBookCheck = new JButton("예약 조회");
		
		jbtRegist.setBounds(750,180,350,60);
		jbtModify.setBounds(750,260,350,60);		
		jbtHistory.setBounds(750,340,350,60);		
		jbtBook.setBounds(750,420,350,60);		
		jbtBookCheck.setBounds(750,500,350,60);		
		
		setLayout(null);
		add(jbtRegist);
		add(jbtModify);
		add(jbtHistory);
		add(jbtBook);
		add(jbtBookCheck);
			
		setBounds(300,150,1200,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
