package com.example.apicall16.ApiInterface

import com.example.apicall16.Model.MyData
import retrofit2.Call
import retrofit2.http.GET

interface MyInterface {

    @GET("mobilelistener.aspx?MeterNo=&CoName=&address=&method=10&v=1zzWx/W4eN5inXn9n4lnVL3tDybCt2fxiX8GoM1oww0=&FromDate=10/16/2023&ToDate=01/16/2024&VcrID=&userid=2&KNo=&Name=")

    fun getData(): Call<MyData>


}