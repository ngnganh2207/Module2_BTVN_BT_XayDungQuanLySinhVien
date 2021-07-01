package qlysinhvien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSV {
    List<SinhVien> list= new ArrayList<>();
    Scanner scanner= new Scanner(System.in);
    File sinhVien= new File("SinhVien.csv");
    String tieuDe= "idname, age, gendor, address, avrPoint";
    static BufferedWriter bufferedWriter;
    static BufferedReader bufferedReader;

    public void them(SinhVien sinhVien){
        list.add(sinhVien);
    }
    public SinhVien creat(){
        //String id, String name, int age, String gendor, String address, double avrPoint
        System.out.println("Nhập mã sinh viên");
        String id= scanner.nextLine();
        System.out.println("Nhập tên sinh viên");
        String name= scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên");
        int age= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính sinh viên");
        String gendor= scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên");
        String address= scanner.nextLine();
        System.out.println("Nhập điểm trung bình");
        double avrPoint= Double.parseDouble(scanner.nextLine());

        return new SinhVien(id,name,age,gendor,address,avrPoint);
    }
    public void delete(String id){
        for( int i=0; i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                list.remove(list.get(i));
                i--;
            }
        }
    }
    public void update(String id){
        for(int i= 0; i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                list.set(i,creat());
                break;
            }
        }
    }
    public void sort(){
        SortSinhVien sortSinhVien= new SortSinhVien();
        list.sort(sortSinhVien);
    }
    public void ghiFile(List<SinhVien> list) throws Exception{
        FileWriter fileWriter= new FileWriter(sinhVien);
        bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.write(tieuDe);
        for(SinhVien sv: list){
            bufferedWriter.newLine();
            bufferedWriter.write(sv.show());
        }
    }
    public void docFile(List<SinhVien> list) throws Exception{
        FileReader fileReader=new FileReader(sinhVien);
        bufferedReader= new BufferedReader(fileReader);
        String line= null;
        while ((line= bufferedReader.readLine())!= null){
            System.out.println(line);
        }
    }
}
