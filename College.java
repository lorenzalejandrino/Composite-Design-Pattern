import java.util.ArrayList;
import java.util.List;

public class College implements Education {
    private String name;
    private List<Education> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(Education unit) {
        units.add(unit);
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "College: " + name);
        for (Education unit : units) {
            unit.displayDetails(indent + "  ");
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (Education unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double budget = 0;
        for (Education unit : units) {
            budget += unit.getBudget();
        }
        return budget;
    }
}