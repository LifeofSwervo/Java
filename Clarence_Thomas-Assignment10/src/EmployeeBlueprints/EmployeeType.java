package EmployeeBlueprints;

public enum EmployeeType
{
    HOURLY,
    SALARY,
    COMMISSION;

    @Override
    public String toString()
    {
        int ordinal = this.ordinal();
        if (ordinal ==  0)
        {
            return "Hourly";
        } else if (ordinal == 2 )
        {
            return "Salary";
        } else if (ordinal == 3 )
        {
            return "Commission";
        } else
        {
            return "Error: Ordinal value not between 0-3.";
        }
    }
}


