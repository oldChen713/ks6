package com.example.ks6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.gson.Gson
import com.lzy.okgo.OkGo
import com.lzy.okgo.callback.StringCallback
import com.lzy.okgo.model.Response
import com.youth.banner.Banner

class MainActivity : AppCompatActivity() {

    private lateinit var  headBanner: Banner;
    private lateinit var  bodyRecycler: RecyclerView;
    private lateinit var  bottomRecycler: RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        headBanner = findViewById(R.id.head_banner);
        bodyRecycler =  findViewById(R.id.body_recycler);
        bottomRecycler = findViewById(R.id.bottom_recycler);
        bodyRecycler.layoutManager = StaggeredGridLayoutManager(2,LinearLayout.HORIZONTAL)
        OkGo.get<String>("http://www.qubaobei.com/ios/cf/dish_list.php?stage_id=1&limit=20&page=1").execute(object :StringCallback(){
            override fun onSuccess(response: Response<String>?) {
                var body = response!!.body()
                var fromJson = Gson().fromJson<FoodEntity>(body, FoodEntity::class.java)
                var data = fromJson.data
                bodyRecycler.adapter =MyOneAdapter(R.layout.item,data )


            }
        })

    }
}