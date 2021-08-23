package com.cris.apppeliculav01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class LoginActivity : AppCompatActivity() {

    private lateinit var txtNombre:EditText
    private lateinit var txtEmail:EditText
    private lateinit var txtPassword:EditText
    private lateinit var progressBar:ProgressBar
    private lateinit var dbReference:DatabaseReference
    private lateinit var database:FirebaseDatabase
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        txtNombre = findViewById(R.id.txtNombreRegistro)
        txtEmail = findViewById(R.id.txtEmailRegistro)
        txtPassword = findViewById(R.id.txtContraseñaRegistro)
        progressBar = ProgressBar(this)
        database = FirebaseDatabase.getInstance()
        auth = FirebaseAuth.getInstance()
        dbReference= database.reference.child("User")

    }
    fun registrar(view: View)
    {
        crearNuevaCuenta()
    }
    private fun crearNuevaCuenta()
    {
        val nombre:String=txtNombre.text.toString()
        val email:String=txtEmail.text.toString()
        val password:String=txtPassword.text.toString()

        if(!TextUtils.isEmpty(nombre) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password))
        {
            progressBar.visibility = View.VISIBLE
            auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this){
                task ->
                if(task.isComplete)
                {
                    val user:FirebaseUser?=auth.currentUser
                    verificarEmail(user)

                    val userDB= user?.uid?.let { dbReference.child(it) }
                    userDB?.child("Nombre")?.setValue(nombre)
                    action()

                }

            }
        }
    }
    private fun action()
    {
        startActivity(Intent(this,InicioUsuario::class.java))
    }
    private fun verificarEmail(usuario:FirebaseUser?){
        usuario?.sendEmailVerification()?.addOnCompleteListener(this)
        {
            task ->
            if(task.isComplete)
            {
                Toast.makeText(this,"Email enviado",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Error al enviar email",Toast.LENGTH_LONG).show()
            }

        }
    }
}