package com.example.adv160420113week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.example.adv160420113week2.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val playerName = view.findViewById<EditText>(R.id.txtName)
        val buttonStart = view.findViewById<Button>(R.id.btnStart)

        buttonStart.setOnClickListener {
            val action = MainFragmentDirections.actionGameFragment(playerName.text.toString())

            Navigation.findNavController(view).navigate(action)
        }
    }
}