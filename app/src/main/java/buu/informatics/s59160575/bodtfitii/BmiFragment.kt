package buu.informatics.s59160575.bodtfitii


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160575.bodtfitii.databinding.FragmentBmiBinding

/**
 * A simple [Fragment] subclass.
 */
class BmiFragment : Fragment() {
    private lateinit var binding: FragmentBmiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_bmi,container,false)
        return binding.root
    }


}
