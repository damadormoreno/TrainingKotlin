package kotlin.davidamadormoreno.com.trainingappkotlin

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_item.view.*

/**
 * Created by David on 09/04/2017.
 */
class ItemAdapter(val items : List<Item> , val listener: (Item) -> Unit) : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        /*val v = LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false)*/
        return ViewHolder(parent.inflate(R.layout.view_item))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.itemView){
            item_title.text = items[position].title
            item_image.loadUrl(items[position].url)
            setOnClickListener { listener(items[position]) }
        }

    override fun getItemCount() = items.size

    class ViewHolder(view:View) : RecyclerView.ViewHolder(view)
}