package arcainne.demot3h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Windows 10 TIMT on 9/5/2016.
 */


public class CountryAdapter extends BaseAdapter {
    private List<Country> countryList;
    Context context;
    int layoutRes;

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int position) {
        return countryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            layoutInflater.inflate(layoutRes,parent,false);

            viewHolder = new ViewHolder();
            viewHolder.textEn = (TextView) convertView.findViewById(R.id.nameEn);
            viewHolder.textVi= (TextView) convertView.findViewById(R.id.nameVi);

        }

        return null;
    }
}
