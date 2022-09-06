package com.example.rp2.data.models

data class Plan(val id: Int, val name: String)

val plan1 = Plan(1, "Plan 1")
val plan2 = Plan(2, "Plan 2")

val plans:List<Plan> = listOf(plan1, plan2)