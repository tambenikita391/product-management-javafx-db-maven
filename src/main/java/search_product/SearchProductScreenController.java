package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;


public class SearchProductScreenController 
{
	@FXML
	private TextField productNameToSearch;
	
	@FXML
	private TextField productID;
	
	@FXML
	private TextField productName;
	
	@FXML
	private TextField price;
	
	@FXML
	private TextField category;
	
	@FXML
	private TextField quantity;
	
	@FXML
	private Label userMessage;
	
	
	public void search(ActionEvent event)
	{
		boolean status = searchProduct(productNameToSearch.getText());
		if(status)
		{
			searchProduct(null);
			userMessage.setText("Product searched Successfully!!");	
		}
		else {
			userMessage.setText("Product not found!!");	
		}
	}
	
	public boolean searchProduct(String productNameToSearch)
	{
		String query = "select * from product where productName='"+productNameToSearch+"' ";
		ResultSet rs = DBUtils.executeQueryGetResult(query);
		
		try {
			if(rs.next())
			{
				productID.setText(rs.getString("productID"));
				productName.setText(rs.getString("productName"));
				price.setText(rs.getString("price"));
				category.setText(rs.getString("category"));
				quantity.setText(rs.getString("quantity"));
				
				return true;			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void delete(ActionEvent event)
	{
		String query = "DLETE FROM product WHERE productName='"+productNameToSearch.getText()+"' ";
		DBUtils.executeQuery(query);
		
	}
	
	public void back(ActionEvent event) throws Exception
	{
		ProductManagementScreen.showProductManagementScreen();
	}

}
