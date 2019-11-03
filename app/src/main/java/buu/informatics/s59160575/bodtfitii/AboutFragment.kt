package buu.informatics.s59160575.bodtfitii


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import buu.informatics.s59160575.bodtfitii.databinding.FragmentAboutBinding
import buu.informatics.s59160575.bodtfitii.databinding.FragmentFatCalculatorBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {
        private lateinit var binding: FragmentAboutBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_about,container,false)
        // Inflate the layout for this fragment

        binding.apply {
            backAboutButton.setOnClickListener {
                findNavController().navigate(R.id.action_aboutFragment_to_homeFragment)
            }
        }
        return binding.root
    }


}
