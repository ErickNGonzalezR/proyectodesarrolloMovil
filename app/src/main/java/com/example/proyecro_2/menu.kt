package com.example.proyecro_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButtonToggleGroup

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.merge_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val toggleButton: MaterialButtonToggleGroup = findViewById(R.id.toggleButton)
        toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            if (isChecked) {
                val fragmentTransaction = supportFragmentManager.beginTransaction()
                when (checkedId) {
                    R.id.button1 -> {
                        val fragment = InicioFragment()
                        fragmentTransaction.replace(R.id.InicioFragment, fragment)
                    }
                    R.id.button2 -> {
                        val fragment = MapaFragment()
                        fragmentTransaction.replace(R.id.MapaFragment, fragment)
                    }
                    R.id.button3 -> {
                        val fragment = EmergenciaFragment()
                        fragmentTransaction.replace(R.id.EmergenciaFragment, fragment)
                    }
                }
                fragmentTransaction.commit()
            }
        }

    }
}