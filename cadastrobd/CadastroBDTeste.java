/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package cadastrobd;

import cadastrobd.model.PessoaFisica;
import cadastrobd.model.PessoaJuridica;
import cadastrobd.model.PessoaFisicaDAO;
import cadastrobd.model.PessoaJuridicaDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroBDTeste {
    public static void main(String[] args) {
        // Instanciar uma pessoa física e persistir no banco de dados
        PessoaFisica pessoaFisica = new PessoaFisica(21, "JJC", "Rua 11, Centro", "Riacho do Sul", "PA", "1111-1111", "joao@riacho.com", "11111111111");

        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        try {
            pessoaFisicaDAO.incluir(pessoaFisica);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroBDTeste.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Alterar os dados da pessoa física no banco
        pessoaFisica.setNome("JJC Alterado");
        try {
            pessoaFisicaDAO.alterar(pessoaFisica);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroBDTeste.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Consultar todas as pessoas físicas do banco de dados e listar no console
        List<PessoaFisica> pessoasFisicas = null;
        try {
            pessoasFisicas = pessoaFisicaDAO.getPessoas();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroBDTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Pessoas Físicas:");
        for (PessoaFisica pf : pessoasFisicas) {
            pf.exibir();
        }

        // Instanciar uma pessoa jurídica e persistir no banco de dados
        PessoaJuridica pessoaJuridica = new PessoaJuridica(21, "JJC", "Rua 11, Centro", "Riacho do Sul", "PA", "1212-1212", "jjc@riacho.com", "11111111111111");

        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
        try {
            pessoaJuridicaDAO.incluir(pessoaJuridica);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroBDTeste.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Alterar os dados da pessoa jurídica no banco
        pessoaJuridica.setNome("JJC Alterado");
        try {
            pessoaJuridicaDAO.alterar(pessoaJuridica);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroBDTeste.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Consultar todas as pessoas jurídicas do banco de dados e listar no console
        List<PessoaJuridica> pessoasJuridicas = null;
        try {
            pessoasJuridicas = pessoaJuridicaDAO.getPessoas();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroBDTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Pessoas Jurídicas:");
        for (PessoaJuridica pj : pessoasJuridicas) {
            pj.exibir();
        }

        try {
            // Excluir a pessoa jurídica criada anteriormente no banco
            pessoaJuridicaDAO.excluir(pessoaJuridica.getId());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroBDTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
