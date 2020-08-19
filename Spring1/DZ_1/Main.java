package Spring1.DZ_1;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Refferal_Stomatologist refferal_stomatologist = new Refferal_Stomatologist();
        registry.setRefferal(refferal_stomatologist);
        registry.issue_direction();
    }

}
