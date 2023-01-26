package ruelas.luis.geoquiz




import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
}
import androidx.annotation.StringRes
data class Question(@StringRes val textResId: Int, val answer: Boolean)

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
    }
}
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    trueButton = findViewById(R.id.true_button)
    falseButton = findViewById(R.id.false_button)
    trueButton.setOnClickListener { view: View ->
// Do something in response to the click here
    }
}
override fun onCreate(savedInstanceState: Bundle?) {
    ...
    trueButton.setOnClickListener { view: View ->
// Do something in response to the click here
        Toast.makeText(
            this,
            R.string.correct_toast,
            Toast.LENGTH_SHORT
        ).show()
    }
    falseButton.setOnClickListener { view: View ->
// Do something in response to the click here
        Toast.makeText(
            this,
            R.string.incorrect_toast,
            Toast.LENGTH_SHORT
        ).show()
    }
}

override fun onCreate(savedInstanceState: Bundle?) {
    ...
    trueButton.setOnClickListener { view: View ->
// Do something in response to the click here
    }
    falseButton.setOnClickListener { view: View ->
// Do something in response to the click here
    }
}
public final class R {
    public static final class anim {
        ...
    }
    ...
    public static final class id {
        ...
    }
    public static final class layout {
        ...
        public static final Int activity_main=0x7f030017;
    }
    public static final class mipmap {
        public static final Int ic_launcher=0x7f030000;
    }
    public static final class string {
        ...
        public static final Int app_name=0x7f0a0010;
        public static final Int false_button=0x7f0a0012;
        public static final Int question_text=0x7f0a0014;
        public static final Int true_button=0x7f0a0015;
    }

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
    }


    }


