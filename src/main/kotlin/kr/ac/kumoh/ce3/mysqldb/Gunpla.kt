package kr.ac.kumoh.ce3.mysqldb

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
data class Gunpla (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var mechanicId: Int,
    var grade: String,
    var date: LocalDate,
    var price: Int,
    var title: String
)