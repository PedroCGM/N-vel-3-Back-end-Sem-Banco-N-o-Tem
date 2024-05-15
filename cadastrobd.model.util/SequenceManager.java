/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cadastrobd.model;

import cadastrobd.model.util.ConectorBD;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SequenceManager {
    public static int getValue(String sequenceName) throws SQLException {
        int value;
        try (ResultSet rs = ConectorBD.getSelect("SELECT NEXT VALUE FOR " + sequenceName + " AS value")) {
            rs.next();
            value = rs.getInt("value");
        }
        return value;
    }

    private SequenceManager() {
    }
}

