/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.ModelLivro;
import conexoes.ConexaoMySql;

/**
 *
 * @author PC
 */
public class DaoLivro {

    ConexaoMySql conexao = new ConexaoMySql();

    public int insert(ModelLivro livro) {
        try {
            conexao.conectar();
            return conexao.insertSQL(
                    "INSERT INTO clientes ("
                    + "id,"
                    + "livro,"
                    + "data"
                    + ") VALUES ("
                    + "'" + livro.getId() + "',"
                    + "'" + livro.getNome() + "',"
                    + "'" + livro.getDataCriacao() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }

}
