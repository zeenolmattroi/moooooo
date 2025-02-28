package com.example.moooooo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    SinhVienService service = new SinhVienService();

    SinhVien sv = new SinhVien("SV1","Kiên",20,9f,2,"logistich");
    SinhVien request = new SinhVien("SV1","Kiên",22,8f,4,"ktvt");
    SinhVien request1 = new SinhVien("SV1","Kiên nguu",22,11f,4,"bất động sản");


    @Test
    void testSuaSinhVien1(){
        String ex = service.SuaSinhVien(sv,request);
        String act="cập nhật sinh viên thành công";
        assertEquals(ex,act);
    }

//    @Test
//    void testSuaSinhVien2(){
//        assertThrows(IllegalArgumentException.class,()->{service.SuaSinhVien(sv,request1);});
//    }



}