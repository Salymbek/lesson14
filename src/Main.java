public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Akyl","ballerina","Ala-Too");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();


        System.out.println();


        Programmer programmer = new Programmer("Bekzat","Backend developer","Java programmer");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();


        System.out.println();


        Singer singer = new Singer("Aida","pop-music","popper");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();





    }
}