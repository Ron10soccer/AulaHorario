package com.emergentes.dao;

import com.emergentes.modelo.CatUsusario;
import java.util.List;

public interface CatUsuarioDAO {
     public void insert(CatUsusario catusuario) throws Exception;
    public void update(CatUsusario catusuario) throws Exception;
    public void delete(int catusuario) throws Exception;
    public CatUsusario getById(int id) throws Exception;
    public List<CatUsusario> getAll() throws Exception;
}
