package com.example.navigationcomponentpractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.navigationcomponentpractice.R
class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        val navController = activity?.let { Navigation.findNavController(it, R.id.fragmentContainerView) }
        val bundle = Bundle()
        bundle.putString("message", "Hello from fragment A")

        val buttonA: Button = view.findViewById(R.id.buttonA)

        buttonA.setOnClickListener {
            navController?.navigate(R.id.action_fragmentA_to_fragmentB, bundle)
        }
        return  view
    }

}