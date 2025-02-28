package com.example.moooooo;

public class TinhTong {



    public int tinhTongCacPhanTuCuaMang(int[] arr){
        if(arr.length<1){
            throw new IllegalArgumentException("Mảng không được rỗng");
        }
        int sum = 0;
        for (int n: arr){
            sum+=n;
        }
        return sum;
    }
}
