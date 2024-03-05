import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Function {
    public  static CellStyle headerStyle = new CellStyle(CellStyle.HorizontalAlign.center);
    public  static CellStyle content = new CellStyle(CellStyle.HorizontalAlign.left);



    public static   String red = "\u001B[31m";
    public  static String white = "\u001B[0m";
    public static   String green = "\u001B[32m";
    public static   String blue = "\u001B[34m";

    public static Scanner sc = new Scanner(System.in);
    public static int idUpdate;
    public static String colSt;
    public static int colNum;
    public static int i=1;
    public static String name,address;

    public static double salary,bonus,rate;
    public static int hourWork;
    public static void header(){
        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        table.setColumnWidth(0, 40, 80);
        table.addCell(blue + "staff management system".toUpperCase() + white, headerStyle);
        table.addCell(blue + "1. Insert Employee" + white, content);
        table.addCell(blue + "2. Update Employee" + white, content);
        table.addCell(blue + "3. Display Employee" + white, content);
        table.addCell(blue + "4. Remove Employee" + white, content);
        table.addCell(blue + "5. Exit" + white, content);
        System.out.println(table.render());
        System.out.println("-------------------------------------------------");
    }
    public  static void functionInput(){
        Table t1 = new Table(4, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        t1.setColumnWidth(0, 10, 20);
        t1.setColumnWidth(1, 10, 20);
        t1.setColumnWidth(2, 10, 20);
        t1.setColumnWidth(3, 10, 20);
        t1.addCell(blue + "1.Volunteer" + white,headerStyle);
        t1.addCell(blue + "2. Salaries Employee" + white,headerStyle);
        t1.addCell(blue + "3. Hourly Employee" + white,headerStyle);
        t1.addCell(blue + "4. Back" + white, headerStyle);
        System.out.println(blue+"choose Type:"+white);
        System.out.println(t1.render());

    }
    public static void functionInputVolunteer( List<StaffMember> staffList){
        System.out.println("ID : "+ (i));
        System.out.print("=> Enter Name : ");
        name = sc.nextLine();
        while(!Pattern.matches("^[a-zA-Z ]*$",name)){
            System.out.println(Function.red+"Name can input only text.Please check and try again!"+Function.white);
            System.out.print("=> Enter Name : ");
            name = sc.nextLine();
        }
        System.out.print("=> Enter Address : ");
        address = sc.nextLine();
        while(!Pattern.matches("^[a-zA-Z ]*$",address)){
            System.out.println(Function.red+"Address can input only text.Please check and try again!"+Function.white);
            System.out.print("=> Enter Address : ");
            address = sc.nextLine();
        }
        System.out.print("=> Enter Salary : ");
        String salary_string = sc.nextLine();
        while(!Pattern.matches("^[0-9.0-9]+$",salary_string)){
            System.out.println(Function.red+"Salary can input number only.Please check and try again!!"+Function.white);
            System.out.print("=> Enter Salary : ");
            salary_string = sc.nextLine();
        }
        salary = Double.parseDouble(salary_string);
        staffList.add(new Volunteer(i++,name,address,salary));
        System.out.println(green+"* You added "+name+" of type Volunteer successfully"+white);
    }
    public static void functionInputSalaryEmp( List<StaffMember> staffList){
        System.out.println("ID : "+ (i));
        System.out.print("=> Enter Name : ");
        name = sc.nextLine();
        while(!Pattern.matches("^[a-zA-Z ]*$",name)){
            System.out.println(Function.red+"Name can input only text.Please check and try again!"+Function.white);
            System.out.print("=> Enter Name : ");
            name = sc.nextLine();
        }
        System.out.print("=> Enter Address : ");
        address = sc.nextLine();
        while(!Pattern.matches("^[a-zA-Z ]*$",address)){
            System.out.println(Function.red+"Address can input only text.Please check and try again!"+Function.white);
            System.out.print("=> Enter Address : ");
            address = sc.nextLine();
        }
        System.out.print("=> Enter Salary : ");
        String salary_string = sc.nextLine();
        while(!Pattern.matches("^[0-9.0-9]+$",salary_string)){
            System.out.println(Function.red+"Salary can input number only.Please check and try again!!"+Function.white);
            System.out.print("=> Enter Salary : ");
            salary_string = sc.nextLine();
        }
        salary = Double.parseDouble(salary_string);
        System.out.print("=> Enter Bonus : ");
        String bonus_string = sc.nextLine();
        while(!Pattern.matches("^[0-9.0-9]+$",bonus_string)){
            System.out.println(Function.red+"Bonus can input number only.Please check and try again!!"+Function.white);
            System.out.print("=> Enter Bonus : ");
            bonus_string = sc.nextLine();
        }
        bonus = Double.parseDouble(bonus_string);
        staffList.add(new SalariedEmployee(i++,name,address,salary,bonus));
        System.out.println(green+"* You added "+name+" of type SalariedEmployee successfully"+white);
    }
    public static void functionInputHourlyEmp( List<StaffMember> staffList){
        System.out.println("ID : "+ (i));
        System.out.print("=> Enter Name : ");
        name = sc.nextLine();
        while(!Pattern.matches("^[a-zA-Z ]*$",name)){
            System.out.println(Function.red+"Name can input only text.Please check and try again!"+Function.white);
            System.out.print("=> Enter Name : ");
            name = sc.nextLine();
        }
        System.out.print("=> Enter Address : ");
        address = sc.nextLine();
        while(!Pattern.matches("^[a-zA-Z ]*$",address)){
            System.out.println(Function.red+"Address can input only text.Please check and try again!"+Function.white);
            System.out.print("=> Enter Address : ");
            address = sc.nextLine();
        }
        System.out.print("=> Enter HourWorked : ");
        String hourWork_string = sc.nextLine();
        while(!Pattern.matches("^[0-9]+$",hourWork_string)){
            System.out.println(Function.red+"HourWorked can input number only.Please check and try again!!"+Function.white);
            System.out.print("=> Enter HourWorked : ");
            hourWork_string = sc.nextLine();
        }
        hourWork = Integer.parseInt(hourWork_string);
        System.out.print("=> Enter Rate : ");
        String rate_string= sc.nextLine();
        while(!Pattern.matches("^[0-9.0-9]+$",rate_string)){
            System.out.println(Function.red+"Rate can input number only.Please check and try again!!"+Function.white);
            System.out.print("=> Enter Rate : ");
            rate_string = sc.nextLine();
        }
        rate = Double.parseDouble(rate_string);
        staffList.add(new HourlySalaryEmployee(i++,name,address,hourWork,rate));
        System.out.println(green+"* You added "+name+" of type HourlySalary successfully"+white);
    }

    public static void functionRemoveEmp( List<StaffMember> staffList){
        int found = 0;
        System.out.println(blue+"==========* Delete Employee *========== "+white);
        do {
            System.out.print("Enter id to remove : ");
            int idDelete = sc.nextInt();

            for (StaffMember list:staffList){
                if(idDelete == list.getId()){
                    staffList.remove(list);
                    System.out.println(green+"* ID "+idDelete+" has removed successfully! *"+white);
                    return;
                }else {
                    found++;
                }
            }
            if(found == staffList.size()){
                System.out.println(red+"Staff don't have this id"+white);
            }
        }while (true);
    }

    public static void functionDisplay( List<StaffMember> staffList){
        System.out.println(blue+"==========* Display Employee *========== "+white);
        Table tList = new Table(9, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
        tList.setColumnWidth(0, 20, 30);
        tList.setColumnWidth(1, 10, 20);
        tList.setColumnWidth(2, 10, 20);
        tList.setColumnWidth(3, 10, 20);
        tList.setColumnWidth(4, 10, 20);
        tList.setColumnWidth(5, 10, 20);
        tList.setColumnWidth(6, 10, 20);
        tList.setColumnWidth(7, 10, 20);
        tList.setColumnWidth(8, 10, 20);
        tList.addCell(blue + "Type" + white,headerStyle);
        tList.addCell(blue + "ID" + white,headerStyle);
        tList.addCell(blue + "Name" + white,headerStyle);
        tList.addCell(blue + "Address" + white, headerStyle);
        tList.addCell(blue + "Salary" + white,headerStyle);
        tList.addCell(blue + "Bonus" + white,headerStyle);
        tList.addCell(blue + "Hour" + white,headerStyle);
        tList.addCell(blue + "Rate" + white, headerStyle);
        tList.addCell(blue + "Pay" + white, headerStyle);
        staffList.forEach(list ->{
            tList.addCell(green+ (list instanceof Volunteer ?"Volunteer":list instanceof SalariedEmployee ?"SalariedEmployee":"HourlySalaryEmployee") + white,headerStyle);
            tList.addCell(blue + list.getId() + white,headerStyle);
            tList.addCell(green + list.name + white,headerStyle);
            tList.addCell(green + ((list.address).toUpperCase()).toUpperCase() + white, headerStyle);
            tList.addCell(blue + (list instanceof Volunteer ?("$ "+String.format("%.2f",((Volunteer) list).getSalary()) ) :list instanceof SalariedEmployee ?("$ "+  String.format("%.2f",((SalariedEmployee) list).getSalary())):(red+"---"+white)) + white,headerStyle);
            tList.addCell(blue + (list instanceof SalariedEmployee?("$ "+ String.format("%.2f",((SalariedEmployee) list).getBonus())):(red+"---"+white))  + white,headerStyle);
            tList.addCell(blue + (list instanceof HourlySalaryEmployee?((HourlySalaryEmployee) list).getHourWorked():(red+"---"+white))  + white,headerStyle);
            tList.addCell(blue + (list instanceof HourlySalaryEmployee?("$ "+String.format("%.2f",((HourlySalaryEmployee) list).getRate())):(red+"---"+white))  + white, headerStyle);
            tList.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
        });
        System.out.println(tList.render());

    }

    public static void functionUpdate( List<StaffMember> staffList){
        System.out.println(blue+"==========* Update Employee *========== "+white);
        System.out.print("Enter or Search ID to Update : ");
        String idUpdateSt = sc.nextLine();
        while(!Pattern.matches("^[0-9]+$",idUpdateSt)){
            System.out.println(Function.red+"Search only number.Please check and try again!"+Function.white);
            System.out.print("Enter or Search ID to update : ");
            idUpdateSt = sc.nextLine();
        }
        idUpdate = Integer.parseInt(idUpdateSt);
        staffList.forEach(list ->{
            if(idUpdate == list.getId()){

                Table tUpdateVo = new Table((list instanceof Volunteer)?6:7,BorderStyle.UNICODE_ROUND_BOX,ShownBorders.ALL);
                tUpdateVo.setColumnWidth(0, 20, 30);
                tUpdateVo.setColumnWidth(1, 10, 20);
                tUpdateVo.setColumnWidth(2, 10, 20);
                tUpdateVo.setColumnWidth(3, 10, 20);
                tUpdateVo.setColumnWidth(4, 10, 20);
                if (list instanceof Volunteer){
                    tUpdateVo.setColumnWidth(5, 10, 20);
                }
                if (list instanceof HourlySalaryEmployee || list instanceof SalariedEmployee){
                    tUpdateVo.setColumnWidth(5, 10, 20);
                    tUpdateVo.setColumnWidth(6, 10, 20);
                }

                tUpdateVo.addCell(blue + "Type" + white,headerStyle);
                tUpdateVo.addCell(blue + "ID" + white,headerStyle);
                tUpdateVo.addCell(blue + "Name" + white,headerStyle);
                tUpdateVo.addCell(blue + "Address" + white,headerStyle);
                if (list instanceof Volunteer || list instanceof SalariedEmployee){
                    tUpdateVo.addCell(blue + "Salary" + white,headerStyle);
                }

                if (list instanceof SalariedEmployee){
                    tUpdateVo.addCell(blue + "Bonus" + white,headerStyle);
                }
                if (list instanceof HourlySalaryEmployee){
                    tUpdateVo.addCell(blue + "Hour" + white,headerStyle);
                    tUpdateVo.addCell(blue + "Rate" + white, headerStyle);
                }
                tUpdateVo.addCell(blue + "Pay" + white, headerStyle);
                tUpdateVo.addCell(green+ (list instanceof Volunteer ?"Volunteer":list instanceof SalariedEmployee ?"SalariedEmployee":"HourlySalaryEmployee") + white,headerStyle);
                tUpdateVo.addCell(blue + list.getId() + white,headerStyle);
                tUpdateVo.addCell(green + list.name + white,headerStyle);
                tUpdateVo.addCell(green + ((list.address).toUpperCase()).toUpperCase() + white, headerStyle);
                if (list instanceof Volunteer){
                    tUpdateVo.addCell(blue + ("$ "+String.format("%.2f",((Volunteer) list).getSalary()) )  + white,headerStyle);
                }
                if (list instanceof SalariedEmployee){
                    tUpdateVo.addCell(blue + ("$ "+  String.format("%.2f",((SalariedEmployee) list).getSalary()))+ white,headerStyle);
                }

                if (list instanceof SalariedEmployee){
                    tUpdateVo.addCell(blue +("$ "+ String.format("%.2f",((SalariedEmployee) list).getBonus()))+ white,headerStyle);
                }
                if (list instanceof HourlySalaryEmployee){
                    tUpdateVo.addCell(blue +(((HourlySalaryEmployee) list).getHourWorked()) + white,headerStyle);
                    tUpdateVo.addCell(blue+("$ "+String.format("%.2f",((HourlySalaryEmployee) list).getRate()))+ white, headerStyle);
                }
                tUpdateVo.addCell(blue + ("$ "+String.format("%.2f",list.pay())) + white, headerStyle);

                System.out.println(tUpdateVo.render());
            }
        });


        if(idUpdate < 0 || idUpdate>staffList.size()){
            System.out.println(red+"Staff don't have this id"+white);
        }
        for(StaffMember list:staffList){
            if(idUpdate == list.getId()){
                if (list instanceof  Volunteer) {
                    do {
                        System.out.println("Choose one column to update: ");
                        System.out.println("1.name\t2.address\t3.salary\t0.Cancel");
                        System.out.print(blue+"=> Select Column Number : "+white);
                        colSt = sc.nextLine();
                        while(!Pattern.matches("^[0-9]+$",colSt)){
                            System.out.println(Function.red+"Column can input only number.Please check and try again!"+Function.white);
                            System.out.print(blue+"=> Select Column Number : "+white);
                            colSt = sc.nextLine();
                        }
                        colNum = Integer.parseInt(colSt);
                        switch (colNum) {
                            case 0:
                                break;
                            case 1:
                                System.out.print("=> Change Name To :");
                                String name = sc.nextLine();
                                while(!Pattern.matches("^[a-zA-Z ]*$",name)){
                                    System.out.println(Function.red+"Name can input only text.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Name To :");
                                    name = sc.nextLine();
                                }
                                list.setName(name);
                                System.out.println(green+("* Name has updated successfully! *")+white);
                                Table tNameVo = new Table(6, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tNameVo.setColumnWidth(0, 20, 30);
                                tNameVo.setColumnWidth(1, 10, 20);
                                tNameVo.setColumnWidth(2, 10, 20);
                                tNameVo.setColumnWidth(3, 10, 20);
                                tNameVo.setColumnWidth(4, 10, 20);
                                tNameVo.setColumnWidth(5, 10, 20);
                                tNameVo.addCell(blue + "Type" + white,headerStyle);
                                tNameVo.addCell(blue + "ID" + white,headerStyle);
                                tNameVo.addCell(blue + "Name" + white,headerStyle);
                                tNameVo.addCell(blue + "Address" + white, headerStyle);
                                tNameVo.addCell(blue + "Salary" + white,headerStyle);
                                tNameVo.addCell(blue + "Pay" + white, headerStyle);
                                tNameVo.addCell(green + "Volunteer" + white,headerStyle);
                                tNameVo.addCell(blue + list.getId()+ white,headerStyle);
                                tNameVo.addCell(green + list.name + white,headerStyle);
                                tNameVo.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tNameVo.addCell(blue + ("$ "+String.format("%.2f",((Volunteer) list).getSalary()) )  + white,headerStyle);
                                tNameVo.addCell(blue + ("$ "+String.format("%.2f",list.pay())) + white, headerStyle);
                                System.out.println(tNameVo.render());
                                break;
                            case 2:
                                System.out.print("=> Change Address To : ");
                                String address = sc.nextLine();
                                while(!Pattern.matches("^[a-zA-Z ]*$",address)){
                                    System.out.println(Function.red+"Address can input only text.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Address To : ");
                                    address = sc.nextLine();
                                }
                                list.setAddress(address);
                                System.out.println(green+("* Address has updated successfully! *")+white);
                                Table tAddressVo = new Table(6, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tAddressVo.setColumnWidth(0, 20, 30);
                                tAddressVo.setColumnWidth(1, 10, 20);
                                tAddressVo.setColumnWidth(2, 10, 20);
                                tAddressVo.setColumnWidth(3, 10, 20);
                                tAddressVo.setColumnWidth(4, 10, 20);
                                tAddressVo.setColumnWidth(5, 10, 20);
                                tAddressVo.addCell(blue + "Type" + white,headerStyle);
                                tAddressVo.addCell(blue + "ID" + white,headerStyle);
                                tAddressVo.addCell(blue + "Name" + white,headerStyle);
                                tAddressVo.addCell(blue + "Address" + white, headerStyle);
                                tAddressVo.addCell(blue + "Salary" + white,headerStyle);
                                tAddressVo.addCell(blue + "Pay" + white, headerStyle);
                                tAddressVo.addCell(green + "Volunteer" + white,headerStyle);
                                tAddressVo.addCell(blue + list.getId()+ white,headerStyle);
                                tAddressVo.addCell(green + list.name + white,headerStyle);
                                tAddressVo.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tAddressVo.addCell(blue + ("$ "+String.format("%.2f",((Volunteer) list).getSalary()) )  + white,headerStyle);
                                tAddressVo.addCell(blue + ("$ "+String.format("%.2f",list.pay())) + white, headerStyle);
                                System.out.println(tAddressVo.render());
                                break;
                            case 3:
                                System.out.print("=> Change Salary To :");
                                String salarySt = sc.nextLine();
                                while(!Pattern.matches("^[0-9.0-9]+$",salarySt)){
                                    System.out.println(Function.red+"Salary can input only number.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Salary To : ");
                                    salarySt = sc.nextLine();
                                }
                                salary = Double.parseDouble(salarySt);
                                ((Volunteer) list).setSalary(salary);
                                System.out.println(green+("* Salary has updated successfully! *")+white);
                                Table tSalaryVo = new Table(6, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tSalaryVo.setColumnWidth(0, 20, 30);
                                tSalaryVo.setColumnWidth(1, 10, 20);
                                tSalaryVo.setColumnWidth(2, 10, 20);
                                tSalaryVo.setColumnWidth(3, 10, 20);
                                tSalaryVo.setColumnWidth(4, 10, 20);
                                tSalaryVo.setColumnWidth(5, 10, 20);
                                tSalaryVo.addCell(blue + "Type" + white,headerStyle);
                                tSalaryVo.addCell(blue + "ID" + white,headerStyle);
                                tSalaryVo.addCell(blue + "Name" + white,headerStyle);
                                tSalaryVo.addCell(blue + "Address" + white, headerStyle);
                                tSalaryVo.addCell(blue + "Salary" + white,headerStyle);
                                tSalaryVo.addCell(blue + "Pay" + white, headerStyle);
                                tSalaryVo.addCell(green + "Volunteer" + white,headerStyle);
                                tSalaryVo.addCell(blue + list.getId()+ white,headerStyle);
                                tSalaryVo.addCell(green + list.name + white,headerStyle);
                                tSalaryVo.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tSalaryVo.addCell(blue + ("$ "+String.format("%.2f",((Volunteer) list).getSalary()) )  + white,headerStyle);
                                tSalaryVo.addCell(blue + ("$ "+String.format("%.2f",list.pay())) + white, headerStyle);
                                System.out.println(tSalaryVo.render());
                                break;
                            default:
                                System.out.println(red+"Invalided column number.Please try again!!"+white);
                        }

                    }while (colNum != 0);
                }

                if (list instanceof  SalariedEmployee){
                    do {
                        System.out.println(green+"Choose one column to update: "+white);
                        System.out.println("1.Name \t 2.Address \t 3.Salary \t 4.Bonus \t 0.Cancel");
                        System.out.print(blue+"=> Select Column Number : "+white);
                        colSt = sc.nextLine();
                        while(!Pattern.matches("^[0-9]+$",colSt)){
                            System.out.println(Function.red+"Column can input only number.Please check and try again!"+Function.white);
                            System.out.print(blue+"=> Select Column Number : "+white);
                            colSt = sc.nextLine();
                        }
                        colNum = Integer.parseInt(colSt);
                        switch (colNum){
                            case 0:
                                break;
                            case 1:
                                System.out.print("=> Change Name To :");
                                String name = sc.nextLine();
                                while(!Pattern.matches("^[a-zA-Z ]*$",name)){
                                    System.out.println(Function.red+"Name can input only text.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Name To :");
                                    name = sc.nextLine();
                                }
                                list.setName(name);
                                System.out.println(green+("* Name has updated successfully *"+white));
                                Table tNameSEmp = new Table(7, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tNameSEmp.setColumnWidth(0, 20, 30);
                                tNameSEmp.setColumnWidth(1, 10, 20);
                                tNameSEmp.setColumnWidth(2, 10, 20);
                                tNameSEmp.setColumnWidth(3, 10, 20);
                                tNameSEmp.setColumnWidth(4, 10, 20);
                                tNameSEmp.setColumnWidth(5, 10, 20);
                                tNameSEmp.addCell(blue + "Type" + white,headerStyle);
                                tNameSEmp.addCell(blue + "ID" + white,headerStyle);
                                tNameSEmp.addCell(blue + "Name" + white,headerStyle);
                                tNameSEmp.addCell(blue + "Address" + white, headerStyle);
                                tNameSEmp.addCell(blue + "Salary" + white,headerStyle);
                                tNameSEmp.addCell(blue + "Bonus" + white,headerStyle);
                                tNameSEmp.addCell(blue + "Pay" + white, headerStyle);
                                tNameSEmp.addCell(green + "SalariedEmployee" + white,headerStyle);
                                tNameSEmp.addCell(blue + list.getId()+ white,headerStyle);
                                tNameSEmp.addCell(green + list.name + white,headerStyle);
                                tNameSEmp.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tNameSEmp.addCell(blue + ("$ "+  String.format("%.2f",((SalariedEmployee) list).getSalary())) + white,headerStyle);
                                tNameSEmp.addCell(blue + ("$ "+ String.format("%.2f",((SalariedEmployee) list).getBonus())) + white,headerStyle);
                                tNameSEmp.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
                                System.out.println(tNameSEmp.render());
                                break;
                            case 2:
                                System.out.print("=> Change Address To : ");
                                String address = sc.nextLine();
                                while(!Pattern.matches("^[a-zA-Z ]*$",address)){
                                    System.out.println(Function.red+"Address can input only text.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Address To : ");
                                    address = sc.nextLine();
                                }
                                list.setAddress(address);
                                System.out.println(green+("* Address has updated successfully *"+white));
                                Table tAddressSEmp = new Table(7, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tAddressSEmp.setColumnWidth(0, 20, 30);
                                tAddressSEmp.setColumnWidth(1, 10, 20);
                                tAddressSEmp.setColumnWidth(2, 10, 20);
                                tAddressSEmp.setColumnWidth(3, 10, 20);
                                tAddressSEmp.setColumnWidth(4, 10, 20);
                                tAddressSEmp.setColumnWidth(5, 10, 20);
                                tAddressSEmp.addCell(blue + "Type" + white,headerStyle);
                                tAddressSEmp.addCell(blue + "ID" + white,headerStyle);
                                tAddressSEmp.addCell(blue + "Name" + white,headerStyle);
                                tAddressSEmp.addCell(blue + "Address" + white, headerStyle);
                                tAddressSEmp.addCell(blue + "Salary" + white,headerStyle);
                                tAddressSEmp.addCell(blue + "Bonus" + white,headerStyle);
                                tAddressSEmp.addCell(blue + "Pay" + white, headerStyle);
                                tAddressSEmp.addCell(green + "SalariedEmployee" + white,headerStyle);
                                tAddressSEmp.addCell(blue + list.getId()+ white,headerStyle);
                                tAddressSEmp.addCell(green + list.name + white,headerStyle);
                                tAddressSEmp.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tAddressSEmp.addCell(blue + ("$ "+  String.format("%.2f",((SalariedEmployee) list).getSalary())) + white,headerStyle);
                                tAddressSEmp.addCell(blue + ("$ "+ String.format("%.2f",((SalariedEmployee) list).getBonus())) + white,headerStyle);
                                tAddressSEmp.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
                                System.out.println(tAddressSEmp.render());
                                break;
                            case 3:
                                System.out.print("=> Change Salary To :");
                                String salarySt = sc.nextLine();
                                while(!Pattern.matches("^[0-9.0-9]+$",salarySt)){
                                    System.out.println(Function.red+"Salary can input only number.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Salary To : ");
                                    salarySt = sc.nextLine();
                                }
                                salary = Double.parseDouble(salarySt);
                                ((SalariedEmployee) list).setSalary(salary);
                                System.out.println(green+("* Salary has updated successfully *"+white));
                                Table tSalarySEmp = new Table(7, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tSalarySEmp.setColumnWidth(0, 20, 30);
                                tSalarySEmp.setColumnWidth(1, 10, 20);
                                tSalarySEmp.setColumnWidth(2, 10, 20);
                                tSalarySEmp.setColumnWidth(3, 10, 20);
                                tSalarySEmp.setColumnWidth(4, 10, 20);
                                tSalarySEmp.setColumnWidth(5, 10, 20);
                                tSalarySEmp.addCell(blue + "Type" + white,headerStyle);
                                tSalarySEmp.addCell(blue + "ID" + white,headerStyle);
                                tSalarySEmp.addCell(blue + "Name" + white,headerStyle);
                                tSalarySEmp.addCell(blue + "Address" + white, headerStyle);
                                tSalarySEmp.addCell(blue + "Salary" + white,headerStyle);
                                tSalarySEmp.addCell(blue + "Bonus" + white,headerStyle);
                                tSalarySEmp.addCell(blue + "Pay" + white, headerStyle);
                                tSalarySEmp.addCell(green + "SalariedEmployee" + white,headerStyle);
                                tSalarySEmp.addCell(blue + list.getId()+ white,headerStyle);
                                tSalarySEmp.addCell(green + list.name + white,headerStyle);
                                tSalarySEmp.addCell(green + ((list.address).toUpperCase()).toUpperCase() + white, headerStyle);
                                tSalarySEmp.addCell(blue + ("$ "+  String.format("%.2f",((SalariedEmployee) list).getSalary())) + white,headerStyle);
                                tSalarySEmp.addCell(blue + ("$ "+ String.format("%.2f",((SalariedEmployee) list).getBonus())) + white,headerStyle);
                                tSalarySEmp.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
                                System.out.println(tSalarySEmp.render());
                                break;
                            case 4 :
                                System.out.print("=> Change Bonus To :" );
                                String bonusSt = sc.nextLine();
                                while(!Pattern.matches("^[0-9.0-9]+$",bonusSt)){
                                    System.out.println(Function.red+"Bonus can input only number.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Bonus To :" );
                                    bonusSt = sc.nextLine();
                                }
                                bonus = Double.parseDouble(bonusSt);
                                ((SalariedEmployee) list).setBonus(bonus);
                                System.out.println(green+("* Bonus has updated successfully *"+white));
                                Table tBonusSEmp = new Table(7, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tBonusSEmp.setColumnWidth(0, 20, 30);
                                tBonusSEmp.setColumnWidth(1, 10, 20);
                                tBonusSEmp.setColumnWidth(2, 10, 20);
                                tBonusSEmp.setColumnWidth(3, 10, 20);
                                tBonusSEmp.setColumnWidth(4, 10, 20);
                                tBonusSEmp.setColumnWidth(5, 10, 20);
                                tBonusSEmp.addCell(blue + "Type" + white,headerStyle);
                                tBonusSEmp.addCell(blue + "ID" + white,headerStyle);
                                tBonusSEmp.addCell(blue + "Name" + white,headerStyle);
                                tBonusSEmp.addCell(blue + "Address" + white, headerStyle);
                                tBonusSEmp.addCell(blue + "Salary" + white,headerStyle);
                                tBonusSEmp.addCell(blue + "Bonus" + white,headerStyle);
                                tBonusSEmp.addCell(blue + "Pay" + white, headerStyle);
                                tBonusSEmp.addCell(green + "SalariedEmployee" + white,headerStyle);
                                tBonusSEmp.addCell(blue + list.getId()+ white,headerStyle);
                                tBonusSEmp.addCell(green + list.name + white,headerStyle);
                                tBonusSEmp.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tBonusSEmp.addCell(blue + ("$ "+  String.format("%.2f",((SalariedEmployee) list).getSalary())) + white,headerStyle);
                                tBonusSEmp.addCell(blue + ("$ "+ String.format("%.2f",((SalariedEmployee) list).getBonus())) + white,headerStyle);
                                tBonusSEmp.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
                                System.out.println(tBonusSEmp.render());
                                break;
                            default: System.out.println(red+"Invalided column number.Please try again!!"+white);
                        }
                    }while (colNum !=0);

                }

                if (list instanceof  HourlySalaryEmployee){
                    do {
                        System.out.println(green+"Choose one column to update: "+white);
                        System.out.println("1.Name\t2.Address\t3.Hour\t4.Rate\t0.Cancel");
                        System.out.print(blue+"=> Select Column Number : "+white);
                        colSt = sc.nextLine();
                        while(!Pattern.matches("^[0-9]+$",colSt)){
                            System.out.println(Function.red+"Column can input only number.Please check and try again!"+Function.white);
                            System.out.print(blue+"=> Select Column Number : "+white);
                            colSt = sc.nextLine();
                        }
                        colNum = Integer.parseInt(colSt);
                        switch (colNum){
                            case 0:
                                break;
                            case 1:
                                System.out.print("=> Change Name To :");
                                String name = sc.nextLine();
                                while(!Pattern.matches("^[a-zA-Z ]*$",name)){
                                    System.out.println(Function.red+"Name can input only text.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Name To :");
                                    name = sc.nextLine();
                                }
                                list.setName(name);
                                System.out.println(green+("* Name has updated successfully *"+white));
                                Table tNameHEmp = new Table(7, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tNameHEmp.setColumnWidth(0, 20, 30);
                                tNameHEmp.setColumnWidth(1, 10, 20);
                                tNameHEmp.setColumnWidth(2, 10, 20);
                                tNameHEmp.setColumnWidth(3, 10, 20);
                                tNameHEmp.setColumnWidth(4, 10, 20);
                                tNameHEmp.setColumnWidth(5, 10, 20);
                                tNameHEmp.addCell(blue + "Type" + white,headerStyle);
                                tNameHEmp.addCell(blue + "ID" + white,headerStyle);
                                tNameHEmp.addCell(blue + "Name" + white,headerStyle);
                                tNameHEmp.addCell(blue + "Address" + white, headerStyle);
                                tNameHEmp.addCell(blue + "Hour" + white,headerStyle);
                                tNameHEmp.addCell(blue + "Rate" + white,headerStyle);
                                tNameHEmp.addCell(blue + "Pay" + white, headerStyle);
                                tNameHEmp.addCell(green + "HourlySalaryEmployee" + white,headerStyle);
                                tNameHEmp.addCell(blue + list.getId()+ white,headerStyle);
                                tNameHEmp.addCell(green + list.name + white,headerStyle);
                                tNameHEmp.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tNameHEmp.addCell(blue + ((HourlySalaryEmployee) list).getHourWorked() + white,headerStyle);
                                tNameHEmp.addCell(blue + ("$ "+String.format("%.2f",((HourlySalaryEmployee) list).getRate()))+ white,headerStyle);
                                tNameHEmp.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
                                System.out.println(tNameHEmp.render());
                                break;
                            case 2:
                                System.out.print("=> Change Address To : ");
                                String address = sc.nextLine();
                                while(!Pattern.matches("^[a-zA-Z ]*$",address)){
                                    System.out.println(Function.red+"Address can input only text.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Address To : ");
                                    address = sc.nextLine();
                                }
                                list.setAddress(address);
                                System.out.println(green+("* Name has updated successfully *"+white));
                                Table tAddressHEmp = new Table(7, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tAddressHEmp.setColumnWidth(0, 20, 30);
                                tAddressHEmp.setColumnWidth(1, 10, 20);
                                tAddressHEmp.setColumnWidth(2, 10, 20);
                                tAddressHEmp.setColumnWidth(3, 10, 20);
                                tAddressHEmp.setColumnWidth(4, 10, 20);
                                tAddressHEmp.setColumnWidth(5, 10, 20);
                                tAddressHEmp.addCell(blue + "Type" + white,headerStyle);
                                tAddressHEmp.addCell(blue + "ID" + white,headerStyle);
                                tAddressHEmp.addCell(blue + "Name" + white,headerStyle);
                                tAddressHEmp.addCell(blue + "Address" + white, headerStyle);
                                tAddressHEmp.addCell(blue + "Hour" + white,headerStyle);
                                tAddressHEmp.addCell(blue + "Rate" + white,headerStyle);
                                tAddressHEmp.addCell(blue + "Pay" + white, headerStyle);
                                tAddressHEmp.addCell(green + "HourlySalaryEmployee" + white,headerStyle);
                                tAddressHEmp.addCell(blue + list.getId()+ white,headerStyle);
                                tAddressHEmp.addCell(green + list.name + white,headerStyle);
                                tAddressHEmp.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tAddressHEmp.addCell(blue + ((HourlySalaryEmployee) list).getHourWorked() + white,headerStyle);
                                tAddressHEmp.addCell(blue + ("$ "+String.format("%.2f",((HourlySalaryEmployee) list).getRate()))+ white,headerStyle);
                                tAddressHEmp.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
                                System.out.println(tAddressHEmp.render());
                                break;
                            case 3:
                                System.out.print("=> Change Hour To :");
                                String hourSt = sc.nextLine();
                                while(!Pattern.matches("^[0-9 ]+$",hourSt)){
                                    System.out.println(Function.red+"Hour can input only number.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Hour To : ");
                                    hourSt = sc.nextLine();

                                }
                                hourWork = Integer.parseInt(hourSt);
                                ((HourlySalaryEmployee) list).setHourWorked(hourWork);
                                System.out.println(green+("* Name has updated successfully *"+white));
                                Table tHourHEmp = new Table(7, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tHourHEmp.setColumnWidth(0, 20, 30);
                                tHourHEmp.setColumnWidth(1, 10, 20);
                                tHourHEmp.setColumnWidth(2, 10, 20);
                                tHourHEmp.setColumnWidth(3, 10, 20);
                                tHourHEmp.setColumnWidth(4, 10, 20);
                                tHourHEmp.setColumnWidth(5, 10, 20);
                                tHourHEmp.addCell(blue + "Type" + white,headerStyle);
                                tHourHEmp.addCell(blue + "ID" + white,headerStyle);
                                tHourHEmp.addCell(blue + "Name" + white,headerStyle);
                                tHourHEmp.addCell(blue + "Address" + white, headerStyle);
                                tHourHEmp.addCell(blue + "Hour" + white,headerStyle);
                                tHourHEmp.addCell(blue + "Rate" + white,headerStyle);
                                tHourHEmp.addCell(blue + "Pay" + white, headerStyle);
                                tHourHEmp.addCell(green + "HourlySalaryEmployee" + white,headerStyle);
                                tHourHEmp.addCell(blue + list.getId()+ white,headerStyle);
                                tHourHEmp.addCell(green + list.name + white,headerStyle);
                                tHourHEmp.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tHourHEmp.addCell(blue + ((HourlySalaryEmployee) list).getHourWorked() + white,headerStyle);
                                tHourHEmp.addCell(blue + ("$ "+String.format("%.2f",((HourlySalaryEmployee) list).getRate()))+ white,headerStyle);
                                tHourHEmp.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
                                System.out.println(tHourHEmp.render());
                                break;
                            case 4 :
                                System.out.print("=> Change Rate To :" );
                                String rateSt = sc.nextLine();
                                while(!Pattern.matches("^[0-9.0-9]+$",rateSt)){
                                    System.out.println(Function.red+"Rate can input only number.Please check and try again!"+Function.white);
                                    System.out.print("=> Change Rate To :" );
                                    rateSt = sc.nextLine();
                                }
                                rate = Double.parseDouble(rateSt);
                                ((HourlySalaryEmployee) list).setRate(rate);
                                System.out.println(green+("* Name has updated successfully *"+white));
                                Table tRateHEmp = new Table(7, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.ALL);
                                tRateHEmp.setColumnWidth(0, 20, 30);
                                tRateHEmp.setColumnWidth(1, 10, 20);
                                tRateHEmp.setColumnWidth(2, 10, 20);
                                tRateHEmp.setColumnWidth(3, 10, 20);
                                tRateHEmp.setColumnWidth(4, 10, 20);
                                tRateHEmp.setColumnWidth(5, 10, 20);
                                tRateHEmp.addCell(blue + "Type" + white,headerStyle);
                                tRateHEmp.addCell(blue + "ID" + white,headerStyle);
                                tRateHEmp.addCell(blue + "Name" + white,headerStyle);
                                tRateHEmp.addCell(blue + "Address" + white, headerStyle);
                                tRateHEmp.addCell(blue + "Hour" + white,headerStyle);
                                tRateHEmp.addCell(blue + "Rate" + white,headerStyle);
                                tRateHEmp.addCell(blue + "Pay" + white, headerStyle);
                                tRateHEmp.addCell(green + "HourlySalaryEmployee" + white,headerStyle);
                                tRateHEmp.addCell(blue + list.getId()+ white,headerStyle);
                                tRateHEmp.addCell(green + list.name + white,headerStyle);
                                tRateHEmp.addCell(green + (list.address).toUpperCase() + white, headerStyle);
                                tRateHEmp.addCell(blue + ((HourlySalaryEmployee) list).getHourWorked() + white,headerStyle);
                                tRateHEmp.addCell(blue + ("$ "+String.format("%.2f",((HourlySalaryEmployee) list).getRate()))+ white,headerStyle);
                                tRateHEmp.addCell(blue + ("$ "+String.format("%.2f",list.pay()))  + white, headerStyle);
                                System.out.println(tRateHEmp.render());
                                break;
                            default: System.out.println(red+"Invalided column number.Please try again!!"+white);
                        }
                    }while (colNum !=0);

                }

            }
        }
    }




}
