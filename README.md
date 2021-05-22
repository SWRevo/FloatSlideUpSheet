# FloatSlideUpSheet
[![](https://jitpack.io/v/SWRevo/FloatSlideUpSheet.svg)](https://jitpack.io/#SWRevo/FloatSlideUpSheet)

## Implementation in Android Studio
## Gradle
Add the following to your `build.gradle` to use:
```
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.SWRevo:FloatSlideUpSheet:1.4.0'
}
```
## Implementation in Sketchware
Version 1.3.0 uses material component version 1.0.0 and appcompat 1.0.0 for support in Sketchware
Add the following to your Sketchware `local_library` download use:
```
dependencies {
    implementation 'com.github.SWRevo:FloatSlideUpSheet:1.3.0'
}
```

## Usage
## KOTLIN

```java

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

```

## JAVA

```java

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

```

## License

    Copyright 2021 indosw

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
