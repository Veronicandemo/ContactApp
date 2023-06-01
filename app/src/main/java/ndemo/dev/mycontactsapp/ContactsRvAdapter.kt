package ndemo.dev.mycontactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import ndemo.dev.mycontactsapp.databinding.ContactListItemBinding

class  ContactsRvAdapter(var contactLists: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding= ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact =contactLists[position]
//        holder.binding.ivAvatar.toString()
        holder.binding.tvName.text=contact.displayName
        holder.binding.tvPhoneNum.text= contact.phoneNumber


    }
    override fun getItemCount(): Int {
        return  contactLists.size
    }
}




class ContactViewHolder(var binding: ContactListItemBinding):ViewHolder(binding.root){}