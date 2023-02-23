package grades;

public class StudentTest {
        public static void main(String[] args) {
                Student student1 = new Student("John Doe");
                student1.addGrade(90);
                student1.addGrade(80);
                student1.addGrade(95);
                System.out.println("Name: " + student1.getName());
                System.out.println("Grades: " + student1.getGradeAverage());

                Student student2 = new Student("Jane Smith");
                student2.addGrade(85);
                student2.addGrade(95);
                student2.addGrade(90);
                System.out.println("Name: " + student2.getName());
                System.out.println("Grades: " + student2.getGradeAverage());
        }
}
