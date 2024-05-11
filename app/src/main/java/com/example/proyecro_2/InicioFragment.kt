package com.example.proyecro_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class InicioFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_inicio_fragment, container, false)

        // Asignar OnClickListener a cada botón
        view.findViewById<Button>(R.id.custom_button_1).setOnClickListener {
            // Cambiar al layout de erupciones
            parentFragmentManager.beginTransaction().replace(R.id.Erupciones, Erupciones()).commit()
        }

        view.findViewById<Button>(R.id.custom_button_2).setOnClickListener {
            // Cambiar al layout de incendios
            val fragment = Incendios()
            parentFragmentManager.beginTransaction().replace(R.id.Incendios, fragment).commit()
        }

        view.findViewById<Button>(R.id.custom_button_3).setOnClickListener {
            // Cambiar al layout de terremotos
            val fragment = Terremotos()
            parentFragmentManager.beginTransaction().replace(R.id.Terremotos, fragment).commit()
        }

        view.findViewById<Button>(R.id.custom_button_4).setOnClickListener {
            // Cambiar al layout de inundaciones
            val fragment = Inundaciones()
            parentFragmentManager.beginTransaction().replace(R.id.Inundaciones, fragment).commit()
        }

        view.findViewById<Button>(R.id.custom_button_5).setOnClickListener {
            // Cambiar al layout de deslizamientos
            val fragment = Deslizamientos()
            parentFragmentManager.beginTransaction().replace(R.id.Deslizamientos, fragment).commit()
        }

        return view
    }
}
