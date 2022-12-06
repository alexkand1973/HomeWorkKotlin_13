package com.alexkand.homeworkkotlin_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Сделайте приложение, которое будет хранить в себе два экрана.
        // Первый экран содержит EditText и кнопку с текстом Log in.
        // EditText должен иметь hint с текстом Password.
        // По нажатию на кнопку должен совершаться переход на новый экран с TextView,
        // которое хранит в себе текст введенный пользователем в предыдущим экране в EditText.
        // Приложение должно быть сделано на фрагментах.
        // Также постарайтесь просто для закрепления материала прописать код для передачи данных
        // между activity и закомментировать его.

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, MainFragment())
            .commit()
    }
}