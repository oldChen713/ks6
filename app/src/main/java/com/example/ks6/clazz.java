package com.example.ks6;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class clazz {
    public static void main(String[] args) {


    }
    class MyOneAdapter extends BaseQuickAdapter<FoodEntity.Data,BaseViewHolder>{

        public MyOneAdapter(int layoutResId, List<FoodEntity.Data> data) {
            super(layoutResId, data);
        }

        public MyOneAdapter(List<FoodEntity.Data> data) {
            super(data);
        }

        public MyOneAdapter(int layoutResId) {
            super(layoutResId);
        }

        @Override
        protected void convert(BaseViewHolder helper, FoodEntity.Data item) {

        }
    }
}
