package spring;

import java.util.List;

import spring.*;

public class MotorcycleService {

    private static MotorcycleDao motorcycleDao;
 
    public MotorcycleService() {
        motorcycleDao = new MotorcycleDao();
    }

    public void update(Motorcycle entity) {
        motorcycleDao.update(entity);
    }
 
    public Motorcycle findById(Integer id) {
        Motorcycle moto = motorcycleDao.findById(id);
        return moto;
    }

    public void delete(Integer id) {
        Motorcycle moto = motorcycleDao.findById(id);
        motorcycleDao.delete(moto);
    }

    public List<Motorcycle> findAll() {
        List<Motorcycle> motorcycles = motorcycleDao.findAll();
        return motorcycles;
    }

    public MotorcycleDao getMotorcycleDao() {
        return motorcycleDao;
    }

    public void setMotorcycleDao(MotorcycleDao motorcycleDao){
	this.motorcycleDao = motorcycleDao;
    }
}
