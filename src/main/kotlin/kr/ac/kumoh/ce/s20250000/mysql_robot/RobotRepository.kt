package kr.ac.kumoh.ce.s20250000.mysql_robot

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface RobotRepository : JpaRepository<Robot, Int> {
    @Query("""
        SELECT new kr.ac.kumoh.ce.s20250000.mysql_robot.EquipmentDto(
            m.name as robotName,
            m.model,
            m.robotClass,
            e.location,
            e.quantity,
            w.name as weaponName,
            w.type as weaponType,
            w.damage,
            w.ability
        )
        FROM Robot m
        LEFT JOIN Equipment e ON m.id = e.mechanicId
        LEFT JOIN Weapon w ON e.weaponId = w.id
        ORDER BY m.name, e.location
    """)
    fun findAllEquipment(): List<EquipmentDto>
}