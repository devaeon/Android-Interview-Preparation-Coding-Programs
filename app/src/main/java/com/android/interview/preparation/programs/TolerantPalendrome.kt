package com.android.interview.preparation.programs

fun tolerantPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1
    val mistakeAllowed = true

    while (left < right) {
        if (s[left] != s[right]) {
            if (!mistakeAllowed) return false // Already removed one char
            // Try skipping either left or right character
            return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1)
        }
        left++
        right--
    }
    return true
}

fun isPalindrome(s: String, left: Int, right: Int): Boolean {
    var l = left
    var r = right
    while (l < r) {
        if (s[l] != s[r]) return false
        l++
        r--
    }
    return true
}

fun main() {
    println(tolerantPalindrome("abba"))      // true
    println(tolerantPalindrome("abb#a"))     // true
    println(tolerantPalindrome("abcdefg"))   // false
    println(tolerantPalindrome("racecar"))   // true
    println(tolerantPalindrome("rac#ecar"))  // true
    println(tolerantPalindrome("hello"))     // false
}
