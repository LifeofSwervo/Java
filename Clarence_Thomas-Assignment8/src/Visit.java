public class Visit
{
    private String date;
    private String doctor;
    private double weight;
    private int[] height;
    private String visitInfo;
    private String prescription;

    // Main Constructor
    public Visit(String date, String doctor, double weight, int[] height, String visitInfo, String prescription)
    {
        this.date = date;
        this.doctor = doctor;
        this.weight = weight;
        this.height = height;
        this.visitInfo = visitInfo;
        this.prescription = prescription;
    }

    // Methods
        // Getters
    public String getDate()
    {
        return date;
    }
    public String getDoctor()
    {
        return doctor;
    }
    public double getWeight()
    {
        return weight;
    }
    public int[] getHeight()
    {
        return height;
    }
    public String getVisitInfo()
    {
        return visitInfo;
    }
    public String getPrescription()
    {
        return prescription;
    }

        // Setters
    public void setDate(String date)
    {
        this.date = date;
    }
    public  void setDoctor(String doctor)
    {
        this.doctor = doctor;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public void setHeight(int[] height)
    {
        this.height = height;
    }
    public void setVisitInfo(String visitInfo)
    {
        this.visitInfo = visitInfo;
    }
    public void setPrescription(String prescription)
    {
        this.prescription = prescription;
    }
    public void printVisit()
    {
        System.out.println("Date: " + date + "\n"
        + "Doctor: " + doctor + "\n"
        + "Weight: " + weight + "\n"
        + "Height: " + height[0] + "ft " + height[1] + "in" + "\n"
        + "Visit Information: " + visitInfo + "\n"
        + "Medicine(s) Prescribed: " + prescription);
    }
    public void printContact()
    {

    }
}
