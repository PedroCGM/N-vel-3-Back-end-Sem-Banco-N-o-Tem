/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cadastrobd.model;

import java.sql.SQLException;

public class ConectorBD {
    public static void getConnection() throws SQLException {
        System.out.println("Conexão estabelecida com o banco de dados.");
    }

    private ConectorBD() {
    }
}
