package com.example.navigationcomponentpractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.navigationcomponentpractice.R

class FragmentB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val navController = activity?.let { Navigation.findNavController(it, R.id.fragmentContainerView) }
        val buttonB: Button = view.findViewById(R.id.buttonB)
        buttonB.setOnClickListener {
            val action = FragmentBDirections.actionFragmentBToFragmentA()
            navController?.navigate(action)
//            navController?.navigate(R.id.action_fragmentB_to_fragmentA)
        }
        return  view
    }

}