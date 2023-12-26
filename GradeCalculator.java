public class GradeCalculator {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 subject marks for the student.");
            return;
        } 

        double totalMarks = 0; 

        for (int i = 0; i < 5; i++) {
            double subjectMarks = Double.parseDouble(args[i]);
            totalMarks += subjectMarks;
        } 

        double percentage = (totalMarks / 5.0);
        System.out.println("Percentage: " + percentage + "%"); 

        // Assigning grades
        char grade = getGrade(percentage);
        System.out.println("Grade: " + grade);
    } 

    private static char getGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
/* 
Output:-
~/downloads/java $ nano
~/downloads/java $ javac SingleStudent.java
~/downloads/java $ java Singlestudent 59 89 97 50 77
Percentage: 74.4%
Grade: C
~/downloads/java t
*/
