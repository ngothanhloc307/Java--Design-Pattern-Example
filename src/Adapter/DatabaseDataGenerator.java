package Adapter;

import java.util.ArrayList;
import java.util.List;

public class DatabaseDataGenerator {
	
	public List<DatabaseData> generateData (){
		List<DatabaseData> list = new ArrayList<>();
		list.add(new DatabaseData(2, 2));
		list.add(new DatabaseData(3, 8));
		list.add(new DatabaseData(5, 42));
		
		return list;
	}

}
