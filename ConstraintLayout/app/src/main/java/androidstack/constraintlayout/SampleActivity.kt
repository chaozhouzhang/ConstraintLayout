package androidstack.constraintlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Placeholder
import kotlinx.android.synthetic.main.layout_placeholder.*

class SampleActivity:AppCompatActivity() {

    private lateinit var mPlaceholder:Placeholder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout =intent.getIntExtra("layout",R.layout.activity_main)
        setContentView(layout)
        when(layout){
            R.layout.layout_placeholder->{
                mPlaceholder = findViewById(R.id.placeholder)
                placeholder.setContentId(R.id.btn_placeholder)
            }
        }
    }
}