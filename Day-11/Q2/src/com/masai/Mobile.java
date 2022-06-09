package com.masai;
public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String name,String... model){
		for(String item:model) {
			int flag = 0;
			for(int i=0;i<outdatedModels.length;i++) {
				if(item.equals(outdatedModels[i])) {
					System.out.println(item+"_OUTDATED");
					flag = 1;
					break;
				}
			}
			if(flag!=1) {
			System.out.println(item+"_NOT_OUTDATED");
			}

		}
	}
	
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.searchOutdatedModel("Mi","note4","note5","note8","note9");
	}
	
	
}
