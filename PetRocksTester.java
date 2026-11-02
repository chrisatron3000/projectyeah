public class PetRockTester{
    public PetRockTester{

    }

    public static void main(String[] var0) {


        Petrock Randy = new Petrock{"Randy", false}
        Petrock Jarad = new Petrock{"Jarad", true}
        Petrock AlsoJarad = new Petrock{"AlsoJarad", false}
    }

    Randy.toStringMethod();
    Jarad.toStringMethod();
    AlsoJarad.toStringMethod();
    AlsoJarad.JaredDetected();
    Jarad.JaredDetected();

    
    PetRock Sam = new PetRock("Sam", false);
    System.out.println(Sam.sameAs(Randy));




}