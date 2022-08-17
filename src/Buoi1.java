import java.text.DecimalFormat;
import java.util.Scanner;

public class Buoi1 {
    public static void main(String[] args) {
        // comment
        // 1 : Kiểu dữ liệu
        // Nhóm 1 (Nguyên thuỷ - primities): char, int, long, double, float, boolean
        // Nhóm 2 (Đối tượng - Object): String, Integer, Long, Double, Float, Boolean

        // 2: Khai báo biến tuân thủ theo camelCase
        // char a = 'a'; // char - kiểu ký tự chứa trong ''
        // int age = 28; // int, long - kiểu số nguyên (Số không có phần thập phân)
        // float height = 1.75f; // float, double - kiểu số có phần thập phân
        // boolean isMale = true; // boolean - kiểu luận lý

        // String name = "Pham Tan Phat"; // String - kieu chuoi

        // 3: Toan tu
        // int a = 5;
        // a = a + 1 <=> a += 1;
        // int b = a++;

        // Toan tu ++

        // Truong hop 1: a++
        // 1 - Truyen gia tri a vao vi tri a++
        // 2 - Tang a len 1 don vi

        // Truong hop 2: ++a
        // 1 - Tang a len 1 don vi
        // 1 - Truyen gia tri a vao vi tri a++

        // System.out.println("Gia tri cua a: " + a);
        // System.out.println("Gia tri cua b: " + b);

        // int a = 5;
        // int b = 3;

        // int result = a++ - --b + --a + a-- + b++ - b-- + a++ + --a;
        // 5 - --b + --a + a-- + b++ - b-- + a++ + --a; a = 6, b = 3;
        // 5 - 2 + --a + a-- + b++ - b-- + a++ + --a; a = 6, b = 2;
        // 5 - 2 + 5 + a-- + b++ - b-- + a++ + --a; a = 5, b = 2;
        // 5 - 2 + 5 + 5 + b++ - b-- + a++ + --a; a = 4, b = 2;
        // 5 - 2 + 5 + 5 + 2 - b-- + a++ + --a; a = 4, b = 3;
        // 5 - 2 + 5 + 5 + 2 - 3 + a++ + --a; a = 4, b = 2;
        // 5 - 2 + 5 + 5 + 2 - 3 + 4 + --a; a = 5, b = 2;
        // 5 - 2 + 5 + 5 + 2 - 3 + 4 + 4; a = 4, b = 2;
        // a = 4, b = 2, result = 20

        // System.out.println("Gia tri cua a: " + a);
        // System.out.println("Gia tri cua b: " + b);
        // System.out.println("Gia tri cua ket qua: " + result);

        // Value 1: a = 4, b = 2, result = 20 (Tich)
        // Value 2: a = 4, b = 2, result = 23 (Kevin)
        // Value 3: a = 5, b = 2, result = 17 (Tan)

        // int c = -5;
        // int d = 5;

        // int result = --c + c++ - d-- + d-- + ++c + c-- - d++ + c++ - d--;
        // -6 + c++ - d-- + d-- + ++c + c-- - d++ + c++ - d--; c = -6, d = 5;
        // -6 - 6 - d-- + d-- + ++c + c-- - d++ + c++ - d--; c = -5, d = 5;
        // -6 - 6 - 5 + d-- + ++c + c-- - d++ + c++ - d--; c = -5, d = 4;
        // -6 - 6 - 5 + 4 + ++c + c-- - d++ + c++ - d--; c = -5, d = 3;
        // -6 - 6 - 5 + 4 - 4 + c-- - d++ + c++ - d--; c = -4, d = 3;
        // -6 - 6 - 5 + 4 - 4 - 4 - d++ + c++ - d--; c = -5, d = 3;
        // -6 - 6 - 5 + 4 - 4 - 4 - 3 + c++ - d--; c = -5, d = 4;
        // -6 - 6 - 5 + 4 - 4 - 4 - 3 - 5 - d--; c = -4, d = 4;
        // -6 - 6 - 5 + 4 - 4 - 4 - 3 - 5 - 4; c = -4, d = 3;
        // c = -4, d = 3, result = -33

        // Độ ưu tiên
        // ++ --
        // * /
        // + -
        // System.out.println("Gia tri cua c: " + c);
        // System.out.println("Gia tri cua d: " + d);
        // System.out.println("Gia tri cua ket qua: " + result);

        // int a = 5;
        // int b = a % 3; // Chia lay phan
        // System.out.print(b);

        // Toán tử so sánh : >, <, ==

        // 4: Câu điều kiện

        // int a = 10;
        // int b = 10;

        // Trường hợp sẽ xảy ra thì sẽ phải làm gì

        // if (a > b) {
        //    System.out.print("A lớn hơn B");
        // } else if (a < b) {
        //    System.out.print("A bé hơn B");
        // } else {
        //    System.out.print("A bằng B");
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập tuổi: ");
        String age = scanner.nextLine();
        System.out.print("Tên bạn là " + name);
        System.out.print("Tuổi bạn là " + age);


        // Chuẩn bị data test cho 6 trường hợp
        // Chiều cao ? , cân nặng ?
    }
}


