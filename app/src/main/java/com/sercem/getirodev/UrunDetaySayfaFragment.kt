package com.sercem.getirodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.sercem.getirodev.databinding.FragmentUrunDetaySayfaBinding


class UrunDetaySayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentUrunDetaySayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_urun_detay_sayfa, container, false)

        val bundle : UrunDetaySayfaFragmentArgs by navArgs()
        var gelenUrun = bundle.urunNesne

        tasarim.imageViewUrunResim.setImageResource(resources.getIdentifier(gelenUrun.urun_resim_adi, "drawable", requireContext().packageName))

        //tasarim.textViewUrunIsmi.text=gelenUrun.urun_adi
        //tasarim.textViewUrunDetaylari.text=gelenUrun.urun_bilgi
        tasarim.urunNesnesi = gelenUrun

        return tasarim.root
    }


}