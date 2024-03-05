import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

public class Volunteer extends StaffMember{
    private double salary;
    public Volunteer(int id,String name, String address,double salary) {
        super( id,name, address);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return
                "Volunteer" +
                "\nID : " + id +
                "\nName : " + name +
                "\nAddress : " + address +
                "\nSalary : $ " + salary +
                "\nPay : $ " + pay() +
                "\n-------------------------------------";

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public double pay(){
        return salary;
    }
}
