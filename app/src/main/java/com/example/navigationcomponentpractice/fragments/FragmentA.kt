package com.example.navigationcomponentpractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationcomponentpractice.R
class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        val buttonA: Button = view.findViewById(R.id.buttonA)
        buttonA.setOnClickListener {
            val action = FragmentADirections.actionFragmentAToFragmentB()
            it.findNavController().navigate(action)
        }
        return  view
    }

}