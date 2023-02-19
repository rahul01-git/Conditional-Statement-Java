public class Main {
    public static void main(String[] args) {
        int age = 45;
        // if-else
        // if(age == 40){
        // System.out.println("I will buy a new house");
        // }else if(age == 60){
        // System.out.println(" I will retire");
        // }
        // else{
        // System.out.println("I will buy an old car");
        // }

        // switch
        switch (age) {
            case 40:
                System.out.println("I'll buy a new house");
                break;
            case 60:
                System.out.println("I'll retire");
                break;
            default:
                System.out.println("I'll buy an old car");
                break;
        }
    }
}
