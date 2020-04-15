public class Employee {
    String name,house_Number;
    int year_Of_Joining;
    static String street_Name;
    static{
        street_Name = "WallsStreet";
    }
    public void setter_and_getter(String nAME, String house_NUMBER, int yEAR_OF_JOINING){
        name=nAME;
        house_Number=house_NUMBER;
        year_Of_Joining=yEAR_OF_JOINING;
        System.out.println(name+"        "+year_Of_Joining+"        "+house_Number+"-"+street_Name);
    }
    public static void main(String[] args){
       Employee employee1 = new Employee();
       Employee employee2 = new Employee();
       Employee employee3 = new Employee();
       System.out.println("Name      Year of Joining      Address");
       employee1.setter_and_getter("Robert","64C", 1994);
       employee2.setter_and_getter("Sam","68D", 2000);
       employee3.setter_and_getter("John","26B", 1999);
    }
}
