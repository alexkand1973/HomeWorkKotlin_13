package com.alexkand.homeworkkotlin_13

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btn_login.setOnClickListener {

            val fragment = SecondFragment()

            val bungle = Bundle()
            bungle.putString("PASSWORD_EXTRA", et_password.text.toString())

            fragment.arguments = bungle

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment).commit()
        }

    }
}