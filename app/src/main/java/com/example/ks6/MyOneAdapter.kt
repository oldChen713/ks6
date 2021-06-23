package com.example.ks6

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

class MyOneAdapter : BaseQuickAdapter<FoodEntity.Data, BaseViewHolder> {
    constructor(layoutResId: Int, data: List<FoodEntity.Data>?) : super(layoutResId,
        data as MutableList<FoodEntity.Data>?
    )


    override fun convert(helper: BaseViewHolder, item: FoodEntity.Data) {

    }
}