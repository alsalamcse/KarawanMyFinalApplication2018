package om.banat.karawan.karawanmyfinalapplication2018;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;

public class TaskAdopter extends ArrayAdapter<MyTask> {
    public TaskAdopter( Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        if (convertView==null)//to build one item
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.taskitem,parent,false)
         MyTask m=getItem(position);//return data o
        TextView tvTitle=convertView.findViewById(R.id.tvitmTitle);
        TextView tvText=convertView.findViewById(R.id.tvitmTextr);
        SeekBar =convertView.findViewById(R.id.skbitmNess);
        SeekBar skbImp=convertView.findViewById(R.id.skbitmImp);
        ImageButton ibDel=convertView.findViewById(R.id.ibtnitmDelTask);

        tvText.setText(m.getText());
        tvTitle.setText(m.getText());
        skbImp.setProgress(m.getImportant());
        SeekBar.setProgress(m.getNecessary());

        ibDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Dell",Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;

    }
}
