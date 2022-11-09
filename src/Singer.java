public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Name = " + getName() +
                "\n" + "Designation = " + getDesignator() +
                "\n" + "bandName = " + getBandName() ;
    }
    public void singing(){
        System.out.println("Sing in an american concert");

    }
    public void playGuitar(){
        System.out.println("Play electronic guitar");
    }
}
