package com.example.criminalintent

import java.util.*

data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(), //current date
                 var isSolved: Boolean = false)

