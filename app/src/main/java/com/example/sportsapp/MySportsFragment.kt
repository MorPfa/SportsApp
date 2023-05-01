package com.example.sportsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sportsapp.databinding.FragmentMySportsBinding

class MySportsFragment : Fragment() {

    private var binding: FragmentMySportsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val sportsBinding = FragmentMySportsBinding.inflate(inflater, container, false)
        binding = sportsBinding
        return sportsBinding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.mySportsFragment = this


    }

    fun goToSportDetail(id: Int){
        findNavController().navigate(id)
    }

}