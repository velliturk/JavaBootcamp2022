public class Main {
    public static void main(String[] args) {
        // array
        String[] krediler = {"Hızlı Kredi", "Maasini Halkbanktan", "Mutlu Emekli"};

        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);

        for (String s : krediler) {
            System.out.println(s);
        }

        /*for (int i = 0; i<krediler.length; i++)
        {
            System.out.println(krediler[i]);
        }*/

    }
}
