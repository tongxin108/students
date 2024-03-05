public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numExtraActivities];
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public void addExtraActivity(int totalActivities) {
        for (int i = 0; i < totalActivities; i++) {
            System.out.print("Enter extra activity " + (i + 1) + ": ");
            extraActivities[i] = System.console().readLine();
        }
    }

    
    public String toString() {
        StringBuilder sbu = new StringBuilder();
        sbu.append("Student ID: ").append(studentID).append("\n");
        sbu.append("Student Name: ").append(studentName).append("\n");
        sbu.append("Extra Activities: ");
        for (String activity : extraActivities) {
            if (activity != null) {
                sbu.append(activity).append(", ");
            }
        }
        return sbu.toString();
    }
}