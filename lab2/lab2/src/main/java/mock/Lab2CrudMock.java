package mock;

import crud.Lab2CrudInterface;
import entity.Entity;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public Entity readEntity() {
		// TODO Auto-generated method stub
		return new Entity("T-shirt", 17, "red");
	}

	@Override
	public void updateEntity(Entity entity) {
		// TODO Auto-generated method stub

	}

}
