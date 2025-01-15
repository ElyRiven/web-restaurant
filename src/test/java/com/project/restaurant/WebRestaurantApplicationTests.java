package com.project.restaurant;

import com.project.restaurant.entities.Dish;
import com.project.restaurant.servicio.IServiceDish;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.;

@SpringBootTest
class WebRestaurantApplicationTests {

	@Autowired
	public IServiceDish dishService;

	@Test
	void contextLoads() {

		Dish sopa=new Dish();
		Dish sopa2=new Dish();

		sopa.setName("Sopa1");
		sopa.setDescription("Sopa de verduras");
		sopa.setImageURL("https://www.google.com");
		sopa.setPrice(2.5);

		sopa2.setName("Sopa2");
		sopa2.setDescription("Sopa de pollo");
		sopa2.setImageURL("https://www.google.com");
		sopa2.setPrice(3.5);

//		dishService.saveDish(sopa);
//		dishService.saveDish(sopa2);

		for(Dish tmp:dishService.listDish()) {
			System.out.println(tmp.getIdDish()+" "+tmp.getName()+" "+tmp.getDescription()+" "+tmp.getImageURL()+" "+tmp.getPrice());
		}

//		dishService.deleteDish(1);
//		dishService.deleteDish(2);
	}
}
