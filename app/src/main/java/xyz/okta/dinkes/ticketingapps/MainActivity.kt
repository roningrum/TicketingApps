package xyz.okta.dinkes.ticketingapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val seatsView = findViewById<SeatsView>(R.id.seatsView)
        val button = findViewById<Button>(R.id.finishButton)



        button.setOnClickListener {
            seatsView.seat.let {
                if(it != null){
                    Toast.makeText(this, "Kursi Anda nomor ${it.name}", Toast.LENGTH_SHORT).show()

                } else {
                    Toast.makeText(this, "Pilih Kursi", Toast.LENGTH_SHORT).show()
                }
        }
        }
    }
}