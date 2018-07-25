package spring.dao;

import spring.dto.*;
import spring.dao.*;
import java.util.List;
import java.sql.*;

public interface MotorcycleDaoImpl{

    public void update(Motorcycle entity);

    public void delete(Motorcycle entity);

    public List<Motorcycle> findAll();

    public Motorcycle findById(Integer id);

}