
package com.emergentes.dao;

import com.emergentes.modelo.CatUsusario;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CatUsuarioDAOimpl extends ConexionDB implements CatUsuarioDAO{

    @Override
    public void insert(CatUsusario catusuario) throws Exception {
        try {
            this.Conectar();
            PreparedStatement ps = this.conn.prepareStatement("INSERT INTO cat_usuario(descripcion) VALUES (?)");
            ps.setString(1, catusuario.getDescripcion());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(CatUsusario catusuario) throws Exception {
        try {
            this.Conectar();
            PreparedStatement ps = this.conn.prepareStatement("UPDATE cat_usuario SET descripcion=? WHERE id=?");
            ps.setString(1, catusuario.getDescripcion());
            ps.setInt(2, catusuario.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id) throws Exception {
        try {
            this.Conectar();
            PreparedStatement ps = this.conn.prepareStatement("DELETE FROM cat_usuario WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public CatUsusario getById(int id) throws Exception {
        CatUsusario objeto = new CatUsusario();
        try {
            this.Conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM cat_usuario where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                objeto.setId(rs.getInt("id"));
                objeto.setDescripcion(rs.getString("descripcion"));

            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }

        return objeto;
    }

    @Override
    public List<CatUsusario> getAll() throws Exception {
        List<CatUsusario> lista = null;
        try {
            this.Conectar();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM cat_usuario");
            ResultSet rs = ps.executeQuery();

            lista = new ArrayList<CatUsusario>();
            while (rs.next()) {
                CatUsusario objeto = new CatUsusario();
                objeto.setId(rs.getInt("id"));
                objeto.setDescripcion(rs.getString("descripcion"));
                lista.add(objeto);
            }
            rs.close();
            ps.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }

        return lista;
    }
}
