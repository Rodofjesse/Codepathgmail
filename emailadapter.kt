package com.example.recyclerviewscodepath

class EmailAdapter (private val emails: List<Email>) : RecyclerView.Adapter<EmailAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Populate data into the item through the holder
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            // Get the data model based on position
            val email = emails.get(position)
            // Set item views based on views and data model
            holder.senderTextView.text = email.sender
            holder.titleTextView.text = email.title
            holder.summaryTextView.text = email.summary
        val senderTextView: TextView
        val titleTextView: TextView
        val summaryTextView: TextView

            override fun getItemCount():
        init {
                return emails.size}
            senderTextView = itemView.findViewById(R.id.senderTv)
            titleTextView = itemView.findViewById(R.id.titleTv)
            summaryTextView = itemView.findViewById(R.id.summaryTv)
        }
    }
}
