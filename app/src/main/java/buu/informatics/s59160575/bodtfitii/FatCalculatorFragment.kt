package buu.informatics.s59160575.bodtfitii


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import buu.informatics.s59160575.bodtfitii.databinding.FragmentFatCalculatorBinding

/**
 * A simple [Fragment] subclass.
 */
class FatCalculatorFragment : Fragment() {
    private lateinit var binding: FragmentFatCalculatorBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentFatCalculatorBinding>(inflater,R.layout.fragment_fat_calculator,container,false)
       binding.apply {
           fatBackButton.setOnClickListener{
               findNavController().navigate(R.id.action_fatCalculatorFragment_to_homeFragment)
           }
       }
        return binding.root
    }


}
