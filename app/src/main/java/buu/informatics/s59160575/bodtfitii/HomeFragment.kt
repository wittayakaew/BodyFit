package buu.informatics.s59160575.bodtfitii


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import buu.informatics.s59160575.bodtfitii.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {
        private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        binding.bmiButton.setOnClickListener {
                view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_bmiFragment)
        }
        binding.fatCalButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fatCalculatorFragment)
        }
        return binding.root

    }


}
