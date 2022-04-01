package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO{

public Appliance find(Criteria criteria){
	Appliance appliance = new Appliance();
	int num;
	Map<String, Object> criterias_in_db = new HashMap<>();
	ArrayList<Object> criteriasArray = new ArrayList<>();
	ArrayList<Appliance> founded = new ArrayList<>();
	List<Object> criterias = new ArrayList<Object>(criteria.getCriteria().values());
	String[] strings;
	String[] subStr;
	String dbFile = Objects.requireNonNull(getClass().getClassLoader().getResource("appliances_db.txt")).getPath();
	try {
		File file = new File(dbFile);
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		String line = reader.readLine();
		while (line != null) {
			num = 0;
			if (line.contains(criteria.getGroupSearchName())){
				for (Object o:criterias) {
					if (line.contains(o.toString())){++num;}
				}
				if (num == criterias.size()){
					appliance = workWithString(line,criteria);
				}
			}
			line = reader.readLine();
		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return appliance;
}

private Appliance workWithString(String line, Criteria criteria){
	String[] subStr;
	String[] subsubStr;
	Map<String, String> found = new HashMap<>();
	String delimeter = " "; // Разделитель
	line = line.replace(":", "");
	line = line.replace(";", "");
	line = line.replace(",", "");
	line = line.replace(criteria.getGroupSearchName().toString(), "");
	line = line.substring(2);
	subStr = line.split(delimeter);
	for (int i = 0; i < subStr.length; i++) {
		subsubStr = subStr[i].split("=");
		found.put(subsubStr[0],subsubStr[1]);
	} // добавляем в found критерии низ строки, которая подходит по заданным значениям
	return createEntity(found, criteria);
}

private Appliance createEntity(Map<String, String> criteria, Criteria criteria2){
		Appliance appliance = new Appliance();
		switch (criteria2.getGroupSearchName()){
			case "Oven":
				appliance = new Oven(
						Integer.parseInt(criteria.get("POWER_CONSUMPTION")),
						Integer.parseInt(criteria.get("WEIGHT")),
						Integer.parseInt(criteria.get("CAPACITY")),
						Integer.parseInt(criteria.get("DEPTH")),
						Double.parseDouble(criteria.get("HEIGHT")),
						Double.parseDouble(criteria.get("WIDTH"))
				);
				break;
			case "Laptop":
				appliance = new Laptop(
						Integer.parseInt(criteria.get("BATTERY_CAPACITY")),
						criteria.get("OS"),
						Integer.parseInt(criteria.get("MEMORY_ROM")),
						Integer.parseInt(criteria.get("SYSTEM_MEMORY")),
						criteria.get("CPU"),
						Double.parseDouble(criteria.get("DISPLAY_INCHES"))
				);
				break;
			case "Refrigerator":
				appliance = new Refrigerator(
						Integer.parseInt(criteria.get("POWER_CONSUMPTION")),
						Integer.parseInt(criteria.get("WEIGHT")),
						Integer.parseInt(criteria.get("FREEZER_CAPACITY")),
						Integer.parseInt(criteria.get("OVERALL_CAPACITY")),
						Double.parseDouble(criteria.get("HEIGHT")),
						Double.parseDouble(criteria.get("WIDTH"))
				);
				break;
			case "VacuumCleaner":
				appliance = new VacuumCleaner(
						Integer.parseInt(criteria.get("POWER_CONSUMPTION")),
						criteria.get("FILTER_TYPE"),
						criteria.get("BAG_TYPE"),
						criteria.get("WAND_TYPE"),
						Boolean.parseBoolean(criteria.get("MOTOR_SPEED_REGULATION")),
						Integer.parseInt(criteria.get("CLEANING_WIDTH"))
				);
				break;
			case "TabletPC":
				appliance = new TabletPC(
						Integer.parseInt(criteria.get("BATTERY_CAPACITY")),
						Integer.parseInt(criteria.get("DISPLAY_INCHES")),
						Integer.parseInt(criteria.get("MEMORY_ROM")),
						Integer.parseInt(criteria.get("FLASH_MEMORY_CAPACITY")),
						criteria.get("COLOR")
				);
				break;
			case "Speakers":
				appliance = new Speakers(
						Integer.parseInt(criteria.get("POWER_CONSUMPTION")),
						Integer.parseInt(criteria.get("NUMBER_OF_SPEAKERS")),
						Integer.parseInt(criteria.get("FREQUENCY_RANGE")),
						Integer.parseInt(criteria.get("CORD_LENGTH"))
				);
				break;
		}
		return appliance;
	}
}


