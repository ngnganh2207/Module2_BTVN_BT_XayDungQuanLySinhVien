package qlysinhvien;

import java.util.Comparator;

public class SortSinhVien implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
