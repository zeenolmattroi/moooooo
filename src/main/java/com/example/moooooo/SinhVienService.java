package com.example.moooooo;

import java.util.ArrayList;

public class SinhVienService {
    public String SuaSinhVien(SinhVien sv, SinhVien request){

        if(request.getTen().isEmpty()|| request.getTen()==null){
            throw new IllegalArgumentException("tên không được trống");
        }else if(request.getTuoi()<0|| request.getTuoi()>40){
            throw new IllegalArgumentException("tuổi không hợp lệ");
        }else if(request.getDiemTrungBinh()<0f||request.getDiemTrungBinh()>10f){
            throw new IllegalArgumentException("điểm không hợp lệ");
        }else if(request.getKyHoc()>6|| request.getKyHoc()<1){
            throw new IllegalArgumentException("kỳ học không hợp lệ");
        }else if(request.getChuyenNganh().isEmpty()|| request.getChuyenNganh()==null){
            throw new IllegalArgumentException("Chuyên nghành không hợp lệ");
        }
        sv.setTen(request.getTen());
        sv.setTuoi(request.getTuoi());
        sv.setDiemTrungBinh(request.getDiemTrungBinh());
        sv.setKyHoc(request.getKyHoc());
        sv.setChuyenNganh(request.getChuyenNganh());
        System.out.println("Sinh viên đã được sửa" );
        System.out.println(sv);
        return "cập nhật sinh viên thành công";
    }
}
