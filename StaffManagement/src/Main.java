import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        int type;
        int idUpdate;
        int colNum;
        List<StaffMember> staffList= new ArrayList<>();
        staffList.add(new Volunteer(Function.i++,"Tina","PP",20.1012));
        staffList.add(new Volunteer(Function.i++,"Lee","SR",20.1012));
        staffList.add(new SalariedEmployee(Function.i++,"Fy","KT",200.9434,10.00233));
        staffList.add(new SalariedEmployee(Function.i++,"Dana","KPS",200,10));
        staffList.add(new SalariedEmployee(Function.i++,"Nana","BTB",200,10));
        staffList.add(new HourlySalaryEmployee(Function.i++,"Sokha","BMC",10,10.2939));
        staffList.add(new HourlySalaryEmployee(Function.i++,"Ka","PV",3,10));

        do{
            Function.header();
            System.out.print(Function.blue+"-> Choose an option(1-5) : "+Function.white);
            String opt_string = sc.nextLine();
            while(!Pattern.matches("^[1-9]+$",opt_string)){
                System.out.println(Function.red+"Input number only"+Function.white);
                System.out.print(Function.blue+"-> Choose an option(1-5) : "+Function.white);
                opt_string = sc.nextLine();
            }
            opt = Integer.parseInt(opt_string);
            switch (opt){
                case 1:
                    do {
                        System.out.println(Function.blue+"==========* Insert Employee *========== "+Function.white);
                        Function.functionInput();
                        System.out.print(Function.blue+"=> Enter Type Number : "+Function.white);
                        String type_string = sc.nextLine();
                        while(!Pattern.matches("^[0-9]+$",type_string)){
                            System.out.println(Function.red+"Input number only"+Function.white);
                            System.out.print(Function.blue+"=> Enter Type Number : "+Function.white);
                            type_string = sc.nextLine();
                        }
                        type = Integer.parseInt(type_string);
                        switch (type){
                            case 1:
                                Function.functionInputVolunteer(staffList);
                                break;
                            case 2:
                                Function.functionInputSalaryEmp(staffList);
                                break;
                            case 3:
                                Function.functionInputHourlyEmp(staffList);
                                break;
                            case 4:
                                break;

                            default:
                                System.out.println(Function.red+"Invalid Type.Please try again"+Function.white);
                        }
                    }while (type!=4);
                    break;
                case 2:
                    Function.functionUpdate(staffList);
                    break;
                case 3:
                    Function.functionDisplay(staffList);
                    break;
                case 4:
                    Function.functionRemoveEmp(staffList);
                    break;
                case 5:
                    System.out.println(Function.blue+"====== Good Bye ======"+Function.white);
                    return;
                default:
                    System.out.println(Function.red+"Invalid Option.Please try again!"+Function.white);
            }
        }while (true);
    }
}