package com.example.functiondeclare

fun main(){
    val meanings = mapOf(
        "serene" to "calm and peaceful",
        "vivid" to "clear, detailed, and full of life",
        "benevolent" to "kind and generous",
        "elated" to "extremely happy or joyful",
        "obstinate" to "stubbornly refusing to change one’s opinion",
        "frugal" to "careful with money or resources",
        "vulnerable" to "easily hurt or harmed emotionally or physically",
        "melancholy" to "a deep, thoughtful sadness",
        "meticulous" to "showing great attention to detail",
        "ardent" to "passionate or enthusiastic"
    )
    print("Enter word:")
    val input : String = readln().lowercase()
    print(meanings[input])
}