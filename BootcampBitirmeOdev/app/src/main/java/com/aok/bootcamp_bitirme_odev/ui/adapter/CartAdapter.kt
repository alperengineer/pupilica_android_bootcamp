package com.aok.bootcamp_bitirme_odev.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.aok.bootcamp_bitirme_odev.data.model.Cart
import com.aok.bootcamp_bitirme_odev.data.model.Food
import com.aok.bootcamp_bitirme_odev.databinding.BgCardSepetBinding
import com.aok.bootcamp_bitirme_odev.ui.fragment.AnasayfaFragmentDirections
import com.aok.bootcamp_bitirme_odev.ui.viewmodel.SepetViewModel
import com.bumptech.glide.Glide

class CartAdapter(
    var mContext: Context,
    var cardList: List<Cart>,
    var viewModel: SepetViewModel
): RecyclerView.Adapter<CartAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design: BgCardSepetBinding): RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardDesignHolder {
        val binding = BgCardSepetBinding.inflate(LayoutInflater.from(mContext), parent, false)


        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(
        holder: CardDesignHolder,
        position: Int
    ) {
        val cart = cardList.get(position)
        val t = holder.design

        val imageName = cart.yemek_resim_adi

        val url = "http://kasimadalan.pe.hu/yemekler/resimler/$imageName"
        Glide.with(holder.itemView.context).load(url).override(200,200).into(t.ivFoodImg)

        t.tvFoodName.text = cart.yemek_adi
        t.tvFoodSummaryPrice.text = "${cart.yemek_fiyat}₺"

    }

    override fun getItemCount(): Int {
        return cardList.size
    }

}