package Practice;

public class BusDriverTest {
    public static void main(String[] args) {
        BusDriver babakubura = new BusDriver("Ajao",56,"08090890987");
        BusDriver babaTaju = new BusDriver("Ibrahim", 34, "090009009");

        String name = babaTaju.getName();
        System.out.println(name);

        System.out.println(babaTaju.getPhoneNumber());

        babaTaju.setName("Mohammed");
        System.out.println(babaTaju.getName());

        name = babakubura.getName();

        System.out.println(name);

        babakubura.setName("Ibrahim");

        String neName = babakubura.getName();


        System.out.println(neName);

        babakubura.setName("Ajao");

        String updatedName = babakubura.getName();
        System.out.println(updatedName);



    }
}
