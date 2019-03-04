package om.banat.karawan.karawanmyfinalapplication2018;

import android.widget.SeekBar;

public class MyTask {

    private String text;
    private SeekBar important;
    private SeekBar necessary;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImportant() {
        return important;
    }

    public void setImportant(SeekBar important) {
        this.important = important;
    }

    public SeekBar getNecessary() {
        return necessary;
    }

    public void setNecessary(SeekBar necessary) {
        this.necessary = necessary;
    }

}