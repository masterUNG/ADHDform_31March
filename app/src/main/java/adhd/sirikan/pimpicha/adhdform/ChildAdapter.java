package adhd.sirikan.pimpicha.adhdform;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by masterUNG on 3/31/2017 AD.
 */

public class ChildAdapter extends BaseAdapter{

    private Context context;
    private String[] iconStrings, childStrings;
    private TextView textView;
    private ImageView imageView;

    public ChildAdapter(Context context,
                        String[] iconStrings,
                        String[] childStrings) {
        this.context = context;
        this.iconStrings = iconStrings;
        this.childStrings = childStrings;
    }

    @Override
    public int getCount() {
        return childStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.child_listview, viewGroup, false);

        //Initial View
        imageView = (ImageView) view1.findViewById(R.id.imvIcon);
        textView = (TextView) view1.findViewById(R.id.txtChild);

        textView.setText(childStrings[i]);
        Picasso.with(context).load(iconStrings[i]).into(imageView);

        return view1;
    }
}   // Main Class
