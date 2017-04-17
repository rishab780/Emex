package com.example.rishab.emex.JobHistoryModel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Rishab on 14-04-2017.
 */

public class JobHistoryModel implements Parcelable {

    public static final Creator<JobHistoryModel> CREATOR = new Creator<JobHistoryModel>() {

        @Override
        public JobHistoryModel createFromParcel(final Parcel in) {
            return new JobHistoryModel(in);
        }

        @Override
        public JobHistoryModel[] newArray(final int size) {
            return new JobHistoryModel[size];
        }
    };
    private String mDriverName, mDistance, mDateAndTime, mPickupLocation, mTotalRideTime, mDestination, mTotalamount;


    /**
     * job history defination
     */
    /**
     * @param mTotalRideTime  time
     * @param mTotalamount    amount
     * @param mDateAndTime    date and time
     * @param mDriverName     name
     * @param mDistance       distance
     * @param mPickupLocation pickuplocation
     * @param mDestination    destination
     */
    public JobHistoryModel(final String mDriverName, final String mDistance, final String mDateAndTime,
                           final String mPickupLocation,
                           final String mTotalRideTime,
                           final String mDestination, final String mTotalamount) {
        this.mDriverName = mDriverName;
        this.mDistance = mDistance;
        this.mDateAndTime = mDateAndTime;
        this.mPickupLocation = mPickupLocation;
        this.mTotalRideTime = mTotalRideTime;
        this.mDestination = mDestination;
        this.mTotalamount = mTotalamount;
    }
    /**
     *
     * @return creator
     *
     */
    /**
     * @param in asd
     */
    protected JobHistoryModel(final Parcel in) {

        mDateAndTime = in.readString();
        mDestination = in.readString();
        mDistance = in.readString();
        mDriverName = in.readString();
        mPickupLocation = in.readString();
        mTotalamount = in.readString();
        mTotalRideTime = in.readString();

    }

    /**
     * @return creator
     */
    public static Creator<JobHistoryModel> getCREATOR() {
        return CREATOR;
    }


    /**
     * @param dest  destination
     * @param flags flags
     */

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(mDriverName);
        dest.writeString(mDistance);
        dest.writeString(mDateAndTime);
        dest.writeString(mPickupLocation);
        dest.writeString(mDestination);
        dest.writeString(mTotalRideTime);
        dest.writeString(mTotalamount);

    }

    /**
     * @return date and time
     */
    public String getmDateAndTime() {
        return mDateAndTime;
    }

    /**
     * @param mDateAndTime date and time
     */

    public void setmDateAndTime(final String mDateAndTime) {
        this.mDateAndTime = mDateAndTime;
    }

    /**
     * @return date time
     */

    public String getmDriverName() {
        return mDriverName;
    }

    /**
     * @param mDriverName name
     */

    public void setmDriverName(final String mDriverName) {
        this.mDriverName = mDriverName;
    }

    /**
     * @return dname
     */

    public String getmDistance() {
        return mDistance;
    }

    /**
     * @param mDistance distance
     */

    public void setmDistance(final String mDistance) {
        this.mDistance = mDistance;
    }

    /**
     * @return distance
     */

    public String getmPickupLocation() {
        return mPickupLocation;
    }

    /**
     * @param mPickupLocation location
     */

    public void setmPickupLocation(final String mPickupLocation) {
        this.mPickupLocation = mPickupLocation;
    }

    /**
     * @return location
     */

    public String getmDestination() {
        return mDestination;
    }

    /**
     * @param mDestination destination
     */

    public void setmDestination(final String mDestination) {
        this.mDestination = mDestination;
    }

    /**
     * @return desti
     */
    public String getmTotalRideTime() {
        return mTotalRideTime;
    }

    /**
     * @param mTotalRideTime time
     */
    public void setmTotalRideTime(final String mTotalRideTime) {
        this.mTotalRideTime = mTotalRideTime;
    }

    /**
     * @return time
     */
    public String getmTotalamount() {
        return mTotalamount;
    }

    /**
     * @param mTotalamount amount
     */
    public void setmTotalamount(final String mTotalamount) {
        this.mTotalamount = mTotalamount;
    }

    /**
     * @return amount
     */
    @Override
    public int describeContents() {
        return 0;
    }


}
