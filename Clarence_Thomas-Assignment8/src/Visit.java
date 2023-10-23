public class Visit
{
    private String date;
    private String doctor;
    private double weight;
    private int height;
    private String visitInfo;
    private String prescription;

    // Main Constructor
    public Visit(String date, String doctor, double weight, int[] height, String visitInfo, String prescription)
    {

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
    public int getHeight()
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
    public void setDate(String newDate)
    {
        date = newDate;
    }
    public  void setDoctor(String newDoctor)
    {
        doctor = newDoctor;
    }
    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }
    public void setVisitInfo(String newVisitInfo)
    {
        visitInfo = newVisitInfo;
    }
    public void setPrescription(String newPrescription)
    {
        prescription = newPrescription;
    }
}
