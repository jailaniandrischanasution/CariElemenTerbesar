public class CariElemenTerbesar {
    public static void main(String[] args) {
        int[] angka = {67, 45, 432, 768, 71, 245, 652, 463, 8, 543};
        
        int terbesar = Integer.MIN_VALUE;
        
        for (int angkaSaatIni : angka) {
            if (angkaSaatIni > terbesar) {
                terbesar = angkaSaatIni;
            }
        }
        
        System.out.println("Angka terbesar adalah: " + terbesar);
    }
}
