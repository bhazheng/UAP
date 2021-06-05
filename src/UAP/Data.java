package UAP;

import java.util.*;

class Data {
    private static final ArrayList<Tanaman> tanamans = new ArrayList<>();
    private static final ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void mulai() {
        System.out.print("Masa tanam (bulan): ");
        int masaTanamBulan = input.nextInt();
        masaTanamBulan = masaTanamBulan * 30;
        while (tanamans.size() < 3) menanam();
        System.out.println("""
                --------------
                PROSES MENANAM
                --------------""");
        System.out.println("---HASIL MENANAM---");
        for(int hari = 0; hari < masaTanamBulan; hari++){
            if(hari != 0 && hari % 90 == 0) {
                for (Tanaman tanaman : tanamans) {
                    if (tanaman.status().equals("Hidup")) {
                        tanaman.treatment();
                    }
                }
            }
            for(int j = 0; j < tanamans.size(); j++){
                if(tanamans.get(j).status().equals("Hidup")) {
                    tanamans.get(j).berkembang();

                } else if(tanamans.get(j).status().equals("Mati") && !lokasi.contains(j)) {
                    lokasi.add(j);
                    menanam();
                }

            }
        }
    }

    public static void menanam(){
        System.out.println("""
                Mau menanam apa?
                1. Tomat
                2. Stroberi
                3. Persik""");
        int inputTanaman = input.nextInt();

        switch (inputTanaman){
            case 1:
                tanamans.add(new Tomat());
                System.out.println("Tomat berhasil ditanam.");
                break;
            case 2:
                tanamans.add(new Stroberi());
                System.out.println("Stroberi berhasil ditanam.");
                break;
            case 3:
                tanamans.add(new Persik());
                System.out.println("Persik berhasil ditanam.");
                break;
        }
    }
    public static void info(){

        for(int i = 0; i < tanamans.size(); i++){
            System.out.println("Tanaman buah ke-" + (i+1));
            System.out.println(tanamans.get(i));
        }
    }
}


