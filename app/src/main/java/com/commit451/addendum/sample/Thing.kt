package com.commit451.addendum.sample

import android.os.Parcel
import android.os.Parcelable

/**
 * Testing parcelable
 */
class Thing : Parcelable {

    var someValue: Int = 0

    constructor() {

    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(this.someValue)
    }

    protected constructor(`in`: Parcel) {
        this.someValue = `in`.readInt()
    }

    companion object {

        @JvmField
        val CREATOR: Parcelable.Creator<Thing> = object : Parcelable.Creator<Thing> {
            override fun createFromParcel(source: Parcel): Thing {
                return Thing(source)
            }

            override fun newArray(size: Int): Array<Thing?> {
                return arrayOfNulls(size)
            }
        }
    }
}
