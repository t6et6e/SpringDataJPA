package kr.ac.kumoh.ce3.mysqldb

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController //anotation?
class GunplaController(val service: MechanicService){
    @GetMapping("/")
    fun welcome(): String{       //kotlin 식 함수표현 fun, 반환형 표현 ":<반환형타입>"
            return "Welcome to Gunpla Server\nMy name is t6e"
    }
    @GetMapping("/mechanics")
    fun getMechanicList(): List<Mechanic>{       //kotlin 식 함수표현 fun, 반환형 표현 ":<반환형타입>"
        return service.getAllMechanics()
    }

    @GetMapping("/mechanic/join/gunpla")
    fun mechanicJoinList(): List<MechanicJoinGunplaDto> {
        return service.getMechanicJoinGunpla()
    }
}