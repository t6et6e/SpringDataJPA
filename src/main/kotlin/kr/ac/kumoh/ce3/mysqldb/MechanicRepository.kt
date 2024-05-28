package kr.ac.kumoh.ce3.mysqldb

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface MechanicRepository : JpaRepository<Mechanic, Int>  {
    @Query("""
   select new kr.ac.kumoh.ce3.mysqldb.MechanicJoinGunplaDto(
       m.id as mechanicId, name, model,
       g.id as gunplaId, title, grade, date, price)
   from Mechanic m left outer join Gunpla g
   on m.id = g.mechanicId
    """)
    fun findMechanicJoinGunpla(): List<MechanicJoinGunplaDto>


}