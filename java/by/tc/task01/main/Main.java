package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		//Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		//criteriaOven.add(SearchCriteria.Oven.WIDTH.toString(), 59.5);
////
		//appliance = service.find(criteriaOven);
		//PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		//Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		//criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
		//criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);
////
		//appliance = service.find(criteriaOven);
////
		//PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14525);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 8000);
////
		appliance = service.find(criteriaTabletPC);// find(Object...obj)
////
		PrintApplianceInfo.print(appliance);

	}

}
