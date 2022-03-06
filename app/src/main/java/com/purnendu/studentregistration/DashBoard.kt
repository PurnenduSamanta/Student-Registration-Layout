package com.purnendu.studentregistration

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class DashBoard : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var toolbar:ConstraintLayout
    lateinit var adapter: Adapter
    private lateinit var drawerLayout: DrawerLayout
    lateinit var snv: NavigationView

    private val subject= arrayListOf("Physics","Chemistry","Math","Biology","Computer","English","Bengali")




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)


        drawerLayout=findViewById(R.id.drawer)
        snv=findViewById(R.id.snv)
        recyclerView=findViewById(R.id.recyclerView)
        toolbar=findViewById(R.id.toolbar)
        val hamburger=toolbar.findViewById<ImageView>(R.id.hamburger)

        title = "Subjects"

        adapter= Adapter(this,subject)


        val layoutManager= LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter


        hamburger.setOnClickListener {

            if(drawerLayout.isDrawerOpen(snv))
               drawerLayout.closeDrawer(GravityCompat.START)

          else
                drawerLayout.openDrawer(GravityCompat.START)
        }
    }
}