public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Name = " + getName() +
                "\n" + "Designation = " + getDesignator() +
                "\n" + "companyName = " + getCompanyName() ;
    }

    public void coding(){
        System.out.println("Write error=free code");
    }
}
