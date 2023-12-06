public class CompareTwoObjects {
    public static void main(String[] args) {
        // Create two objects
        MyClass obj1 = new MyClass(1, "John");
        MyClass obj2 = new MyClass(1, "John");

        // Compare objects using the equals method
        if (obj1.equals(obj2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    }
}

class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals method for custom comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        MyClass myClass = (MyClass) obj;

        if (id != myClass.id) {
            return false;
        }
        return name != null ? name.equals(myClass.name) : myClass.name == null;
    }

    // Override hashCode method if you override equals
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
