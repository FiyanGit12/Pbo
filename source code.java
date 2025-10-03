public class MakhlukHidup {
    private String nama;
    private String jenis;
    private double berat;
    private int umur;

    // Default Constructor
    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 0;
        this.berat = 0.0;
        System.out.println("[Default Constructor] Objek MakhlukHidup dibuat.");
    }

    // Parameterized Constructor
    public MakhlukHidup(String nama, String jenis, int umur, double berat) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.berat = berat;
        System.out.println("[Parameterized Constructor] Objek MakhlukHidup dibuat dengan parameter.");
    }

    // Copy Constructor
    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama;
        this.jenis = other.jenis;
        this.umur = other.umur;
        this.berat = other.berat;
        System.out.println("[Copy Constructor] Objek MakhlukHidup disalin dari objek lain.");
    }

    // Setter dengan validasi
    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak boleh negatif. Diset ke 0.");
            this.umur = 0;
        }
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter info
    public String getInfo() {
        return "Nama=" + nama + ", Jenis=" + jenis
             + ", Umur=" + umur + ", Berat=" + berat;
    }

    public static void main(String[] args) {
        // Objek m dibuat dengan Default Constructor
        MakhlukHidup m = new MakhlukHidup();
        m.setNama("Kucing");  
        System.out.println(m.getInfo());

        // Objek m2 dibuat dengan Parameterized Constructor
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        System.out.println(m2.getInfo());

        // Objek m3 dibuat dengan Copy Constructor (salin dari m2)
        MakhlukHidup m3 = new MakhlukHidup(m2);
        System.out.println(m3.getInfo());

        // Ubah nama m2 pakai setter
        m2.setNama("Kuda");
        System.out.println(m2.getInfo());

        // Uji validasi: set umur negatif pada m3
        m3.setUmur(-10);
        System.out.println(m3.getInfo());
    }
}


