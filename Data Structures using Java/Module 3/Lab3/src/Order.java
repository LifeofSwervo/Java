public class Order
{
    private String orderCode; // A private instance variable for the order code (which is alphanumeric).
    private int priority; // A private instance variable for the priority of the order (the acceptable values are 1, 2, or 3).
    // Constructor
    public Order(String orderCode, int priority)
    {
        this.orderCode = orderCode;
        this.priority = (priority >= 1 && priority <= 3) ? priority : 1;
    }

    // Getters
    public int getPriority()
    {
        return priority;
    }
    public String getOrderCode()
    {
        return orderCode;
    }

    public String toString()
    {
        return "Order Code: " + orderCode + ", Priority: " + priority;
    }
}
