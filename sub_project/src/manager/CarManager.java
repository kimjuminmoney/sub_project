package manager;

import java.awt.Button;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import manager.BookingManagerTap;
import manager.CalculateTap;
import manager.InventoryManagerTap;
import manager.MyInformationTap;
import manager.OrderManagerTap;

public class CarManager extends JFrame {

	
	private JTabbedPane jtp;
	
	
	public CarManager() {
		super("MYCAR");
		jtp=new JTabbedPane();
		
		
		//상단 탭
		CarManagerTab cmt1=new CarManagerTab(); 
		InventoryManagerTap cmt2=new InventoryManagerTap(); 
		OrderManagerTap cmt3=new OrderManagerTap(); 
		BookingManagerTap cmt4=new BookingManagerTap(); 
		CalculateTap cmt5=new CalculateTap(); 
		MyInformationTap cmt6=new MyInformationTap(); 
		
		
		
		setLayout(null);
		
		jtp.add(cmt1,"차 량 관 리");
		jtp.add(cmt2,"재 고 관 리");
		jtp.add(cmt3,"발 주 관 리");
		jtp.add(cmt4,"예 약 관 리");
		jtp.add(cmt5," 정    산 ");
		jtp.add(cmt6,"내   정 보");
		
		
		//글씨
		cmt1.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt2.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt3.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt4.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt5.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		cmt6.setFont(new Font("맑은 고딕",Font.PLAIN,12));
		
        
		//크기 조정 및 배치
		setBounds(300, 300, 1000, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//CarManager
	
	
	public static void main(String[] args) {
		new CarManager();
	}//main

}//class
