package com.cris.apppeliculav01

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var txtNombreUsuario: EditText
    private lateinit var txtPassword:EditText
    private lateinit var auth: FirebaseAuth
    private lateinit var progressBar:ProgressBar



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtNombreUsuario = findViewById(R.id.etxtUsuario)
        txtPassword = findViewById(R.id.etxtPassword)
        auth= FirebaseAuth.getInstance()
        progressBar = ProgressBar(this)
    }

    // metodo para el boton
    fun siguienteAc() {
        startActivity(Intent(this, InicioUsuario::class.java))

    }
    fun login(view: View)
    {
        loginUsuario()
    }
    //metodo para el boton registrarse
    fun registro(view: View?) {
        val siguiente = Intent(this, LoginActivity::class.java)
        startActivity(siguiente)
    }
    fun olvidoPassword(view: View)
    {

    }
    private fun loginUsuario()
    {
        val user:String=txtNombreUsuario.text.toString()
        val password=txtPassword.text.toString()

        if(!TextUtils.isEmpty(user) && !TextUtils.isEmpty(password)){

            auth.signInWithEmailAndPassword(user,password).addOnCompleteListener(this)
            {
                task ->
                if(task.isSuccessful)
                {
                    progressBar.visibility=View.VISIBLE
                    siguienteAc()
                }else
                {
                    Toast.makeText(this,"Error al ingresar", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}