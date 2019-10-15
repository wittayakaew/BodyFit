package buu.informatics.s59160575.bodtfitii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import buu.informatics.s59160575.bodtfitii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
