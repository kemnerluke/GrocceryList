import java.util.ArrayList;

public class grocceryListProject {
private static ArrayList<String> groccerylist = new ArrayList<String>();
	
	public static void addGrocceryItem(String item) {
		groccerylist.add(item);
	}
	
	
	public static void printGrocceryList() {
		System.out.println("you have"+ groccerylist.size() +" items in your groccery list");
		for(int i=0;i<groccerylist.size();i++) {
			System.out.println((i+1)+"."+groccerylist.get(i));
		}
	}
	public static void modifyGrocceryItem(String currentItem, String newitem) {
		int position =groccerylist.indexOf(currentItem);
		if(position>=0) {
			modifyGrocceryItem(position,newitem);
		}
		
	}
	
	private static void modifyGrocceryItem(int position,String newitem) {
		groccerylist.set(position, newitem);
		System.out.println("groccery item is "+(position+1+"has been modified"));
	}
	
	public static void removeGrocceryItem(String newitem) {
		int position=groccerylist.indexOf(newitem);
		if(position>=0) {
			removeGrocceryItem(position);
		}
	}
	
	private static  void removeGrocceryItem(int position) {
		groccerylist.remove(position);
	}
	
	public static int findItem(String searchItem) {
	return groccerylist.indexOf(searchItem);
		
	}
	public static boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if(position>=0) {
			return true;
		}
		return false;
	}
}
