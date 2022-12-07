
package com.emergentes.dao;

import com.emergentes.modelo.Mat_Par;
import com.emergentes.utiles.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Mat_ParDAOimpl extends ConexionDB implements Mat_ParDAO{

    @Override
    public void insert(Mat_Par matpar) throws Exception {
        try {
            this.Conectar();
            String sql = "INSERT INTO mat_par (id_materia,id_paralelo) values (?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);

            //ps.setInt(1, matparalelo.getId());
            ps.setInt(1, matpar.getId_materia());
            ps.setInt(2, matpar.getId_paralelo());
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        }

    @Override
    public void update(Mat_Par matpar) throws Exception {
        try {
            this.Conectar();
            String sql = "UPDATE mat_par SET id_materia=?, id_paralelo=? WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, matpar.getId_materia());
            ps.setInt(2, matpar.getId_paralelo());
            ps.setInt(3, matpar.getId());
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
            String sql = "DELETE FROM mat_par WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
       }

    @Override
    public Mat_Par getById(int id) throws Exception {
        Mat_Par mp = new Mat_Par();

        try {
            this.Conectar();
            String sql = "SELECT * FROM mat_par WHERE id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mp.setId(rs.getInt("id"));
                mp.setId_materia(rs.getInt("id_materia"));
                mp.setId_paralelo(rs.getInt("id_paralelo"));
      

            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return mp;
        }

    @Override
    public List<Mat_Par> getAll() throws Exception {
         List<Mat_Par> lista = null;
        try {
            this.Conectar();
            //revizar
            String sql = "select mp.*, concat('Nivel ',m.nivel,' - ', m.nombre,' (',m.sigla,') ',' - Par. ',p.nombre_paralelo) as mat_par ";
            sql += "from materia m, paralelo p, mat_par mp ";
            sql += "where m.id=mp.id_materia AND p.id=mp.id_paralelo ";
            sql += "ORDER BY m.nivel, m.nombre, p.nombre_paralelo ";
           
           //String sql="select mp.*, concat( m.nombre,' - Par. ',p.nombre_paralelo) as mat_par from materia m, paralelo p, mat_par mp where m.id=mp.id_materia AND p.id=mp.id_paralelo";

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Mat_Par>();
            while (rs.next()) {
                Mat_Par mp = new Mat_Par();

                mp.setId(rs.getInt("id"));
                mp.setId_materia(rs.getInt("id_materia"));
                mp.setId_paralelo(rs.getInt("id_paralelo"));
                mp.setMat_par1(rs.getString("mat_par"));

                lista.add(mp);
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
