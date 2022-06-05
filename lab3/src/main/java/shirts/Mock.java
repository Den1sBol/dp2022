package shirts;

import java.util.ArrayList;
import java.util.List;

public class Mock {

	private List<Shirt> shirtList = new ArrayList<>();
	
	public Mock () {
		this.shirtList.add(new Shirt(0, "White", 17));
		this.shirtList.add(new Shirt(1, "Blue", 20));
		this.shirtList.add(new Shirt(2, "Red", 13));
	}

	public List<Shirt> getShirtList() {
		return shirtList;
	}

	public void setShirtList(List<Shirt> shirtList) {
		this.shirtList = shirtList;
	}
	
	
}
