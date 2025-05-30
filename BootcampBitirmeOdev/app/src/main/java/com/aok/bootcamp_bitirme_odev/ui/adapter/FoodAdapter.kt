package com.aok.bootcamp_bitirme_odev.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.aok.bootcamp_bitirme_odev.R
import com.aok.bootcamp_bitirme_odev.data.model.Food
import com.aok.bootcamp_bitirme_odev.databinding.BgAnasayfaYemeklerBinding
import com.aok.bootcamp_bitirme_odev.ui.fragment.AnasayfaFragmentDirections
import com.aok.bootcamp_bitirme_odev.ui.viewmodel.AnasayfaViewModel
import com.bumptech.glide.Glide

class FoodAdapter(
    var mContext: Context,
    var foodList: List<Food>,
    var viewModel: AnasayfaViewModel
): RecyclerView.Adapter<FoodAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: BgAnasayfaYemeklerBinding)
        : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardDesignHolder {
        val binding = BgAnasayfaYemeklerBinding.inflate(LayoutInflater.from(mContext), parent, false)

        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(
        holder: CardDesignHolder,
        position: Int
    ) {
        val food = foodList.get(position)
        val t = holder.design
        val imageName = food.yemek_resim_adi

        val url = "http://kasimadalan.pe.hu/yemekler/resimler/$imageName"
        Glide.with(holder.itemView.context).load(url).override(200,200).into(t.ivFoodImg)

        t.tvFoodName.text = food.yemek_adi
        t.tvFoodPrice.text = "${food.yemek_fiyat}₺"
        t.cvFood.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.gecisDetayFragment(food = food)
            Navigation.findNavController(it).navigate(gecis)
        }


    }

    override fun getItemCount(): Int {
        return foodList.size
    }


}