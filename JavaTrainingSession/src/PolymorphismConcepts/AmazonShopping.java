package PolymorphismConcepts;

import java.util.HashMap;
import java.util.Map;

public class AmazonShopping extends HomeDepartment {

	public AmazonShopping(String item1, String item2, String item3) {
		super(item1, item2, item3);
		// TODO Auto-generated constructor stub
		
		
	}

	public static void main(String[] args) {

		
		Map<String,HomeDepartment> amazonMap = new HashMap<String,HomeDepartment>();
		
		HomeDepartment Livingroom = new HomeDepartment("Sofa","TV Unit","Speakers");
		HomeDepartment Kitchenroom = new HomeDepartment("Fridge","Cooker","Dishwasher");
		HomeDepartment Diningroom = new HomeDepartment("DiningTable","Chairs","Dinner Set");
		HomeDepartment Bedroom = new HomeDepartment("Bed","Matress","Bed Lamp");
		
		amazonMap.put("Living", Livingroom);
		amazonMap.put("Kitchen", Kitchenroom);
		amazonMap.put("Dining", Diningroom);
		amazonMap.put("Bedding", Bedroom);
		
		System.out.println("Amazon Home Department");
		System.out.println("**********************");
		
		for(Map.Entry<String, HomeDepartment> department:amazonMap.entrySet()) {
			
			String category = department.getKey();
			HomeDepartment hd = department.getValue();
			
			System.out.println(category+":"+hd.item1+","+hd.item2+","+hd.item3);
			
		}

	}

}
