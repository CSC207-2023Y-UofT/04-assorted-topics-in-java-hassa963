/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.*;


class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }


    public boolean addDrivable(String id, Drivable obj) {
       if (drivable_map.containsKey(id)){
           return false;
       };
       drivable_map.put(id, obj);
       return true;
        }

    /*
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable item : drivable_map.values()) {
            if (speed <= item.getMaxSpeed()) {
                return true;
            }
        }
        return false;
    }


    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    public ArrayList getTradable() { ArrayList tradable = new ArrayList<Tradable>();
        for (Drivable item : drivable_map.values()){
            if ( item instanceof Tradable){
                tradable.add(item);
            }
        }
        return tradable;

    }
}


    
