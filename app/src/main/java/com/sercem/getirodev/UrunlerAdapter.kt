package com.sercem.getirodev

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.sercem.getirodev.databinding.UrunCardBinding

class UrunlerAdapter(var mContext:Context, var urunlerListesi:List<Urunler>)
    : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(urunCardBinding: UrunCardBinding):RecyclerView.ViewHolder(urunCardBinding.root){
        var tasarim:UrunCardBinding

        init{
            this.tasarim=urunCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater =LayoutInflater.from(mContext)
        val tasarim = UrunCardBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTutucu(tasarim)

    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)

        holder.tasarim.imageViewUrun.setImageResource(mContext.resources.getIdentifier(urun.urun_resim_adi, "drawable", mContext.packageName))
        //holder.tasarim.textViewUrunAdi.text= urun.urun_adi
        holder.tasarim.urunNesnesi=urun
        holder.tasarim.urunCardview.setOnClickListener {
            val gecis = UrunlerAnasayfaFragmentDirections.urunDetayGesis(urun)
            Navigation.findNavController(it).navigate(gecis)

        }
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}