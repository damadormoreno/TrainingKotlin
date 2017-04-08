package kotlin.davidamadormoreno.com.trainingappkotlin

/**
 * Created by David on 08/04/2017.
 */
fun getItems(): List<Item>{
    return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/cats/$it/" ) }
}

data class Item(val id: Long, val title:String, val url:String)