// FILE: 1.kt
// SKIP_INLINE_CHECK_IN: inlineFun$default
package test

@Suppress("NOT_YET_SUPPORTED_IN_INLINE")
inline fun inlineFun(capturedParam: String, lambda: () -> String = { capturedParam }): String {
    return lambda()
}

// FILE: 2.kt

import test.*

fun box(): String {
    return inlineFun("OK")
}

// FILE: 1.smap
//TODO maybe do smth with default method body mapping
SMAP
1.kt
Kotlin
*S Kotlin
*F
+ 1 1.kt
test/_1Kt
*L
1#1,10:1
7#1:11
*E

SMAP
1.kt
Kotlin
*S Kotlin
*F
+ 1 1.kt
test/_1Kt$inlineFun$1
*L
1#1,10:1
*E

// FILE: 2.smap

SMAP
2.kt
Kotlin
*S Kotlin
*F
+ 1 2.kt
_2Kt
+ 2 1.kt
test/_1Kt
*L
1#1,9:1
6#2,2:10
*E
*S KotlinDebug
*F
+ 1 2.kt
_2Kt
*L
6#1,2:10
*E