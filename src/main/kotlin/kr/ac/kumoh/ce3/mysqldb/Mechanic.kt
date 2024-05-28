package kr.ac.kumoh.ce3.mysqldb

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Mechanic(    //괄호 바뀌면 안됨
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,
    var name: String,
    var model: String,
    var manufacturer: String,
    var armor: String,
    var height: Int,
    var weight: Int
)
