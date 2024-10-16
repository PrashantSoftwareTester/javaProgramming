package collectionFramework;

public class HashMapMethods {

	public static void main(String[] args) {
	
		//Methods in Hashmap:
		
		//1. m1.clear();  
		// used to remove all the mappings from the HashMap.
			
		//2.	m1.compute(null, null);
		//  the compute() method is used to compute a new value for the specified key.
			
		//3.	m1.computeIfAbsent(null, null);
		//  Using computeIfAbsent() method to add a value if the key is absent
			
		//4.	m1.computeIfPresent(null, null);
		//  Using computeIfPresent() method to update a value if the key is present
			
		//5.	m1.containsKey();
		//	Checking if the map contains a mapping for the key.
			
		//6.	m1.containsValue();
		//	used to check whether the map contains one or more mappings with a specific value. It returns true if the map contains at least one mapping with the specified value, and false otherwise
			
		//7.	m1.entrySet();
		//	the entrySet() method is used to obtain a set view of the mappings contained in the map. This method returns a set of Map.Entry objects, where each entry represents a key-value mapping in the HashMap.
		//  This method is particularly useful when you need to iterate over all the key-value pairs in the HashMap or when you want to perform operations that involve both keys and values simultaneously, such as filtering or transforming entries.	
			
			
		//8.	m1.equals();
		//  the equals() method is used to compare this HashMap instance with another object for equality. It returns true if the specified object is also a HashMap and has the same mappings as this HashMap. Otherwise, it returns false.
		//  This method is useful when you need to check whether two HashMaps contain the same mappings. Keep in mind that for two HashMaps to be considered equal, they must have the same mappings and must be of the same size.
			
			
		//9.	m1.forEach(null);
		//   We use the forEach() method to iterate over each entry in the HashMap  	
			
		//10.	m1.get();
		//	This method is useful when you need to retrieve values from the HashMap based on their corresponding keys
			
			
		//11.	m1.getClass();
		//	Checking the runtime class of the HashMap object
			
		//12.	m1.getOrDefault(it, null);
		//	This method is useful when you need to retrieve values from the HashMap based on their corresponding keys, and you want to specify a default value to be returned if the key doesn't exist in the map. It allows you to avoid potential NullPointerExceptions when retrieving values.
			
		//13.	m1.hashCode();
		//	internally, HashMap uses the hashCode() method of the "Banana" key to calculate its hash code and determine the bucket where the "Banana" key-value pair is stored. Then, it uses the equals() method to compare keys and retrieves the associated value.
		//  So, while you don't typically call hashCode() directly when working with HashMaps, it's essential to understand its role in the background of how HashMaps function.
			
			
		//14.	m1.isEmpty();
		//  This method is useful when you need to verify if a HashMap is empty before performing certain operations. For example, you might want to avoid iterating over an empty map or avoid unnecessary processing if the map is empty.
			
		//15.	m1.keySet();
		//  the keySet() method is used to obtain a set view of the keys contained in the map. It returns a Set containing all the keys present in the HashMap.	
		//  This method is useful when you need to work with the keys of the HashMap separately, such as iterating over them, performing operations on them, or passing them to other methods that expect a collection of keys.	
			
			
		//16. m1.merge(null, null, null);
		//The merge() method is useful when you want to perform a conditional update on the HashMap, based on whether the key is present or not, and how to combine the old and new values.
			
		//17.	m1.notify();
		// The notify() method is used in conjunction with the wait() method for inter-thread communication in Java.
		//	It wakes up a single thread that is waiting on the object on which notify() is called. 	
		//The notifyAll() method can be used to wake up all threads waiting on the object.	
			
			
		//18.	m1.notifyAll();
		//	The notifyAll() method is used in conjunction with the wait() method for inter-thread communication in Java.
		//	It wakes up all threads that are waiting on the object on which notifyAll() is called.
			
			
		//19.	m1.put(null, null);
		//  We add some key-value pairs to the HashMap using the put() method. 	
			
		//20.	m1.putAll();
		//  This method is useful when you want to combine mappings from one map into another. It allows you to efficiently copy all mappings from one map into another without having to iterate over each entry individually.	
			
		//21.	m1.putIfAbsent(null, null);
		//  This method is useful when you want to insert a new mapping into the map only if the key is not already associated with a value or is associated with null. It helps in scenarios where you want to avoid overwriting existing mappings with new values.	
			
		//22.	m1.remove(it);
		//  The remove(Object key) method in Java's HashMap is used to remove the mapping for a specified key from the map if it is present. It returns the value associated with the key that was removed, or null if the key was not found in the map. 	
		//  This method is useful when you want to remove a specific key-value mapping from the map. It helps in scenarios where you want to delete specific data from the map based on the keys.	
			
		//23.	m1.remove(m1, it);
		//	remove(Object key, Object value) method, which is used to remove the entry for the specified key only if it is currently mapped to the specified value. If the key is not mapped to the specified value or if the key is not found in the map, the map remains unchanged.
		//  This method is useful when you want to remove a specific key-value mapping from the map only if the key is mapped to a particular value. It helps in scenarios where you want to ensure that the removal is conditional on both the key and the value.
		
		//24.	m1.replace(null, null);
		//	In Java's HashMap, the replace(K key, V value) method is used to replace the value associated with the specified key with the specified value in the map if the key is present and mapped to a non-null value. If the key is not present or is mapped to a null value, the map remains unchanged.
		// This method is useful when you want to replace the value associated with a specific key in the map. It helps in scenarios where you want to update the value for an existing key without adding a new key-value pair or when you need to ensure that the replacement is conditional on the presence of the key and its current value.	
			
		//25.	m1.replace(null, null, null);
		// 	The replace(K key, V oldValue, V newValue) method in Java's HashMap is used to replace the value associated with a specified key only if it is currently mapped to a specified old value. If the key is not present or if the old value does not match the current value associated with the key, the map remains unchanged.
		//  This method is useful when you want to replace the value associated with a specific key in the map, but only if it matches a certain condition (e.g., the current value is a specific value). It helps in scenarios where you want to update the value for an existing key conditionally.	
			
		//26.	m1.replaceAll(null);
		//  In Java's HashMap, the replaceAll(BiFunction<? super K,? super V,? extends V> function) method is used to replace each value in the map with the result of applying the given function to the key and its current associated value.	
		// This method is useful when you want to update all values in the map based on some transformation logic. It allows you to modify the values of the map in place without changing the keys.	
		// hashMap.replaceAll((key, value) -> value * value);	
			
		//27.	m1.size();
		// In Java's HashMap, the size() method is used to get the number of key-value mappings present in the map. It returns an integer value representing the number of mappings (entries) in the HashMap.	
		// This method is useful when you want to determine the number of mappings in the HashMap, which can be helpful for various purposes such as checking the emptiness of the map or understanding its current state.	
			
		//28.	m1.toString();
		//	In Java's HashMap, the toString() method is used to return a string representation of the HashMap object. This string representation consists of a list of key-value mappings enclosed in curly braces {}, with each key-value pair separated by a comma ,. Each key-value pair is represented as key=value.
		//  This method is useful when you want to quickly view the contents of the HashMap as a string, which can be helpful for debugging purposes or for displaying the contents of the map in a readable format.	
			
		//29.	m1.values();
		//  In Java's HashMap, the values() method is used to obtain a Collection view of the values contained in the map. This Collection view allows you to access the values in the HashMap, but it does not provide direct access to the map's underlying values. Changes made to the map will be reflected in the Collection view, and vice versa.	
		//  This method is useful when you want to iterate over or perform operations on the values of the HashMap without needing to iterate over the keys explicitly. It provides a convenient way to access and manipulate the values stored in the HashMap.	
			
		//30.	m1.wait();
		//In Java's HashMap, the wait() method is not specifically utilized as part of its functionality. The wait() method is inherited from the Object class and is primarily used for synchronization and thread communication in Java.

	    // calling wait() on an object, it causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object, or until a specified amount of time has elapsed.  	
			
	//31. m1.wait(0);
	// The wait(0) method is used in scenarios where a thread needs to wait indefinitely until a specific condition is met before continuing its execution. However, it's not directly tied to the functionality of a HashMap or any other Java collection.		
			
			
	//32.	m1.wait(0, 0);
	// The wait(long timeout, int nanos) method is typically used for synchronization and thread communication in Java.		
	// The wait(0, 0) method is used in scenarios where a thread needs to wait indefinitely until a specific condition is met before continuing its execution. However, it's not directly tied to the functionality of a HashMap or any other Java collection.		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
