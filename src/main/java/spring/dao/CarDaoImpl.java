package spring.dao;

import spring.dto.*;
import spring.dao.*;
import java.util.List;
import java.sql.*;

public interface CarDaoImpl {

    public List<Car> findAll();

    public void update(Car entity);

    public void delete(Car entity);

    public Car findById(Integer id);

}