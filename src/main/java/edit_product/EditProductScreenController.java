package edit_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import db_operations.DBUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class EditProductScreenController
{
	@FXML
	private TextField productNameToEdit;
	
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
	
	
	public void done(ActionEvent event) throws SQLException
	{
		boolean status = editProduct(productNameToEdit.getText());
		if(status)
		{
			editProduct(null);
			String updateQuery = "update product set "+ " productID='"+productID.getText()+"', productName='"+productName.getText()+"', price='"+price.getText()+"', category='"+category.getText()+"', quantity='"+quantity.getText()+"' "+ "where productName='"+productNameToEdit.getText()+"'";
			DBUtils.executeQuery(updateQuery);
			userMessage.setText("Product added successfully!!");
			
		}
					
		else
		{
			userMessage.setText("Product not added!!");	
			
		}
		
	}
	
	public boolean editProduct(String productNameToEdit) throws SQLException
	{
       String query = "select * from product where productName= '"+productNameToEdit+"'";
		
		ResultSet rs = DBUtils.executeQueryGetResult(query);
			try {
				if(rs.next())
				{
					productID.setText(rs.getString("productID"));
					productName.setText(rs.getString("productName"));
					price.setText(rs.getString("price"));
					category.setText(rs.getString("category"));
					quantity.setText(rs.getString("quantity"));
								
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return true;	
	}
	
	public void back(ActionEvent event) throws Exception
	{
		ProductManagementScreen.showProductManagementScreen();
	}
	
	
	

}
