package cudra.mohamed.featuresimplementation

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class ChatsRVAdapter(var chatList:List<Chats>):RecyclerView.Adapter<ChatsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ChatsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return chatList.size
    }
}
class ChatsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var ivPerson:ShapeableImageView=itemView.findViewById(R.id.ivPerson)
    var tvName:TextView=itemView.findViewById(R.id.tvName)
    var tvTime:TextView=itemView.findViewById(R.id.tvTime)
    var ivDone:TextView=itemView.findViewById(R.id.ivDone)
    var tvMessage:TextView=itemView.findViewById(R.id.tvMessage)
}