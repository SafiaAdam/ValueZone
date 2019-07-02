package Project.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Project.DTOs.Shopper;
import Project.DTOs.Voucher;
import Project.Interfaces.DaoInterface;

public class Dao implements DaoInterface {
	
	/********************  SQL COMMANDS ****************************/
	/******Shopper Commands**********/
	private final String ADD_SHOPPER="";
	private final String LIST_SHOPPERS="";
	/*******Voucher commands*********/
	private final String LIST_VOUCHERS="";
	private final String DOWNLOAD_VOUCHERS="";
	private final String REDEEM_VOUCHERS="";
	/***************************************************************/
	
	private Connection con;
	
	public Dao() {
		Connect();
	}
	
	@Override
	public void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(DaoInterface.url, DaoInterface.username, DaoInterface.password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addShopper() {
		
	}
	
	public ArrayList<Shopper> listShoppers(){
		try {
			ArrayList<Shopper> shoppers = new ArrayList();
			PreparedStatement ps = con.prepareStatement(LIST_SHOPPERS);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String email = rs.getString("email");
				String name=rs.getString("name");
				String surname= rs.getString("surname");
				String contactNumber= rs.getString("contactNumber");
				String physicalAdd = rs.getString("physicalAddress");
				Shopper shopper = new Shopper(email,name,surname,contactNumber,physicalAdd);
				shoppers.add(shopper);
				return shoppers;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Voucher> listVouchers(){
		
	}
	
	public void DownloadVoucher(String barcode) {
		
	}
	
	public void redeemVoucher(String barcode) {
		
	}
}
