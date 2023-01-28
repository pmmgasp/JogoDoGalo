package dam.ipt.jogodogalo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dam.ipt.jogodogalo.databinding.ActivityMenuBinding

class Menu : AppCompatActivity() {
    private lateinit var binding : ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Btn1.setOnClickListener{

            Jogar()
        }
        binding.btnDef.setOnClickListener{

            defs()
        }

    }
    private fun Jogar(){
        val jogo = Intent(this,Jogo::class.java)
        startActivity(jogo)
    }

    private fun defs(){
        val defs = Intent(this,Definicoes::class.java)
        startActivity(defs)
    }

}