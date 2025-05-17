package com.aok.a06_contactapp.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.aok.a06_contactapp.R
import com.aok.a06_contactapp.data.entity.Kisiler
import com.aok.a06_contactapp.databinding.CardTasarimBinding
import com.aok.a06_contactapp.ui.fragments.AnasayfaFragmentDirections
import com.aok.a06_contactapp.ui.viewmodel.AnasayfaViewModel
import com.aok.a06_contactapp.utils.gecisYap
import com.google.android.material.snackbar.Snackbar

class KisilerAdapter(var mContext: Context, var kisilerListesi: List<Kisiler>, var viewModel: AnasayfaViewModel) : RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kisi = kisilerListesi.get(position) // 0,1,2,3,...
        val t = holder.tasarim // Tasarıma erişim nesnesi oluşturduk

        t.textViewKisiAd.text = kisi.kisi_ad
        t.textViewKisiNo.text = kisi.kisi_tel

        t.cardViewSatir.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi = kisi)
            // Navigation.findNavController(it).navigate(gecis)
            Navigation.gecisYap(it, gecis)
        }

        t.imageViewSil.setOnClickListener {
            Snackbar.make(it, "${kisi.kisi_ad} silinsin mi?", Snackbar.LENGTH_SHORT)
                .setAction ("Evet"){
                    viewModel.sil(kisi.kisi_id)
                }.show()
        }

    }

    override fun getItemCount(): Int {
        return kisilerListesi.size
    }




}