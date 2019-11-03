package buu.informatics.s59160575.bodtfitii


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160575.bodtfitii.databinding.FragmentResultBinding

/**
 * A simple [Fragment] subclass.
 */
class ResultFragment : Fragment() {
    private lateinit var binding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_result,container,false)
        // Inflate the layout for this fragment

        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("resultFragment", "onCreate called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("resultFragment", "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i("resultFragment", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("resultFragment", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("resultFragment", "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("resultFragment", "onDestroyView called")
    }

}
