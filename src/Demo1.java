public class Demo1 {
    public static void main(String[] args) {
        // khai báo mảng 1 chiều
        int[] numbers = new int[5];
        System.out.println(numbers.length);
        String[] nyc = {"Hương","Ngọc","Trang","Linh","Đạt"};
        System.out.println("so phan tu cua mang nyc "+nyc.length);

        nyc[4] = "Đạt 09";
        // truy cập vào phần tử mảng
        System.out.println("Người yêu c thứ 3 "+nyc[2]);
        System.out.println("NYC của QA là : "+nyc[4]);
        // Dùng vòng lặp để duyệt qua mảng

        System.out.println("Danh sách người yêu cũ");
        System.out.println(nyc[0]);
        System.out.println(nyc[1]);
        System.out.println(nyc[2]);
        System.out.println(nyc[3]);
        System.out.println(nyc[4]);
        
        //for i 
        for (int i = 0; i < nyc.length; i++) {
            System.out.println(nyc[i]);
        }
        // foreach
        for (String item : nyc) {
            System.out.println(item);
        }
    }
}
