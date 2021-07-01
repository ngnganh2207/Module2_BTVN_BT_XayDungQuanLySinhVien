package qlysinhvien;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.Scanner;

public class MainQLSV {
    public static void main(String[] args) {
        QLSV qlsv= new QLSV();
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("0. Exit");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật sinh viên");
            System.out.println("4. Xóa thông tin sinh viên");
            System.out.println("5. Sort- Sắp xếp sinh viên");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi từ file");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for(SinhVien sv: qlsv.list){
                        System.out.println(sv.show());
                    }
                    break;
                case 2:
                    SinhVien sinhVien= qlsv.creat();
                    qlsv.them(sinhVien);
                    break;
                case 3:
                    System.out.println("Nhập ID sinh viên cần update");
                    String id3= scanner.nextLine();
                    qlsv.update(id3);
                    break;
                case 4:
                    System.out.println("CẢNH BÁO. VIỆC XÓA SẼ LÀM MẤT DỮ LIỆU");
                    System.out.println("1. Tiếp tục");
                    System.out.println("2. Bỏ qua");
                    int choice4= Integer.parseInt(scanner.nextLine());
                    if(choice4==1) {
                        System.out.println("Nhập id sinh viên cần xóa");
                        String id4 = scanner.nextLine();
                        qlsv.delete(id4);
                    }else {
                        System.out.println("Bạn đã lựa chọn không xóa");
                    }
                    break;
                case 5:
                    qlsv.sort();
                    break;
                case 6:
                    try{
                        qlsv.docFile(qlsv.list);
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            qlsv.bufferedReader.close();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    break;


                case 7:
                    try{
                        qlsv.ghiFile(qlsv.list);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                    finally {
                        try{
                            qlsv.bufferedWriter.close();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    break;

            }
        }
    }
}
