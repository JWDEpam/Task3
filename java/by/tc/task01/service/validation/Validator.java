package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.Map;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		Map<String, Object> criterias = criteria.getCriteria();

		ArrayList<Boolean> contains = new ArrayList<>();

		switch (criteria.getGroupSearchName()){
			case  ("Laptop"):
				for (SearchCriteria.Laptop s : SearchCriteria.Laptop.values()){
					if (criterias.containsKey(s.toString())){
						contains.add(true);
					}
				}
				break;
			case  ("Oven"):
				for (SearchCriteria.Oven s : SearchCriteria.Oven.values()){
					if (criterias.containsKey(s.toString())){
						contains.add(true);
					}
				}
				break;
			case  ("TabletPC"):
				for (SearchCriteria.TabletPC s : SearchCriteria.TabletPC.values()){
					if (criterias.containsKey(s.toString())){
						contains.add(true);
					}
				}
				break;
			case  ("Refrigerator"):
				for (SearchCriteria.Refrigerator s : SearchCriteria.Refrigerator.values()){
					if (criterias.containsKey(s.toString())){
						contains.add(true);
					}
				}
				break;
			case  ("VacuumCleaner"):
				for (SearchCriteria.VacuumCleaner s : SearchCriteria.VacuumCleaner.values()){
					if (criterias.containsKey(s.toString())){
						contains.add(true);
					}
				}
				break;
			case  ("Speakers"):
				for (SearchCriteria.Speakers s : SearchCriteria.Speakers.values()){
					contains.add(criterias.containsKey(s));
				}
				break;
		}
		return contains.size() == criterias.size();
	}

}

//you may add your own new classes