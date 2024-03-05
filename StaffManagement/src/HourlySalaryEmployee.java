public class HourlySalaryEmployee extends StaffMember{
    private int hourWorked;
    private double rate;

    public HourlySalaryEmployee(int id,String name, String address, int hourWorked, double rate) {
        super(id,name, address);
        this.hourWorked = hourWorked;
        this.rate = rate;
    }
    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }



    @Override
    public String toString() {
        return
                "HourlySalaryEmployee"+
                "\nID : " + id +
                "\nName : " + name +
                "\nAddress : " + address +
                "\nHoursWorked : " + hourWorked +
                "\nRate : " + rate +
                "\nPayment : $ "+pay()+
                "\n-------------------------------------";

    }

    @Override
    public double pay() {
        return hourWorked*rate;
    }
}
