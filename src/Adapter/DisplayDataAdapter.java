package Adapter;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdapter implements DatabaseDataConverter {
	

	@Override
	public List<DisplayData3rdParty> convertData(List<DatabaseData> data) {
		List<DisplayData3rdParty> resultList = new ArrayList<>();
		for(DatabaseData datum : data) {
			float index = datum.position;
			String position = Integer.toString(datum.amount);
			DisplayData3rdParty dd = new DisplayData3rdParty(index, position);
			resultList.add(dd);
		}
		return resultList;
	}

}
