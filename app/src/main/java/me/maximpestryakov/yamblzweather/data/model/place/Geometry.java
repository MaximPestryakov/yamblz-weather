
package me.maximpestryakov.yamblzweather.data.model.place;

import com.google.gson.annotations.SerializedName;

public class Geometry {
    @SerializedName("location")
    private Location location;

    public Location getLocation() {
        return location;
    }
}
