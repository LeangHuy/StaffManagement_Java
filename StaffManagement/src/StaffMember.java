import org.nocrala.tools.texttablefmt.Table;

public abstract class StaffMember {
//    protected static int lastId = 0;
    protected int id;
    protected String name;
    protected String address;

    public StaffMember(int id,String name,String address){
//        this.id = ++lastId;
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return

                "id= " + id +
                "\nname= " + name +
                "\naddress= " + address  ;

    }
    abstract public double pay();

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }
}
