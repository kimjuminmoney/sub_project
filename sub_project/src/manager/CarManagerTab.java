package manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.Color;
//
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CarManagerTab extends JPanel {
	
	private JLabel CMName;
	
    private JScrollPane scrollPane;
    private JTable jtbCarInfoTable;
	
	private JTextField jtfStartDate;
	private JTextField jtfEndDate;
	private JButton jbDateSearch;
	
	private JButton jbtCarInfo;
	private JButton jbtCarAdd;
	private JButton jbtCarInfoModify;


    
    public CarManagerTab() {//
    	
        setLayout(new BorderLayout());
        
        String[] columnNames = {"차량번호", "모델명", "수리 내역", "입고일", "출고일", "비고"};

        String[][] data = { //확인용 데이터. 추후에 자료 받아와야함!
                {"123일 5678", "iX", "엔진오일 교체", "2023-08-23", "2023-08-25", ""},
                {"128조 3561", "컴페티션", "타이어 교체", "2023-08-23", "2023-08-27", ""},
                {"586화 1111", "어쩌고", "주유구 점검", "2023-08-30", "2023-08-31", ""},
                {"320이 3492", "저쩌고", "기어 교체", "2023-09-01", "2023-09-12", ""},
                {"932팅 1489", "얼씨고", "유리창 교체", "2023-09-18", "2023-09-23", ""},
                {"521아 6437", "절씨고", "시트 교체", "2023-09-25", "2023-09-27", ""},
                {"359자 5617", "알파고", "암튼 교체함", "2023-09-27", "2023-10-01", ""}
        };
        
        CMName = new JLabel("입고 차량관리");
        
        //정보 게시판
        jtbCarInfoTable = new JTable(data, columnNames);
        scrollPane = new JScrollPane(jtbCarInfoTable);
        
        //날짜, 검색
        jtfStartDate = new JTextField();
      	jtfEndDate = new JTextField();
      	jbDateSearch = new JButton();
      		
      	//하단 버튼
      	jbtCarInfo = new JButton("차량 정보");
      	jbtCarAdd = new JButton("차량 추가");
      	jbtCarInfoModify = new JButton("정보 수정");
      	
      	
        
        
        //추가
        setLayout(null);
        
        add("North", CMName);
        
        add("Center", scrollPane);
        
		add("Center", jtfStartDate);
		add("Center", jtfEndDate);
		add("Center", jbDateSearch);
		
		add("Center", jbtCarInfo);
		add("Center", jbtCarAdd);
		add("Center", jbtCarInfoModify);
		
		//크기 조정 및 배치
		
		CMName.setBounds(10, 6, 80, 20);
		
		scrollPane.setBounds(80, 50, 800, 400); // 테이블의 위치와 크기 설정
		
		jtfStartDate.setBounds(200, 500, 100, 30); // 시작 날짜 필드의 위치와 크기 설정
		jtfEndDate.setBounds(350, 500, 100, 30); // 종료 날짜 필드의 위치와 크기 설정
		jbDateSearch.setBounds(500, 500, 100, 30); // 검색 버튼의 위치와 크기 설정

		jbtCarInfo.setBounds(650, 550, 120, 30); // "차량 정보" 버튼의 위치와 크기 설정
		jbtCarAdd.setBounds(800, 550, 120, 30); // "차량 추가" 버튼의 위치와 크기 설정
		jbtCarInfoModify.setBounds(950, 550, 120, 30); // "정보 수정" 버튼의 위치와 크기 설정
		
		scrollPane.setVisible(true);
		setVisible(true);
        
        
    } //CarManagerTap1

 
    	
} //class
