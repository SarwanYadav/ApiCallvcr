package com.example.apicall16

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apicall16.ApiInterface.MyInterface
import com.example.apicall16.Model.MyData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("http://avvnlvigilance.pragyaware.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyInterface::class.java)





        val retrofitData = retrofitBuilder.getData()






        retrofitData.enqueue(object : Callback<MyData?> {
            override fun onResponse(call: Call<MyData?>, response: Response<MyData?>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<MyData?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })


    }
}