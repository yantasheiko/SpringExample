package src.test.java.ru.maven;

import org.testng.*;
import org.testng.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import spring.*;
import java.util.*;
import org.springframework.test.context.*;
import org.springframework.test.context.testng.*;

@org.junit.runner.RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
public class TestDao extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	private CarService carService;
	@Autowired
	private MotorcycleService motorcycleService;

	@BeforeMethod
	public void setUp() throws Exception {
		carService = new CarService();
		motorcycleService = new MotorcycleService();
	}

	@Test
	public void testCarFindAll() throws Exception {
  		List<Car> list;
  		list = carService.findAll();
  		Assert.assertNotNull(list);
	}

	@Test
	public void testMotorcycleFindAll() throws Exception {
		List<Motorcycle> list;
		list = motorcycleService.findAll();
		Assert.assertNotNull(list);
	}

	@Test
	public void testCarFindById() throws Exception {
		int i = 1;
		Car car = (Car) carService.findById(i);
		Assert.assertNotNull(car);
	}

	@Test
	public void testMotorcycleFindById() throws Exception {
		int i = 2;
		Motorcycle moto = (Motorcycle) motorcycleService.findById(i);
		Assert.assertNotNull(moto);
	}

	@Test
	public void testCarUpdate() throws Exception {
		Car carUpd = new Car("BMW", "F02", 4);
		carService.update(carUpd);
			Car car = new Car();
			List<Car> list = carService.findAll();
	   		Iterator<Car> i = list.iterator();
			for (int a = 1; a <= 4; a++) {
				car = i.next();
            		}
			Assert.assertEquals(car.getCarName(), "BMW");
			Assert.assertEquals(car.getCarModel(), "F02");
	}

	@Test
	public void testMotorcycleUpdate() throws Exception {
		Motorcycle motoUpd = new Motorcycle("Kawasaki", "Concours", 3);
		motorcycleService.update(motoUpd);
			Motorcycle moto = new Motorcycle();
			List<Motorcycle> list = motorcycleService.findAll();
			Iterator<Motorcycle> iter = list.iterator();
         		for (int a = 1; a <= 3; a++) {
				moto = iter.next();
            		}
			Assert.assertEquals(moto.getMotorcycleName(), "Kawasaki");
			Assert.assertEquals(moto.getMotorcycleModel(), "Concours");
			Assert.assertEquals(moto.getId().toString(), "3");
	}

	@Test(expectedExceptions = { IllegalArgumentException.class, NoSuchElementException.class } )
	public void testCarDelete() throws Exception {
		Car carUpd = new Car();
		carUpd.setId(5);
		carService.delete(carUpd.getId());
			Car car = new Car();
			List<Car> list = carService.findAll();
			Iterator<Car> i = list.iterator();
			Assert.assertEquals(4, list.size());
			for (int a = 1; a <= 5; a++){
				car = i.next();
				Assert.assertEquals(car.getId().toString(), String.valueOf(a));
			}
	}

	@Test(expectedExceptions = { IllegalArgumentException.class, NoSuchElementException.class } )
	public void testMotorcycleDelete() throws Exception {
		Motorcycle motoDel = new Motorcycle();
		motoDel.setId(6);
		motorcycleService.delete(motoDel.getId());
			Motorcycle moto = new Motorcycle();
			List<Motorcycle> list = motorcycleService.findAll();
			Iterator<Motorcycle> iter = list.iterator();
			Assert.assertEquals(5, list.size());
			for (int a = 1; a <= 6; a++){
				moto = iter.next();
				Assert.assertEquals(moto.getId().toString(), String.valueOf(a));
			}
	}

}
