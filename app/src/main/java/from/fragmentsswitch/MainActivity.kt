package from.fragmentsswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOne = findViewById<Button>(R.id.button_one)
        val buttonTwoo = findViewById<Button>(R.id.button_twoo)

        buttonOne.setOnClickListener(
            View.OnClickListener {
                view ->
                // To switch to Fragment One
                // Get fragment
                val fragmentOne = OneFragment()
                // Get Fragment Manager Support
                val manager = supportFragmentManager
                // make transaction using Fragment Manager
                val transaction = manager.beginTransaction()
                // Replace fragment in container and finish transaction
                transaction.replace(R.id.fragmentContainerView, fragmentOne)
                transaction.addToBackStack(null)
                transaction.commit()

            }
        )

        buttonTwoo.setOnClickListener(
            View.OnClickListener {
                    view ->
                // To switch to Fragment One
                // Get fragment
                val fragmentTwo = TwooFragment()
                // Get Fragment Manager Support
                val manager = supportFragmentManager
                // make transaction using Fragment Manager
                val transaction = manager.beginTransaction()
                // Replace fragment in container and finish transaction
                transaction.replace(R.id.fragmentContainerView, fragmentTwo)
                transaction.addToBackStack(null)
                transaction.commit()

            }
        )
    }
}