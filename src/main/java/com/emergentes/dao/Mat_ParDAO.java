package com.emergentes.dao;

import com.emergentes.modelo.Mat_Par;
import java.util.List;

public interface Mat_ParDAO {
    public void insert(Mat_Par matpar) throws Exception;
    public void update(Mat_Par matpar) throws Exception;
    public void delete(int id) throws Exception;
    public Mat_Par getById(int id) throws Exception;
    public List<Mat_Par> getAll() throws Exception;
}
