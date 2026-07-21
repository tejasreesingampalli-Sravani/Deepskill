class Singleton {

    // Create a private static instance
    private static Singleton instance;

    // Private constructor prevents object creation from outside
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton Class");
    }
}

class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Check if both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Different instances created.");
        }
    }
}