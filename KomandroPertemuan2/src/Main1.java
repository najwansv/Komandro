import java.util.ArrayList;

public class Main1 {
    
    public static void main(String[] args) {
        
        ArrayList<String> namaLengkap = new ArrayList<>();
        ArrayList<Integer> umur = new ArrayList<>();

        namaLengkap.add("najwan sulvadli");
        umur.add(12);

        namaLengkap.add("John wick");
        umur.add(29);

        namaLengkap.add("tetua bangka");
        umur.add(130);

        System.out.println("Nama : " + namaLengkap.get(0));
        System.out.println("Umur : " + umur.get(0));

        System.out.println("Nama : " + namaLengkap.get(1));
        System.out.println("Umur : " + umur.get(1));

        System.out.println("Nama : " + namaLengkap.get(2));
        System.out.println("Umur : " + umur.get(2));
        
        System.out.println("=======================");
        
        for( int urutan = 0 ; urutan < 3 ; urutan++ ){
            System.out.println("perulangan ke : " + urutan);
            System.out.println("nama : " + namaLengkap.get (urutan));
            System.out.println("Umur : " + umur.get(urutan));
        }

        System.out.println("perulangan selesai");
    }

}
