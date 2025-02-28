package com.example.moooooo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tinhTongTest {
    TinhTong tinhTong = new TinhTong();

    int[] arr1 = {1,2,3,4,5,6,7,8,9};
    int[] arr2 = {4,5,6,7,8,9};
    int[] arr3={};


    @Test
    void tinhTong1(){
        assertEquals(45,tinhTong.tinhTongCacPhanTuCuaMang(arr1));
    }

    @Test
    void tinhTong2(){
        assertEquals(39,tinhTong.tinhTongCacPhanTuCuaMang(arr2));
    }


    @Test
    void tinhTong3(){
        assertThrows(IllegalArgumentException.class,()->{tinhTong.tinhTongCacPhanTuCuaMang(arr3);});
    }
}