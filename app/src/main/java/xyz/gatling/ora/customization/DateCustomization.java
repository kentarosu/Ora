package xyz.gatling.ora.customization;

import android.os.Parcel;

/**
 * Created by gimmi on 7/3/2016.
 */

public class DateCustomization extends BaseDateTimeCustomization {
    String format = "MMMM dd, y";
    String formatMonth = "MMMM";
    String formatDay = "dd";
    String formatYear = "y";

    public DateCustomization(){
        format = "MMMM dd, y";
    }

    @Override
    public String getFormat() {
        return format;
    }
    public static final Creator<BaseDateTimeCustomization> CREATOR = new Creator<BaseDateTimeCustomization>() {
        @Override
        public DateCustomization createFromParcel(Parcel in) {
            return new DateCustomization(in);
        }

        @Override
        public DateCustomization[] newArray(int size) {
            return new DateCustomization[size];
        }
    };

    DateCustomization(Parcel in){
        super(in);
        format = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(format);
    }
}
