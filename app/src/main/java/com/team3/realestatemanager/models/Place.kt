package com.team3.realestatemanager.models

import android.os.Parcel
import android.os.Parcelable

data class Place(
    val name: String = "",
    val image: String = "",
    val createdBy: String = "",
    var documentId: String = "",
) : Parcelable {
    constructor(source: Parcel) : this(
        source.readString()!!,
        source.readString()!!,
        source.readString()!!,
        source.readString()!!,
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(name)
        writeString(image)
        writeString(createdBy)
        writeString(documentId)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Place> = object : Parcelable.Creator<Place> {
            override fun createFromParcel(source: Parcel): Place = Place(source)
            override fun newArray(size: Int): Array<Place?> = arrayOfNulls(size)
        }
    }
}