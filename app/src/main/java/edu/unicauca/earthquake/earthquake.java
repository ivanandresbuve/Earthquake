package edu.unicauca.earthquake;

public class earthquake {
    import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

    public class Earthquake {
        /**
         * Properties with information about the earthquake
         */
        private String mId;
        private Date mDate;
        private String mDetails;
        private Location mLocation;
        private double mMagnitude;
        private String mLink;

        public String getId() {
            return mId;
        }

        public Date getDate() {
            return mDate;
        }

        public String getDetails() {
            return mDetails;
        }

        public Location getLocation() {
            return mLocation;
        }

        public double getMagnitude() {
            return mMagnitude;
        }

        public String getLink() {
            return mLink;
        }

        public Earthquake(String id, Date date, String details, Location location,
                          double magnitude, String link) {
            mId = id;
            mDate = date;
            mDetails = details;
            mLocation = location;
            mMagnitude = magnitude;
            mLink = link;
        }

        /**
         * Format the earthquake information to String representation
         * @return a string representing the earthquake information
         */

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Earthquake)
                return (((Earthquake) obj).getId().contentEquals(mId));
            else
                return false;
        }
    }
}
