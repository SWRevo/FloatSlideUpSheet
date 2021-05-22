package id.indosw.floatslideupsheet.sample

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import id.indosw.floatslideupsheet.lib.view.FloatingSlideUpBuilder
import id.indosw.floatslideupsheet.lib.view.FloatingSlideUpLayout


class FloatingSlideUpSheetActivity : AppCompatActivity() {

    private var slideContent : FloatingSlideUpLayout? = null
    private var containerFloatingMenu : LinearLayout? = null
    private var contentExpandContainer : LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        slideContent = findViewById(R.id.slide_conten)
        containerFloatingMenu = findViewById(R.id.container_floating_menu)
        contentExpandContainer = findViewById(R.id.content_expand_container)
        initView()
    }


    @SuppressLint("ResourceAsColor")
    private fun initView() {
        val floatingSlideUpSheet =   FloatingSlideUpBuilder(this, slideContent!!)
                .setFloatingMenuRadiusInDp(32)
                .setFloatingMenuColor(android.R.color.white)
                .setFloatingMenu(containerFloatingMenu!!)
                .setPanel(contentExpandContainer!!)
                .build()


    }

}