package module1;

public class Main {

	public static void main(String[] args) {
		Bag<String> guitarBag = new Bag<>();
		
		// Add sample items to bag
		guitarBag.add("Gibson SG");
		guitarBag.add("Gibson Les Paul");
		guitarBag.add("Gibson ES-335");
		guitarBag.add("Gibson SG");
		guitarBag.add("Fender Stratocaster");
		guitarBag.add("Gretsch White Falcon");
		guitarBag.add("Fender Telecaster");
		
		// Print bag contents
		System.out.println("Bag contents:\n" + guitarBag.toString() + "\n");
		
		// Test contains()
		System.out.println("Contains \"Gibson SG\"?         " + guitarBag.contains("Gibson SG"));
		System.out.println("Contains \"Fender Telecaster\"? " + guitarBag.contains("Fender Telecaster"));
		System.out.println("Contains \"Ibanez JEM\"?        " + guitarBag.contains("Ibanez JEM") + "\n");
		
		// Test count()
		System.out.println("Count of \"Gibson SG\":         " + guitarBag.count("Gibson SG"));
		System.out.println("Count of \"Fender Telecaster\": " + guitarBag.count("Fender Telecaster"));
		System.out.println("Count of \"Ibanez JEM\":        " + guitarBag.count("Ibanez JEM") + "\n");
		
		// Test remove()
		guitarBag.remove("Fender Telecaster");
		System.out.println("Bag contents after removing one \"Fender Telecaster\":\n" + guitarBag);
		
		// Test contains() and count() for the removed element
		System.out.println("Contains \"Fender Telecaster\"? " + guitarBag.contains("Fender Telecaster"));
		System.out.println("Count of \"Fender Telecaster\": " + guitarBag.count("Fender Telecaster"));
	}

}
