import java.util.ArrayList;
import java.util.Scanner;

// Lớp Nguoi để quản lý thông tin cá nhân
class Nguoi {
    private String hoTen248;
    private String ngaySinh248;
    private String queQuan248;

    public Nguoi() {}

    public Nguoi(String hoTen248, String ngaySinh248, String queQuan248) {
        this.hoTen248 = hoTen248;
        this.ngaySinh248 = ngaySinh248;
        this.queQuan248 = queQuan248;
    }

    public void nhapThongTin248(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        hoTen248 = sc.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        ngaySinh248 = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan248 = sc.nextLine();
    }

    public void hienThiThongTin248() {
        System.out.println("Họ tên: " + hoTen248);
        System.out.println("Ngày sinh: " + ngaySinh248);
        System.out.println("Quê quán: " + queQuan248);
    }

    public String getNgaySinh248() {
        return ngaySinh248;
    }

    public String getQueQuan248() {
        return queQuan248;
    }
}

// Lớp hồ sơ học sinh
class HSHocSinh {
    private Nguoi nguoi248;
    private String lop248;
    private String khoaHoc248;
    private String kyHoc248;

    public HSHocSinh() {}

    public void nhapThongTin248(Scanner sc) {
        nguoi248 = new Nguoi();
        System.out.println("== Nhập thông tin học sinh ==");
        nguoi248.nhapThongTin248(sc);

        System.out.print("Nhập lớp: ");
        lop248 = sc.nextLine();
        System.out.print("Nhập khoá học: ");
        khoaHoc248 = sc.nextLine();
        System.out.print("Nhập kỳ học: ");
        kyHoc248 = sc.nextLine();
    }

    public void hienThiThongTin248() {
        System.out.println("==== Hồ sơ học sinh ====");
        nguoi248.hienThiThongTin248();
        System.out.println("Lớp: " + lop248);
        System.out.println("Khoá học: " + khoaHoc248);
        System.out.println("Kỳ học: " + kyHoc248);
    }

    public String getNamSinh248() {
        if (nguoi248.getNgaySinh248().length() >= 4) {
            return nguoi248.getNgaySinh248().substring(nguoi248.getNgaySinh248().length() - 4);
        }
        return "";
    }

    public String getQueQuan248() {
        return nguoi248.getQueQuan248();
    }

    public String getLop248() {
        return lop248;
    }
}

// Chương trình chính
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HSHocSinh> dsHocSinh248 = new ArrayList<>();

        System.out.print("Nhập số lượng học sinh: ");
        int n248 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n248; i++) {
            System.out.println("\n--- Nhập thông tin học sinh thứ " + (i + 1) + " ---");
            HSHocSinh hs248 = new HSHocSinh();
            hs248.nhapThongTin248(sc);
            dsHocSinh248.add(hs248);
        }

        // 1. Hiển thị học sinh sinh năm 1985 và quê ở Thái Nguyên
        System.out.println("\n===== HỌC SINH SINH NĂM 1985 & QUÊ THÁI NGUYÊN =====");
        for (HSHocSinh hs248 : dsHocSinh248) {
            if (hs248.getNamSinh248().equals("1985") && hs248.getQueQuan248().equalsIgnoreCase("Thái Nguyên")) {
                hs248.hienThiThongTin248();
                System.out.println("---------------------------");
            }
        }

        // 2. Hiển thị học sinh lớp 10A1
        System.out.println("\n===== HỌC SINH LỚP 10A1 =====");
        for (HSHocSinh hs248 : dsHocSinh248) {
            if (hs248.getLop248().equalsIgnoreCase("10A1")) {
                hs248.hienThiThongTin248();
                System.out.println("---------------------------");
            }
        }
    }
}
1