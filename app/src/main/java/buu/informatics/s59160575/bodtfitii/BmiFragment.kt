package buu.informatics.s59160575.bodtfitii


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import buu.informatics.s59160575.bodtfitii.databinding.FragmentBmiBinding

/**
 * A simple [Fragment] subclass.
 */
class BmiFragment : Fragment() {
    private lateinit var binding: FragmentBmiBinding
    var bmi = 0;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_bmi,container,false)
        binding.apply {
            bmiBackButton.setOnClickListener{
                findNavController().navigate(R.id.action_bmiFragment_to_homeFragment)
            }
            bmiCalculatorButton.setOnClickListener{
                calculatorBMI()
            }
        }
        return binding.root
    }

    fun calculatorBMI(){
        binding.apply {
            var hight = hightEditBmiNum.text.toString().toInt()
            var wight = wightEditBmiNum.text.toString().toInt()
            var bmi= (wight/((hight*1.0/100)*(hight*1.0/100)))

            bmiResultText.text = "%.2f".format(bmi).toDouble().toString()
        }

    }


}
