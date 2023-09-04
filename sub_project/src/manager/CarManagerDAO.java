package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbConn.DbConn;

public class CarManagerDAO {
	private static CarManagerDAO cMDAO;
	
	private CarManagerDAO() {
		
	}
	
	public static CarManagerDAO getInstance() {
		if(cMDAO==null) {
			cMDAO=new CarManagerDAO();
		}
		return cMDAO;
	}
	
	public List<CarManagerVO> selectCarInfo(String strDate, String endDate) throws SQLException{
		List<CarManagerVO> list = new ArrayList<CarManagerVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		DbConn db = DbConn.getInstance();
		
		try {
			
		}finally {
			db.dbClose(rs, pstmt, con);
		}
		
		
		
		return list;
	}
	
	public CarManagerVO selectOneCarInfo(String carNo, String receivedDay) {
		CarManagerVO cVO = new CarManagerVO();
		
		return cVO;
	}
	
	public List<PartInfoVO> selectOnePartInfo(String partNo){
		List<PartInfoVO> list = new ArrayList<PartInfoVO>();
		
		
		return	 list;
	}
	
	public void insertCarInfo(CarManagerVO cVO) {
		
	}
	public void insertPartInfo(PartInfoVO pVO) {
		
	}
	
	public void updateCarInfo(String endDate) {
		
	}
	

}
