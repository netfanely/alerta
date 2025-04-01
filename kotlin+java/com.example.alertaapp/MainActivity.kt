package com.example.alertaapp

	import android.app.Activity
	import android.content.DialogInterface
	import android.os.Bundle
	import android.widget Button
	import androidx.activity.enableEdgeToEdge
	import androidx.appcompat.app.AlertDialog
	import androidx.appcompat.app.AppCompatActivity
	import androidx.core.view.ViewCompat
	import androidx.core.view.WindowInsetsCompat
	
	class MainActivity : AppCompatActivity(){
		override fun onCreate(savedInstanceState: Bundle?) {
			super.onCreate(savedInstanceState)
			enableEdgeToEdge()
			setContentView(R.layout.activity_main)
			ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
				val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
				v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
				insets
			}
			alerta(this,"Titulo","detalle desde la nube")
			
			fun alerta(context: Activity, titulo: String, detalle: String){
				val boton: Button = findViewById(R.id.button)
				boton.setOnClickListenter{
					val builder = AlertDialog.Builder(context)
					builder.setTitle(titulo)
					builder.setMessage(detalle)
						.setPositiveButton("ACEPTAR", DialogInterface.OnClickListener{dialog, id->
						     //aceptar
							})
						builder.setNegativeButton("CANCELAR"){
							dialog, id->
							//cancelar
						}
						builder.show()
					}
			}
			
	}
