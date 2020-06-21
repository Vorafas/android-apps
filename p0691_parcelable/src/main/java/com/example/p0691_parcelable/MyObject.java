package com.example.p0691_parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class MyObject implements Parcelable {
    final static String TAG = "myLogs";

    public String s;
    public int i;

    public MyObject(String s, int i) {
        Log.d(TAG, "MyObject(String s, int i)");
        this.s = s;
        this.i = i;
    }

    private MyObject(Parcel parcel) {
        Log.d(TAG, "MyObject(Parcel parcel)");
        s = parcel.readString();
        i = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int flags) {
        Log.d(TAG, "writeToParcel");
        parcel.writeString(s);
        parcel.writeInt(i);
    }

    public final static Parcelable.Creator<MyObject> CREATOR = new Parcelable.Creator<MyObject>() {
        public MyObject createFromParcel(Parcel in) {
            Log.d(TAG, "createFromParcel");
            return new MyObject(in);
        }

        public MyObject[] newArray(int size) {
            return new MyObject[size];
        }
    };
}
