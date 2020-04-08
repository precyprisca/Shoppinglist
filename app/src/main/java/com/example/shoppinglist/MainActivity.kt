import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglist.R
import com.example.shoppinglist.Shopping
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.shoppinglist.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Shopping> ()

        arrayList.add(Shopping( "Banana","500", R.drawable.banana ))
        arrayList.add(Shopping( "Watch","20000", R.drawable.watch ))
        arrayList.add(Shopping( "Shoe","15000", R.drawable.shoes ))
        arrayList.add(Shopping( "Perfume","25000", R.drawable.perfume ))
        arrayList.add(Shopping( "Tissue","200", R.drawable.tissue ))

        val myAdapter = ShoppinglistAdapter(arrayList, this)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = myAdapter
    }

}
