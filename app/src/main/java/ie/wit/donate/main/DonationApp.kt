package ie.wit.donate.main

import android.app.Application
import android.util.Log
import ie.wit.donate.models.DonationMemStore
import ie.wit.donate.models.DonationStore

class DonationApp : Application() {

    lateinit var donationsStore: DonationStore

    override fun onCreate() {
        super.onCreate()
        donationsStore = DonationMemStore()
        Log.v("Donate","Donation App started")
    }
}