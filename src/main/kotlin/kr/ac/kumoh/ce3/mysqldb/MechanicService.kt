package kr.ac.kumoh.ce3.mysqldb

import org.springframework.stereotype.Service

@Service
class MechanicService(val repository: MechanicRepository){
    fun getAllMechanics(): List<Mechanic>{
        return repository.findAll()
    }
    fun getMechanicJoinGunpla(): List<MechanicJoinGunplaDto> {
        return repository.findMechanicJoinGunpla()
    }
}