package javaapplication1;

import java.sql.CallableStatement;
import java.sql.Types;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dell
 */
public class User {

    public String firstname, lastname, username, email, password, userid;
    public String cname, commnet, vehiclePlate, resID, lotid, spaceid, pdate,ptime;
    public int rating;
    ConnectionToDB con = new ConnectionToDB();
    Connection connection = con.establishConnection();
    ResultSet res = null;

    public User(String firstname, String lastname, String username, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public int getAvailableSpaceID(int LotID) {
        int SpaceID = 0;
        try {
            // Execute the first query (assuming getUserDetail is a table-valued function)
            String sqlQuery = "select dbo.getAvailableSpaceID(?) AS SpaceID";
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            callableStatement.setInt(1, LotID);

            // Execute the query and retrieve the result set
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                if (res.next()) {
                    SpaceID = (res.getInt("SpaceID"));
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return SpaceID;
    }

    public int getLotBySub(String Cat) {
        int LotID = 0;
        try {
            // Execute the first query (assuming getUserDetail is a table-valued function)
            String sqlQuery = "SELECT dbo.getLotBySub(?) AS LotID";
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            callableStatement.setString(1, Cat);

            // Execute the query and retrieve the result set
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                if (res.next()) {
                    LotID = (res.getInt("LotID"));
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return LotID;
    }

    public void requestParking(String username, String LicPlate, String LotID, String SpaceID) {
        String sqlQuery = "{call requestParking(?,?,?,?)}";
        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            callableStatement.setInt(1, Integer.parseInt(username));
            callableStatement.setString(2, LicPlate);
            callableStatement.setInt(3, Integer.parseInt(LotID));
            callableStatement.setInt(4, Integer.parseInt(SpaceID));


            callableStatement.execute();
            JOptionPane.showMessageDialog(null, "Request Submitted!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void checkout(int userID, int resID, String eHours, float total) {
        String sqlQuery = "{call checkout(?,?,?,?)}";
        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            callableStatement.setString(1, userid);
            callableStatement.setInt(2, resID);
            callableStatement.setString(3, eHours);
            callableStatement.setFloat(4, total);
            callableStatement.execute();
            JOptionPane.showMessageDialog(null, "Checkout done!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<String> getUserReservationIDs(String username) {
        ArrayList<String> resList = new ArrayList<>();
        String sqlQuery = "Select * from dbo.getUserReservationIDs(?)";
        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            callableStatement.setString(1, username);
            callableStatement.executeQuery();
            res = callableStatement.getResultSet();
            while (res.next()) {
                resList.add(res.getString("ReservationID"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return resList;

    }

    public void submitFeedback(int resID, String comment, int rating) {
        String sqlQuery = "{call submitFeedback(?,?,?)}";
        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);

            // Set input parameters
            callableStatement.setInt(1, resID);
            callableStatement.setString(2, comment);
            callableStatement.setInt(3, rating);

            // Execute the stored procedure
            callableStatement.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void signup(String username, String FirstName, String LastName, String Email, String Password, String usertype) {
        String sqlQuery = "{call proc_Sign_up(?,?,?,?,?,?)}";
        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);

            // Set input parameters
            callableStatement.setString(1, username);
            callableStatement.setString(2, FirstName);
            callableStatement.setString(3, LastName);
            callableStatement.setString(4, Email);
            callableStatement.setString(5, Password);
            callableStatement.setString(6, usertype);

            // Execute the stored procedure
            callableStatement.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<User> viewAllReservations() {
        ArrayList<User> uList = new ArrayList<>();
        String sqlQuery = "Select * from viewReservations";

        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                while (res.next()) {
                    User u = new User();

                    u.resID=res.getString("ReservationID");
                    u.cname=res.getString("Name");
                    u.vehiclePlate=res.getString("VehiclePlate");
                    u.lotid=res.getString("LotID");
                    u.spaceid=res.getString("SpaceID");
                    u.pdate=res.getString("ParkDate");
                    u.ptime=res.getString("ParkTime");
                    System.out.println(u.resID+u.cname+u.vehiclePlate+u.lotid+u.spaceid+u.pdate+u.ptime);
                    uList.add(u);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return uList;
    }
    
     public ArrayList<User> viewAllUsers() {
        ArrayList<User> uList = new ArrayList<>();
        String sqlQuery = "Select * from viewUsers";

        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                while (res.next()) {
                    User u = new User();

                    u.userid = res.getString("UserID");
                    u.username = (res.getString("Username"));
                    u.firstname = res.getString("FirstName");
                    u.lastname = res.getString("LastName");
                    u.email = res.getString("Email");
                    u.password = res.getString("Password");

//                    System.out.println(m.getiName() + m.getiDescription() + m.getiPrice());
                    uList.add(u);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return uList;
    }


    public ArrayList<User> viewAllFeedback() {
        ArrayList<User> uList = new ArrayList<>();
        String sqlQuery = "Select * from viewAllFeedbacks";

        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                while (res.next()) {
                    User u = new User();

                    u.commnet = res.getString("Comment");
                    u.cname = (res.getString("CustomerName"));
                    u.rating = res.getInt("Rating");
                    uList.add(u);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return uList;
    }

    public ArrayList<User> viewUserVehicles() {
        ArrayList<User> uList = new ArrayList<>();
        String sqlQuery = "Select * from viewUserVehicles";

        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                while (res.next()) {
                    User u = new User();

                    u.resID = res.getString("ReservationID");
                    u.cname = (res.getString("CustomerName"));
                    u.vehiclePlate = res.getString("VehiclePlate");
                    uList.add(u);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return uList;
    }

    public int getReservedUserID(String username) {
        int resID = 0;
        String sqlQuery = "SELECT dbo.getReservedUserID(?) AS ReservationID"; // Assuming dbo is the schema, modify it if needed
        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            callableStatement.setString(1, username);
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                if (res.next()) {
                    resID = (res.getInt("ReservationID"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return resID;
    }
    
    

    public float getTotalAmount(String eHours, int resID) {
        float total = 0;
        String sqlQuery = "SELECT dbo.getTotalAmount(?,?) AS Charges"; // Assuming dbo is the schema, modify it if needed
        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            callableStatement.setString(1,eHours);
            callableStatement.setInt(2, resID);
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                if (res.next()) {
                    total = (res.getInt("Charges"));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return total;
    }

    public String loginUser(String Username, String Password, String role) {
        String result = "";
        String sqlQuery = "{? = call loginUser(?,?,?)}";
        try {
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);

            callableStatement.registerOutParameter(1, Types.VARCHAR);

            // Set input parameters
            callableStatement.setString(2, Username);
            callableStatement.setString(3, Password);
            callableStatement.setString(4, role);

            // Execute the stored procedure
            callableStatement.execute();

            // Retrieve the result from the output parameter
            result = callableStatement.getString(1);

        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public User getUserDetail(String Username, String Password) {
        try {
            // Execute the first query (assuming getUserDetail is a table-valued function)
            String sqlQuery = "SELECT * FROM dbo.getUserDetail(?, ?)";
            CallableStatement callableStatement = connection.prepareCall(sqlQuery);
            callableStatement.setString(1, Username);
            callableStatement.setString(2, Password);

            // Execute the query and retrieve the result set
            if (callableStatement.execute()) {
                res = callableStatement.getResultSet();
                if (res.next()) {
                    userid = (res.getString("UserID"));
                    username = (res.getString("Username"));
                    firstname = (res.getString("FirstName"));
                    lastname = (res.getString("LastName"));
                    email = (res.getString("Email"));
                    password = (res.getString("Password"));
                    System.out.println(firstname + lastname + email + password + userid);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // Continue processing as needed
        return this;
    }

}
