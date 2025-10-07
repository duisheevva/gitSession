package db;

public class GenericId {
    public static int CUSTOMER_ID = 0;
    public static int getCustomerID() {
        return ++CUSTOMER_ID;
    }
}
