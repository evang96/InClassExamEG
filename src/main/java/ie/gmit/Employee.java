package ie.gmit;
//Evan Garvey
//G00322695
//In class exam (The Employee Class). Create arguements that cause a test to pass or fail
//09/03/20

public class Employee {

    private String Title;
    private String Name;
    private String PPS;
    private String Phone;
    private String EmployType;
   // private String Age;


    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }

    public String getPPS() {
        return PPS;
    }

    public String getEmployType() {
        return EmployType;
    }

//    public String getAge() {
//        return Age;
//    }

    public String getPhone() {
        return Phone;
    }

    public Employee(String Title, String Name, String PPS, String Phone, String EmployType, String Age) {

        if (Title.equals("MR") || Title.equals("MRS") || Title.equals("MS")) {
            this.Title = Title;
        } else {
            throw new IllegalArgumentException("Please enter one of the above titles:");
        }

        if (Name.length() >= 3 & Name.length() <= 25) {
            this.Name = Name;
        } else {
            throw new IllegalArgumentException("Invalid name ERROR, try again.");
        }
        if (PPS.length() == 8) {
            this.PPS = PPS;
        } else {
            throw new IllegalArgumentException("Invalid PPS ERROR, try again.");
        }
        if (Phone.length() == 9) {
            this.Phone = Phone;
        } else {
            throw new IllegalArgumentException("Invalid phone number ERROR, try again.");
        }
        if (EmployType.equals("Full-Time") || EmployType.equals("Part-Time") || EmployType.equals("Contract")) {
            this.EmployType = EmployType;
        } else {
            throw new IllegalArgumentException("Invalid Employment Type ERROR, try again.");
        }
//        if (Age >= 16) {
//            throw new IllegalArgumentException("Age ERROR, Age must be over 16, try again.");
//        } else {
//            this.Age = Age;
//        }


    }
}