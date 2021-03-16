public class ShowStudent{
    public static void main(String[]args)
    {
        Student obj = new Student();
            obj.setID(12345);
            obj.setEarnedPoints(15);
            obj.setCreditHours(5);
            obj.setGradePoint();

        System.out.println("Earned Points:"
        + obj.getEarnedPoints());
        System.out.println("ID:"
        + obj.getID());
        System.out.println("Credit Hours Earned:"
        + obj.getcreditHours());
        System.out.println("Grade Point:"
        + obj.getGradePoint());
    }
}