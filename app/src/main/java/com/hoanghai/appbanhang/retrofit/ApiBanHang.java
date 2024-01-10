package com.hoanghai.appbanhang.retrofit;

import com.hoanghai.appbanhang.model.LoaiSpModel;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface  ApiBanHang {
    // GET DATA
    @GET("getloaisp.php")
    Observable<LoaiSpModel> getLoaiSp();
    // POST DATA
}
