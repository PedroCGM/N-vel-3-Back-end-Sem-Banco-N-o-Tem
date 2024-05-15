/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cadastrobd;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaJuridicaDAO {
    public PessoaJuridica getPessoa(int id) throws SQLException {
        // Simulação de consulta no banco de dados
        return null;
    }

    public List<PessoaJuridica> getPessoas() throws SQLException {
        // Simulação de consulta no banco de dados
        return new ArrayList<>();
    }

    public void incluir(PessoaJuridica pessoaJuridica) throws SQLException {
        // Simulação de inclusão no banco de dados
        System.out.println("Pessoa jurídica incluída no banco de dados.");
    }

    public void alterar(PessoaJuridica pessoaJuridica) throws SQLException {
        // Simulação de alteração no banco de dados
        System.out.println("Pessoa jurídica alterada no banco de dados.");
    }

    public void excluir(int id) throws SQLException {
        // Simulação de exclusão no banco de dados
        System.out.println("Pessoa jurídica excluída do banco de dados.");
    }
}
