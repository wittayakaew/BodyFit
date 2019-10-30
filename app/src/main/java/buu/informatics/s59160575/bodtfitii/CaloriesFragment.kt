package buu.informatics.s59160575.bodtfitii


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import buu.informatics.s59160575.bodtfitii.databinding.FragmentCaloriesBinding

/**
 * A simple [Fragment] subclass.
 */
class CaloriesFragment : Fragment() {
    private lateinit var  binding : FragmentCaloriesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_calories, container, false)
        binding.apply {
            caloriesBackButton.setOnClickListener {
                findNavController().navigate(R.id.action_caloriesFragment_to_homeFragment)
                }
            caloriesCalButton.setOnClickListener {
                    val id = genderGroupSelect.checkedRadioButtonId

                if (genderFemale.isChecked){
                    Toast.makeText( context, "female",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText( context, "male",Toast.LENGTH_SHORT).show()
                }


                }
            return binding.root
        }

        fun calculatorCalories() {
            binding.apply {
                var age = caloriesAgeNum.text.toString().toInt()
                var hight = caloriesHightNum.text.toString().toInt()
                var weight = caloriesWeightNum.text.toString().toInt()

            }

        }

    }
}
