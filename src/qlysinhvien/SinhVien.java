package qlysinhvien;

public class SinhVien {
    private String id;
    private String name;
    private int age;
    private String gendor;
    private String address;
    private double avrPoint;

    public SinhVien() {
    }

    public SinhVien(String id, String name, int age, String gendor, String address, double avrPoint) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gendor = gendor;
        this.address = address;
        this.avrPoint = avrPoint;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGendor() {
        return gendor;
    }

    public void setGendor(String gendor) {
        this.gendor = gendor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAvrPoint() {
        return avrPoint;
    }

    public void setAvrPoint(double avrPoint) {
        this.avrPoint = avrPoint;
    }


    public String show() {
        return  id + ", " + name + ", " + age + ", " + gendor + ", " + address + ", "+ avrPoint;
    }
}

