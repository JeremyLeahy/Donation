package ie.wit.donate.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DonationModel(var id: Long = 0,
                         val paymentmethod: String = "N/A",
                         val amount: Int = 0) : Parcelable