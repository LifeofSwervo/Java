package EmployeeBlueprints;

import java.text.NumberFormat;

public interface Printable // Printable interface
{
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    NumberFormat percent = NumberFormat.getPercentInstance();
    void print();
}
