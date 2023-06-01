package ndemo.dev.mycontactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ndemo.dev.mycontactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }


    fun displayContacts(){
        var contact1=ContactData("","Vallary Buraje","+254798675423")
        var contact2=ContactData("","Nyambura Wambui","+254709876523")

        var contact3=ContactData("","Eunice Keletu","+254798765432")
        var contact4=ContactData("","Faith Kazungu","+2547864533")
        var contact5=ContactData("","Akech Atong","+254798765432")
        var contact6=ContactData("","Ndemo Vero","+2547864533")
        var contact7=ContactData("","Clarine Antiba","+254798765432")
        var contact8=ContactData("","Susan Maina","+2547864533")
        var contact9=ContactData("","Loice Kanini","+254798765432")
        var contact10=ContactData("","Sonia Wanjiku","+2547864533")
        var contact11=ContactData("","Christine Anne","+254798765432")
        var contact12=ContactData("","Elizabeth Wambui","+2547864533")
        var contact13=ContactData("","Faith Ndunge","+254798765432")
        var contact14=ContactData("","Juliet Olieng","+2547864533")
        var contact15=ContactData("","Purity Ndirangu","+2547864533")


        var contactLists= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,
            contact11,contact12,contact13,contact14,contact15)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactAdapter = ContactsRvAdapter(contactLists)
        binding.rvContacts.adapter=contactAdapter

    }

}