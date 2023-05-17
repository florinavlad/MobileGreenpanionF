package com.example.greenpanion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class RegisterFragment : Fragment() {

    private lateinit var stateSpinner: Spinner
    private lateinit var citySpinner: Spinner

    private lateinit var stateAdapter: ArrayAdapter<CharSequence>
    private lateinit var cityAdapter: ArrayAdapter<CharSequence>
    private lateinit var selectedState: String
    private lateinit var selectedCity: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        stateSpinner = view.findViewById(R.id.state_Spinner)
        stateAdapter = ArrayAdapter.createFromResource(requireActivity(), R.array.array_of_states, R.layout.spinner_layout)

        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        stateSpinner.adapter = stateAdapter

        stateSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long)
            {
                citySpinner = requireView().findViewById(R.id.city_Spinner)
                selectedState = stateSpinner.selectedItem.toString()

                if (parent?.id == R.id.state_Spinner) {

                    when (selectedState) {
                        "Selectează județul" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.array_of_cities, R.layout.spinner_layout)
                        }
                        "Alba" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Alba_cities, R.layout.spinner_layout)
                        }
                        "Arad County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Arad_cities, R.layout.spinner_layout)
                        }
                        "Arges" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Arges_cities, R.layout.spinner_layout)
                        }
                        "Bacău County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Bacau_cities, R.layout.spinner_layout)
                        }
                        "Bihor County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Bihor_cities, R.layout.spinner_layout)
                        }
                        "Bistrița-Năsăud County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Bistrita_cities, R.layout.spinner_layout)
                        }
                        "Botoșani County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Botosani_cities, R.layout.spinner_layout)
                        }
                        "Braila" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Braila_cities, R.layout.spinner_layout)
                        }
                        "Brașov County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Brasov_cities, R.layout.spinner_layout)
                        }
                        "Bucharest" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Bucuresti_cities, R.layout.spinner_layout)
                        }
                        "Buzău County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Buzau_cities, R.layout.spinner_layout)
                        }
                        "Caraș-Severin County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.CarașSeverin_cities, R.layout.spinner_layout)
                        }
                        "Cluj County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Cluj_cities, R.layout.spinner_layout)
                        }
                        "Constanța County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Constanta_cities, R.layout.spinner_layout)
                        }
                        "Covasna County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Covasna_cities, R.layout.spinner_layout)
                        }
                        "Călărași County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Calarasi_cities, R.layout.spinner_layout)
                        }
                        "Dolj County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Dolj_cities, R.layout.spinner_layout)
                        }
                        "Dâmbovița County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Dambovita_cities, R.layout.spinner_layout)
                        }
                        "Galați County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Galati_cities, R.layout.spinner_layout)
                        }
                        "Giurgiu County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Giurgiu_cities, R.layout.spinner_layout)
                        }
                        "Gorj County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Gorj_cities, R.layout.spinner_layout)
                        }
                        "Harghita County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Harghita_cities, R.layout.spinner_layout)
                        }
                        "Hunedoara County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Hunedoara_cities, R.layout.spinner_layout)
                        }
                        "Ialomița County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Ialomita_cities, R.layout.spinner_layout)
                        }
                        "Iași County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Iasi_citites, R.layout.spinner_layout)
                        }
                        "Ilfov County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Ilfov_cities, R.layout.spinner_layout)
                        }
                        "Maramureș County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Maramures_cities, R.layout.spinner_layout)
                        }
                        "Mehedinți County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Mehedinti_cities, R.layout.spinner_layout)
                        }
                        "Mureș County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Mures_cities, R.layout.spinner_layout)
                        }
                        "Neamț County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Neamt_cities, R.layout.spinner_layout)
                        }
                        "Olt County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Olt_cities, R.layout.spinner_layout)
                        }
                        "Prahova County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Prahova_cities, R.layout.spinner_layout)
                        }
                        "Satu Mare County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.SatuMare_cities, R.layout.spinner_layout)
                        }
                        "Sibiu County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Sibiu_cities, R.layout.spinner_layout)
                        }
                        "Suceava County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Suceava_cities, R.layout.spinner_layout)
                        }
                        "Sălaj County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Salaj_cities, R.layout.spinner_layout)
                        }
                        "Teleorman County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Teleorman_cities, R.layout.spinner_layout)
                        }
                        "Timiș County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Timis_cities, R.layout.spinner_layout)
                        }
                        "Tulcea County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Tulcea_cities, R.layout.spinner_layout)
                        }
                        "Vaslui County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Vaslui_cities, R.layout.spinner_layout)
                        }
                        "Vrancea County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Vrancea_cities, R.layout.spinner_layout)
                        }
                        "Vâlcea County" -> { cityAdapter = ArrayAdapter.createFromResource(parent.context, R.array.Valcea_cities, R.layout.spinner_layout)
                        }

                        else -> {
                            // code for handling other cases
                        }
                    }
                    cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    citySpinner.adapter = cityAdapter

//                    citySpinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
//                        override fun onItemSelected(
//                            parent: AdapterView<*>?,
//                            view: View?,
//                            position: Int,
//                            id: Long
//                        ) {
//                            selectedCity = citySpinner.selectedItem.toString()
//                        }
//
//                        override fun onNothingSelected(parent: AdapterView<*>?) {
//                            TODO("Not yet implemented")
//                        }

//                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}