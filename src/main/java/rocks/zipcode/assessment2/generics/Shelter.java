package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Dog;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> {
    Shelter<Object> test = new Shelter<>();
    public Shelter() {
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return test.size();
    }

    public void add(Object object) {
       test.add(object);

    }

    public Boolean contains(Object object) {
        return test.contains(object);
    }

    public void remove(Object object) {
        test.remove(object);
    }

    public Object get(Integer index) {
        return test.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return test.getIndexOf(ageable);
    }
}