package id.indosw.floatslideupsheet.sample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import id.indosw.floatslideupsheet.lib.view.FloatingSlideUpBuilder;
import id.indosw.floatslideupsheet.lib.view.FloatingSlideUpLayout;

public class FloatingSlideUpActivity extends AppCompatActivity {

    private FloatingSlideUpLayout slideContent;
    private LinearLayout containerFloatingMenu;
    private LinearLayout contentExpandContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slideContent = findViewById(R.id.slide_conten);
        containerFloatingMenu = findViewById(R.id.container_floating_menu);
        contentExpandContainer = findViewById(R.id.content_expand_container);
        initView();
    }

    @SuppressLint("ResourceAsColor")
    private void initView() {
        FloatingSlideUpBuilder floatingSlideUpSheet = new FloatingSlideUpBuilder(this, slideContent);
        floatingSlideUpSheet.setFloatingMenuRadiusInDp(32);
        floatingSlideUpSheet.setFloatingMenuColor(android.R.color.white);
        floatingSlideUpSheet.setFloatingMenu(containerFloatingMenu);
        floatingSlideUpSheet.setPanel(contentExpandContainer);
        floatingSlideUpSheet.build();
    }
}
