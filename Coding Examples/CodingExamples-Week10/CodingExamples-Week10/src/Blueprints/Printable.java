package Blueprints;

import java.text.NumberFormat;

/**
 * This holds helper constants to format currency, percent and creates print methods for
 * all implemented classes have a set method.
 * @author Lucas Hartman
 * @version 1.0.0
 */
public interface Printable {
    /**
     * A number formatter to format currency
     */
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    /**
     * a number formatter to format percents
     */
    NumberFormat percent = NumberFormat.getPercentInstance();

    /**
     * Default method to call the toString() if none are defined
     */
    default void print() {

        System.out.println(toString());
    }

}
