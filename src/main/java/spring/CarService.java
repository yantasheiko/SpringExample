package spring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.*;


public class CarService {

    private static CarDao carDao;
 
    public CarService() {
        carDao = new CarDao();
    }

    public void update(Car entity) {
        carDao.update(entity);
    }
 
    public Car findById(Integer id) {
        Car car = carDao.findById(id);
        return car;
    }

    public void delete(Integer id) {
        Car car = carDao.findById(id);
        carDao.delete(car);
    }

    public List<Car> findAll() {
        List<Car> cars = carDao.findAll();
        return cars;
    }

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {

		this.carDao = carDao;

    }


}
