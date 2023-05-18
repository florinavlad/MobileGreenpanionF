package com.example.greenpanion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MapPrizesFragment : Fragment() {

    private lateinit var etUserLocation: EditText
    private lateinit var etCenterLocation: EditText
    private lateinit var directionBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map_prizes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        etUserLocation = view.findViewById(R.id.user_location)
        etCenterLocation = view.findViewById(R.id.center_destination)
        directionBtn = view.findViewById(R.id.direction_Btn)

        directionBtn.setOnClickListener() {
            val userLocation = etUserLocation.text.toString()
            val centerLocation = etCenterLocation.text.toString()

            if (userLocation.isEmpty() && centerLocation.isEmpty()) {
                Toast.makeText(requireContext(), "Locația ta și a centrului trenuie completate", Toast.LENGTH_SHORT).show()
            }
            else {
                val uri = Uri.parse("https://www.google.com/maps/dir/$userLocation/$centerLocation")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                intent.`package` = "com.google.android.apps.maps"
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
            }
        }
    }
}