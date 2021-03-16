public class student
{
    private int ID;
    private int creditHours;
    private int earnedPoints;
    private double gradePoint;

    public Student()
    {
        ID = 9999
        earnedPoint = 12;
        creditHours = 3;
        setGradePoint();
    }
    public int getID()
    {
        return ID;
    }
    public int getcreditHours()
    {
        return creditHours;
    }
    public int getEarnedPoints()
    {
        return earnedPoints;
    }
    public double getGradePoint()
    {
        return gradePoint;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public void setCredithours(int creditHours)
    {
        this.creditHours= creditHours;
    }
    public void setEarnedPoints(int earnedPoints)
    {
        this.earnedPoints = earnedPoints;
    }
    public void setGradePoint()
    {
        gradePoint= earnedPoints/creditHours;
    }
    public void showID()
    {
        System.out.println(ID);
    }
    public void showCreditHours()
    {
        system.out.println(creditHours);
    }
    public void showEarnedPoints()
    {
        system.out.println(earnedPoints);
    }
    public void showGradepoint()
    {
        System.out.println(gradePoint);
    }
    public void displayStudent()
    {
        System.out.println("ID"+ID);
        System.out.println("Earned Point:" + earnedPoints);
        System.out.println("Credit Hours Earned"+ creditHours);
        System.out.println("Grade Point"+ gradePoint);
    }
}