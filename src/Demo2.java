import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] marks = new float[3];
        System.out.println("Nhập vào điểm toán lý hóa");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = Float.parseFloat(scanner.nextLine());
        }
        // tính TB
        float sum = 0;
        for (float mark : marks) {
            sum += mark;
        }
        System.out.printf("Điểm TB %.1f",(sum/marks.length));

        // tìm max trong mảng
        float max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if(max < marks[i]){
                max = marks[i];
            }
        }
        System.out.println("\nGiá trị lớn nhất là "+max);

    }
}
