package com.example.seanseapp;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    Connection conn;
    String un, password, ip, port, db;

    public Connection connect() {

        ip = "172.1.1.0";
        port = "1433";
        db = "Seanse";
        un = "sa";
        password = "admin";
        conn = null;
        String ConnURL = null;
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnURL = "jdbc:jtds:sqlserver://" + ip + ":" + port + ";"
                    + "databaseName=" + db + ";user=" + un + ";password="
                    + password + ";";
            conn = DriverManager.getConnection(ConnURL);
        } catch (SQLException e) {
            Log.d("Error", e.getMessage());
        } catch (ClassNotFoundException e) {
            Log.d("Error", e.getMessage());
        }
        return conn;
    }
}
