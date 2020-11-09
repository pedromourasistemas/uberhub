package br.com.pedrohenriquemoura.uberhub.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Opportunity (var organization: String,
                        var title: String,
                        var description: String,
                        var value: String,
                        var email: String,
                        var phone: String,
                        var status: String) {
}