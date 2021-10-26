package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio.exam

import java.util.*

fun main()
{
    when (Scanner(System.`in`).next())
    {
        "dilluns"   -> print("Compra llums")
        "dimarts"   -> print("Compra naps")
        "dimecres"  -> print("Compra nespres")
        "dijous"    -> print("Compra nous")
        "divendres" -> print("Faves tendres")
        "dissabte"  -> print("Tot s'ho gasta")
        "diumenge"  -> print("Tot s'ho menja")
    }
}