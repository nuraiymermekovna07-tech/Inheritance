public class Main {
    public static void main(String[] args) {
        System.out.println(" ------ Peson Info ---------");
        Person person = new Person("Nuraiym","Programmer");
        person.learn();
        person.eat();
        person.eat();
        System.out.println(person);

        System.out.println(" --------- Dancer Info ---------");
        Dancer dancer = new Dancer("Aizat","Dancer","F5");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.eat();
        System.out.println(dancer);

        System.out.println(" --------- Singer Info ---------");
        Singer singer = new Singer("Aidin","Dancer","Atlant");
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playgitar();
        System.out.println(singer);
    }
}