/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;
import java.sql.*;

/**
 *
 * @author Dipendra
 */
public class TotalStudent {
    
    int getTotalStudent(){
      int total=0;
     DbConnection db = new DbConnection();
     Connection conn= db.getConnection();
        PreparedStatement pst;
        try{
            pst = conn.prepareStatement("SELECT count(*) as total from student");
            ResultSet rst = pst.executeQuery();
            if(rst.next()){
              total = rst.getInt("total");
            }
        }catch(SQLException ex){
         System.out.println(ex.getMessage());
        }
        return total;
    }
}
