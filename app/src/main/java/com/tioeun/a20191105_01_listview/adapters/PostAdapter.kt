package com.tioeun.a20191105_01_listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tioeun.a20191105_01_listview.R
import com.tioeun.a20191105_01_listview.datas.PostData

class PostAdapter(context:Context, res:Int, list:ArrayList<PostData>) : ArrayAdapter<PostData>(context, res, list) {

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var row = convertView
        if(row == null){
            row = inf.inflate(R.layout.post_list_item, null)
        }

        var postData = mList.get(position)

        var titleTxt = row?.findViewById<TextView>(R.id.titleTxt)
        var contentTxt = row?.findViewById<TextView>(R.id.contentTxt)

        titleTxt?.text = postData.title
        contentTxt?.text = postData.content

        return row!!
    }
}