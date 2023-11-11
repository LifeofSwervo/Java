package Blueprints;

/**
 * Enum type for what kind of account that the bank system has
 * @author Lucas Hartman
 * @version 1.0.0
 */
public enum AccountType {
    /**
     * The CHECKING constant for account type
     */
    CHECKING,
    /**
     * The SAVINGS constant for account type
     */
    SAVINGS;

    /**
     * Returns a formatted string of the value of the enum type
     * @return a String of the enum
     */
    @Override
    public String toString()
    {
        String type = switch (this.ordinal()) {
            case 0 -> "Checking";
            case 1 -> "Savings";
            default -> "";
        };
        return type;
    }

}
