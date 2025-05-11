public class UniversityTest {
    public static void main(String[] args) {
        College engineering = new College("College of Engineering");
        College business = new College("College of Business");
        College university = new College("New Era University");

        Department cs = new Department("Computer Science Dept");
        Department it = new Department("Information Technology Dept");

        Teacher teacher1 = new Teacher("Sean", "ReactJS100", 41000);
        Teacher teacher2 = new Teacher("Gian", "Operating Systems", 54000);
        Teacher teacher3 = new Teacher("Jeron", "Marketing 101", 61950);

        Student student1 = new Student("William", "20-20002-18", 30000);
        Student student2 = new Student("Carl", "20-611995-54", 15000);
        Student student3 = new Student("Patricia", "20-183945-6", 30000);
        Student student4 = new Student("Sophia", "20-19459-3", 40000);

        cs.addUnit(teacher1);
        cs.addUnit(student1);
        cs.addUnit(student2);
        cs.addUnit(student4);


        it.addUnit(teacher2);
        it.addUnit(student3);
        it.addUnit(student2);

        engineering.addUnit(cs);
        engineering.addUnit(it);
        engineering.addUnit(teacher3);
        engineering.addUnit(student1);

        business.addUnit(teacher3);
        business.addUnit(student3);

        university.addUnit(engineering);
        university.addUnit(business);

        System.out.println("=== NEU ===");
        university.displayDetails("");

        System.out.println("\nTotal students in University: " + university.getStudentCount());
        System.out.printf("Total budget of University: %.2f\n", university.getBudget());
    }
}