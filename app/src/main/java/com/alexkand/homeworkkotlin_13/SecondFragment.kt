package com.alexkand.homeworkkotlin_13

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        tv_password.text = arguments?.getString("PASSWORD_EXTRA")

        btn_back_to_main.setOnClickListener {

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment()).commit()
        }
    }
}